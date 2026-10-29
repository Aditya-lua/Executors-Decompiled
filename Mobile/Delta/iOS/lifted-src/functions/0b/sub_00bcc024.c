/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbcc024..0xbcc0e8 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bcc024_1 {
    char padding_0[8];
    struct st_bcc024_0 *field_8;
    char padding_10[24];
    struct st_bcc024_0 *field_28;
    char padding_30[8];
    unsigned long long field_38;
    char padding_40[24];
    struct st_bcc024_0 *field_58;
    struct st_bcc024_0 *field_60;
    char padding_68[8];
    struct st_bcc024_0 *field_70;
    char padding_78[8];
    struct st_bcc024_0 *field_80;
    char padding_88[8];
    struct st_bcc024_0 *field_90;
    char padding_98[24];
    struct st_bcc024_0 *field_b0;
    struct st_bcc024_0 *field_b8;
    char padding_c0[8];
    struct st_bcc024_0 *field_c8;
    char padding_d0[8];
    struct st_bcc024_0 *field_d8;
    char padding_e0[8];
    struct st_bcc024_0 *field_e8;
} st_bcc024_1;

typedef struct st_bcc024_0 {
    struct st_bcc024_0 *field_0;
} st_bcc024_0;


st_bcc024_0 ** sub_bcc024(st_bcc024_1 *a0)
{
    st_bcc024_0 **ptr;  // x0
    unsigned long v3;  // cc_op
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    unsigned long v12;  // cc_ndep
    unsigned long v13;  // 4110
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    st_bcc024_0 **v19;  // x0
    unsigned long v4;  // 4110
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = a0;
    if (*ptr)
    {
        if (a0->field_8)
        {
            v4 = arm64g_calculate_condition(v3 | 16, v10, v11, v12);
            v5 = 4;
            v6 = (v4 & 1 ? *(long long *)&a0->padding_10[8] : 0x40000000);
            v7 = 0;
            v8 = 0;
            v9 = arm64g_calculate_condition(4, v6, 0, 0);
            if (!(v9 & 1))
                goto LABEL_bcc050;
        }
        else
        {
            v13 = arm64g_calculate_condition(v3 | 16, v10, v11, v12);
            v5 = 0;
            v6 = (v13 & 1 ? *(long long *)&a0->padding_10[8] : 0x40000000);
            v7 = 0;
            v8 = 0;
            v14 = arm64g_calculate_condition(0, v6, 0, 0);
            if (!(v14 & 1))
            {
LABEL_bcc050:
                _free(a0->field_8);
            }
        }
        ptr = a0->field_28;
        if (ptr)
        {
            v15 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
            v16 = arm64g_calculate_condition(4, (v15 & 1 ? a0->field_38 : 0x40000000), 0, 0);
            if (!(v16 & 1))
                goto LABEL_bcc068;
        }
        else
        {
            v17 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
            v18 = arm64g_calculate_condition(0, (v17 & 1 ? a0->field_38 : 0x40000000), 0, 0);
            if (!(v18 & 1))
            {
LABEL_bcc068:
                ptr = _free(ptr);
            }
        }
    }
    if (a0->field_58)
    {
        if (a0->field_58 != 2)
        {
            if (a0->field_60 && a0->field_70)
                _free();
            ptr = a0->field_80;
            if (ptr && a0->field_90)
                ptr = _free();
        }
        else
        {
            return ptr;
        }
    }
    if (!a0->field_b0)
        return ptr;
    if (a0->field_b8 && a0->field_c8)
        _free();
    v19 = a0->field_d8;
    if (!v19)
    {
        return v19;
    }
    else if (a0->field_e8)
    {
        return _free();
    }
    else
    {
        return v19;
    }
}
