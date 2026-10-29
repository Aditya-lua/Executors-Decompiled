/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x980310..0x98042c (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_980310_0 {
    long long field_0;
    char field_8;
    char padding_9[15];
    struct st_980310_0 *field_18;
    struct st_980310_0 *field_20;
    unsigned long long field_28;
} st_980310_0;

extern long long g_98042c;
extern long long g_9804e4;
extern long long g_980524;
extern long long g_98052c;

st_980310_0 * sub_980310(long long a0, unsigned long a1)
{
    st_980310_0 *v2;  // x19
    st_980310_0 *v3;  // x0
    st_980310_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (20 < a1)
        return 0;
    v2 = sub_a6bffc(48, "ssl/quic/quic_lcidm.c", 118);
    if (!v2)
        return v2;
    if (sub_aa8658(a0, &v2->field_8, 16, 0))
    {
        v3 = sub_a66520(sub_a66530(&g_98042c, &g_9804e4), " ", "@", " ", "@");
        v2->field_18 = v3;
        if (v3)
        {
            v4 = sub_a66520(sub_a66530(&g_980524, &g_98052c), " ", "@", " ", "@");
            v2->field_20 = v4;
            if (v4)
            {
                v2->field_0 = a0;
                v2->field_28 = a1;
                return v2;
            }
        }
    }
    sub_a66664(v2->field_18);
    sub_a66664(v2->field_20);
    sub_a6c2e4(v2, "ssl/quic/quic_lcidm.c", 142);
    return 0;
}
