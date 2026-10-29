/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe768c..0xbe769c (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be768c_1 {
    char padding_0[8];
    struct st_be768c_0 *field_8;
} st_be768c_1;

typedef struct st_be768c_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_be768c_0;


void sub_be768c(st_be768c_1 *a0)
{
    goto *((void *)(a0->field_8->field_18));
}
