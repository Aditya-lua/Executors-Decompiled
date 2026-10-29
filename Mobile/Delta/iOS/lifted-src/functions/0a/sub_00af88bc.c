/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf88bc..0xaf88dc (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af88bc_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_af88bc_0;


int sub_af88bc(st_af88bc_0 *a0, unsigned long a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9

    v0 = a0->field_18 | a1;
    v1 = v0 | 128;
    if (a1 & 1920)
        v0 = v1;
    a0->field_18 = v0;
    return 1;
}
