/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc35948..0xc35978 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c35948_1 {
    char padding_0[8];
    struct st_c35948_0 *field_8;
} st_c35948_1;

typedef struct st_c35948_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_c35948_0;


void sub_c35948(unsigned long a0, st_c35948_1 *a1)
{
    goto *((void *)(a1->field_8->field_18));
}
