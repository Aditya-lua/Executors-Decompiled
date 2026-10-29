/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x24b634..0x24b7d8 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_24b634_3 {
    char padding_0[144];
    unsigned long long field_90;
} st_24b634_3;

typedef struct st_24b634_6 {
    char padding_0[8];
    struct st_24b634_5 *field_8;
} st_24b634_6;

typedef struct st_24b634_0 {
    struct st_24b634_1 *field_0;
    unsigned long long field_8;
} st_24b634_0;

typedef struct st_24b634_5 {
    char padding_0[24];
    struct st_24b634_4 *field_18;
} st_24b634_5;

typedef struct st_24b634_9 {
    char padding_0[8];
    struct st_24b634_1 *field_8;
    char padding_10[8];
    struct st_24b634_1 *field_18;
} st_24b634_9;

typedef struct st_24b634_4 {
    char padding_0[48];
    unsigned long long field_30;
} st_24b634_4;

typedef struct st_24b634_1 {
    unsigned long long field_0;
} st_24b634_1;

typedef struct st_24b634_2 {
    char field_0;
} st_24b634_2;

typedef struct st_24b634_7 {
    char padding_0[259];
    char field_103;
    char padding_104[1148];
    unsigned long long field_580;
} st_24b634_7;

typedef struct st_24b634_8 {
    char padding_0[96];
    struct st_24b634_7 *field_60;
} st_24b634_8;

extern unsigned long long g_e7aa30;
extern st_24b634_8 *g_f0d198;
extern unsigned long long g_f0d528;
extern long long g_f11980;
extern long long g_f119b8;

void sub_24b634(st_24b634_3 *a0, unsigned long a1, st_24b634_6 *a2, unsigned long a3)
{
    unsigned long long v14;  // x26
    unsigned long long v15;  // x25
    st_24b634_0 **v24;  // x0
    st_24b634_0 *v25;  // x8
    unsigned long v26;  // x25
    unsigned long v27;  // cc_op
    unsigned long v28;  // cc_dep1
    unsigned long v29;  // cc_dep2
    unsigned long v30;  // cc_ndep
    unsigned long v31;  // 4110
    unsigned long v32;  // cc_op
    unsigned long v33;  // cc_dep1
    unsigned long long v16;  // x24
    unsigned long long v34;  // 4102
    unsigned long v35;  // 4110
    unsigned long long v36;  // 4102
    unsigned long long v17;  // x23
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4105
    unsigned long long v39;  // 4110
    unsigned long long v40;  // 4105
    unsigned long long v18;  // x22
    unsigned long long v19;  // x21
    unsigned long long v20;  // x20
    unsigned long long v21;  // x19
    unsigned long long v22;  // x30
    st_24b634_9 *v23;  // x22
    st_24b634_2 **v0;  // [bp-0x68], Other Possible Types: char
    st_24b634_2 *v1;  // [bp-0x60]
    st_24b634_3 *v2;  // [bp-0x58]
    unsigned long long v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x48]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x38]
    unsigned long long v7;  // [bp-0x30]
    unsigned long long v8;  // [bp-0x28]
    unsigned long long v9;  // [bp-0x20]
    unsigned long long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    unsigned long long v12;  // [bp-0x8]
    char v13;  // [bp+0x0]

    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = &v13;
    v12 = v22;
    v1 = &v0;
    v2 = a0;
    v0 = &v1;
    v23 = *(long long *)sub_2622c4(&g_f11980, &v2);
    if (v23)
    {
        if (a2->field_8->field_18->field_30 == g_f0d198->field_60->field_580 && !(g_f0d198->field_60->field_103 >> 4 & 1))
        {
            if ((char)a2->padding_0[2] < 0)
                sub_d5c30(a2, g_f0d528 + 5158);
            v24 = sub_261b18(&g_f119b8, v23);
            v25 = *v24;
            if (v25)
            {
                v26 = *(long long *)((char *)v25->field_0 + a1 + (v2->field_90 >> 1));
                if (!v25->field_8)
                {
                    v31 = arm64g_calculate_condition(v27, v28, v29, v30);
                    v32 = 4;
                    v33 = (v31 & 1 ? v26 : 0x40000000);
                    v34 = arm64g_calculate_condition(20, v33, 0, 0);
                    if (v34 & 1)
                        goto LABEL_24b764;
LABEL_24b710:
                    if (v25->field_8)
                    {
                        v37 = arm64g_calculate_condition(v32 | 16, v33, 0, 0);
                        v38 = arm64g_calculate_condition(20, (v37 & 1 ? v26 : 0), 0, 0);
                        if (!(v38 & 1))
                            goto LABEL_24b71a;
LABEL_24b719:
                    }
                    else
                    {
                        v39 = arm64g_calculate_condition(v32 | 16, v33, 0, 0);
                        v40 = arm64g_calculate_condition(16, (v39 & 1 ? v26 : 0), 0, 0);
                        if (v40 & 1)
                            goto LABEL_24b719;
LABEL_24b71a:
                    }
                }
                else
                {
                    v35 = arm64g_calculate_condition(v27, v28, v29, v30);
                    v32 = 0;
                    v33 = (v35 & 1 ? v26 : 0x40000000);
                    v36 = arm64g_calculate_condition(16, v33, 0, 0);
                    if (!(v36 & 1))
                        goto LABEL_24b710;
LABEL_24b764:
                    v25->field_8 = v26;
                }
                if (v23->field_18)
                    v23->field_18();
            }
            v23->field_8();
        }
        v23->field_8();
    }
    else
    {
        goto *((void *)(g_e7aa30));
    }
}
