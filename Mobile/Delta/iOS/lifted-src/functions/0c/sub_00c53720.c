/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc53720..0xc537dc (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c53720_0 {
    char field_0;
    char padding_1[7];
    long long field_8;
} st_c53720_0;


unsigned long long sub_c53720(unsigned long long *a0)
{
    unsigned long long v13;  // x9
    unsigned long long v14;  // x8
    unsigned long long v15;  // x0
    st_c53720_0 *v16;  // x8
    unsigned long long v17;  // 4102
    unsigned long long v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    unsigned long long v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x58]
    unsigned long long v6;  // [bp-0x50]
    unsigned long v7;  // [bp-0x48]
    unsigned long long v8;  // [bp-0x40]
    unsigned long long v9;  // [bp-0x38]
    unsigned long v10;  // [bp-0x28]
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
        v15 = sub_c537dc(&v9, &v0);
        if (!v9)
            break;
        v16 = v9 + v10 * 16;
        if (v16->field_0 == 82)
        {
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v17 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v17 & 1))
            {
                /* unsupported instruction */;
                sub_c53420(v16->field_8);
            }
        }
    }
    return v15;
}
