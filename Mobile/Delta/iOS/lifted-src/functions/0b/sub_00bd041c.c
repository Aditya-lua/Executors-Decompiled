/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd041c..0xbd04ac (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_bd041c(unsigned long long *a0)
{
    unsigned long v13;  // x9
    unsigned long v14;  // x8
    unsigned long long v15;  // x0
    unsigned long long v16;  // 4102
    unsigned long v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x60]
    unsigned long v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x50]
    unsigned long v5;  // [bp-0x48]
    unsigned long v6;  // [bp-0x40]
    unsigned long v7;  // [bp-0x38]
    unsigned long v8;  // [bp-0x30]
    char v9;  // [bp-0x28], Other Possible Types: unsigned long
    unsigned long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v13 = *a0;
    if (v13)
    {
        v14 = a0[2];
        v1 = 0;
        v2 = v13;
        v3 = a0[1];
        v5 = 0;
        v6 = v13;
        v7 = a0[1];
        v13 = 1;
    }
    else
    {
        v14 = 0;
    }
    v0 = v13;
    v4 = v13;
    v8 = v14;
    while (1)
    {
        v15 = sub_bd04ac(&v9, &v0);
        if (!v9)
            break;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v16 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v16 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(*(long long *)(v9 + 272 + v10 * 8));
        }
    }
    return v15;
}
