/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac39b4..0xac3a34 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac39b4_0 {
    char padding_0[144];
    long long field_90;
    char padding_98[32];
    struct st_ac39b4_0 *field_b8;
    struct st_ac39b4_0 *field_c0;
    long long field_c8;
} st_ac39b4_0;


void sub_ac39b4(st_ac39b4_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_ac39b4_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_a6c2e4(a0->field_90, "crypto/slh_dsa/slh_dsa_key.c", 25);
    v8 = a0->field_b8;
    if (a0->field_c0 != a0->field_b8)
    {
        sub_a3f52c(a0->field_c0);
        v8 = a0->field_b8;
    }
    a0->field_c0 = 0;
    sub_a3f52c(v8);
    sub_a58aa4(a0->field_c8);
    a0->field_b8 = 0;
    sub_a66ec0(a0, 64);
    sub_a6c2e4();
    return;
}
