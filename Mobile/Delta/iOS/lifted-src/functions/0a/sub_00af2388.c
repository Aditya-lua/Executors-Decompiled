/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf2388..0xaf23d8 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af2388_0 {
    char padding_0[8];
    long long field_8;
} st_af2388_0;


unsigned long long sub_af2388(st_af2388_0 *a0, long long a1, unsigned long a2)
{
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a2;
    if (!(a2 & 0x30000))
        return 0;
    return sub_af2284(a1, sub_a99eac(a0->field_8), &v0);
}
