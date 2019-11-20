package com.kopytko.sms;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class ExampleSmS {
    public static final String ACCOUNT_SID = "AC3ed21164fa1bd9ee5bb74eb64c33317e";
    public static final String AUTH_TOKEN = "80921c037593a03ffc070c6137865852";

    public static void send(String msg) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message
                .creator(new PhoneNumber("+380982060736"),
                        new PhoneNumber("+12097915927"), msg).create();
    }
}
