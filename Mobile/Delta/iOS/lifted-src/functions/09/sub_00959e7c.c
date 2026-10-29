/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x959e7c..0x959ea4 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_959e7c_0 {
    char padding_0[144];
    unsigned long long field_90;
} st_959e7c_0;

typedef struct st_959e7c_1 {
    char padding_0[344];
    struct st_959e7c_0 *field_158;
} st_959e7c_1;


void sub_959e7c(st_959e7c_1 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    goto *((void *)(a0->field_158->field_90));
}
