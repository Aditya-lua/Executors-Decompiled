/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99bdb4..0x99bdf4 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99bdb4_0 {
    char padding_0[2680];
    unsigned long long field_a78[2];
    long long field_a80;
} st_99bdb4_0;


int sub_99bdb4(st_99bdb4_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a6c2e4(a0->field_a78[1], "ssl/statem/extensions.c", 1179);
    *(uint128_t *)a0->field_a78 = 0;
    return 1;
}
