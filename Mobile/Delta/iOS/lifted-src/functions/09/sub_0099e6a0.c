/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99e6a0..0x99eb58 (1208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99e6a0_3 {
    char padding_0[8];
    long long field_8;
    char padding_10[2288];
    struct st_99e6a0_1 *field_900;
    struct st_99e6a0_2 *field_908;
    long long field_910;
    long long field_918;
    char padding_920[536];
    unsigned int field_b38;
} st_99e6a0_3;

typedef struct st_99e6a0_4 {
    struct st_99e6a0_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[536];
    unsigned int field_230;
} st_99e6a0_4;

typedef struct st_99e6a0_0 {
    char padding_0[64];
    unsigned int field_40;
} st_99e6a0_0;

typedef struct st_99e6a0_2 {
    char padding_0[760];
    struct st_99e6a0_0 *field_2f8;
} st_99e6a0_2;

typedef struct st_99e6a0_1 {
    unsigned int field_0;
    char padding_4[732];
    unsigned long long field_2e0;
    char padding_2e8[16];
    struct st_99e6a0_0 *field_2f8;
    char padding_300[40];
    long long field_328;
    char padding_330[16];
    unsigned int field_340;
} st_99e6a0_1;


unsigned long long sub_99e6a0(st_99e6a0_3 *a0, long long a1)
{
    unsigned long v7;  // x22
    st_99e6a0_1 *v8;  // x8
    unsigned long long v17;  // w23
    st_99e6a0_4 *v18;  // x25
    unsigned long long v19;  // x8
    unsigned long long v20;  // x26
    unsigned long long v21;  // w0
    unsigned long long v22;  // x22
    long long v23;  // x1
    unsigned long long v24;  // x0
    long long v25;  // x1
    long long v26;  // x20
    unsigned long long v9;  // x24
    st_99e6a0_3 *v27;  // x0
    long long v28;  // x2
    unsigned long long v10;  // x21
    unsigned long v11;  // x0
    st_99e6a0_1 *v12;  // x8
    unsigned long long v13;  // x9
    unsigned long long v14;  // w9
    unsigned long long v15;  // x10
    unsigned long long v16;  // x27
    long long v0;  // [bp-0x90], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x80]
    unsigned long long v2;  // [bp-0x78]
    char v3;  // [bp-0x70], Other Possible Types: unsigned long
    char v4;  // [bp-0x68], Other Possible Types: long long
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = 0;
    v2 = 0;
    v7 = a0->field_8;
    a0->field_b38 = 0;
    v8 = a0->field_900;
    if (v8->field_0 != 772)
        return 2;
    if (!*(long long *)&v8->padding_330[0] && !a0->field_908)
        return 2;
    if (*(int *)&a0->padding_10[2240] == 1)
    {
        v9 = sub_95a6a8(a0);
        v8 = a0->field_900;
        if (!*(long long *)&v8->padding_330[0])
            goto LABEL_99e7b8;
LABEL_99e718:
        if (!v8->field_2f8)
        {
            sub_a368c8();
            v23 = 1099;
            goto LABEL_99ea4c;
        }
        v10 = sub_95a688(v7, v8->field_2f8->field_40);
        if (v10 && (*(int *)&a0->padding_10[2240] != 1 || v10 == v9))
        {
            v11 = sub_a7c2c0();
            v12 = a0->field_900;
            v13 = v11 - v12->field_2e0;
            if (v11 < v12->field_2e0)
                v13 = 0;
            v14 = (unsigned int)((v13 >> 9) / 1953125);
            if (v14 < 1)
                v15 = 0;
            else
                v15 = v14 - 1;
            if ((unsigned long long)*(long long *)&v12->padding_330[8] >= v15)
            {
                v16 = (unsigned int)v15 * 1000;
                if (v14 >= 2 && v16 & 0xffffffff00000000)
                {
                    v17 = 0;
                    goto LABEL_99e7c4;
                }
                else
                {
                    v16 += v12->field_340;
                    v17 = (unsigned int)sub_a50ac8(v10);
                    if (v17 > 0)
                    {
                        a0->field_b38 = a0->field_b38 + 1;
                        v18 = &a0->field_908;
                        v19 = a0->field_908;
                        if (v19)
                        {
                            v20 = 0;
                        }
                        else
                        {
                            v20 = 0;
                            v21 = 0;
                            v22 = 0;
LABEL_99e868:
                            if (!sub_c68d5c(a1, 41, 2) || !sub_c6876c(a1, 2) || !sub_c6876c(a1, 2))
                            {
                                sub_a368c8();
                                v23 = 1207;
                            }
                            else if (!(v20 & 1) && (!sub_a6ec4c(a1, a0->field_900->field_328, *(long long *)&a0->field_900->padding_330[0], 2) || !sub_c68d5c(a1, v16 & 0xffffffff, 4)))
                            {
                                sub_a368c8();
                                v23 = 1215;
                            }
                            else if (!v18->field_0)
                            {
LABEL_99e914:
                                if (sub_a6e970(a1) && sub_c68eb8(a1, &v4) && sub_c6876c(a1, 2) && (v20 & 1 || sub_a6e86c(a1, v17, &v2, 1)) && (!v18->field_0 || sub_a6e86c(a1, v21, &v1, 1)) && sub_a6e970(a1) && sub_a6e970(a1) && sub_c68eb8(a1, &v3) && sub_c68a08(a1))
                                {
                                    v26 = sub_a6e990(a1) - v3;
                                    if ((v20 & 1 || (*(unsigned int *)&v0 = 0, sub_99b3fc(a0, v10, v26, v4, 0, v2, a0->field_900, 1, v0) == 1)) && (!v18->field_0 || !(v0 = 1, sub_99b3fc(a0, v22, v26, v4, 0, v1) != 1)))
                                        return 1;
                                    goto LABEL_99ea94;
                                }
                                else
                                {
                                    sub_a368c8();
                                    v23 = 1245;
                                }
                            }
                            else if (sub_a6ec4c(a1, a0->field_910, a0->field_918, 2) && sub_c68d5c(a1, 0, 4))
                            {
                                a0->field_b38 = a0->field_b38 + 1;
                                goto LABEL_99e914;
                            }
                            else
                            {
                                sub_a368c8();
                                v23 = 1224;
                            }
LABEL_99ea4c:
                            sub_a369bc("ssl/statem/extensions_clnt.c", v23, "tls_construct_ctos_psk");
                            v27 = a0;
                            v28 = 786691;
                            goto LABEL_99ea8c;
                        }
LABEL_99e7d4:
                        v24 = sub_95a688(v7, *(int *)(*(long long *)(v19 + 760) + 64));
                        if (!v24)
                        {
                            sub_a368c8();
                            v25 = 1183;
                        }
                        else if (*(int *)&a0->padding_10[2240] == 1 && v24 != v9)
                        {
                            sub_a368c8();
                            v25 = 1192;
                        }
                        else
                        {
                            v22 = v24;
                            v21 = (unsigned int)sub_a50ac8();
                            if (v21 > 0)
                                goto LABEL_99e868;
                            sub_a368c8();
                            v25 = 1198;
                        }
                        sub_a369bc("ssl/statem/extensions_clnt.c", v25, "tls_construct_ctos_psk");
                        v27 = a0;
                        v28 = 219;
LABEL_99ea8c:
                        sub_9a58a4(v27, 80, v28, 0);
LABEL_99ea94:
                        return 0;
                    }
                }
            }
        }
    }
    else
    {
        v9 = 0;
        if (*(long long *)&v8->padding_330[0])
            goto LABEL_99e718;
LABEL_99e7b8:
        v10 = 0;
    }
    v17 = 0;
    v16 = 0;
LABEL_99e7c4:
    v19 = a0->field_908;
    if (!v19)
        return 2;
    v18 = &a0->field_908;
    v20 = 1;
    goto LABEL_99e7d4;
}
