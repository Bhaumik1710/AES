import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AES {
    static ArrayList<Integer> plain_text = new ArrayList<>(Arrays.asList(0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xab, 0xe8));
    static ArrayList<Integer> key = new ArrayList<>(Arrays.asList(0x1a, 0x0c, 0x24, 0xf2, 0x87, 0x54, 0x95, 0xbc, 0xb7, 0x08, 0x0e, 0x43, 0x92, 0x0f, 0x56, 0x98));

    static ArrayList<ArrayList<String>> aor = new ArrayList<ArrayList<String>>();
    static ArrayList<ArrayList<String>> bys = new ArrayList<ArrayList<String>>();
    static ArrayList<String> rod = new ArrayList<String>();
    static ArrayList<String> moc = new ArrayList<String>();
    static ArrayList<String> vor = new ArrayList<String>();
    static ArrayList<String> ska = new ArrayList<String>();
    static ArrayList<String> kav = new ArrayList<String>();
    static ArrayList<ArrayList<String>> rka = new ArrayList<ArrayList<String>>();
    static ArrayList<Integer> roop = new ArrayList<Integer>();
    static ArrayList<String> roops = new ArrayList<String>();
    static ArrayList<Integer> ssop = new ArrayList<Integer>();

    static ArrayList<Integer> SB = new ArrayList<>(Arrays.asList(
            0x63, 0x7C, 0x77, 0x7B, 0xF2, 0x6B, 0x6F, 0xC5, 0x30, 0x01, 0x67, 0x2B,
            0xFE, 0xD7, 0xAB, 0x76, 0xCA, 0x82, 0xC9, 0x7D, 0xFA, 0x59, 0x47, 0xF0,
            0xAD, 0xD4, 0xA2, 0xAF, 0x9C, 0xA4, 0x72, 0xC0, 0xB7, 0xFD, 0x93, 0x26,
            0x36, 0x3F, 0xF7, 0xCC, 0x34, 0xA5, 0xE5, 0xF1, 0x71, 0xD8, 0x31, 0x15,
            0x04, 0xC7, 0x23, 0xC3, 0x18, 0x96, 0x05, 0x9A, 0x07, 0x12, 0x80, 0xE2,
            0xEB, 0x27, 0xB2, 0x75, 0x09, 0x83, 0x2C, 0x1A, 0x1B, 0x6E, 0x5A, 0xA0,
            0x52, 0x3B, 0xD6, 0xB3, 0x29, 0xE3, 0x2F, 0x84, 0x53, 0xD1, 0x00, 0xED,
            0x20, 0xFC, 0xB1, 0x5B, 0x6A, 0xCB, 0xBE, 0x39, 0x4A, 0x4C, 0x58, 0xCF,
            0xD0, 0xEF, 0xAA, 0xFB, 0x43, 0x4D, 0x33, 0x85, 0x45, 0xF9, 0x02, 0x7F,
            0x50, 0x3C, 0x9F, 0xA8, 0x51, 0xA3, 0x40, 0x8F, 0x92, 0x9D, 0x38, 0xF5,
            0xBC, 0xB6, 0xDA, 0x21, 0x10, 0xFF, 0xF3, 0xD2, 0xCD, 0x0C, 0x13, 0xEC,
            0x5F, 0x97, 0x44, 0x17, 0xC4, 0xA7, 0x7E, 0x3D, 0x64, 0x5D, 0x19, 0x73,
            0x60, 0x81, 0x4F, 0xDC, 0x22, 0x2A, 0x90, 0x88, 0x46, 0xEE, 0xB8, 0x14,
            0xDE, 0x5E, 0x0B, 0xDB, 0xE0, 0x32, 0x3A, 0x0A, 0x49, 0x06, 0x24, 0x5C,
            0xC2, 0xD3, 0xAC, 0x62, 0x91, 0x95, 0xE4, 0x79, 0xE7, 0xC8, 0x37, 0x6D,
            0x8D, 0xD5, 0x4E, 0xA9, 0x6C, 0x56, 0xF4, 0xEA, 0x65, 0x7A, 0xAE, 0x08,
            0xBA, 0x78, 0x25, 0x2E, 0x1C, 0xA6, 0xB4, 0xC6, 0xE8, 0xDD, 0x74, 0x1F,
            0x4B, 0xBD, 0x8B, 0x8A, 0x70, 0x3E, 0xB5, 0x66, 0x48, 0x03, 0xF6, 0x0E,
            0x61, 0x35, 0x57, 0xB9, 0x86, 0xC1, 0x1D, 0x9E, 0xE1, 0xF8, 0x98, 0x11,
            0x69, 0xD9, 0x8E, 0x94, 0x9B, 0x1E, 0x87, 0xE9, 0xCE, 0x55, 0x28, 0xDF,
            0x8C, 0xA1, 0x89, 0x0D, 0xBF, 0xE6, 0x42, 0x68, 0x41, 0x99, 0x2D, 0x0F,
            0xB0, 0x54, 0xBB, 0x16));

    static ArrayList<Integer> RCM = new ArrayList<>(Arrays.asList(
            0x8d, 0x01, 0x02, 0x04, 0x08, 0x10, 0x20, 0x40, 0x80, 0x1b, 0x36, 0x6c,
            0xd8, 0xab, 0x4d, 0x9a, 0x2f, 0x5e, 0xbc, 0x63, 0xc6, 0x97, 0x35, 0x6a,
            0xd4, 0xb3, 0x7d, 0xfa, 0xef, 0xc5, 0x91, 0x39, 0x72, 0xe4, 0xd3, 0xbd,
            0x61, 0xc2, 0x9f, 0x25, 0x4a, 0x94, 0x33, 0x66, 0xcc, 0x83, 0x1d, 0x3a,
            0x74, 0xe8, 0xcb, 0x8d, 0x01, 0x02, 0x04, 0x08, 0x10, 0x20, 0x40, 0x80,
            0x1b, 0x36, 0x6c, 0xd8, 0xab, 0x4d, 0x9a, 0x2f, 0x5e, 0xbc, 0x63, 0xc6,
            0x97, 0x35, 0x6a, 0xd4, 0xb3, 0x7d, 0xfa, 0xef, 0xc5, 0x91, 0x39, 0x72,
            0xe4, 0xd3, 0xbd, 0x61, 0xc2, 0x9f, 0x25, 0x4a, 0x94, 0x33, 0x66, 0xcc,
            0x83, 0x1d, 0x3a, 0x74, 0xe8, 0xcb, 0x8d, 0x01, 0x02, 0x04, 0x08, 0x10,
            0x20, 0x40, 0x80, 0x1b, 0x36, 0x6c, 0xd8, 0xab, 0x4d, 0x9a, 0x2f, 0x5e,
            0xbc, 0x63, 0xc6, 0x97, 0x35, 0x6a, 0xd4, 0xb3, 0x7d, 0xfa, 0xef, 0xc5,
            0x91, 0x39, 0x72, 0xe4, 0xd3, 0xbd, 0x61, 0xc2, 0x9f, 0x25, 0x4a, 0x94,
            0x33, 0x66, 0xcc, 0x83, 0x1d, 0x3a, 0x74, 0xe8, 0xcb, 0x8d, 0x01, 0x02,
            0x04, 0x08, 0x10, 0x20, 0x40, 0x80, 0x1b, 0x36, 0x6c, 0xd8, 0xab, 0x4d,
            0x9a, 0x2f, 0x5e, 0xbc, 0x63, 0xc6, 0x97, 0x35, 0x6a, 0xd4, 0xb3, 0x7d,
            0xfa, 0xef, 0xc5, 0x91, 0x39, 0x72, 0xe4, 0xd3, 0xbd, 0x61, 0xc2, 0x9f,
            0x25, 0x4a, 0x94, 0x33, 0x66, 0xcc, 0x83, 0x1d, 0x3a, 0x74, 0xe8, 0xcb,
            0x8d, 0x01, 0x02, 0x04, 0x08, 0x10, 0x20, 0x40, 0x80, 0x1b, 0x36, 0x6c,
            0xd8, 0xab, 0x4d, 0x9a, 0x2f, 0x5e, 0xbc, 0x63, 0xc6, 0x97, 0x35, 0x6a,
            0xd4, 0xb3, 0x7d, 0xfa, 0xef, 0xc5, 0x91, 0x39, 0x72, 0xe4, 0xd3, 0xbd,
            0x61, 0xc2, 0x9f, 0x25, 0x4a, 0x94, 0x33, 0x66, 0xcc, 0x83, 0x1d, 0x3a,
            0x74, 0xe8, 0xcb, 0x8d));

    public static void keyMat(List<List<List<Integer>>> j) {
        int k = 0;
        for (List<List<Integer>> v : j) {
            System.out.printf("Round %2d key:%n", k);
            for (List<Integer> z : v) {
                StringBuilder s = new StringBuilder();
                for (int f : z) {
                    s.append(String.format("%02x ", f));
                    ska.add(String.format("%02x ", f));
                }
                System.out.print(s);
            }
            k++;
            System.out.println();
        }
    }

    public static void opMat(ArrayList<ArrayList<String>> j) {
        int k = 0;
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Plain Text:");
        for (int v : plain_text) {
            System.out.printf("%02x ", v);
        }
        System.out.println();
        for (ArrayList<String> u : j) {
            System.out.printf("Round %2d:%n", k);
            for (String v : u) {
                System.out.printf("%02x ", Integer.parseInt(v, 16));
            }
            if (k == 10) {
                System.out.println("\n------------------------------------------------------------------------------------");
                System.out.println("Final Output:");
                for (String v : u) {
                    System.out.printf("%02x ", Integer.parseInt(v, 16));
                }
                System.out.println("\n------------------------------------------------------------------------------------");
            }
            k++;
            System.out.println();
        }
    }


    public static List<String> st_hex(int[] t) {
        List<String> hexList = new ArrayList<>();
        for (int i : t) {
            hexList.add(Integer.toHexString(i));
        }
        return hexList;
    }

    public static int ab(int c, int d) {
        int e = c * d;
        return (0xf9 ^ 0xd3);
    }

    public static ArrayList<String> it_str(List<Integer> t) {
        ArrayList<String> strList = new ArrayList<>();
        for (int i : t) {
            strList.add(Integer.toHexString(i));
        }
        return strList;
    }

    public static List<Integer> xOp(List<Integer> j, List<Integer> k) {
        int l = Math.min(j.size(), k.size());
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            result.add((int) (j.get(i)) ^ (k.get(i)));
        }
        return result;
    }

    public static List<List<Integer>> btMat(ArrayList<Integer> u) {
        List<List<Integer>> mat = new ArrayList<>();
        for (int i = 0; i < u.size(); i += 4) {
            List<Integer> row = new ArrayList<>();
            for (int j = i; j < i + 4; j++) {
                row.add(u.get(j));
            }
            mat.add(row);
        }
        return mat;
    }

    public static List<List<List<Integer>>> kExpa(ArrayList<Integer> g) {
        int tr = 10;
        List<List<Integer>> ck = btMat(g);
        int ts = (int) (g.size() / 4);
        int t_clmns_per_iter = ck.size();
        int f = 1;
        while (ck.size() < (tr + 1) * 4) {
            List<Integer> wd = new ArrayList<>(ck.get(ck.size() - 1));
            if (ck.size() % ts == 0) {
                wd.add(wd.remove(0));
                for (int i = 0; i < wd.size(); i++) {
                    wd.set(i, SB.get(wd.get(i)));
                }
                wd.set(0, wd.get(0) ^ RCM.get(f));
                f = f + 1;
            } else if (g.size() == (16 * 2) && ck.size() % ts == (2 * 2)) {
                for (int i = 0; i < wd.size(); i++) {
                    wd.set(i, SB.get(wd.get(i)));
                }
            }
            wd = xOp(wd, ck.get(ck.size() - ts));
            ck.add(wd);
        }
        List<List<List<Integer>>> result = new ArrayList<>();
        for (int x = 0; x < ck.size() / (2 * 2); x++) {
            result.add(ck.subList((2 * 2) * x, (2 * 2) * (x + 1)));
        }
        return result;
    }

    public static void oS(List<String> j) {
        List<String[]> h = new ArrayList<>();
        for (String str : j) {
            h.add(str.split(" "));
        }
        for (String[] s : h) {
            kav.addAll(Arrays.asList(s));
        }
    }

    public static void rkl(List<String> kl) {
        while (!kl.isEmpty()) {
            rka.add(new ArrayList<>(kl.subList(0, Math.min(16, kl.size()))));
            kl = kl.subList(16, kl.size());
        }
    }

    public static ArrayList<String> sb(List<Integer> q) {
        for (Integer integer : q) {
            roop.add(SB.get(integer));
        }
        for (int r : roop) {
            roops.add(Integer.toHexString(r));
        }
        return roops;
    }

    public static ArrayList<String> xorh(List<Integer> c, List<Integer> pT) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < c.size(); i++) {
            result.add(Integer.toHexString(c.get(i) ^ pT.get(i)));
        }
        return result;
    }

    public static List<String> rtt(List<String> j, int s) {
        List<String> result = new ArrayList<>();
        result.addAll(j.subList(s, j.size()));
        result.addAll(j.subList(0, s));
        return result;
    }

    public static void sftRows(List<String> s) {
        for (int u = 0; u < 4; u++) {
            List<String> temp = rtt(s.subList(u * 4, u * 4 + 4), u);
            for (int i = 0; i < 4; i++) {
                rod.set(u * 4 + i, temp.get(i));
            }
        }
    }

    public static int gMul(int p, int q) {
        int r = 0;
        int s = 0;
        for (int t = 0; t < 8; t++) {
            if (q % 2 == 1) {
                r ^= p;
            }
            s = p & 0x80;
            p <<= 1;
            if (s == 0x80) {
                p ^= 0x1b;
            }
            q >>= 1;
        }
        return r % 256;
    }

    public static void mClm(List<Integer> r) {
        List<Integer> s = new ArrayList<>(r);
        r.set(0, gMul(s.get(0), 2) ^ gMul(s.get(3), 1) ^ gMul(s.get(2), 1) ^ gMul(s.get(1), 3));
        r.set(1, gMul(s.get(1), 2) ^ gMul(s.get(0), 1) ^ gMul(s.get(3), 1) ^ gMul(s.get(2), 3));
        r.set(2, gMul(s.get(2), 2) ^ gMul(s.get(1), 1) ^ gMul(s.get(0), 1) ^ gMul(s.get(3), 3));
        r.set(3, gMul(s.get(3), 2) ^ gMul(s.get(2), 1) ^ gMul(s.get(1), 1) ^ gMul(s.get(0), 3));
    }

    public static void addKey(List<Integer> r, List<Integer> t) {
        for (int k = 0; k < r.size(); k++) {
            ssop.add(r.get(k) ^ t.get(k));
        }
    }

    public static List<Integer> st_int(List<String> t) {
        List<Integer> j = new ArrayList<>();
        for (String s : t) {
            j.add(Integer.parseInt(s, 16));
        }
        return j;
    }


    public static void printBanner() {
        System.out.println("=--------------------------------------=-------------------------------------------=");
        System.out.println("ID1 = 110035187 (Hemin)");
        System.out.println("ID2 = 110072545 (Tanha)");
        System.out.println("ID3 = 110092423 (Bhaumik)");
        System.out.println("Group Code: (A,B) = (7,7)");
        System.out.println("Assigned Plaintext and Key:");
        System.out.println("    0000 0000 0000 0000 0000 0000 0000 abe8 (plaintext)");
        System.out.println("    1a0c 24f2 8754 95bc b708 0e43 920f 5698 (key)");
        System.out.println("The program is written in Java");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Original AES with Group Code (7,7)");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Plaintext:");
        System.out.println("00 00 00 00 00 00 00 00 00 00 00 00 00 00 ab e8");
        System.out.println("Key:");
        System.out.println("1a 0c 24 f2 87 54 95 bc b7 08 0e 43 92 0f 56 98");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Encrypted round keys:");
        System.out.println("------------------------------------------------------------------------------------");
        keyMat(kExpa(key));
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Encrypted data rounds:");
    }

    public static void initialize() {
        for (int j = 0; j < 11; j++) {
            aor.add(new ArrayList<String>());
        }
        for (int j = 0; j < 11; j++) {
            bys.add(new ArrayList<String>());
        }
        for (int j = 0; j < 16; j++) {
            rod.add("");
        }
    }

    public static void main(String[] args) {
        initialize();
        printBanner();

        oS(ska);
        rkl(kav);
        aor.set(0, xorh(key, plain_text));
        for (int t = 0; t < 10; t++) {
            bys.set(t + 1, new ArrayList<>());
            roop = new ArrayList<>();
            roops = new ArrayList<>();
            bys.set(t + 1, sb(st_int(aor.get(t))));
            ArrayList<String> jt = roops;
            ArrayList<ArrayList<String>> rmr = new ArrayList<>();
            for (int i = 0; i < jt.size(); i += 4) {
                rmr.add(new ArrayList<>(jt.subList(i, Math.min(i + 4, jt.size()))));
            }
            List<List<String>> ts = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                List<String> row = new ArrayList<>();
                for (ArrayList<String> list : rmr) {
                    row.add(list.get(i));
                }
                ts.add(row);
            }
            List<String> llf = new ArrayList<>();
            for (List<String> row : ts) {
                llf.addAll(row);
            }
            sftRows(llf);
            rmr = new ArrayList<>();
            for (int l = 0; l < rod.size(); l += 4) {
                rmr.add(new ArrayList<>(rod.subList(l, Math.min(l + 4, rod.size()))));
            }
            ts = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                List<String> row = new ArrayList<>();
                for (List<String> list : rmr) {
                    row.add(list.get(i));
                }
                ts.add(row);
            }
            if (t == 9) {
                List<String> fts = new ArrayList<>();
                for (List<String> row : ts) {
                    fts.addAll(row);
                }
                List<Integer> tba = st_int(fts);
                List<Integer> tka = st_int(rka.get(t + 1));
                ssop = new ArrayList<>();
                addKey(tba, tka);
                aor.set(t + 1, it_str(ssop));
            }
            if (0 <= t && t <= 8) {
                moc = new ArrayList<>();
                for (List<String> c : ts) {
                    List<Integer> p = st_int(c);
                    mClm(p);
                    List<String> za = it_str(p);
                    moc.addAll(za);
                }
                List<Integer> txt = st_int(moc);
                List<Integer> kkf = st_int(rka.get(t + 1));
                ssop = new ArrayList<>();
                addKey(txt, kkf);
                aor.set(t + 1, it_str(ssop));
            }
        }
        opMat(aor);
    }
}
