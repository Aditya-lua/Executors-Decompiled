/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x980be0..0x980c6c (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_980be0_1 {
    char padding_0[8];
    long long field_8;
} st_980be0_1;

typedef struct st_980be0_0 {
    char padding_0[32];
    long long field_20;
} st_980be0_0;

extern long long g_980d4c;

st_980be0_1 * sub_980be0(st_980be0_0 *a0, unsigned long long a1)
{
    st_980be0_1 *v4;  // x0
    st_980be0_1 *v5;  // x20
    char v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x40]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = a1;
    v4 = sub_a66b6c(a0->field_20, &v0);
    if (!v4)
        return v4;
    v5 = v4;
    sub_a19710(v4->field_8, 0);
    sub_a66ccc(v5->field_8, &g_980d4c, a0);
    sub_a66994(a0->field_20, v5);
    sub_a66664(v5->field_8);
    sub_a6c2e4(v5, "ssl/quic/quic_lcidm.c", 259);
    return 1;
}
