/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a6c18..0x1a6ca0 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a6c18_0 {
    char field_0;
} st_1a6c18_0;

long long sub_1a6c18(long long a0, long long i, long long a2, long long a3)
{
    long long v4;  // x21
    long long v5;  // x0
    st_1a6c18_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1a6c18_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (i == a2)
        return i;
    do
    {
        v4 = i;
        v5 = sub_1c12a4(a0, v4, a2, a3);
        i = v5;
    } while (i != v4);
    return v5;
}
