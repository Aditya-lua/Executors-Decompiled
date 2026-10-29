/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3afc0..0xb3b170 (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b3afc0(unsigned long long a0, unsigned long long a1, unsigned long long *a2, unsigned long a3)
{
    unsigned long long v4;  // w0
    unsigned long long v5;  // w27
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4105
    unsigned long long v16;  // w8
    unsigned long v17;  // cc_op
    unsigned long v18;  // cc_dep1
    unsigned long long v19;  // 4112
    unsigned long long v6;  // x0
    unsigned long long v20;  // 4105
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    long long v9;  // x0
    long long v10;  // x0
    unsigned long long v11;  // w0
    unsigned long long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    v4 = (unsigned int)sub_a2f9e0();
    if (!(a1 >> 2 & 1))
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (v4)
    {
        v5 = (unsigned int)a1 & 3;
        if (v5 == 1)
            return 0;
        v6 = sub_a6ee78();
        if (!v6)
            return v6;
        v7 = v6;
        v8 = sub_9dddcc(sub_a19700(a0));
        if (v8)
        {
            sub_9de064(v8);
            v9 = sub_9ffdd0(a0);
            v10 = sub_a19700(a0);
            v11 = (unsigned int)sub_a16ddc(v9, v7, 0, v10, sub_a19708(a0), v8, &v0);
            if (!v5)
            {
                v14 = arm64g_calculate_condition(v17, v18, v12, v13);
                v15 = arm64g_calculate_condition(3, (v14 & 1 ? v11 : 0x40000000), 0, 0);
                v16 = (unsigned int)!(v15 & 1);
                if (v5)
                    goto LABEL_b3b098;
            }
            else
            {
                v19 = arm64g_calculate_condition(v17, v18, v12, v13);
                v20 = arm64g_calculate_condition(0, (v19 & 1 ? v11 : 0x40000000), 0, 0);
                v16 = (unsigned int)!(v20 & 1);
                if (v5)
                {
LABEL_b3b098:
                    if (v11)
                        v16 = sub_b3bbe8(a0, v7, 0, (unsigned int)a1 & 1, &v1) != 0;
                }
            }
            if (!(a1 >> 7 & 1))
            {
                if (v16)
                    goto LABEL_b3b0e0;
            }
            else
            {
                if (v16 && sub_b3be28(a0, v7, 0))
                {
LABEL_b3b0e0:
                    if (sub_a6f570(v7))
                        a2();
                }
            }
        }
        sub_a6eed4(v7);
        sub_a6c2e4(v1, "providers/implementations/keymgmt/ec_kmgmt.c", 503);
        sub_a6c2e4(v0, "providers/implementations/keymgmt/ec_kmgmt.c", 504);
        sub_9de17c(v8);
        sub_9dded4(v8);
        return 0;
    }
    else
    {
        return 0;
    }
}
