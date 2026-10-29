/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97f1a8..0x97f2dc (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97f1a8_2 {
    unsigned int field_0;
    char padding_4[2];
    char field_6;
    char padding_7[1];
    struct st_97f1a8_0 *field_8;
    struct st_97f1a8_1 *field_10;
    long long field_18;
    struct st_97f1a8_2 *field_20;
    unsigned int field_28;
    unsigned short field_2c;
} st_97f1a8_2;

typedef struct st_97f1a8_1 {
    char padding_0[2];
    struct st_97f1a8_0 *field_2;
    struct st_97f1a8_1 *field_a;
    unsigned long long field_12;
    struct st_97f1a8_2 *field_1a;
    unsigned int field_22;
    unsigned short field_26;
} st_97f1a8_1;

typedef struct st_97f1a8_0 {
    unsigned int field_0;
    unsigned short field_4;
} st_97f1a8_0;


st_97f1a8_2 * sub_97f1a8(long long a0, st_97f1a8_2 *a1, st_97f1a8_2 *n)
{
    unsigned int v3;  // w0
    unsigned short v4;  // x0
    st_97f1a8_2 *v5;  // x25
    st_97f1a8_2 *v6;  // x0
    st_97f1a8_2 *v7;  // x8
    st_97f1a8_0 *v8;  // x8
    st_97f1a8_1 *v9;  // x9
    unsigned int v10;  // w8
    unsigned long long v11;  // 4102
    st_97f1a8_2 *v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (a1 && !n || !a1 && n || !sub_9d35bc())
        return 0;
    v3 = sub_717b8(a0);
    v4 = sub_9d365c(a0);
    v5 = v0;
    v6 = sub_a6bffc(n + v5 + 46, "ssl/quic/quic_impl.c", 0x1329);
    if (!v6)
        return v6;
    /* unsupported instruction */;
    v6->field_0 = 1;
    v7 = v6;
    v7->field_28 = v3;
    v8 = &v7->field_28;
    v9 = &v5->field_6;
    *(st_97f1a8_0 **)((char *)v8 - 32) = v8;
    *(st_97f1a8_1 **)((char *)v8 - 24) = v9;
    *(unsigned long *)((char *)v8 - 16) = v8 + v9;
    *(st_97f1a8_2 **)((char *)v8 - 8) = n;
    v8->field_4 = v4;
    if (sub_9d35bc(a0, v8 + 1, 0))
    {
        if (!a1)
            return v6;
        _memcpy(v6->field_18, a1, n);
        return v6;
    }
    do
    {
        /* unsupported instruction */;
        v10 = /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v11 = arm64g_calculate_condition(19, v10, 1, 0);
    if (!(v11 & 1))
    {
        /* unsupported instruction */;
    }
    else if (1 < (int)v10)
    {
        return 0;
    }
    sub_a6c2e4();
    return 0;
}
