/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2aad0..0xa2ab50 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2aad0_0 {
    char padding_0[8];
    struct st_a2aad0_1 *field_8;
} st_a2aad0_0;

typedef struct st_a2aad0_1 {
    unsigned int field_0;
} st_a2aad0_1;


unsigned long long sub_a2aad0(st_a2aad0_0 *a0, long long a1)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    char v0;  // [bp-0x38]
    char v1;  // [bp-0x2c]
    char v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_afbf08(0, &v2, &v1, &v0, a1);
    if (!(unsigned int)v5)
        return v5;
    v6 = sub_a2a41c(v0, v2, v1, *(int *)a0->field_8, 0, 0, 0);
    if (!v6)
        return v6;
    sub_a5ab14(a0, *(int *)a0->field_8, v6);
    return 1;
}
