/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb66864..0xb66934 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b66864_0 {
    char padding_0[152];
    unsigned long long field_98;
    struct st_b66864_1 *field_a0;
    unsigned long long field_a8;
} st_b66864_0;

typedef struct st_b66864_1 {
    long long field_0;
} st_b66864_1;


void sub_b66864(st_b66864_0 *a0)
{
    unsigned long long v2;  // 4102
    unsigned long long v3;  // x22
    unsigned long long v4;  // x22
    unsigned long long v5;  // x22
    unsigned long long v6;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v2 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (!(v2 & 1))
    {
        /* unsupported instruction */;
        sub_b86ac8();
    }
    sub_b665d8(a0);
    v3 = 0;
    while (1)
    {
        v4 = v3;
        if (v4 == a0->field_a8)
            break;
        v5 = v4 + 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v6 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        v3 = v5;
        if (!(v6 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(*(long long *)&a0->field_a0[v4]);
            v3 = v5;
        }
    }
    if (!a0->field_98)
        return;
}
