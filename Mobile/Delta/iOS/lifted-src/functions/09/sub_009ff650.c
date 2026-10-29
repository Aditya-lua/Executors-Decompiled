/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ff650..0x9ff938 (744 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ff650_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[72];
    unsigned int field_60;
    char padding_64[4];
    unsigned long long field_68;
    unsigned long long field_70;
    char padding_78[48];
    unsigned long long field_a8;
    char padding_b0[16];
    unsigned long long field_c0;
} st_9ff650_0;


long long sub_9ff650(void* a0)
{
    st_9ff650_0 *v2;  // x23
    long long v3;  // x1
    long long v12;  // w0
    long long v14;  // x22
    long long v4;  // x20
    long long v5;  // x24
    long long v6;  // x21
    long long v7;  // x22
    long long v8;  // x0
    long long v9;  // w0
    unsigned long v10;  // x2
    long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0 + 8;
    if ((int)sub_9e46a8((long long)a0[8]) >= 10001)
    {
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_key.c", 276, "generate_key");
        v3 = 103;
    }
    else if ((long long)a0[16] && (int)sub_9e46a8((long long)a0[16]) >= 10001)
    {
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_key.c", 282, "generate_key");
        v3 = 130;
    }
    else if (0x1ff >= (int)sub_9e46a8(v2->field_0))
    {
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_key.c", 287, "generate_key");
        v3 = 126;
    }
    else
    {
        v4 = sub_9dddcc((long long)a0[176]);
        if (v4)
        {
            v5 = (long long)a0[120];
            v6 = v5;
            if (v6 || !(v6 = sub_9e4988(), !v6))
            {
                v7 = (long long)a0[112];
                if ((long long)a0[112] || !(v7 = sub_9e4958(), !v7))
                {
                    if (v5)
                    {
LABEL_9ff784:
                        if (sub_9ff308(v4, a0, v6, v7))
                        {
                            *(long long *)&a0[112] = v7;
                            *(long long *)&a0[120] = v6;
                            *(long long *)&a0[200] = (long long)a0[200] + 1;
                            v14 = 1;
                            goto LABEL_9ff804;
                        }
                    }
                    else if (sub_9fec10(a0))
                    {
                        v8 = sub_ab148c(sub_9e46a8((long long)a0[8]));
                        if ((long long)a0[16] && !(v9 = (unsigned int)sub_9e46a8((long long)a0[16]), (int)sub_9e46a8((long long)a0[16]) < (int)a0[104]))
                        {
                            v10 = (int)a0[104];
                            v11 = v4;
                            goto LABEL_9ff8b0;
                        }
                    }
                    else if (!(long long)a0[16])
                    {
                        v12 = (unsigned int)sub_9e46a8((long long)a0[8]);
                        if (v12 > (int)a0[104] && sub_9e9188() && (!sub_9e5bc4((long long)a0[24], 2) || sub_9e5748(v2->field_0, 2) || sub_9e56a0(v6, 0)))
                            goto LABEL_9ff784;
                    }
                    else if (sub_a62f90((long long)a0[176], v2, 1, 0))
                    {
                        v10 = sub_9e46a8((long long)a0[16]);
                        v8 = 80;
                        v11 = v4;
LABEL_9ff8b0:
                        if (sub_a608b8(v11, v2, v10, v8, v6))
                            goto LABEL_9ff784;
                    }
                }
            }
            else
            {
                v7 = 0;
            }
        }
        else
        {
            v7 = 0;
            v6 = 0;
        }
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_key.c", 379, "generate_key");
        sub_a36abc(5, 0x80003, 0);
        if (v7 != (long long)a0[112])
            sub_9e48d4(v7);
        v14 = 0;
LABEL_9ff804:
        if (v6 != (long long)a0[120])
            sub_9e48d4(v6);
        sub_9dded4(v4);
        return v14;
    }
    sub_a36abc(5, v3, 0);
    return 0;
}
