/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x425f4..0x42648 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_425f4_0 {
    char field_0;
} st_425f4_0;


long long sub_425f4(unsigned long a0, unsigned long long i)
{
    unsigned long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long v7;  // x0
    st_425f4_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_425f4_0 *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (!i)
        return a0;
    v5 = a0 + 16;
    do
    {
        v6 = i;
        v2 = v5;
        v7 = sub_10344(&v2);
        v5 += 56;
        i = v6 - 1;
    } while (i);
    return v7;
}
