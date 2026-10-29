/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9879b8..0x987b80 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9879b8_0 {
    unsigned long long field_0;
    char padding_8[840];
    char field_350;
    char padding_351[719];
    unsigned int field_620;
} st_9879b8_0;


long long sub_9879b8(st_9879b8_0 *a0, unsigned long long a1, long long a2, unsigned long long *a3)
{
    long long v2;  // x19
    st_9879b8_0 *v3;  // x20
    unsigned long long v12;  // 4107
    unsigned long long v13;  // 4107
    unsigned long long v14;  // x25
    unsigned long long v15;  // x8
    unsigned long long v4;  // x0
    unsigned long long v5;  // x23
    unsigned long long v6;  // x8
    long long v7;  // x3
    long long v8;  // x1
    long long v9;  // x6
    unsigned long v10;  // cc_dep1
    unsigned long long v11;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = a0;
    v4 = sub_98952c(&a0->field_350);
    if (v4)
    {
        *a3 = v4;
        return 1;
    }
    v5 = a1 >> 2;
    if (!(a1 & 1 ^ v3->field_620 >> 25 & 1))
    {
        v6 = 1432;
        if (!(a1 & 2))
            v6 = 1424;
        if ((unsigned long long)*(long long *)((char *)v3 + v6) > v5)
        {
            *a3 = 0;
            return 1;
        }
        v7 = "STREAM frame for nonexistent stream";
        v8 = 5;
        v9 = 491;
    }
    else
    {
        v10 = a1 & 2;
        if (!(a1 & 2))
        {
            v11 = 1440;
            v12 = arm64g_calculate_condition(10, v10, 0, 0);
            if (!(v12 & 1))
                goto LABEL_987a46;
LABEL_987a45:
            v14 = 656;
        }
        else
        {
            v11 = 1448;
            v13 = arm64g_calculate_condition(10, v10, 0, 0);
            if (v13 & 1)
                goto LABEL_987a45;
LABEL_987a46:
            v14 = 752;
        }
        if (!sub_97bb98())
        {
            v7 = "internal error (stream count RXFC)";
            v8 = 1;
            v9 = 445;
        }
        else if (sub_97bea8((char *)v3 + v14, 0))
        {
            v7 = "exceeded maximum allowed streams";
            v8 = 4;
            v9 = 452;
        }
        else
        {
            v15 = *(long long *)((char *)v3 + v11);
            if (v5 < v15)
            {
                *a3 = 0;
                return 1;
            }
            while (1)
            {
                v4 = sub_979a44(v3, a1 & 3 | v15 * 4);
                if (!v4)
                {
                    sub_979174(v3, 1, v2, "internal error (stream allocation)", 0, "ssl/quic/quic_rx_depack.c", 468, "depack_do_implicit_stream_create");
                    return 0;
                }
                v15 = *(long long *)((char *)v3 + v11) + 1;
                *(unsigned long long *)((char *)v3 + v11) = v15;
                if (v15 > v5)
                {
                    *a3 = v4;
                    return 1;
                }
            }
        }
    }
    sub_979174(v3, v8, v2, v7, 0, "ssl/quic/quic_rx_depack.c", v9, "depack_do_implicit_stream_create");
    return 0;
}
