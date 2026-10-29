/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa14a04..0xa14c64 (608 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

long long sub_a14a04(long long a0, unsigned long a1, unsigned long long a2, unsigned int a3)
{
    unsigned long v6;  // x0
    unsigned long v7;  // x22
    unsigned long v8;  // x23
    unsigned long v9;  // x21
    unsigned long long v10;  // x24
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v2 = 0;
    v3 = 0;
    if (a1)
    {
        v6 = sub_9ffdd0(a1);
        if (v6)
        {
            v7 = v6;
            if (a3 == 2)
            {
                v8 = 0;
LABEL_a14acc:
                v9 = 0;
                if (a3 == 1)
                {
                    v10 = "Public-Key";
                    goto LABEL_a14ae8;
                }
                else
                {
                    v10 = "ECDSA-Parameters";
                    goto LABEL_a14ae8;
                }
            }
            if (sub_975ff4(a1))
            {
                v8 = sub_a19928(a1, sub_9d4f84(a1), &v2, 0);
                if (v8)
                    goto LABEL_a14ac8;
                v9 = 0;
            }
            else
            {
                v8 = 0;
LABEL_a14ac8:
                if (a3)
                    goto LABEL_a14acc;
                if (sub_962b90(a1))
                {
                    v9 = sub_a19bd0(a1, &v3);
                    if (v9)
                        goto LABEL_a14c58;
                }
                else
                {
                    v9 = 0;
LABEL_a14c58:
                    v10 = "Private-Key";
LABEL_a14ae8:
                    if (sub_9d4cf4(a0, a2, 128))
                    {
                        v0 = v10;
                        v1 = sub_a1ab64(v7);
                        if ((int)sub_9d524c(a0, "%s: (%d bit)\n") >= 1 && (!v9 || (v0 = a2, v1 = &g_c7c2eb, (int)sub_9d524c(a0, "%*spriv:\n") >= 1 && sub_9ca9ac(a0, v3, v9, (unsigned int)a2 + 4))) && (!v8 || (v0 = a2, v1 = &g_c7c2eb, (int)sub_9d524c(a0, "%*spub:\n") >= 1 && sub_9ca9ac(a0, v2, v8, (unsigned int)a2 + 4))) && sub_a20174(a0, v7, a2))
                        {
                            sub_a6c4e8(v3, v9, "crypto/ec/ec_ameth.c", 342);
                            sub_a6c2e4(v2, "crypto/ec/ec_ameth.c", 343);
                            return 1;
                        }
                    }
                }
            }
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_ameth.c", 341, "do_EC_KEY_print");
            sub_a36abc(16, 0x80010, 0);
            sub_a6c4e8(v3, v9, "crypto/ec/ec_ameth.c", 342);
            sub_a6c2e4(v2, "crypto/ec/ec_ameth.c", 343);
            return 0;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ec_ameth.c", 292, "do_EC_KEY_print");
    sub_a36abc(16, 0xc0102, 0);
    return 0;
}
