/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aa1cc..0x2aa1e8 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aa1cc_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
} st_2aa1cc_0;


long long sub_2aa1cc(st_2aa1cc_0 *a0)
{
    if (a0->field_0 != 3)
        return 0;
    return a0->field_8;
}
