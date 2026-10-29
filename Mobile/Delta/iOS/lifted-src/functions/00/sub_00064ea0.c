/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x64ea0..0x6505c (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_64ea0_1 {
    char padding_0[24];
    struct st_64ea0_2 *field_18;
} st_64ea0_1;

typedef struct st_64ea0_3 {
    char padding_0[40];
    struct st_64ea0_4 *field_28;
    struct st_64ea0_4 *field_30;
    struct st_64ea0_0 *field_38;
    unsigned long long field_40;
    char padding_48[48];
    struct st_64ea0_4 *field_78;
    struct st_64ea0_4 *field_80;
    char padding_88[266];
    char field_192;
} st_64ea0_3;

typedef struct st_64ea0_2 {
    unsigned long long field_0;
} st_64ea0_2;

typedef struct st_64ea0_4 {
    struct st_64ea0_1 *field_0;
} st_64ea0_4;

typedef struct st_64ea0_0 {
    char field_0;
} st_64ea0_0;


unsigned long long sub_64ea0(st_64ea0_3 *a0, unsigned long long a1)
{
    st_64ea0_1 **v7;  // x8
    char *v8;  // x23
    st_64ea0_1 **v9;  // x24
    unsigned long long v10;  // 4124
    st_64ea0_1 **v11;  // x0
    st_64ea0_1 **v12;  // x8
    unsigned long long v13;  // x21
    st_64ea0_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_64ea0_0 *v1;  // [bp-0x60]
    unsigned long v2;  // [bp-0x50]
    st_64ea0_1 *v3;  // [bp-0x41]
    char v4;  // [bp-0x40]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_78)
        return 0xffffffff;
    sub_65068();
    v7 = a0->field_30;
    v8 = a0->field_38;
    v9 = a0->field_28;
    v10 = arm64g_calculate_condition(1, a1 & 0xffffffff, 1, 0);
    if (!(v10 & 1))
    {
        if (!v7)
        {
            v7 = &v3;
            a0->field_28 = &v3;
            a0->field_30 = &v3;
            a0->field_38 = &v4;
        }
        *(char *)v7 = a1;
        v11 = a0->field_28;
        v12 = (char *)&a0->field_30->field_0 + 1;
        a0->field_30 = v12;
        v13 = v12 - v11;
        if (v12 != v11)
            goto LABEL_64f28;
    }
    else
    {
        v13 = v7 - v9;
        if (v7 != v9)
        {
LABEL_64f28:
            if (a0->field_192 != 1)
            {
                v2 = a0->field_40;
                if (!a0->field_80)
                    sub_64d58(0);
                (*(long long *)(*(long long *)a0->field_80 + 24))();
            }
            else if (_fwrite() == v13)
            {
                a0->field_28 = v9;
                a0->field_30 = v9;
                a0->field_38 = v8;
            }
            else
            {
                return 0xffffffff;
            }
        }
    }
    return sub_6312c(a1);
}
