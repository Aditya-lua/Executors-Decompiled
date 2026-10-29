/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ebd3c..0x1ebdb0 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ebd3c_0 {
    char field_0;
} st_1ebd3c_0;


long long sub_1ebd3c(long long a0, unsigned long long *a1)
{
    unsigned long long v4;  // x21
    unsigned long long i;  // x22
    long long v6;  // x0
    st_1ebd3c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1ebd3c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a1[1])
        return a0;
    v4 = 0;
    i = 0;
    do
    {
        v6 = sub_1fa300(a0, *a1 + v4);
        i += 1;
        v4 += 8;
    } while (i < a1[1]);
    return v6;
}
