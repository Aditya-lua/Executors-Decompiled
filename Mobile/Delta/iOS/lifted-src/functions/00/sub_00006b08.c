/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6b08..0x6b20 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6b08_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[7];
    char field_17;
} st_6b08_0;


long long sub_6b08(st_6b08_0 *a0)
{
    unsigned long v0;  // x0

    v0 = a0->field_17;
    if ((long long)v0 < 0)
        return a0->field_8;
    return v0;
}
