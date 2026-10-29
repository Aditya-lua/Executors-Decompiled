/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac8c70..0xac8dd8 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ac8c70(unsigned long a0, unsigned long a1, unsigned long long a2, unsigned int *a3, long long a4)
{
    unsigned long long v3;  // x19
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x20
    long long v7;  // x1
    unsigned long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a2;
    if (a2)
    {
        v3 = sub_9e4db0();
        if (v3)
        {
            v4 = sub_ac85f8(a4, v3);
            if (v4)
            {
                v5 = sub_a03638();
                if (!(v5 >> 31 & 1))
                {
                    *a3 = v5;
                    v6 = 1;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/sm2/sm2_sign.c", 490, "ossl_sm2_internal_sign");
                    sub_a36abc(53, 0xc0103, 0);
                    v6 = 0xffffffff;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/sm2/sm2_sign.c", 484, "ossl_sm2_internal_sign");
                v7 = 786691;
LABEL_ac8d68:
                sub_a36abc(53, v7, 0);
                v4 = 0;
                v6 = 0xffffffff;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/sm2/sm2_sign.c", 478, "ossl_sm2_internal_sign");
            v7 = 524291;
            goto LABEL_ac8d68;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/sm2/sm2_sign.c", 472, "ossl_sm2_internal_sign");
        sub_a36abc(53, 0xc0102, 0);
        v4 = 0;
        v3 = 0;
        v6 = 0xffffffff;
    }
    sub_a16990(v4);
    sub_9e48d4(v3);
    return v6;
}
