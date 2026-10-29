/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2f144..0xa2f520 (988 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2f144_5 {
    char *field_0;
    struct st_a2f144_1 *field_8;
    struct st_a2f144_1 *field_10;
} st_a2f144_5;

typedef struct st_a2f144_0 {
    char padding_0[8];
    char *field_8;
    struct st_a2f144_1 *field_10;
    long long field_18;
    struct st_a2f144_2 *field_20;
    struct st_a2f144_2 *field_28;
} st_a2f144_0;

typedef struct st_a2f144_3 {
    struct st_a2f144_0 *field_0;
    struct st_a2f144_1 *field_8;
    struct st_a2f144_1 *field_10;
    unsigned int field_14;
    struct st_a2f144_1 *field_18;
    struct st_a2f144_1 *field_20;
    struct st_a2f144_1 *field_28;
    struct st_a2f144_1 *field_30;
    long long field_38;
    long long field_40;
} st_a2f144_3;

typedef struct st_a2f144_2 {
    unsigned long long field_0;
} st_a2f144_2;

typedef struct st_a2f144_4 {
    char *field_0;
    char padding_8[8];
    uint128_t field_10;
    unsigned long long field_20;
    struct st_a2f144_1 *field_28;
    char padding_30[8];
    uint128_t field_38;
    unsigned long long field_48;
} st_a2f144_4;

typedef struct st_a2f144_1 {
    struct st_a2f144_1 *field_0;
    char padding_8[8];
    struct st_a2f144_1 *field_10;
    struct st_a2f144_1 *field_18;
    char padding_20[72];
    struct st_a2f144_2 *field_68;
} st_a2f144_1;

extern char g_10002b0;

char * sub_a2f144(st_a2f144_3 *a0)
{
    char *v16;  // x26
    char *v17;  // w8
    char *v27;  // w0
    unsigned long v28;  // cc_op
    unsigned long v29;  // cc_dep1
    unsigned long v30;  // cc_dep2
    unsigned long v31;  // cc_ndep
    unsigned long long v32;  // 4110
    unsigned long long v33;  // 4102
    unsigned long long v34;  // 4110
    unsigned long long v35;  // 4102
    char *v18;  // w28
    char *v36;  // w0
    unsigned long long v37;  // 4112
    char *v38;  // x23
    st_a2f144_4 *v39;  // x25
    char *v40;  // x1
    long long v41;  // x2
    long long v42;  // x0
    char *v43;  // x21
    char *v44;  // x23
    char *v45;  // x0
    char *v19;  // x24
    char *v46;  // x25
    char *v47;  // x26
    st_a2f144_5 *v48;  // x8
    unsigned long v20;  // x25
    char *v22;  // x20
    char *v23;  // x22
    char *v24;  // x1
    char *v25;  // x23
    uint128_t v0;  // [bp-0x228]
    uint128_t v1;  // [bp-0x218]
    unsigned long long v2;  // [bp-0x208]
    st_a2f144_0 *v3;  // [bp-0x200]
    char *v4;  // [bp-0x1f8]
    unsigned int v5;  // [bp-0x1f0]
    unsigned int v6;  // [bp-0x1ec]
    char *v7;  // [bp-0x1e8]
    char *v8;  // [bp-0x1e0]
    char *v9;  // [bp-0x1d8], Other Possible Types: uint128_t
    char *v10;  // [bp-0x1c8], Other Possible Types: uint128_t
    unsigned long long v11;  // [bp-0x1b8]
    char *v12;  // [bp-0x1b0]
    unsigned long v13;  // [bp-0x70]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v13 = *(long long *)&g_10002b0;
    v16 = *(long long *)&a0->field_14;
    if (!v16)
    {
        if (a0->field_0->field_10)
            v17 = (char *)0;
        else
            v17 = 0xffffffff;
        *(unsigned int *)&a0->field_18 = (unsigned int)v17;
    }
    if ((int)a0->field_10 >= 1)
    {
        v18 = (char *)((int)a0->field_10 + 1);
        do
        {
            if (v16 && *(long long *)&a0->field_14)
                v19 = *(long long *)*(long long *)&a0->field_14;
            else
                v19 = 0;
            v20 = v18 - 2;
            v22 = sub_ad69f8(a0->field_0->field_18, v20);
            if (v22)
            {
                v23 = *(long long *)v22;
                v24 = *(long long *)&v22[16];
                v25 = *(long long *)&v22[24];
            }
            else
            {
                v24 = 0;
                v23 = 0;
                v25 = 0;
            }
            v10 = (char *)0;
            v9 = (char *)0;
            v7 = (char *)0;
            v4 = (char *)0;
            v3 = a0->field_0;
            v7 = v22;
            v8 = (char *)(int)a0->field_18;
            v5 = v20;
            v6 = *(int *)((char *)&a0->field_10 + 4) + 1;
            if (v16)
            {
                if (!sub_a2d73c(v19))
                    continue;
            }
            else
            {
                if (v3->field_8 && (v27 = (char *)(unsigned int)sub_a6e200(v24, v3->field_8), sub_a6e200(v24, v3->field_8)))
                    continue;
            }
            if (a0->field_0->field_10)
            {
                v32 = arm64g_calculate_condition(v28 | 16, v29, v30, v31);
                v33 = arm64g_calculate_condition(4, (v32 & 1 ? v25 : 0x40000000), 0, 0);
                if (v33 & 1)
                    goto LABEL_a2f1ac;
            }
            else
            {
                v34 = arm64g_calculate_condition(v28 | 16, v29, v30, v31);
                v35 = arm64g_calculate_condition(0, (v34 & 1 ? v25 : 0x40000000), 0, 0);
                if (v35 & 1)
                    goto LABEL_a2f1ac;
            }
            if (sub_a6e200(a0->field_0->field_10, v25))
                continue;
            *(int *)&a0->field_18 = (int)a0->field_18 + 1;
LABEL_a2f1ac:
            v36 = (char *)(unsigned int)sub_a2f144(&v3);
            *(uint128_t *)&a0->field_20 = (uint128_t)v9;
            a0->field_30 = v10;
            if (v36)
            {
                v37 = arm64g_calculate_condition(1, (unsigned long long)v36, 1, 0);
                if (v37 & 1)
                {
                    if ((int)a0->field_18)
                        a0->field_0->field_20();
                    if (*(long long *)&g_10002b0 == v13)
                        return 0;
                    ___stack_chk_fail();
                }
                if (v36 != 1)
                {
                    if (!v16)
                    {
LABEL_a2f408:
                        v46 = 0;
                        v45 = a0->field_8;
LABEL_a2f410:
                        v47 = sub_9d9454(v45);
                        if (v47)
                            (*(long long *)&v23[104])();
LABEL_a2f44c:
                        v43 = 0;
                        sub_9d93e0(v47);
                        a0->field_20 = v22;
                        v44 = v46;
                        goto LABEL_a2f468;
                    }
LABEL_a2f338:
                    v45 = sub_9d3c1c(sub_9d8844());
                    v46 = v45;
                    if (!v45)
                    {
                        v47 = 0;
                        goto LABEL_a2f44c;
                    }
                    goto LABEL_a2f410;
                }
                else if (a0->field_28)
                {
                    if (a0->field_20)
                        v38 = a0->field_20->field_18;
                    else
                        v38 = 0;
                    v39 = &v9;
                    sub_a71618("data-type", a0->field_38, 0);
                    if (v38)
                    {
                        sub_a71618("data-structure", v38, 0);
                        v9 = v0;
                        v10 = v1;
                        v11 = v2;
                        v39 = &v12;
                    }
                    v40 = a0->field_28;
                    v41 = a0->field_30;
                    v42 = sub_a71670("data", v40, v41);
                    *(uint128_t *)&v39->field_0 = v0;
                    v39->field_10 = v1;
                    v39->field_20 = v2;
                    sub_a71bbc(v42, v40, v41);
                    *(uint128_t *)&v39->field_28 = v0;
                    *(uint128_t *)(v39->padding_30)[1] = v1;
                    *(unsigned long long *)((char *)&v39->field_38 + 8) = v2;
                    if (!v16)
                        goto LABEL_a2f408;
                    goto LABEL_a2f338;
                }
                else
                {
                    sub_c66c60();
                    v43 = 0;
                    v44 = 0;
                    goto LABEL_a2f468;
                }
            }
        } while ((v18 -= 1, v18 > 1));
    }
    v44 = 0;
    v43 = 0xffffffff;
LABEL_a2f468:
    sub_a6c2e4(a0->field_28, "crypto/encode_decode/encoder_lib.c", 684);
    a0->field_28 = 0;
    if (v44)
    {
        sub_9d46fc(v44, 115, 0, &v0);
        v48 = *(unsigned long long *)&v0;
        a0->field_28 = v48->field_8;
        a0->field_30 = v48->field_0;
        *(uint128_t *)&v48->field_0 = 0;
        *(uint128_t *)&v48->field_10 = 0;
    }
    sub_9d3c28(v44);
    if (*(long long *)&g_10002b0 == v13)
        return v43;
    ___stack_chk_fail();
}
