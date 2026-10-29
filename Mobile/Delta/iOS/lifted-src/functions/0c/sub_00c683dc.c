/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc683dc..0xc6847c (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c683dc(unsigned long a0, unsigned long long a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long long v16;  // 4102
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    sub_a69cc4();
    if (a1 >> 31 & 1)
    {
LABEL_c68410:
        if (sub_a69c94() && sub_a69c78() && sub_a69ca4() && sub_a69c9c(v10, 4))
        {
            if (!(v9 >> 31 & 1))
            {
                if (sub_a69c88() && sub_a69ca4() && sub_a69c6c())
                {
                    sub_a69cb8();
                    v16 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
                    if (!(v16 & 1))
                        goto LABEL_c6845c;
                    sub_a69cac(sub_a69c48());
                }
            }
            else
            {
LABEL_c6845c:
            }
        }
    }
    else if (30 >= (unsigned int)v9 && !(!sub_a69c94()))
    {
        goto LABEL_c68410;
    }
}
