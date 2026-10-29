/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4154ec..0x4154f8 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4154ec_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_4154ec_0;

typedef struct st_4154ec_1 {
    char padding_0[24];
    struct st_4154ec_0 *field_18;
} st_4154ec_1;


long long sub_4154ec(st_4154ec_1 *a0)
{
    goto *((void *)(a0->field_18->field_10));
}
