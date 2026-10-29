/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc61428..0xc614bc (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c61428_0 {
    char padding_0[24];
    struct st_c61428_1 *field_18;
} st_c61428_0;

typedef struct st_c61428_2 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    struct st_c61428_0 *field_18;
    char padding_20[8];
    long long field_28;
} st_c61428_2;

typedef struct st_c61428_1 {
    unsigned long long field_0;
} st_c61428_1;


st_c61428_2 * sub_c61428(st_c61428_2 *a0, st_c61428_0 **a1)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    do
    {
        /* unsupported instruction */;
        v2 = /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v3 = arm64g_calculate_condition(19, v2, 1, 0);
    if (!(v3 & 1))
    {
        /* unsupported instruction */;
    }
    else if (1 < (int)v2)
    {
        *a1 = 0;
        return a0;
    }
    if (!a0->field_18)
    {
        sub_a6a9e8(0, a0, a0 + 1);
        sub_95e3b8(a0->field_8);
        sub_a7c1d0(a0->field_28);
        a0 = sub_a6c2e4(a0, "ssl/ssl_lib.c", 1441);
        *a1 = 0;
        return a0;
    }
    a0->field_18->field_18();
}
