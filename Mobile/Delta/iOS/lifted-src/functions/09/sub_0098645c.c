/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98645c..0x9879b8 (5468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98645c_2 {
    struct st_98645c_1 *field_0;
    char padding_8[16];
    long long field_18;
    unsigned long long field_20[2];
    char field_28;
} st_98645c_2;

typedef struct st_98645c_4 {
    char padding_0[704];
    struct st_98645c_0 *field_2c0;
} st_98645c_4;

typedef struct st_98645c_1 {
    char field_0;
    char padding_1[71];
    struct st_98645c_0 *field_48;
    unsigned long long field_50;
} st_98645c_1;

typedef struct st_98645c_0 {
    char padding_0[216];
    long long field_d8;
    char padding_e0[144];
    char field_170;
    char padding_171[703];
    struct st_98645c_0 *field_430;
} st_98645c_0;

typedef struct st_98645c_3 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_98645c_3;

extern unsigned int g_d28440[4];
extern st_98645c_3 g_d285ba;
extern char g_10002b0;

int sub_98645c(st_98645c_0 *a0, st_98645c_2 *a1)
{
    st_98645c_0 *v15;  // x19
    st_98645c_0 *v16;  // w8
    unsigned long long v21;  // 4110
    unsigned long long v22;  // 4102
    unsigned long v23;  // cc_op
    unsigned long v24;  // cc_dep1
    unsigned long v25;  // cc_dep2
    unsigned long v26;  // cc_ndep
    unsigned long long v27;  // 4110
    unsigned long long v28;  // 4102
    st_98645c_0 *v17;  // w21
    long long v29;  // x3
    long long v30;  // x1
    long long v31;  // x6
    st_98645c_0 *v19;  // x28
    unsigned long long v20;  // x8
    st_98645c_4 *v0;  // [bp-0x120]
    unsigned long v1;  // [bp-0x118]
    unsigned long v2;  // [bp-0x110]
    unsigned long v3;  // [bp-0x108]
    unsigned long v4;  // [bp-0x100]
    unsigned int v5;  // [bp-0xf4]
    uint128_t v6;  // [bp-0xf0]
    st_98645c_0 *v7;  // [bp-0xe0], Other Possible Types: char
    unsigned long v8;  // [bp-0xd8]
    st_98645c_0 *v9;  // [bp-0xd0]
    st_98645c_0 *v10;  // [bp-0xc8]
    st_98645c_0 *v11;  // [bp-0xc0]
    unsigned long v12;  // [bp-0x70]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    if (a0)
    {
        v15 = a0;
        sub_978500();
        v7 = 0;
        v6 = (uint128_t)a1->field_20;
        v16 = (st_98645c_0 *)a1->field_0->field_0;
        if (2 < v16)
        {
            if (v16 == 3)
            {
                v7 = (st_98645c_0 *)1;
                sub_98b268(v15->field_d8);
                v17 = (st_98645c_0 *)2;
                goto LABEL_986528;
            }
            a0 = 0;
            if (v16 == 5)
            {
                v16 = (st_98645c_0 *)2;
                v17 = (st_98645c_0 *)3;
                goto LABEL_986500;
            }
        }
        else if (v16 != 1)
        {
            a0 = 0;
            if (v16 == 2)
            {
                v17 = (st_98645c_0 *)1;
LABEL_986500:
                v7 = (st_98645c_0 *)(char)v16;
                sub_98b274(v15->field_d8, a1->field_18);
LABEL_986528:
                if (a1->field_0->field_48 >= 0)
                {
                    v8 = a1->field_0->field_50;
                    v9 = a1->field_0->field_48;
                    if (v9)
                    {
                        v5 = *(int *)((char *)&g_d28440[0] + 0x4 * v17);
                        v3 = &v15[1].padding_e0[72];
                        v4 = a1->field_20[1];
                        v1 = &v15[1].padding_0[40];
                        v2 = &v15[1].padding_e0[64];
                        v0 = &v15->field_170;
                        if (sub_98ec18())
                        {
                            v19 = v10;
                            if (v11)
                            {
                                v20 = 1 << ((char)v19 & 63) & 805306381;
                                if (v19 <= 29)
                                {
                                    v21 = arm64g_calculate_condition(v23 | 144, v24, v25, v26);
                                    v22 = arm64g_calculate_condition(4, (v21 & 1 ? v20 : 0x40000000), 0, 0);
                                    if (v22 & 1)
                                        goto LABEL_98675c;
                                    goto LABEL_98660c;
                                }
                                else
                                {
                                    v27 = arm64g_calculate_condition(v23 | 144, v24, v25, v26);
                                    v28 = arm64g_calculate_condition(0, (v27 & 1 ? v20 : 0x40000000), 0, 0);
                                    if (!(v28 & 1))
                                    {
LABEL_98660c:
                                        if (30 >= v19)
                                            goto *((void *)(sub_986624 + *(short *)((char *)&g_d285ba.field_0 + 0x2 * v19) * 4));
                                    }
                                    else
                                    {
LABEL_98675c:
                                        v7 |= 4;
                                        if (v19 <= 30)
                                            goto *((void *)(sub_986624 + *(short *)((char *)&g_d285ba.field_0 + 0x2 * v19) * 4));
                                        v29 = "Unknown frame type received";
                                        v30 = 7;
                                        v31 = 1434;
                                    }
                                }
                            }
                            else
                            {
                                v29 = "non-minimal frame type encoding";
                                v30 = 10;
                                v31 = 1123;
                            }
                        }
                        else
                        {
                            v29 = "malformed frame header";
                            v30 = 10;
                            v19 = 0;
                            v31 = 1115;
                        }
                    }
                    else
                    {
                        v29 = "empty packet payload";
                        v30 = 10;
                        v19 = 0;
                        v31 = 1098;
                    }
                    sub_979174(v15, v30, v19, v29, 0, "ssl/quic/quic_rx_depack.c", v31, "depack_process_frames");
                    goto LABEL_986e98;
                }
                else
                {
LABEL_986e98:
                    a0 = 0;
                }
            }
        }
        else
        {
            v17 = (st_98645c_0 *)0;
            v16 = (st_98645c_0 *)0;
            goto LABEL_986500;
        }
    }
    if (*(long long *)&g_10002b0 == v12)
        return (unsigned int)a0;
    ___stack_chk_fail();
}
