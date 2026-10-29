/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa68bd8..0xa68be8 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a68bd8_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_a68bd8_0;

typedef struct st_a68bd8_1 {
    char padding_0[24];
    struct st_a68bd8_0 *field_18;
} st_a68bd8_1;


void sub_a68bd8(st_a68bd8_1 *a0)
{
    goto *((void *)(a0->field_18->field_10));
}
