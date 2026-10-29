/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5f634..0xc5f648 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5f634_1 {
    char padding_0[8];
    struct st_c5f634_0 *field_8;
} st_c5f634_1;

typedef struct st_c5f634_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_c5f634_0;


void sub_c5f634(unsigned long a0, st_c5f634_1 *a1)
{
    goto *((void *)(a1->field_8->field_18));
}
