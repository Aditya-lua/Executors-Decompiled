/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0bd30..0xb0be08 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0bd30_1 {
    char padding_0[32];
    char field_20;
    char padding_21[75];
    char field_6c;
    char padding_6d[83];
    char field_c0;
    char padding_c1[127];
    char field_140;
    char padding_141[127];
    char field_1c0;
    char padding_1c1[127];
    struct st_b0bd30_0 *field_240;
} st_b0bd30_1;

typedef struct st_b0bd30_0 {
    struct st_b0bd30_0 *field_0;
} st_b0bd30_0;


int sub_b0bd30(st_b0bd30_1 *a0, long long a1, long long a2, st_b0bd30_0 **a3)
{
    st_b0bd30_0 **i;  // x19
    long long v3;  // x21
    long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a3;
    v3 = a2;
    v4 = a1;
    if (a0->field_240)
        a0->field_240();
    if (i > 0x3fffffff)
    {
        do
        {
            sub_9fb9ac(v3, v4, 0x40000000, &a0->field_c0, &a0->field_140, &a0->field_1c0, &a0->field_20, __ROL__(a0->field_6c, 31) & 0x80000001 & 1);
            i += 0x1ffffffff8000000;
            v3 += 0x40000000;
            v4 += 0x40000000;
        } while (i > 0x3fffffff);
    }
    if (!i)
        return 1;
    sub_9fb9ac(v3, v4, i, &a0->field_c0, &a0->field_140, &a0->field_1c0, &a0->field_20, __ROL__(a0->field_6c, 31) & 0x80000001 & 1);
    return 1;
}
