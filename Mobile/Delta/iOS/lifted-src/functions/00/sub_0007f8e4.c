/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7f8e4..0x7fa30 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7f8e4_1 {
    struct st_7f8e4_2 *field_0;
    unsigned long long field_8;
} st_7f8e4_1;

typedef struct st_7f8e4_2 {
    unsigned int field_0;
} st_7f8e4_2;

typedef struct st_7f8e4_0 {
    char field_0;
} st_7f8e4_0;


st_7f8e4_1 * sub_7f8e4(st_7f8e4_1 *a0, long long a1, long long a2, long long a3, long long a4)
{
    unsigned long long v4;  // x22
    unsigned long long v5;  // x24
    unsigned long long v6;  // x25
    st_7f8e4_1 *v7;  // x0
    unsigned long long v8;  // 4106
    unsigned long long v9;  // 4106
    unsigned long long v10;  // 4106
    unsigned long idx;  // x9
    st_7f8e4_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_7f8e4_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if ((unsigned long long)(a2 - a1) < 300)
    {
        return a0;
    }
    else if (a0->field_8 > 195)
    {
        return a0;
    }
    else
    {
        v4 = (unsigned long long)(a2 + a1) >> 1;
        sub_7fc60(a3 + 3760, a4, a1, a2);
        sub_7fc60(a3 + 0xf00, a4, a1, v4);
        sub_7fc60(a3 + 3920, a4, v4, a2);
        v5 = sub_7ffa8(a3 + 3760, a3);
        v6 = sub_7ffa8(a3 + 0xf00, a3);
        v7 = sub_7ffa8(a3 + 3920, a3);
        v8 = arm64g_calculate_condition(130, v5, 120, 0);
        if (v8 & 1)
            return v7;
        v9 = arm64g_calculate_condition(130, v6, 120, 0);
        if (v9 & 1)
            return v7;
        v10 = arm64g_calculate_condition(130, v7, 120, 0);
        if (v10 & 1)
        {
            return v7;
        }
        else if (v5 <= (char *)v7 + v6)
        {
            return v7;
        }
        else
        {
            sub_7f8e4(a0, a1, v4, a3, a4);
            idx = a0->field_8;
            *(unsigned int *)&a0->field_0[idx] = v4;
            a0->field_8 = idx + 1;
            return sub_7f8e4(a0, v4, a2, a3, a4);
        }
    }
}
