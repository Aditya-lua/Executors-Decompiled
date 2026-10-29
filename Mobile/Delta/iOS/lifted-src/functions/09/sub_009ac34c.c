/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ac34c..0x9ac420 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ac34c_2 {
    char padding_0[8];
    struct st_9ac34c_0 *field_8;
    char padding_10[2368];
    char field_950;
    char padding_951[215];
    unsigned int field_a28;
} st_9ac34c_2;

typedef struct st_9ac34c_0 {
    char padding_0[616];
    struct st_9ac34c_1 *field_268;
} st_9ac34c_0;

typedef struct st_9ac34c_1 {
    char field_0;
} st_9ac34c_1;


char sub_9ac34c(st_9ac34c_2 *a0)
{
    char v2;  // w0
    unsigned long long v3;  // 4118
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ac05c();
    if (!v2)
        return v2;
    v3 = arm64g_calculate_condition(1, a0->field_a28, 1, 0);
    if (!(v3 & 1) && a0->field_8->field_268)
        a0->field_8->field_268();
    if (!*(long long *)&a0[1].padding_10[300] || sub_9633b4(a0) || !(a0->field_950 & 1))
        return 1;
    return 0;
    return 1;
}
