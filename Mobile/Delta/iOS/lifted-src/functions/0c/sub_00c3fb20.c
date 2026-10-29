/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3fb20..0xc3fb38 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3fb20_1 {
    char padding_0[8];
    struct st_c3fb20_0 *field_8;
} st_c3fb20_1;

typedef struct st_c3fb20_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_c3fb20_0;


void sub_c3fb20(unsigned long a0, st_c3fb20_1 *a1)
{
    goto *((void *)(a1->field_8->field_18));
}
