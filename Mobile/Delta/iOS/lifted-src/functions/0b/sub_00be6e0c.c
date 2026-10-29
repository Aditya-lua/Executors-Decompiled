/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe6e0c..0xbe6ea0 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_be6e0c(unsigned long long *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x8
    unsigned long long v9;  // x9
    unsigned long long v10;  // 4139
    unsigned long long v11;  // 4102
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = *a0;
    v9 = v8 ^ 0x8000000000000000;
    v10 = arm64g_calculate_condition(0x44, v8, 0, 0);
    if (!(v10 & 1))
        v9 = 1;
    if (!v9)
    {
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v11 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v11 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(a0[1]);
        }
    }
    else if (v9 != 1)
    {
        sub_be5f30(a0 + 1);
    }
    else if (v8)
    {
        _free(a0[1]);
    }
    sub_be6008();
    return;
}
