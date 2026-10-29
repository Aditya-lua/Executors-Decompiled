/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa98a84..0xa98de0 (860 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a98a84_0 {
    char padding_0[24];
    struct st_a98a84_1 *field_18;
} st_a98a84_0;

typedef struct st_a98a84_1 {
    unsigned long long field_0;
} st_a98a84_1;


unsigned int sub_a98a84(st_a98a84_0 *a0, uint128_t *a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    uint128_t v0;  // [bp-0x50]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (16 > a4)
        return 0xffffffff;
    v0 = *a1;
    a0->field_18();
}
