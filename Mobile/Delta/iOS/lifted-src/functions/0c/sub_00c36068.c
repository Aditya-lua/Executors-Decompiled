/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc36068..0xc36098 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c36068_1 {
    char padding_0[8];
    struct st_c36068_0 *field_8;
} st_c36068_1;

typedef struct st_c36068_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_c36068_0;


void sub_c36068(unsigned long a0, st_c36068_1 *a1)
{
    goto *((void *)(a1->field_8->field_18));
}
