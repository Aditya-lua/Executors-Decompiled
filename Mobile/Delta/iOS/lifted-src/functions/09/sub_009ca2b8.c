/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ca2b8..0x9ca51c (612 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ca2b8_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_9ca2b8_0;

typedef struct st_9ca2b8_1 {
    struct st_9ca2b8_0 *field_0;
    char padding_8[8];
    unsigned long long field_10;
    unsigned long long field_18;
} st_9ca2b8_1;

extern long long g_e8a458;

unsigned long long sub_9ca2b8(unsigned int a0, unsigned long long a1, unsigned long long a2, unsigned long long a3, unsigned int a4, long long a5)
{
    long long v2;  // x20
    st_9ca2b8_1 *v3;  // x19
    unsigned long long *v12;  // x2
    unsigned long long v4;  // x0
    st_9ca2b8_0 *v5;  // x27
    unsigned long long n;  // x26
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned long long v9;  // x21
    long long v10;  // x22
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 524301;
    v3 = sub_9cde20(&g_e8a458);
    if (v3)
    {
        v4 = sub_9cf0ec();
        if (v4)
        {
            v5 = v4;
            v3->field_0->field_8 = v4;
            v3->field_0->field_0 = 4;
            if (!(a2 >> 31 & 1))
            {
                if (!(unsigned int)a2)
                    n = 16;
                else
                    n = a2 & 0xffffffff;
                v7 = sub_a6bf4c();
                v5->field_8 = v7;
                if (!v7)
                {
                    sub_9cd960(v3, &g_e8a458);
                    sub_9cf6c8(0);
                    return 0;
                }
                v5->field_0 = n;
                if (a1)
                {
                    _memcpy(v7, a1, n);
LABEL_9ca3bc:
                    if (!sub_9c19dc())
                    {
                        v9 = 0;
                        v10 = 222;
                    }
                    else if ((int)a4 >= 1)
                    {
                        v8 = sub_9cf11c();
                        v3->field_10 = v8;
                        if (v8)
                        {
                            if (sub_9c19dc())
                                goto LABEL_9ca3f4;
                            v9 = 0;
                            v10 = 234;
                        }
                        else
                        {
                            v9 = 0;
                            v10 = 230;
                        }
                    }
                    else
                    {
LABEL_9ca3f4:
                        if ((int)a3 < 1 || (unsigned int)a3 == 163 || (v11 = sub_9cf764(a3, 5, 0), v3->field_18 = v11, v11))
                        {
                            v9 = sub_9cf6bc();
                            if (v9)
                            {
                                v12 = v9;
                                *v12 = sub_a99624(69);
                                if (sub_9c5460(&g_e8a458, v3, v12 + 1))
                                {
                                    sub_9cd960(v3, &g_e8a458);
                                    return v9;
                                }
                                v10 = 262;
                            }
                            else
                            {
                                v2 = 524299;
                                v10 = 252;
                            }
                        }
                        else
                        {
                            v9 = 0;
                            v2 = 524299;
                            v10 = 243;
                        }
                    }
                }
                else
                {
                    if ((int)sub_aa8658(a5) >= 1)
                        goto LABEL_9ca3bc;
                    v9 = 0;
                    v2 = 524324;
                    v10 = 214;
                }
            }
            else
            {
                v9 = 0;
                v2 = 524550;
                v10 = 201;
            }
        }
        else
        {
            v9 = 0;
            v10 = 193;
        }
    }
    else
    {
        v9 = 0;
        v10 = 189;
    }
    sub_a368c8();
    sub_a369bc("crypto/asn1/p5_pbev2.c", v10, "PKCS5_pbkdf2_set_ex");
    sub_a36abc(13, v2, 0);
    sub_9cd960(v3, &g_e8a458);
    sub_9cf6c8(v9);
    return 0;
}
