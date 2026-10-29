/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb960d0..0xb960e8 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b960d0_1 {
    char padding_0[8];
    struct st_b960d0_0 *field_8;
} st_b960d0_1;

typedef struct st_b960d0_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_b960d0_0;


void sub_b960d0(unsigned long a0, st_b960d0_1 *a1)
{
    goto *((void *)(a1->field_8->field_18));
}
