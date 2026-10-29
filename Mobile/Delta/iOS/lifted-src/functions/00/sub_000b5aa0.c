/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5aa0..0xb5b68 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5aa0_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    char padding_20[12];
    unsigned int field_2c;
} st_b5aa0_1;

typedef struct st_b5aa0_0 {
    char field_0;
} st_b5aa0_0;


st_b5aa0_1 * sub_b5aa0(st_b5aa0_1 *a0, long long a1, long long a2, unsigned long long a3, long long a4, unsigned long a5)
{
    unsigned long v4;  // x8
    unsigned long long v5;  // 4114
    st_b5aa0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_b5aa0_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_18)
    {
        return a0;
    }
    else if (a0->field_18 > a0->field_8)
    {
        v4 = a0->field_2c;
        if ((unsigned int)a3 >= (unsigned int)v4)
        {
            v5 = arm64g_calculate_condition(147, a3 & 0xffffffff, v4 & 0xffffffff, 0);
            if (!(v5 & 1))
                sub_b6ab0(a0, a3 - v4);
            sub_b9e50(a0, a3, a4);
        }
        return sub_bb414(a1, a2, a0);
    }
    else
    {
        return a0;
    }
}
