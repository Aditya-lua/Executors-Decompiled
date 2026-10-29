/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa793c..0xaa79d8 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa793c_0 {
    long long field_0;
    struct st_aa793c_0 *field_8;
    struct st_aa793c_0 *field_10;
    char field_18;
    char padding_19[7];
    long long field_20;
    long long field_28;
} st_aa793c_0;

extern long long g_aa7e20;

void sub_aa793c(st_aa793c_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_aa793c_0 *v8;  // x20
    st_aa793c_0 *v9;  // x20
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
    sub_a7c1d0(a0->field_0);
    v8 = a0->field_8;
    if (v8)
    {
        sub_a66c58(v8, &g_aa7e20);
        sub_a66664(v8);
        a0->field_8 = 0;
    }
    v9 = a0->field_10;
    if (v9)
    {
        sub_a66c58(v9, &g_aa7e20);
        sub_a66664(v9);
        a0->field_10 = 0;
    }
    sub_ad6020(a0->field_20);
    sub_ad6020(a0->field_28);
    memset(&a0->field_18, 0, 24);
}
