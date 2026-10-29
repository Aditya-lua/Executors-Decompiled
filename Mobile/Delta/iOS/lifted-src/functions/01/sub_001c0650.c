/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c0650..0x1c06b8 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c0650_1 {
    struct st_1c0650_1 *field_0;
} st_1c0650_1;

typedef struct st_1c0650_0 {
    char field_0;
} st_1c0650_0;


long long sub_1c0650(long long a0, st_1c0650_1 **a1, st_1c0650_1 **i)
{
    st_1c0650_1 **v4;  // x20
    long long v5;  // x0
    st_1c0650_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1c0650_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == i)
        return a0;
    do
    {
        v4 = a1;
        v5 = sub_1afd14(a0, v4 + 2, v4 + 2);
        a1 = *v4;
    } while (*v4 != i);
    return v5;
}
