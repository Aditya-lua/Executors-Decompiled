/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d324c..0x1d32ac (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d324c_0 {
    char field_0;
} st_1d324c_0;

unsigned long long sub_1d324c(long long a0, unsigned long long i, unsigned long a2)
{
    unsigned long long v4;  // x1
    unsigned long long v5;  // x0
    st_1d324c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1d324c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    do
    {
        v4 = i;
        v5 = sub_1b6224(a0);
        i = v5;
    } while (i != v4);
    return v5;
}
