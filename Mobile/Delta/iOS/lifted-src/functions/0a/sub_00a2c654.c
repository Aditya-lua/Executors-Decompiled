/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2c654..0xa2c73c (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2c654_0 {
    char padding_0[48];
    struct st_a2c654_1 *field_30;
} st_a2c654_0;

typedef struct st_a2c654_1 {
    unsigned long long field_0;
} st_a2c654_1;

extern char g_10002b0;

st_a2c654_0 * sub_a2c654(st_a2c654_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *(long long *)&g_10002b0;
    if (a0)
        a0->field_30();
    sub_c66a50();
    if (*(long long *)&g_10002b0 == v0)
        return 0;
    ___stack_chk_fail();
}
