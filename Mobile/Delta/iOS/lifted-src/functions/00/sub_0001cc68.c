/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1cc68..0x1cc8c (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1cc68_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_1cc68_0;


st_1cc68_0 * sub_1cc68(st_1cc68_0 *a0, unsigned long long a1)
{
    unsigned long long v0;  // x8

    v0 = a0->field_10;
    if (v0 != a1)
        a0->field_10 = v0 + (a1 - v0 + 15 & 0xfffffffffffffff0);
    return a0;
}
