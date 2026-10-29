/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97eeb8..0x97efac (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97eeb8_0 {
    struct st_97eeb8_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_97eeb8_0 *field_10;
} st_97eeb8_0;

extern long long g_97efac;
extern long long g_97efb8;
extern long long g_97f060;

st_97eeb8_0 * sub_97eeb8(void)
{
    st_97eeb8_0 *v2;  // x19
    st_97eeb8_0 *v3;  // x0
    st_97eeb8_0 *v4;  // x0
    unsigned int v5;  // w8
    unsigned long long v6;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(24, "ssl/quic/quic_impl.c", 0x12c1);
    if (!v2)
        return v2;
    v3 = sub_a66520(sub_a66530(&g_97efac, &g_97efb8), " ", "@", " ", "@");
    v2->field_0 = v3;
    if (v3)
    {
        v4 = sub_ad9324();
        v2->field_10 = v4;
        if (v4)
        {
            /* unsupported instruction */;
            v2->field_8 = 1;
            return v2;
        }
    }
    do
    {
        /* unsupported instruction */;
        v5 = /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v6 = arm64g_calculate_condition(19, v5, 1, 0);
    if (!(v6 & 1))
    {
        /* unsupported instruction */;
    }
    else if (1 < (int)v5)
    {
        return 0;
    }
    sub_ad93e4(&v2->field_10);
    sub_a66c58(v2->field_0, &g_97f060);
    sub_a66664(v2->field_0);
    sub_a6c2e4(v2, "ssl/quic/quic_impl.c", 0x12f2);
    return 0;
}
