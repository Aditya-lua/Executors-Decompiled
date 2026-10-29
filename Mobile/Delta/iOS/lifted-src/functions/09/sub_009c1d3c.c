/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c1d3c..0x9c1e88 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

int sub_9c1d3c(unsigned long long *a0, long long a1, long long *a2, long long a3)
{
    long long v11;  // x0
    long long v12;  // x22
    unsigned long v13;  // x8
    long long v14;  // x9
    char v0;  // [bp-0x40]
    char v1;  // [bp-0x3f]
    char v2;  // [bp-0x3e]
    char v3;  // [bp-0x3d]
    char v4;  // [bp-0x3c]
    char v5;  // [bp-0x3b]
    char v6;  // [bp-0x3a]
    char v7;  // [bp-0x39]
    unsigned long v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v11 = sub_9c13d0(0, 0, *a2);
    if (v11)
    {
        if ((unsigned long long)v11 >= 9)
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/a_int.c", 632, "ossl_c2i_uint64_int");
            sub_a36abc(13, 223, 0);
            v11 = 0;
        }
        else
        {
            v12 = v11;
            sub_9c13d0(&v0, a1, *a2, a3);
            v13 = v0;
            if (v12 != 1)
            {
                v14 = v12;
                v13 = v1 | v13 * 0x100;
                if (v12 != 2)
                {
                    v13 = v2 | v13 * 0x100;
                    if (v14 != 3)
                    {
                        v13 = v3 | v13 * 0x100;
                        if (v14 != 4)
                        {
                            v13 = v4 | v13 * 0x100;
                            if (v14 != 5)
                            {
                                v13 = v5 | v13 * 0x100;
                                if (v14 != 6)
                                {
                                    v13 = v6 | v13 * 0x100;
                                    if (v14 != 7)
                                        v13 = v7 | v13 * 0x100;
                                }
                            }
                        }
                    }
                }
            }
            *a0 = v13;
            v11 = 1;
        }
    }
    if (*(long long *)&g_10002b0 == v8)
        return v11;
    ___stack_chk_fail();
}
