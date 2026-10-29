/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5519c..0x5535c (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5519c_3 {
    struct st_5519c_2 *field_0;
    long long field_8;
} st_5519c_3;

typedef struct st_5519c_2 {
    char padding_0[56];
    void* field_38;
} st_5519c_2;

typedef struct st_5519c_6 {
    char padding_0[64];
    long long field_40;
} st_5519c_6;

typedef struct st_5519c_5 {
    char padding_0[32];
    struct st_5519c_3 *field_20;
    void* field_28;
    struct st_5519c_4 *field_30;
    void* field_38;
    struct st_5519c_4 *field_40;
} st_5519c_5;

typedef struct st_5519c_1 {
    unsigned long long field_0;
} st_5519c_1;

typedef struct st_5519c_4 {
    struct st_5519c_1 *field_0;
} st_5519c_4;

typedef struct st_5519c_0 {
    char field_0;
} st_5519c_0;

extern unsigned int g_f00b70;

void sub_5519c(st_5519c_6 *a0, st_5519c_5 *a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v19;  // 4102
    void* v20;  // x0
    void* v21;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    void* v14;  // x8
    void* v15;  // x1
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4102
    unsigned long long v18;  // 4112
    st_5519c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_5519c_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_38)
        (*(long long *)*(long long *)*(long long *)a1->field_30)();
    v14 = a1->field_28;
    if (a1->field_28 == 2)
    {
        if (a1->field_38 == 1)
        {
            v15 = *(long long *)a1->field_30;
            if (v15)
            {
                v16 = arm64g_calculate_condition(20, a1->field_38, 1, 0);
                v17 = arm64g_calculate_condition(19, (v16 & 1 ? (int)v15[8] : 0), (v16 & 1 ? g_f00b70 : 0), 0);
LABEL_55290:
                v20 = sub_54840(a0);
                if (v20)
                    goto LABEL_5529c;
            }
            else
            {
                v18 = arm64g_calculate_condition(20, a1->field_38, 1, 0);
                v19 = arm64g_calculate_condition(16, (v18 & 1 ? (int)v15[8] : 0), (v18 & 1 ? g_f00b70 : 0), 0);
                if (v19 & 1 || (long long)v15[64] != 1)
                    goto LABEL_55290;
                if (sub_52a10(a0->field_40, (long long)v15[32], "ipairs"))
                {
                    v20 = sub_54840(a0, *(long long *)(long long)v15[56]);
                    if (!v20)
                        goto LABEL_552c8;
                    goto LABEL_552ac;
                }
                else if (sub_52a10(a0->field_40, (long long)v15[32], "pairs") && (v20 = sub_54840(a0, *(long long *)(long long)v15[56]), v20))
                {
LABEL_5529c:
LABEL_552ac:
                    sub_52f98(a0);
                    sub_52f98(a0, a1->field_20->field_8, (long long)v20[8]);
                }
            }
LABEL_552c8:
            v14 = a1->field_28;
        }
        else
        {
            v14 = 2;
            v21 = 0;
            goto LABEL_552e4;
        }
    }
    if (!v14)
        goto LABEL_55304;
    v21 = 0;
    do
    {
LABEL_552e4:
        if (*(long long *)(*(long long *)((char *)a1->field_20 + 0x8 * v21) + 56))
        {
            sub_52f98(a0);
            v14 = a1->field_28;
        }
    } while ((v21 += 1, v14 > v21));
LABEL_55304:
    (*(long long *)*(long long *)a1->field_40)();
}
