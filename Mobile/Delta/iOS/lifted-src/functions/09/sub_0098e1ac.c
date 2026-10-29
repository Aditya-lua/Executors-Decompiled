/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98e1ac..0x98e27c (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98e1ac_0 {
    char padding_0[144];
    long long field_90;
    long long field_98;
    long long field_a0;
    char field_a8;
} st_98e1ac_0;


double sub_98e1ac(st_98e1ac_0 *a0, uint128_t *a1)
{
    unsigned long long v2;  // x9
    unsigned long long v3;  // x8
    unsigned long long v4;  // x0
    unsigned long long v5;  // x8
    st_98e1ac_0 *v6;  // x0
    uint128_t *v7;  // x8
    uint128_t v8;  // q0
    uint128_t v9;  // q1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_98;
    if (v2 == a0->field_a0)
    {
        if (v2)
            v3 = v2 * 8 / 5;
        else
            v3 = 4;
        if (v3 >= 0x200)
            v3 = 0x200;
        if (v2 != v3)
        {
            v4 = sub_a6c1b4(a0->field_90, v3 * 32, "ssl/quic/quic_txpim.c", 173);
            if (v4)
            {
                v5 = v4;
                v6 = a0;
                a0->field_90 = v5;
                a0->field_a0 = v3;
                v2 = a0->field_98;
                a0 = v6;
LABEL_98e248:
                a0->field_98 = v2 + 1;
                v7 = v5 + v2 * 32;
                v8 = *a1;
                v9 = a1[1];
                *v7 = v8;
                v7[1] = v9;
                a0->field_a8 = a0->field_a8 | 1;
            }
        }
    }
    else
    {
        v5 = a0->field_90;
        goto LABEL_98e248;
    }
    return (unsigned long long)v8;
}
