/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3e0d8..0xb3e290 (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3e0d8_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_b3e0d8_0;

extern char g_10002b0;

unsigned int sub_b3e0d8(unsigned int a0, unsigned long long a1, unsigned long long *a2, unsigned long a3)
{
    unsigned int v7;  // w0
    unsigned int iter;  // w24
    unsigned int v9;  // x0
    unsigned int v10;  // x0
    st_b3e0d8_0 *v11;  // x24
    unsigned int v13;  // x0
    st_b3e0d8_0 *v14;  // x24
    st_b3e0d8_0 *v16;  // x21
    uint128_t v0;  // [bp-0x120]
    uint128_t v1;  // [bp-0x110]
    unsigned long v2;  // [bp-0x100]
    char v3;  // [bp-0xf8]
    unsigned long v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v7 = sub_a2f9e0();
    if (a1 & 3 && a0 && v7)
    {
        if (!(a1 & 1))
        {
            iter = 0;
        }
        else
        {
            v9 = sub_a7f878(a0);
            if (v9)
            {
                sub_a71670("seed", v9, 32);
                iter = 1;
            }
            else
            {
                iter = 0;
            }
            v10 = sub_a8002c(a0);
            if (v10)
            {
                v11 = &(&v3)[iter * 40];
                sub_a71670("priv", v10, sub_a80958(a0));
                v11->field_0 = v0;
                v11->field_10 = v1;
                v11->field_20 = v2;
                iter += 1;
            }
        }
        if (a1 >> 1 & 1)
        {
            v13 = sub_a01e1c(a0);
            if (v13)
            {
                v14 = &(&v3)[iter * 40];
                sub_a71670("pub", v13, sub_a80940(a0));
                v14->field_0 = v0;
                v14->field_10 = v1;
                v14->field_20 = v2;
                v16 = &(&v3)[(iter + 1) * 40];
                sub_a71bbc();
                v16->field_0 = v0;
                v16->field_10 = v1;
                v16->field_20 = v2;
                a2();
            }
        }
        if (iter)
        {
            v16 = &(&v3)[iter * 40];
            sub_a71bbc();
            v16->field_0 = v0;
            v16->field_10 = v1;
            v16->field_20 = v2;
            a2();
        }
    }
    if (*(long long *)&g_10002b0 == v4)
        return 0;
    ___stack_chk_fail();
}
