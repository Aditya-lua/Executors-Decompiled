/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95c2dc..0x95c2ec (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95c2dc_0 {
    char padding_0[168];
    unsigned long long field_a8;
} st_95c2dc_0;

typedef struct st_95c2dc_1 {
    char padding_0[24];
    struct st_95c2dc_0 *field_18;
} st_95c2dc_1;


void sub_95c2dc(st_95c2dc_1 *a0, unsigned long a1)
{
    goto *((void *)(a0->field_18->field_a8));
}
