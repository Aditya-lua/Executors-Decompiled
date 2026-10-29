/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x29a6c..0x29a78 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_29a6c_1 {
    unsigned int field_0;
} st_29a6c_1;

typedef struct st_29a6c_0 {
    char padding_0[48];
    struct st_29a6c_1 *field_30;
} st_29a6c_0;


st_29a6c_0 * sub_29a6c(st_29a6c_0 *a0, unsigned long idx, unsigned int a2)
{
    *(unsigned int *)&a0->field_30[idx] = a2;
    return a0;
}
