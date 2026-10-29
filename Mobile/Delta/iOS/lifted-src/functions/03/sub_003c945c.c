/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c945c..0x3c94e8 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c945c_0 {
    char field_0;
} st_3c945c_0;


unsigned long long sub_3c945c(unsigned long long a0, char *a1, unsigned long long a2, unsigned int a3)
{
    unsigned long long v4;  // x20
    char *iter;  // x21
    unsigned long long i;  // x22
    unsigned long long v7;  // x22
    unsigned long long v8;  // x0
    unsigned long long v9;  // x20
    st_3c945c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3c945c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a2 < 1)
        return a0;
    v4 = a3;
    iter = a1 + 3;
    i = a2;
    do
    {
        v7 = i;
        *(iter - 1) = sub_3d706c(a0);
        *(iter - 2) = sub_3d706c(a0);
        v8 = sub_3d706c(a0);
        *(iter - 3) = v8;
        v9 = v4 - 1;
        *iter = (char)((int)((v4 >= 1) * 0x80000000) >> 31) & 254 | v4 >= 1;
        iter += 4;
        i = v7 - 1;
        v4 = v9;
    } while (i);
    return v8;
}
