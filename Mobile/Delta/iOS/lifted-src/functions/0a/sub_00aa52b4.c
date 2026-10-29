/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa52b4..0xaa5318 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa52b4_0 {
    char padding_0[8];
    struct st_aa52b4_0 *field_8;
    long long field_10;
    long long field_18;
} st_aa52b4_0;

extern long long g_aa5318;

void sub_aa52b4(st_aa52b4_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_aa52b4_0 *v8;  // x0
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
    v8 = a0->field_8;
    if (v8)
    {
        sub_a7b61c(v8, &g_aa5318, a0);
        v8 = a0->field_8;
    }
    sub_a7b3fc(v8);
    sub_a7c1d0(a0->field_10);
    sub_a7c1d0(a0->field_18);
}
