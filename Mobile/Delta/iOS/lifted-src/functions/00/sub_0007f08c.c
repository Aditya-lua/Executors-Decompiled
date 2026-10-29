/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7f08c..0x7f198 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7f08c_1 {
    char padding_0[936];
    unsigned int field_3a8;
    char padding_3ac[36];
    unsigned long long field_3d0;
    unsigned long long field_3d8;
    char padding_3e0[2232];
    unsigned long long field_c98;
} st_7f08c_1;

typedef struct st_7f08c_0 {
    char field_0;
} st_7f08c_0;


unsigned long long sub_7f08c(st_7f08c_1 *a0, long long a1, long long a2, long long a3, long long a4, long long a5)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // 4106
    st_7f08c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_7f08c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_814e8();
    v5 = arm64g_calculate_condition(130, v4, 120, 0);
    if (v5 & 1)
    {
        return v4;
    }
    else if (v4 == 1)
    {
        if (*(int *)(a0->field_c98 + 5604) == 2)
            *(unsigned int *)(a0->field_c98 + 5604) = 1;
        if (!a0->field_3a8)
            return sub_7cda0(a1, a2, a3, a4, a5);
        return 0xffffffffffffff96;
    }
    else
    {
        return sub_7ea04(a0, a1, a2, a3, a4, a5, a0->field_3d8 - a0->field_3d0 >> 3);
    }
}
