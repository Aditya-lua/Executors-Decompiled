/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa5a74..0xaa5ac0 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa5a74_0 {
    char padding_0[8];
    long long field_8;
    long long field_10;
    char padding_18[8];
    struct st_aa5a74_0 *field_20;
} st_aa5a74_0;

extern long long g_aa5ac0;

st_aa5a74_0 * sub_aa5a74(st_aa5a74_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_aa5a74_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a7c198(a0->field_10);
    if ((unsigned int)v8)
    {
        sub_a7b524(a0->field_8, &g_aa5ac0);
        a0->field_20 = 0;
        sub_a7c1b4(a0->field_10);
        v8 = 1;
    }
    return v8;
}
