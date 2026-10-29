/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99bf30..0x99bf98 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99bf30_0 {
    char padding_0[120];
    unsigned int field_78;
    char padding_7c[1084];
    unsigned long long field_4b8[2];
    unsigned long long field_4c8[2];
} st_99bf30_0;


int sub_99bf30(st_99bf30_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a6c2e4(a0->field_4b8[0], "ssl/statem/extensions.c", 1115);
    *(uint128_t *)a0->field_4b8 = 0;
    if (!a0->field_78)
        return 1;
    sub_a6c2e4(a0->field_4c8[0], "ssl/statem/extensions.c", 1119);
    *(uint128_t *)a0->field_4c8 = 0;
    return 1;
}
