/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1935c..0x19398 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1935c_0 {
    char field_0;
} st_1935c_0;


long long sub_1935c(long long *a0)
{
    long long v4;  // x0
    st_1935c_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1935c_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *a0;
    if (!v4)
        return v4;
    return !_strcmp(v4);
}
