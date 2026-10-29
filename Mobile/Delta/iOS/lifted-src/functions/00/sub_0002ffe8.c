/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ffe8..0x30030 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ffe8_0 {
    char field_0;
} st_2ffe8_0;


unsigned long long sub_2ffe8(unsigned long a0, unsigned long long a1)
{
    unsigned long long i;  // x9
    unsigned long long v3;  // x9
    unsigned long long v4;  // x1
    st_2ffe8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_2ffe8_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!a1)
        return a1;
    i = a1;
    do
    {
        v3 = i;
        v4 = a1;
        a1 = (unsigned int)v4 * 32 + ((unsigned int)v4 >> 2) + *(char *)(a0 - 1 + v3) ^ (unsigned int)v4;
        i = v3 - 1;
    } while (i);
    return a1;
}
