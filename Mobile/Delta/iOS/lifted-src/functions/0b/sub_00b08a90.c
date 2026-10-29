/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb08a90..0xb08adc (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b08a90_0 {
    char padding_0[108];
    char field_6c;
    char padding_6d[707];
    char field_330;
    char padding_331[15];
    unsigned long long field_340;
} st_b08a90_0;


long long sub_b08a90(st_b08a90_0 *a0)
{
    *(uint128_t *)&a0->padding_6d[691] = 0;
    a0->field_330 = a0->field_330 & 252;
    a0->field_340 = 0xffffffffffffffff;
}
