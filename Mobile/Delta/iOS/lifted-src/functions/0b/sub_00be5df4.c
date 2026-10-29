/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe5df4..0xbe5f30 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_be5df4(unsigned long long *a0)
{
    unsigned long long v2;  // x21
    unsigned long long *v3;  // x0
    unsigned long i;  // x23
    long long *v5;  // x8
    unsigned long long v6;  // x9
    unsigned long v7;  // x10
    unsigned long long v8;  // 4121
    unsigned long long v9;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[1];
    v3 = a0;
    if (v3[3] != v2)
    {
        i = 0;
        v3 = a0;
        do
        {
            v5 = v2 + 24 * i;
            v6 = *v5;
            v7 = v6 ^ 0x8000000000000000;
            v8 = arm64g_calculate_condition(0x44, v6, 0, 0);
            if (!(v8 & 1))
                v7 = 1;
            if (!v7)
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v9 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v9 & 1))
                {
                    /* unsupported instruction */;
                    v3 = sub_b86a90(v5[1]);
                }
            }
            else if (v7 != 1)
            {
                v3 = sub_be5f30(v5 + 1);
            }
            else if (v6)
            {
                v3 = _free(v5[1]);
            }
            i += 1;
        } while (i != (a0[3] - v2) / 24);
    }
    if (!a0[2])
        return v3;
    return _free();
}
