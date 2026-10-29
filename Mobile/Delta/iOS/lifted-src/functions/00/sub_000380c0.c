/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x380c0..0x3810c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_380c0_0 {
    char field_0;
} st_380c0_0;


unsigned long long sub_380c0(unsigned long long a0, unsigned long long i)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x19
    st_380c0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_380c0_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!i)
        return a0;
    v4 = a0 + 8;
    do
    {
        v5 = v4;
        v6 = i;
        v4 = v5 + 32;
        i = v6 - 1;
    } while (i);
    return v5 + 32;
}
