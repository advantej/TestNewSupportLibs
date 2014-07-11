package com.advantej.android.test.testnewsupportlibs.content;


import com.advantej.android.test.testnewsupportlibs.R;
import com.advantej.android.test.testnewsupportlibs.model.FooBar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by tejas on 6/30/14.
 */
public class MockData {

    private static String[] sRandomTexts = new String[] {
            "Posuere quam in, vivamus purus, amet a in.",
            "Enim tellus, eget est fringilla, tortor metus.",
            "Enim in, libero cursus.",
            "Porta mauris erat, wisi ipsum molestie.",
            "Sapien a nullam, nulla consectetuer ut.",
            "Morbi pede ac, arcu volutpat, ac curabitur ut.",
            "Justo sed, venenatis fermentum turpis, explicabo vel.",
            "Tortor vestibulum suscipit.",
            "Neque pellentesque.",
            "Velit lacus, felis condimentum.",
            "Odio eleifend, amet aenean, ac lorem feugiat.",
            "Lacinia tristique commodo, nulla nisl tempor.",
            "Molestie ante, tincidunt at ullamcorper.",
            "Tellus lectus integer.",
            "Sit accumsan sagittis, ligula tellus in, odio hendrerit.",
            "Eget enim.",
            "Urna quisque tortor, id aenean.",
            "At amet vel.",
            "Eget cursus, viverra urna taciti, malesuada vel fringilla.",
            "Dicta arcu etiam, aenean donec pellentesque.",
            "Volutpat nunc a.",
            "Lacus wisi, reiciendis est.",
            "Lacus risus ut, nam ultricies, adipiscing aliquam felis.",
            "Nisl tristique, pellentesque non, orci cras augue.",
            "Sem sodales et, justo in, diam dictum.",
            "Integer aliquam eu, sem massa consequat, justo dolor etiam.",
            "Accumsan ipsum orci, faucibus penatibus, interdum maecenas.",
            "Justo vestibulum cursus.",
            "Euismod aliquam.",
            "Maecenas nulla, pulvinar placerat sit.",
            "Volutpat ac eget.",
            "Sed vitae, nec aut, ac leo.",
            "Nulla justo, cumque justo nec, placerat amet adipiscing.",
            "Metus sed at, lobortis nonummy aliquam, sed adipiscing tempor.",
            "Mi natoque etiam.",
            "Tortor dui, tincidunt montes.",
            "Pellentesque commodo, vestibulum nostra.",
            "Inceptos vestibulum sit.",
            "Velit nunc cum, a scelerisque pretium, volutpat et.",
            "Magna velit pellentesque, orci per sed, curabitur quisque.",
            "Eget porta mauris, leo id justo, ut vitae.",
            "Saepe rutrum platea, sodales viverra.",
            "Praesent vel, pede odio, feugiat felis dictumst.",
            "Arcu sed, eleifend ante, erat placerat ut.",
            "Morbi sed.",
            "Wisi sed in, facilisi amet nec, libero adipiscing rutrum.",
            "Massa a tempor, aliquet diam.",
            "Id eu, nunc amet orci.",
            "Magna curabitur, at congue nec, magna eget libero.",
            "Nulla quis lobortis, euismod et, ut porttitor in."
    };

    public static List<FooBar> getMockFoobarObjects(int num) {
        List<FooBar> fooBars = new ArrayList<FooBar>();

        Random random = new Random();

        for (int i = 0; i < num; i++) {
            fooBars.add(new FooBar(R.drawable.ic_launcher, sRandomTexts[random.nextInt(50)], sRandomTexts[random.nextInt(50)]));
        }

        return fooBars;
    }
}
