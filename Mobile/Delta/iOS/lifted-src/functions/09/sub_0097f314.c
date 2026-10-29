/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97f314..0x97f3dc (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97f314_0 {
    char padding_0[1752];
    struct st_97f314_1 *field_6d8;
} st_97f314_0;

typedef struct st_97f314_1 {
    long long field_0;
    char padding_8[8];
    long long field_10;
} st_97f314_1;


unsigned long long * sub_97f314(st_97f314_0 *a0, long long a1, st_97f314_1 **a2)
{
    long long *v2;  // x21
    long long *v3;  // x0
    unsigned long long *v4;  // x19
    long long *v5;  // x0
    long long *v6;  // x20
    long long *v7;  // w8
    unsigned long long v8;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &a0->field_6d8->field_0;
    if (!v2)
        return 0;
    v3 = sub_97f1a8(a1, 0, 0);
    if (v3)
    {
        v4 = v3;
        sub_ad9384(v2[2]);
        v5 = sub_a66b6c(*v2, v4);
        if (v5)
        {
            *a2 = v5;
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v6 = 1;
        }
        else
        {
            v6 = 0;
        }
        sub_ad93b4(v2[2]);
        do
        {
            /* unsupported instruction */;
            v7 = (long long *)/* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v8 = arm64g_calculate_condition(19, (unsigned long long)v7, 1, 0);
        if (!(v8 & 1))
        {
            /* unsupported instruction */;
        }
        else if (1 < v7)
        {
            return v6;
        }
        sub_a6c2e4(v4, "ssl/quic/quic_impl.c", 0x138e);
        return v6;
    }
    return 0;
}
