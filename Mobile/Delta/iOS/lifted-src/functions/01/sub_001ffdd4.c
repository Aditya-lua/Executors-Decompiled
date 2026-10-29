/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ffdd4..0x1ffeec (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ffdd4_0 {
    char field_0;
} st_1ffdd4_0;


unsigned int sub_1ffdd4(void* a0, void* a1)
{
    unsigned int v4;  // w8
    double v5;  // d0
    double v6;  // d1
    unsigned long long v7;  // 4146
    unsigned long long v8;  // 4170
    unsigned int v9;  // w8
    st_1ffdd4_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1ffdd4_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = (int)a0[12];
    if (v4 != (int)a1[12])
        return 0;
    switch (v4)
    {
    case 2:
        if (*(long long *)a0 != *(long long *)a1)
            return 0;
        return (int)a0[8] == (int)a1[8];
    case 0:
        return 1;
    case 5:
        return sub_58ad4();
    case 1:
        return *(int *)a0 == *(int *)a1;
    case 3:
        v5 = *(double *)a0;
        v6 = *(double *)a1;
        v7 = arm64g_calculate_condition(112, (((((char)(CmpF(__double_as_longlong(v5), __double_as_longlong(v5))) >> 5 & 3 | isnan(v5)) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v5)) * 0x10000000, 0, 0);
        v8 = arm64g_calculate_condition(112, (((((char)(CmpF(__double_as_longlong(v6), __double_as_longlong(v6))) >> 5 & 3 | isnan(v6)) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v6)) * 0x10000000, 0, 0);
        if (v8 & 1)
            v9 = 0;
        else
            v9 = !(v7 & 1);
        if (v5 == v6)
            return 1;
        return v9;
    default:
        return *(long long *)a0 == *(long long *)a1;
    }
}
