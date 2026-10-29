/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97f098..0x97f1a8 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97f098_0 {
    char padding_0[1752];
    struct st_97f098_1 *field_6d8;
} st_97f098_0;

typedef struct st_97f098_1 {
    long long field_0;
    char padding_8[8];
    long long field_10;
} st_97f098_1;


unsigned long long * sub_97f098(st_97f098_0 *a0, long long a1, long long a2, long long a3)
{
    long long *v2;  // x21
    long long *v3;  // x19
    long long *v4;  // x0
    unsigned long long *v5;  // x20
    long long *v6;  // w8
    unsigned long long v7;  // 4102
    long long *v8;  // w8
    unsigned long long v9;  // 4102
    long long *v10;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &a0->field_6d8->field_0;
    if (!v2)
        return 0;
    v3 = sub_97f1a8(a1, a2, a3);
    if (!v3)
        return v3;
    sub_ad9384(v2[2]);
    v4 = sub_a66b6c(*v2, v3);
    if (v4)
    {
        v5 = v4;
        sub_a66994(*v2, v5);
        do
        {
            /* unsupported instruction */;
            v6 = (long long *)/* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v7 = arm64g_calculate_condition(19, (unsigned long long)v6, 1, 0);
        if (!(v7 & 1))
        {
            /* unsupported instruction */;
        }
        else if (1 < v6)
        {
            goto LABEL_97f130;
        }
        sub_a6c2e4(v5, "ssl/quic/quic_impl.c", 0x138e);
    }
LABEL_97f130:
    sub_a66794(*v2, v3);
    if (sub_a66e38(*v2))
    {
        do
        {
            /* unsupported instruction */;
            v8 = (long long *)/* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v9 = arm64g_calculate_condition(19, (unsigned long long)v8, 1, 0);
        if (!(v9 & 1))
        {
            /* unsupported instruction */;
        }
        else if (1 < v8)
        {
            goto LABEL_97f188;
        }
        sub_a6c2e4(v3, "ssl/quic/quic_impl.c", 0x138e);
LABEL_97f188:
        v10 = 0;
    }
    else
    {
        v10 = 1;
    }
    sub_ad93b4(v2[2]);
    return v10;
}
