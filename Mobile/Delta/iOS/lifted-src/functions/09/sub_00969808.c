/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x969808..0x969d00 (1272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_969808_1 {
    char padding_0[1616];
    unsigned long long field_650;
    char padding_658[8];
    struct st_969808_0 *field_660;
} st_969808_1;

typedef struct st_969808_4 {
    char padding_0[8];
    struct st_969808_1 *field_8;
    char padding_10[8];
    struct st_969808_2 *field_18;
    char padding_20[992];
    unsigned long long field_400;
    char padding_408[1144];
    struct st_969808_3 *field_880;
} st_969808_4;

typedef struct st_969808_2 {
    int field_0;
    char padding_4[212];
    void* field_d8;
} st_969808_2;

typedef struct st_969808_3 {
    char padding_0[28];
    char field_1c[4];
    char field_1e;
} st_969808_3;

typedef struct st_969808_0 {
    char padding_0[16];
    unsigned short field_10;
    char padding_12[6];
    unsigned int field_18;
    char padding_1c[4];
    unsigned int field_20;
} st_969808_0;


unsigned int sub_969808(st_969808_4 *a0, unsigned int a1, long long a2)
{
    unsigned long long v6;  // x0
    st_969808_2 *v17;  // x8
    unsigned long v18;  // x9
    char v19;  // w0
    long long v21;  // x1
    char v22;  // x0
    char v23;  // x8
    char v24;  // x0
    unsigned long long v25;  // x0
    unsigned long long v8;  // x8
    st_969808_0 *v9;  // x21
    unsigned long long v10;  // x8
    unsigned long long v11;  // x23
    unsigned long long v12;  // 4116
    char v13;  // x0
    unsigned long long v14;  // 4118
    unsigned long long v15;  // x0
    char v0;  // [bp-0x58], Other Possible Types: unsigned int
    char v1;  // [bp-0x4a]
    char v2;  // [bp-0x49]
    unsigned short *v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_9c7b68(a2);
    if (!((char)((char)a0->field_18->field_d8[80]) >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
    {
        if ((unsigned int)v6 == 116)
        {
            sub_a368c8();
            sub_a369bc("ssl/t1_lib.c", 2687, "tls12_check_peer_sigalg");
            sub_9a58a4();
            return 0;
        }
        if ((unsigned int)v6 == 6)
            v6 = 912;
        else
            v6 &= 0xffffffff;
    }
    v8 = a0->field_8->field_650;
    if (a0->field_8->field_650)
    {
        v9 = a0->field_8->field_660;
        while (1)
        {
            v10 = v8;
            if (v9->field_10 == a1)
                break;
            v9 += 2;
            v8 = v10 - 1;
            if (v10 == 1)
                goto LABEL_96993c;
        }
        if (*(int *)&v9[1].padding_0[8] && (v11 = v6, sub_969d00(a0, v9)))
        {
            v12 = arm64g_calculate_condition(1, v11 & 0xffffffff, 1, 0);
            if (v12 & 1)
            {
                v13 = sub_959f90(a2, 0, a0->field_8);
                if (!v13)
                {
                    sub_a368c8();
                    sub_a369bc("ssl/t1_lib.c", 2707, "tls12_check_peer_sigalg");
                    sub_9a58a4();
                    return 0;
                }
                v11 = *(int *)v13;
                v14 = arm64g_calculate_condition(0x11, v11 & 0xffffffff, 1, 0);
                if (!(v14 & 1))
                {
                    sub_a368c8();
                    sub_a369bc("ssl/t1_lib.c", 2715, "tls12_check_peer_sigalg");
                    sub_9a58a4(a0, 47, 370, 0);
                    return 0xffffffff;
                }
            }
            if (!((char)((char)a0->field_18->field_d8[80]) >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000 && (*(int *)&v9->padding_12[2] == 64 || *(int *)&v9->padding_12[2] == 675))
            {
LABEL_969aa4:
                sub_a368c8();
                sub_a369bc("ssl/t1_lib.c", 2727, "tls12_check_peer_sigalg");
                sub_9a58a4();
                return 0;
            }
            if ((unsigned int)v11 == v9->padding_1c)
            {
                v15 = v11;
                if ((unsigned int)v15 == 912)
                    v15 = sub_9c7b68(a2);
            }
            else
            {
                if ((unsigned int)v11 != 6 || v9->padding_1c != 912)
                    goto LABEL_969aa4;
                v15 = 6;
            }
            if (!sub_959ea4(v15, &v0, a0->field_8) || v9->field_20 != v0)
            {
                sub_a368c8();
                sub_a369bc("ssl/t1_lib.c", 2735, "tls12_check_peer_sigalg");
                sub_9a58a4();
                return 0;
            }
            if ((unsigned int)v11 == 408)
            {
                v17 = a0->field_18;
                v18 = (int)v17->field_d8[80];
                if (!(v18 >> 3 & 1) && v17->field_0 >= 772 && v17->field_0 != 0x10000 || a0->field_880->field_1c[2] & 3)
                {
                    v19 = sub_969e24(a2);
                    if (*(int *)&v9[1].padding_0[4] && v19 != *(int *)&v9[1].padding_0[4])
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/t1_lib.c", 2746, "tls12_check_peer_sigalg");
                        sub_9a58a4();
                        return 0;
                    }
                    v17 = a0->field_18;
                    v18 = (int)a0->field_18->field_d8[80];
                }
                if (!(v18 >> 3 & 1) && v17->field_0 >= 772 && v17->field_0 != 0x10000)
                    goto LABEL_969b80;
                if (!sub_968ec0(a0, sub_969e90(a2), 1))
                {
                    sub_a368c8();
                    sub_a369bc("ssl/t1_lib.c", 2753, "tls12_check_peer_sigalg");
                    sub_9a58a4();
                    return 0;
                }
                if ((a1 & 0xfffffeff) == 1027 || !(a0->field_880->field_1c & 0x30000))
                    goto LABEL_969b80;
                sub_a368c8();
                v21 = 2761;
            }
            else if (a0->field_880->field_1c[2] & 3)
            {
                sub_a368c8();
                v21 = 2767;
            }
            else
            {
LABEL_969b80:
                v22 = sub_9696b0(a0, 1, &v3);
                v23 = 0;
                if (v22)
                {
                    do
                    {
                        if (v3[v23] == a1)
                            goto LABEL_969bb8;
                    } while ((v23 += 1, v22 != v23));
LABEL_969bc0:
                    if (*(int *)&v9->padding_12[2] == 64 && !(a0->field_880->field_1c & 196609))
                        goto LABEL_969c08;
                    sub_a368c8();
                    v21 = 2779;
                }
                else
                {
LABEL_969bb8:
                    if (v23 == v22)
                        goto LABEL_969bc0;
                    if (*(int *)&v9->padding_12[2])
                    {
LABEL_969c08:
                        v24 = sub_95a688(a0->field_8, v9->field_18);
                        if (!v24)
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/t1_lib.c", 2783, "tls12_check_peer_sigalg");
                            sub_9a58a4();
                            return 0;
                        }
                        goto LABEL_969c78;
                    }
                    else
                    {
                        v24 = 0;
LABEL_969c78:
                        v1 = a1 >> 8;
                        v2 = a1;
                        v25 = sub_969f28(a0->field_8, v9);
                        if ((unsigned int)v25)
                        {
                            if (v24)
                                sub_9c7b68(v24);
                            if (sub_959e54(a0, 0x5000d, v25))
                            {
                                a0->field_400 = v9;
                                return 1;
                            }
                        }
                        sub_a368c8();
                        v21 = 2794;
                    }
                }
            }
            sub_a369bc("ssl/t1_lib.c", v21, "tls12_check_peer_sigalg");
            sub_9a58a4();
            return 0;
        }
    }
LABEL_96993c:
    sub_a368c8();
    sub_a369bc("ssl/t1_lib.c", 2698, "tls12_check_peer_sigalg");
    sub_9a58a4();
    return 0;
}
