/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac80e8..0xac85f8 (1296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ac80e8(long long a0, long long a1, long long a2, unsigned long long a3, long long a4)
{
    long long v7;  // x22
    long long v8;  // x0
    unsigned long v17;  // x8
    unsigned long long v18;  // x24
    long long v19;  // x0, Other Possible Types: unsigned long long
    unsigned long long v20;  // x21
    long long v21;  // x1
    unsigned long long v9;  // x19
    unsigned long long v10;  // x20
    long long v11;  // x28
    long long v12;  // x27
    unsigned long long v13;  // x0
    long long v14;  // x1
    unsigned int v15;  // w0
    unsigned long long v16;  // 4139
    unsigned long long v0;  // [bp-0x90]
    long long v1;  // [bp-0x88]
    long long v2;  // [bp-0x80]
    long long v3;  // [bp-0x78]
    unsigned long long v4;  // [bp-0x61], Other Possible Types: char
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = sub_9ffdd0(a4);
    v8 = sub_975ff4(a4);
    v4 = 0;
    if (!v8)
    {
        sub_a368c8();
        sub_a369bc("crypto/sm2/sm2_sign.c", 48, "ossl_sm2_compute_z_digest");
        sub_a36abc(53, 0xc0102, 0);
        v10 = 0;
        v9 = 0;
        goto LABEL_ac85a0;
    }
    v9 = sub_a3f728();
    if (!v9)
    {
        sub_a368c8();
        sub_a369bc("crypto/sm2/sm2_sign.c", 54, "ossl_sm2_compute_z_digest");
        sub_a36abc(53, 0x80006, 0);
        v10 = 0;
        goto LABEL_ac85a0;
    }
    v10 = sub_9dddcc(sub_a19700(a4));
    if (!v10)
    {
        sub_a368c8();
        v21 = 59;
        goto LABEL_ac82b0;
    }
    sub_9de064(v10);
    v19 = sub_9de208(v10);
    v11 = sub_9de208(v10);
    v12 = sub_9de208(v10);
    v3 = sub_9de208(v10);
    v2 = sub_9de208(v10);
    v1 = sub_9de208(v10);
    v13 = sub_9de208(v10);
    if (!v13)
    {
        sub_a368c8();
        v21 = 73;
LABEL_ac82b0:
        sub_a369bc("crypto/sm2/sm2_sign.c", v21, "ossl_sm2_compute_z_digest");
        goto LABEL_ac82c0;
    }
    v0 = v13;
    if (sub_a3fd98(v9, a1))
    {
        if (a3 >= 0x1fff)
        {
            sub_a368c8();
            sub_a369bc("crypto/sm2/sm2_sign.c", 86, "ossl_sm2_compute_z_digest");
            goto LABEL_ac8594;
        }
        v4 = a3 >> 5;
        if (sub_a3fe10(v9, &v4, 1))
        {
            v4 = (char)a3 * 8;
            if (!sub_a3fe10(v9, &v4, 1))
            {
                sub_a368c8();
                v14 = 99;
            }
            else if (!a3 || sub_a3fe10(v9, a2, a3))
            {
                if (sub_a1acc8(v7, v19, v11, v12, v10))
                {
                    v15 = sub_9e46a8(v19);
                    v16 = arm64g_calculate_condition(177, v15, 7, 0);
                    v17 = (v16 & 1 ? v15 + 14 : v15 + 7);
                    v18 = (long long)(v17 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v17, 61) & 0xe00000001fffffff & 0x1fffffff;
                    v19 = sub_a6bffc(v18, "crypto/sm2/sm2_sign.c", 114);
                    if (v19)
                    {
                        v19 = v19;
                        if (...)
                        {
                            v20 = 1;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/sm2/sm2_sign.c", 137, "ossl_sm2_compute_z_digest");
                            sub_a36abc(53, 0xc0103, 0);
                            v20 = 0;
                        }
                        goto LABEL_ac85a4;
                    }
                    else
                    {
                        v20 = 0;
                        goto LABEL_ac85a4;
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/sm2/sm2_sign.c", 109, "ossl_sm2_compute_z_digest");
                }
LABEL_ac82c0:
                goto LABEL_ac8594;
            }
            else
            {
                sub_a368c8();
                v14 = 104;
            }
        }
        else
        {
            sub_a368c8();
            v14 = 94;
        }
    }
    else
    {
        sub_a368c8();
        v14 = 78;
    }
    sub_a369bc("crypto/sm2/sm2_sign.c", v14, "ossl_sm2_compute_z_digest");
LABEL_ac8594:
    sub_a36abc(53);
    v20 = 0;
LABEL_ac85a0:
    v19 = 0;
LABEL_ac85a4:
    sub_a6c2e4(v19, "crypto/sm2/sm2_sign.c", 144);
    sub_9de17c(v10);
    sub_9dded4(v10);
    sub_a3f73c(v9);
    return v20;
}
