/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x81b5c..0x81cf0 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_81b5c_1 {
    char padding_0[268];
    unsigned int field_10c;
    char padding_110[696];
    unsigned long long field_3c8;
    unsigned long long field_3d0;
    unsigned long long field_3d8;
    unsigned long long field_3e0;
    unsigned long long field_3e8;
    char padding_3f0[2216];
    uint128_t field_c98;
} st_81b5c_1;

typedef struct st_81b5c_0 {
    char field_0;
} st_81b5c_0;

extern unsigned long long g_e6b8a0;
extern unsigned long long g_e6b8b8;

long long sub_81b5c(st_81b5c_1 *a0, long long a1, long long a2, char *a3, unsigned long long a4, unsigned long long a5, long long a6)
{
    unsigned long long v4;  // x9
    unsigned long v5;  // cc_op
    unsigned long v8;  // cc_ndep
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4102
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    st_81b5c_1 *v13;  // x24
    unsigned long long v14;  // x0
    unsigned long long v15;  // 4106
    char v16;  // x8
    unsigned long long v17;  // 4113
    uint128_t *v19;  // x8
    uint128_t v20;  // q0
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    st_81b5c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_81b5c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a5)
        return sub_7cda0(a1, a2, a3, a4, a6);
    if (!(int)a0->field_3c8)
    {
        v4 = a0->field_3e8 - a0->field_3e0;
        if (a0->field_3d8 - a0->field_3d0 <= 31)
        {
            v6 = arm64g_calculate_condition(v5 | 144, v11, v12, v8);
            v7 = arm64g_calculate_condition(132, (v6 & 1 ? v4 : 0x20000000), (v6 & 1 ? 9 : 0), 0);
            if (!(v7 & 1))
                goto LABEL_81bf8;
        }
        else
        {
            v9 = arm64g_calculate_condition(v5 | 144, v11, v12, v8);
            v10 = arm64g_calculate_condition(128, (v9 & 1 ? v4 : 0x20000000), (v9 & 1 ? 9 : 0), 0);
            if (!(v10 & 1))
            {
LABEL_81bf8:
                if (sub_7dd6c(a3, a4))
                    return sub_7ec18(a1, a2, *a3, a4, a6);
            }
        }
    }
    v13 = a0;
    v14 = sub_84de8();
    v15 = arm64g_calculate_condition(18, v14, 70, 0);
    if (!(v15 & 1))
    {
        goto *((void *)(g_e6b8a0));
    }
    else
    {
        if (7 < v13->field_10c)
            v16 = v13->field_10c - 1;
        else
            v16 = 6;
        v17 = arm64g_calculate_condition(130, v14, 120, 0);
        if (!(v17 & 1))
        {
            if (!v14)
            {
                goto *((void *)(g_e6b8a0));
            }
            else if (a4 - (a4 >> (v16 & 63)) + 1 > v14)
            {
                v19 = (v13->padding_3f0)[1];
                v20 = __dirty_unsupported_Iop_SliceV128(*v19, *v19, 8);
                *v19 = v20;
            }
            else
            {
                goto *((void *)(g_e6b8a0));
            }
        }
        goto *((void *)(g_e6b8b8));
    }
}
