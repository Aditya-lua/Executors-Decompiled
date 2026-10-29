/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f39a8..0x1f3a14 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f39a8_0 {
    char field_0;
} st_1f39a8_0;


int sub_1f39a8(unsigned long a0, long long a1, char *i, char *a3)
{
    char *v5;  // x20
    st_1f39a8_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_1f39a8_0 *v1;  // [bp-0x40]
    unsigned int v2;  // [bp-0x34]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (i == a3)
        return 1;
    do
    {
        v5 = i + 1;
        v2 = *i;
        sub_1f8478(a1, &v2);
        i = v5;
    } while (i != a3);
    return 1;
}
