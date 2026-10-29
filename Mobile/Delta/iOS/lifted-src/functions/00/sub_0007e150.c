/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7e150..0x7e21c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7e150_1 {
    char padding_0[40];
    long long field_28;
} st_7e150_1;

typedef struct st_7e150_2 {
    char padding_0[4];
    unsigned int field_4;
} st_7e150_2;

typedef struct st_7e150_0 {
    char field_0;
} st_7e150_0;


unsigned long long sub_7e150(unsigned long a0, long long a1, long long a2, st_7e150_1 *a3, st_7e150_2 *a4, unsigned long a5, long long a6, long long a7)
{
    long long v4;  // x26
    unsigned long long v5;  // x0
    unsigned long long v6;  // 4106
    unsigned long long v7;  // 4106
    st_7e150_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_7e150_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if ((int)a3->field_28)
    {
        v4 = 0;
        v5 = sub_801cc();
        v6 = arm64g_calculate_condition(130, v5, 120, 0);
        if (v6 & 1)
            return v5;
    }
    else
    {
        v4 = a4->field_4;
        v5 = sub_801cc();
        v7 = arm64g_calculate_condition(146, v5, 120, 0);
        if (!(v7 & 1))
            return v5;
    }
    sub_7d6c4(a1, 0, a2, a3, &a4->padding_0[v5], a5 - v5, a6, a7);
    return v4;
}
