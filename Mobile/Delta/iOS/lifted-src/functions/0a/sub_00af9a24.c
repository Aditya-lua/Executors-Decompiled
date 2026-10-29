/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf9a24..0xaf9a3c (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af9a24_1 {
    char padding_0[208];
    struct st_af9a24_0 *field_d0;
} st_af9a24_1;

typedef struct st_af9a24_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_af9a24_0;


int sub_af9a24(st_af9a24_1 *a0)
{
    if (!a0->field_d0->field_20)
        return 0;
    goto *((void *)(a0->field_d0->field_20));
}
