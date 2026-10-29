/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2bcf8..0x2bd70 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2bcf8_0 {
    char field_0;
} st_2bcf8_0;


long long sub_2bcf8(long long a0, unsigned long a1)
{
    long long v4;  // x20
    long long i;  // x22
    long long v6;  // x0
    st_2bcf8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_2bcf8_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = (long long)(a1 - a0) >> 3;
    if (v4 < 2)
        return a0;
    i = ((unsigned long long)(v4 - 2) >> 1) + 1;
    do
    {
        v6 = sub_2e128(a0);
        i -= 1;
    } while (0 < i);
    return v6;
}
