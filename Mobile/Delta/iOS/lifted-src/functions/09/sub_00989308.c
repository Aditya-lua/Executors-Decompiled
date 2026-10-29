/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989308..0x989320 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989308_0 {
    char padding_0[56];
    unsigned long long field_38;
} st_989308_0;


unsigned long long sub_989308(st_989308_0 *a0, st_989308_0 *a1)
{
    if (a1->field_38 > a0->field_38)
        return 0xffffffff;
    return a0->field_38 > a1->field_38;
}
