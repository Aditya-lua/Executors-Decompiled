/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9806fc..0x9807e4 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9806fc_0 {
    char padding_0[8];
    struct st_9806fc_0 *field_8;
    unsigned long long field_10;
} st_9806fc_0;

typedef struct st_9806fc_1 {
    char padding_0[32];
    long long field_20;
} st_9806fc_1;

extern long long g_98042c;
extern long long g_9804e4;

st_9806fc_0 * sub_9806fc(st_9806fc_1 *a0, unsigned long long a1)
{
    st_9806fc_0 *v4;  // x0
    st_9806fc_0 *v5;  // x0
    st_9806fc_0 *v6;  // x20
    st_9806fc_0 *v7;  // x0
    char v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x50]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = a1;
    v4 = sub_a66b6c(a0->field_20, &v0);
    if (v4)
        return v4;
    v5 = sub_a6bffc(48, "ssl/quic/quic_lcidm.c", 214);
    if (!v5)
        return v5;
    v6 = v5;
    v7 = sub_a66520(sub_a66530(&g_98042c, &g_9804e4), " ", "@", " ", "@");
    v6->field_8 = v7;
    if (v7)
    {
        v6->field_10 = a1;
        sub_a66794(a0->field_20, v6);
        if (!sub_a66e38(a0->field_20))
            return v6;
    }
    sub_a66664();
    sub_a6c2e4(v6, "ssl/quic/quic_lcidm.c", 231);
    return 0;
}
