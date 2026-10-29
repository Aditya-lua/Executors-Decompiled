/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x62fd8..0x6304c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_62fd8_1 {
    struct st_62fd8_1 *field_0;
} st_62fd8_1;

typedef struct st_62fd8_0 {
    char field_0;
} st_62fd8_0;


st_62fd8_1 ** sub_62fd8(st_62fd8_1 **a0, long long a1)
{
    long long v4;  // x20
    st_62fd8_1 **v5;  // x0
    long long i;  // x20
    st_62fd8_1 **v7;  // x0
    unsigned long long v9;  // 4110
    st_62fd8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_62fd8_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1;
    v1 = &v0;
    v0 = &v1;
    if (a1 < 0)
    {
        v7 = *a0;
        do
        {
            v7 = sub_62884(v7);
            *a0 = v7;
            v9 = arm64g_calculate_condition(50, v4, 1, 0);
            v4 += 1;
        } while (v9 & 1);
        return v7;
    }
    else if (v4)
    {
        v5 = *a0;
        i = v4 + 1;
        do
        {
            v5 = sub_62b88(v5);
            *a0 = v5;
            i -= 1;
        } while (1 < i);
        return v5;
    }
    else
    {
        return a0;
    }
}
