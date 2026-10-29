/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3be1f4..0x3be25c (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3be1f4_1 {
    struct st_3be1f4_1 *field_0;
} st_3be1f4_1;

typedef struct st_3be1f4_0 {
    char field_0;
} st_3be1f4_0;


long long sub_3be1f4(long long a0, st_3be1f4_1 **a1, st_3be1f4_1 **i)
{
    st_3be1f4_1 **v4;  // x20
    long long v5;  // x0
    st_3be1f4_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3be1f4_0 *v1;  // [bp-0x38]
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
        v5 = sub_3be25c(a0, v4 + 2, v4 + 2);
        a1 = *v4;
    } while (*v4 != i);
    return v5;
}
