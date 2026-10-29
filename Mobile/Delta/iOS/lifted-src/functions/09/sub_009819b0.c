/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9819b0..0x981d40 (912 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9819b0_1 {
    struct st_9819b0_0 *field_0;
    char padding_8[56];
    unsigned long long field_40;
    char padding_48[56];
    long long field_80;
    long long field_88;
    char padding_90[10];
    unsigned short field_9a;
} st_9819b0_1;

typedef struct st_9819b0_0 {
    unsigned long long field_0;
    long long field_8;
} st_9819b0_0;

typedef struct st_9819b0_4 {
    char padding_0[16];
    char field_10;
} st_9819b0_4;

typedef struct st_9819b0_2 {
    char padding_0[16];
    long long field_10;
    char padding_18[32];
    char field_38;
    char padding_39[215];
    char field_110;
    char padding_111[15];
    char field_120;
} st_9819b0_2;

extern char g_10002b0;

unsigned long long sub_9819b0(st_9819b0_2 *a0, st_9819b0_1 *a1, unsigned short a2)
{
    st_9819b0_4 *v20;  // x22
    unsigned short v21;  // x21
    unsigned long long v30;  // 4104
    unsigned long long v31;  // 4104
    long long v32;  // x8
    long long v22;  // x21
    unsigned short v23;  // x21
    char *v24;  // x21
    unsigned long long v25;  // x0
    unsigned short v26;  // x0
    long long v27;  // x22
    unsigned long v28;  // x25
    unsigned long v29;  // cc_dep1
    unsigned short v0;  // [bp-0x150]
    unsigned short v1;  // [bp-0x148]
    unsigned long v2;  // [bp-0x140], Other Possible Types: unsigned short
    unsigned long v3;  // [bp-0x130], Other Possible Types: unsigned short
    unsigned long v4;  // [bp-0x128]
    unsigned long long v5;  // [bp-0x120], Other Possible Types: unsigned short
    unsigned short v6;  // [bp-0x110]
    unsigned short v7;  // [bp-0x100]
    unsigned short v8;  // [bp-0xe9]
    unsigned short v9;  // [bp-0xe8]
    unsigned short v10;  // [bp-0xe0]
    char *v11;  // [bp-0xd8]
    long long v12;  // [bp-0xd0]
    unsigned short v13;  // [bp-0xc5]
    unsigned short v14;  // [bp-0xb0]
    char v15;  // [bp-0xa8]
    unsigned short v16;  // [bp-0x78]
    unsigned long v17;  // [bp-0x58]
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    v17 = *(long long *)&g_10002b0;
    v9 = 0;
    v10 = 0;
    v8 = 0;
    v7 = 0;
    v5 = 0;
    v6 = 0;
    v2 = 0;
    v3 = 0;
    v0 = 0;
    v1 = 0;
    if (!(a1->field_9a & 1))
    {
        v14 = 0;
        if ((unsigned long long)a0->field_10 >= 21 && a0->field_120 >> 6 & 1 && (v20 = &a0->field_110, a2 = a2, sub_988948(a1->field_88, &v20->padding_0[a0->field_10], 0, &v14, 0)))
        {
            v21 = 1;
            do
            {
                v22 = v21;
                sub_979648(v14);
                v21 = v22 + 1;
            } while (sub_988948(a1->field_88, &v20->padding_0[a0->field_10], v22, &v14, 0));
            if (v21 == 1)
            {
                v23 = 0;
                if (a2)
                    goto LABEL_981a98;
                goto LABEL_981ae0;
            }
            else
            {
                v23 = 0;
                goto LABEL_981ae0;
            }
        }
        else
        {
            if (a2)
            {
LABEL_981a98:
                v24 = (char *)a2;
                if (sub_980b2c(a1->field_80, a2, 0, &v10))
                {
                    v25 = sub_979638(v10, a0);
                    if (*(long long *)&g_10002b0 == v17)
                        return v25;
                    ___stack_chk_fail();
                }
                if (a1->field_9a >> 4 & 1 && 1200 <= a0->field_10 && !(v11 = &a0->field_120, v12 = a0->field_10, !sub_990cb4(&v11, -0x1, 1, 0, &v14, 0, &v1) && !((char)v1 >> 1 & 1)))
                {
                    if (*(unsigned int *)((void*)&v14 + 4) == 1)
                    {
                        if ((char)v14 == 1 && (!*(long long *)&a1[1].padding_8[4] || (unsigned long long)*(long long *)&a1[1].padding_8[4] > (unsigned long long)*(long long *)&a1->padding_48[40]))
                        {
                            v13 = 0;
                            v2 = a1->field_0->field_0;
                            v3 = a1->field_40;
                            v4 = *v24;
                            v5 = 32;
                            v26 = sub_9830a0(&v2);
                            if (!v26)
                            {
LABEL_981adc:
                                v23 = 0;
                            }
                            else
                            {
                                v27 = v26;
                                if (sub_985ac0(a1->field_0->field_0, a1->field_0->field_8, &v15, 1, v27, 0) && sub_983484(v27, a0, v24))
                                {
                                    v28 = a1->field_9a;
                                    v29 = (unsigned int)v28 & 4;
                                    if (!((unsigned int)v28 & 4))
                                    {
                                        v30 = arm64g_calculate_condition(9, v29, 0, 0);
                                        if (!(v30 & 1))
                                            goto LABEL_981c0e;
LABEL_981c0d:
                                        v23 = v27;
                                    }
                                    else
                                    {
                                        v31 = arm64g_calculate_condition(9, v29, 0, 0);
                                        if (v31 & 1)
                                            goto LABEL_981c0d;
LABEL_981c0e:
                                        v23 = 0;
                                    }
                                    if (v28 >> 2 & 1 && !v16)
                                    {
LABEL_981c1c:
                                        sub_981ea8(a1, &a0->field_38, &v14);
                                    }
                                    else
                                    {
                                        v32 = v27;
                                        if (v16 && (v32 = v27, !sub_982148(&v14, a1, &a0->field_38, &v13, &v8)))
                                        {
                                            if (!(a1->field_9a >> 2 & 1))
                                                goto LABEL_981cb4;
                                            goto LABEL_981c1c;
                                        }
                                        if (v28 >> 2 & 1)
                                        {
                                            v23 = 0;
                                            if (sub_983400(v27))
                                                goto LABEL_981cc0;
                                        }
                                        else
                                        {
LABEL_981cb4:
                                            v23 = v32;
LABEL_981cc0:
                                            sub_982594(a1, &a0->field_38, &v15, &v13);
                                            if (v9)
                                            {
                                                if (v8 == 1)
                                                    sub_9826e4(v9, &a0->field_38);
                                                if (!v23)
                                                    goto LABEL_981d00;
                                                while (sub_98391c(v23, &v0) == 1)
                                                {
                                                    sub_979640(v9, v0);
                                                }
                                                sub_98311c(v23, *(long long *)(v9 + 1064));
                                                goto LABEL_981adc;
                                            }
                                            else
                                            {
LABEL_981d00:
                                            }
                                        }
                                    }
                                }
                                else
                                {
                                    v23 = 0;
                                }
                            }
LABEL_981ae0:
                            sub_983138();
                            sub_983138(v23);
                            v25 = sub_97b768(a1->field_40, a0);
                            if (*(long long *)&g_10002b0 == v17)
                                return v25;
                            ___stack_chk_fail();
                        }
                    }
                    else
                    {
                        if ((unsigned long long)a0->field_10 >= 1200)
                            sub_981d40(a1, &a0->field_38, &v14);
                    }
                }
            }
        }
    }
    goto LABEL_981adc;
}
