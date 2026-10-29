/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x959e54..0x959e7c (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_959e54_0 {
    char padding_0[144];
    unsigned long long field_90;
} st_959e54_0;

typedef struct st_959e54_1 {
    char padding_0[2176];
    struct st_959e54_0 *field_880;
} st_959e54_1;


void sub_959e54(st_959e54_1 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    goto *((void *)(a0->field_880->field_90));
}
