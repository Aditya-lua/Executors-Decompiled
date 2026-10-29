/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x310e8..0x3115c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_310e8_0 {
    char field_0;
} st_310e8_0;


long long sub_310e8(long long a0, long long a1)
{
    long long v4;  // x21
    long long i;  // x21
    long long v6;  // x0
    st_310e8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_310e8_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a1 - a0 >> 3;
    if (v4 < 2)
        return a0;
    do
    {
        i = v4;
        v6 = sub_2ff50(a0, a1);
        a1 -= 8;
        v4 = i - 1;
    } while (2 < i);
    return v6;
}
