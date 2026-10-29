/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b24d0..0x8b24dc (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b24d0_0 {
    struct st_8b24d0_1 *field_0;
    unsigned long long field_8;
} st_8b24d0_0;

typedef struct st_8b24d0_1 {
    unsigned long long field_0;
} st_8b24d0_1;


st_8b24d0_0 * sub_8b24d0(st_8b24d0_0 *a0)
{
    *(unsigned long long *)a0->field_0 = a0->field_8;
    return a0;
}
