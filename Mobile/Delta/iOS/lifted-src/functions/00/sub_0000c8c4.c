/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc8c4..0xca18 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c8c4_1 {
    struct st_c8c4_0 *field_0;
    unsigned long long field_8;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
} st_c8c4_1;

typedef struct st_c8c4_2 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_c;
    unsigned int field_14;
    unsigned long long field_18;
} st_c8c4_2;

typedef struct st_c8c4_3 {
    struct st_c8c4_4 *field_0;
} st_c8c4_3;

typedef struct st_c8c4_4 {
    struct st_c8c4_3 *field_0;
} st_c8c4_4;

typedef struct st_c8c4_0 {
    char field_0;
} st_c8c4_0;

extern unsigned long long g_e61ac8;
extern unsigned long long g_e61ae0;

void sub_c8c4(st_c8c4_1 *a0)
{
    unsigned long v7;  // x9
    unsigned long v8;  // x21
    unsigned long long v17;  // 4112
    unsigned long long v18;  // 4102
    unsigned long long v19;  // 4112
    unsigned long long v20;  // 4102
    unsigned long v21;  // x10
    unsigned long long v22;  // x11
    st_c8c4_2 *v23;  // x8
    unsigned long v9;  // x22
    unsigned long long v10;  // x0
    unsigned long i;  // x8
    char *v12;  // x9
    unsigned long v13;  // x12
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned int v16;  // w13
    st_c8c4_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_c8c4_0 *v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    st_c8c4_4 **v3;  // [bp-0x40]
    st_c8c4_4 **v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v7 = a0->field_10;
    v8 = a0->field_14 | (v7 - a0->field_18) * 0x100000000;
    v9 = (unsigned int)v7 + 2;
    a0->field_10 = v9;
    v4 = &v3;
    v2 = v8;
    v3 = &v4;
    if (a0->field_8 > v9 && *(char *)&a0->field_0[v9] == 91)
    {
        v10 = sub_a20c(a0);
        if (!(v10 >> 31 & 1))
        {
            sub_ce2c(a0, &v2, v10, 283, 287);
            goto *((void *)(g_e61ae0));
        }
        else
        {
            goto *((void *)(g_e61ac8));
        }
    }
    i = a0->field_10;
    v3 = &v4;
    v4 = &v3;
    v12 = a0->field_0;
    v13 = a0->field_8;
    v14 = v13;
    v15 = i;
    if (v13 > i)
    {
        do
        {
            if (!v12[i])
                break;
            v16 = v12[i];
            if (v16 != 10)
            {
                v17 = arm64g_calculate_condition(20, v14, v15, 0);
                v18 = arm64g_calculate_condition(3, (v17 & 1 ? v16 & 0xff : 0x40000000), (v17 & 1 ? 13 : 0), 0);
                if (v18 & 1)
                    break;
            }
            else
            {
                v19 = arm64g_calculate_condition(20, v14, v15, 0);
                v20 = arm64g_calculate_condition(0, (v19 & 1 ? v16 & 0xff : 0x40000000), (v19 & 1 ? 13 : 0), 0);
                if (v20 & 1)
                    break;
            }
            i = (unsigned int)i + 1;
            a0->field_10 = i;
            v3 = &v4;
            v4 = &v3;
            v14 = v13;
            v15 = i;
        } while (i < v13);
    }
    v21 = a0->field_14;
    v22 = i - a0->field_18;
    v23->field_0 = 282;
    *(unsigned long *)&(&v23->field_0)[1] = v2;
    *(unsigned long long *)((char *)&v23->field_4 + 4) = v21 | v22 * 0x100000000;
    *(unsigned int *)((char *)&v23->field_c + 4) = i - v9;
    *(char **)&v23->field_14 = &v12[v9];
    return;
}
