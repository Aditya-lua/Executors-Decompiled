/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a74a0..0x9a79d0 (1328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a74a0_1 {
    char padding_0[216];
    struct st_9a74a0_0 *field_d8;
} st_9a74a0_1;

typedef struct st_9a74a0_3 {
    char padding_0[8];
    struct st_9a74a0_4 *field_8;
    char padding_10[8];
    struct st_9a74a0_1 *field_18;
    char padding_20[40];
    unsigned int field_48;
    char padding_4c[316];
    char field_188;
    char padding_189[659];
    int field_41c;
    char padding_420[208];
    struct st_9a74a0_2 *field_4f0;
    char padding_4f8[1032];
    struct st_9a74a0_5 *field_900;
    char padding_908[32];
    char field_928;
    char padding_929[137];
    char field_9b2;
    char padding_9b3[33];
    int field_9d4;
} st_9a74a0_3;

typedef struct st_9a74a0_2 {
    char padding_0[256];
    unsigned long long field_100;
} st_9a74a0_2;

typedef struct st_9a74a0_5 {
    unsigned int field_0;
} st_9a74a0_5;

typedef struct st_9a74a0_0 {
    char padding_0[80];
    char field_50;
} st_9a74a0_0;

typedef struct st_9a74a0_4 {
    long long field_0;
} st_9a74a0_4;


unsigned long long sub_9a74a0(st_9a74a0_3 *a0, long long a1)
{
    st_9a74a0_3 *v2;  // x19
    unsigned int *v3;  // x21
    unsigned long long v12;  // x0
    long long v13;  // w0
    char v14;  // x22
    unsigned long long *v4;  // x23
    unsigned long long v5;  // x0
    unsigned long long v7;  // x0
    long long v8;  // x1
    unsigned int *v9;  // x8
    unsigned long v10;  // x21
    char n;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    v3 = a0->field_900;
    v4 = a0->field_8;
    v5 = sub_9b1b7c();
    if ((unsigned int)v5)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 1190, "tls_construct_client_hello");
        sub_9a58a4(v2, 80, v5, 0);
        return 0;
    }
    if ((!v3 || !sub_9b0e34(v2, *v3, 0) || !sub_966dc0(v3)) && !*(int *)&v2->padding_4f8[984])
    {
        v7 = sub_96612c(v2, 0);
        if (!(unsigned int)v7)
            return v7;
    }
    if (!(v2->field_18->field_d8->field_50 >> 3 & 1))
    {
LABEL_9a768c:
        if (sub_c68d5c(a1, v2->field_9d4, 2) && sub_a6ebd4(a1, &v2->field_188, 32))
        {
            v9 = v2->field_900;
            v10 = v9 + 150;
            if (!*(int *)&v2->padding_4c[48] && *v9 != 772)
            {
                n = *(long long *)&v9[148];
                if (v2->field_48 == 772)
                {
                    *(unsigned long long *)&v2->padding_929[31] = n;
                    _memcpy(&v2->field_928, v10, n);
                    goto LABEL_9a76e8;
                }
            }
            else if (v2->field_48 != 772 || !(v2->field_9b2 >> 4 & 1))
            {
                n = 0;
LABEL_9a76e8:
                if (!sub_c6876c(a1, 1) || n && !sub_a6ebd4(a1, v10, n) || !sub_a6e970(a1))
                {
                    sub_a368c8();
                    v8 = 1297;
                }
                else if (v2->field_18->field_d8->field_50 >> 3 & 1 && (0xff < v2->field_4f0->field_100 || !sub_a6ec4c(a1)))
                {
                    sub_a368c8();
                    v8 = 1306;
                }
                else if (sub_c6876c(a1, 2))
                {
                    v12 = sub_9ab924(v2, sub_96125c(v2), a1);
                    if (!(unsigned int)v12)
                    {
                        return v12;
                    }
                    else if (!sub_a6e970(a1))
                    {
                        sub_a368c8();
                        v8 = 1323;
                    }
                    else if (sub_c6876c(a1, 1))
                    {
                        if (sub_9b0e10(v2) && v4[35] && (v2->field_18->field_d8->field_50 >> 3 & 1 || 0x303 >= v2->field_41c))
                        {
                            v13 = (unsigned int)sub_ad69e4();
                            if (v13 >= 1)
                            {
                                v14 = 0;
                                do
                                {
                                    if (!sub_c68d5c(a1, *(int *)sub_ad69f8(v4[35], v14), 1))
                                    {
                                        sub_a368c8();
                                        sub_a369bc("ssl/statem/statem_clnt.c", 1341, "tls_construct_client_hello");
                                        sub_9a58a4(v2, 80, 0xc0103, 0);
                                        return 0;
                                    }
                                } while ((v14 += 1, v13 != v14));
                            }
                        }
                        if (sub_c68d5c(a1, 0, 1) && sub_a6e970(a1))
                            return sub_99b1e4(v2, a1, 128, 0, 0) != 0;
                        sub_a368c8();
                        v8 = 1349;
                    }
                    else
                    {
                        sub_a368c8();
                        v8 = 1329;
                    }
                }
                else
                {
                    sub_a368c8();
                    v8 = 1313;
                }
            }
            else
            {
                n = 32;
                *(unsigned long long *)&v2->padding_929[31] = 32;
                v10 = &v2->field_928;
                if (*(int *)&v2->padding_4f8[984] || (n = 32, 0 < (int)sub_aa8658(*v4, v10, 32, 0)))
                    goto LABEL_9a76e8;
                sub_a368c8();
                v8 = 0x500;
            }
        }
        else
        {
            sub_a368c8();
            v8 = 1264;
        }
    }
    else
    {
        if (...)
            goto LABEL_9a768c;
        sub_a368c8();
        v8 = 1225;
    }
    sub_a369bc("ssl/statem/statem_clnt.c", v8, "tls_construct_client_hello");
    sub_9a58a4(v2, 80, 0xc0103, 0);
    return 0;
}
