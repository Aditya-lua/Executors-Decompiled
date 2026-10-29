/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x957c58..0x958054 (1020 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_957c58_0 {
    struct st_957c58_0 *field_0;
    struct st_957c58_0 *field_4;
    struct st_957c58_0 *field_8;
    struct st_957c58_0 *field_10;
    struct st_957c58_0 *field_18;
    struct st_957c58_0 *field_20;
    char padding_28[8];
    struct st_957c58_0 *field_30;
    struct st_957c58_0 *field_38;
    struct st_957c58_0 *field_40;
    long long field_48;
    int field_50;
    char padding_54[4];
    long long field_58;
    unsigned long long field_60;
    unsigned int field_68;
    char padding_6c[4];
    struct st_957c58_0 *field_70;
    long long field_78;
    long long field_80;
    long long field_88;
    unsigned long long field_90;
    unsigned int field_98;
    char padding_9c[4];
    struct st_957c58_0 *field_a0;
    unsigned int field_a8;
    char padding_ac[4];
    struct st_957c58_0 *field_b0;
    unsigned int field_b8;
    char padding_bc[4];
    struct st_957c58_0 *field_c0;
    char padding_c8[392];
    struct st_957c58_0 *field_250;
    char field_258;
    char padding_259[31];
    char field_278;
    char padding_279[7];
    char field_280;
    char padding_281[31];
    char field_2a0;
    char padding_2a1[7];
    char field_2a8;
    char padding_2a9[15];
    struct st_957c58_0 *field_2b8;
    struct st_957c58_0 *field_2c0;
    char padding_2c8[8];
    unsigned long long field_2d0;
    unsigned long long field_2d8;
    unsigned long long field_2e0;
    char padding_2e8[8];
    unsigned int field_2f0;
    char padding_2f4[4];
    struct st_957c58_0 *field_2f8;
    long long field_300;
    unsigned int field_308;
    char padding_30c[20];
    char field_320;
    char padding_321[7];
    struct st_957c58_0 *field_328;
    unsigned long long field_330;
    unsigned long long field_338;
    unsigned int field_340;
    unsigned int field_344;
    struct st_957c58_0 *field_348;
    struct st_957c58_0 *field_350;
    char field_358;
    char padding_359[7];
    char field_360;
    char padding_361[7];
    struct st_957c58_0 *field_368;
    struct st_957c58_0 *field_370;
    unsigned int field_378;
} st_957c58_0;

extern long long g_e84dd0;

st_957c58_0 * sub_957c58(st_957c58_0 *a0, unsigned long long *a1, unsigned long a2, long long a3, long long a4)
{
    st_957c58_0 *v4;  // x21
    st_957c58_0 *v5;  // x20
    st_957c58_0 *v14;  // x8
    st_957c58_0 *v15;  // x25
    st_957c58_0 *v16;  // x8
    unsigned long long v17;  // x0
    unsigned long long v18;  // x8
    st_957c58_0 *v19;  // x8
    st_957c58_0 *v20;  // x0
    st_957c58_0 *v21;  // x9
    st_957c58_0 *v22;  // x8
    st_957c58_0 *v23;  // x8
    st_957c58_0 *v6;  // w8
    st_957c58_0 *v24;  // x10
    st_957c58_0 *v25;  // x8
    st_957c58_0 *v26;  // x9
    st_957c58_0 *v27;  // x10
    st_957c58_0 *v28;  // x8
    st_957c58_0 *v29;  // x9
    long long v8;  // x22
    long long v9;  // x23
    unsigned long v10;  // x8
    unsigned long long v11;  // x0
    st_957c58_0 *v12;  // x0
    st_957c58_0 *v13;  // x25
    st_957c58_0 *v0;  // [bp-0x60]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *a1;
    v4 = sub_9cae2c(0, &v1);
    if (!v4)
    {
        v5 = 0;
    }
    else if (a0 && !(v5 = a0->field_0, !a0->field_0) || !(v5 = sub_965b4c(), !v5))
    {
        if ((int)v4->field_0 != 1)
        {
            v8 = 254;
            v9 = 286;
            goto LABEL_957d7c;
        }
        v6 = (st_957c58_0 *)*(int *)((char *)&v4->field_0 + 4);
        if (v6 >> 8 == 3 || v6 >> 8 == 254 || v6 == 0x100)
        {
            *(unsigned int *)&v5->field_0 = (unsigned int)v6;
            *(int *)&v5->field_300 = (int)v4->field_b0;
            if ((int)v4->field_4->field_0 != 2)
            {
                v8 = 137;
                v9 = 302;
                goto LABEL_957d7c;
            }
            v10 = (short)v4->field_4->field_4->field_0;
            v11 = (unsigned int)((v10 & 0xff00) >> 8) | (unsigned int)v10 * 0x100 & 0xff00ff00 | 0x3000000;
            v5->field_2f8 = v11;
            v12 = sub_955b68(v11);
            *(st_957c58_0 **)&v5->field_2f0 = v12;
            if (v12)
            {
                v13 = v4->field_18;
                if (!v13 || !(int)v13->field_0)
                {
                    v14 = 0;
LABEL_957df8:
                    *(st_957c58_0 **)&v5->padding_c8[384] = v14;
                    v15 = v4->field_10;
                    if (v15 && (int)v15->field_0)
                    {
                        if (0x200 >= (unsigned int)(int)v15->field_0)
                        {
                            _memcpy(&v5->field_48, v15->field_4);
                            v16 = (int)v15->field_0;
                            goto LABEL_957e2c;
                        }
                    }
                    else
                    {
                        v16 = 0;
LABEL_957e2c:
                        v5->field_4 = v16;
                        if (v4->padding_28)
                            v17 = (unsigned long long)(1000000000 * v4->padding_28);
                        else
                            v17 = sub_a7c2c0();
                        v5->field_2d8 = v17;
                        v18 = 3000000000;
                        if (v4->field_30)
                            v18 = 1000000000 * v4->field_30;
                        v5->field_2d0 = v18;
                        sub_965adc();
                        sub_afc404(v5->field_2b8);
                        v5->field_2b8 = v4->field_38;
                        v4->field_38 = 0;
                        sub_a5a4c8(*(long long *)&v5->padding_2a9[7]);
                        *(unsigned long long *)&v5->padding_2a9[7] = 0;
                        v19 = *(long long *)&v4->field_b8;
                        if ((!v19 || (v0 = v19->field_4, v20 = sub_afb6e0(0, &v0, (int)v19->field_0, a3, a4), *(st_957c58_0 **)&v5->padding_2a9[7] = v20, v20)) && sub_958054(&v5->field_278, &v5->padding_259[23], v4->field_40, 32) && (*(long long *)v5->padding_2c8 = (int)v4->field_48, sub_9580bc(&v5->padding_30c[12], *(long long *)&v4->field_50) && sub_9580bc(&v5->padding_281[23], v4->field_70) && sub_9580bc(&v5->field_2a0, v4->field_78)))
                        {
                            v5->field_330 = v4->field_58;
                            *(int *)&v5->field_338 = v4->field_60;
                            sub_a6c2e4(*(long long *)&v5->field_320, "ssl/ssl_asn1.c", 371);
                            v21 = *(long long *)&v4->field_68;
                            if (v21)
                            {
                                v22 = v21->field_4;
                                v5->field_328 = (int)v21->field_0;
                                v21->field_4 = 0;
                            }
                            else
                            {
                                v22 = 0;
                            }
                            *(st_957c58_0 **)&v5->field_320 = v22;
                            v23 = v4->field_8;
                            if (v23)
                            {
                                if ((int)v23->field_0 == 1)
                                {
                                    v23 = (char)v23->field_4->field_0;
                                    goto LABEL_957f78;
                                }
                                else
                                {
                                    v8 = 271;
                                    v9 = 382;
                                }
LABEL_957d7c:
                                sub_a368c8();
                                sub_a369bc("ssl/ssl_asn1.c", v9, "d2i_SSL_SESSION_ex");
                                sub_a36abc(20, v8, 0);
                            }
                            else
                            {
LABEL_957f78:
                                *(unsigned int *)&v5->padding_2e8[0] = (unsigned int)v23;
                                if (sub_9580bc(&v5->field_358, v4->field_80))
                                {
                                    *(int *)&v5->field_370 = v4->field_88;
                                    *(int *)((char *)&v5->field_338 + 4) = v4->field_90;
                                    sub_a6c2e4(*(long long *)&v5->field_340, "ssl/ssl_asn1.c", 399);
                                    v24 = *(long long *)&v4->field_98;
                                    if (v24)
                                    {
                                        v25 = v24->field_4;
                                        v26 = (int)v24->field_0;
                                        v24->field_4 = 0;
                                    }
                                    else
                                    {
                                        v25 = 0;
                                        v26 = 0;
                                    }
                                    *(st_957c58_0 **)&v5->field_340 = v25;
                                    v5->field_348 = v26;
                                    *(char *)&v5->field_350 = (int)v4->field_a0;
                                    sub_a6c2e4(*(long long *)&v5->field_360, "ssl/ssl_asn1.c", 411);
                                    v27 = *(long long *)&v4->field_a8;
                                    if (v27)
                                    {
                                        v28 = v27->field_4;
                                        v29 = (int)v27->field_0;
                                        v27->field_4 = 0;
                                    }
                                    else
                                    {
                                        v28 = 0;
                                        v29 = 0;
                                    }
                                    *(st_957c58_0 **)&v5->field_360 = v28;
                                    v5->field_368 = v29;
                                    sub_9cd960(v4, &g_e84dd0);
                                    if (a0 && !a0->field_0)
                                        a0->field_0 = v5;
                                    *a1 = v1;
                                    return v5;
                                }
                            }
                        }
                    }
                }
                else if (32 >= (unsigned int)(int)v13->field_0)
                {
                    _memcpy(&v5->field_250, v13->field_4);
                    v14 = (int)v13->field_0;
                    goto LABEL_957df8;
                }
            }
        }
        else
        {
            v8 = 259;
            v9 = 293;
            goto LABEL_957d7c;
        }
    }
    sub_9cd960(v4, &g_e84dd0);
    if (!a0 || a0->field_0 != v5)
        sub_9662a0(v5);
    return 0;
}
