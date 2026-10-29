/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bd340..0x1bd434 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bd340_0 {
    char field_0;
} st_1bd340_0;


unsigned short sub_1bd340(long long a0, unsigned int a1, uint128_t a2)
{
    long long v9;  // x0
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // cc_ndep
    unsigned long long v17;  // 4112
    unsigned long long v18;  // 4106
    unsigned long v19;  // cc_op
    unsigned int v11;  // w8
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4106
    st_1bd340_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_1bd340_0 *v1;  // [bp-0x40]
    unsigned int v2;  // [bp-0x34]
    unsigned short v3;  // [bp-0x30]
    unsigned int v4;  // [bp-0x2c]
    unsigned short v5;  // [bp-0x24]
    unsigned short v6;  // [bp-0x22]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    v5 = 5;
    v4 = (unsigned int)(a2 * 2361183241434822607 >> 71) + (unsigned int)(a2 * 2361183241434822607 >> 127) + 1000 * a1;
    v9 = sub_1ac480(&(int)a0, &v4);
    if (!v9)
    {
        return 14;
    }
    else if (v9 < 1)
    {
        return 2;
    }
    else if (v6 & 5)
    {
        v2 = 4;
        v3 = 0;
        v11 = _getsockopt(a0, 0xffff, 0x1007, &v3, &v2);
        if (!v3)
        {
            v12 = arm64g_calculate_condition(v19, v14, v15, v16);
            v13 = arm64g_calculate_condition(193, (v12 & 1 ? v11 : 0x40000000), v12 & 1, 0);
            if (!(v13 & 1))
                return 2;
        }
        else
        {
            v17 = arm64g_calculate_condition(v19, v14, v15, v16);
            v18 = arm64g_calculate_condition(192, (v17 & 1 ? v11 : 0x40000000), v17 & 1, 0);
            if (!(v18 & 1))
                return 2;
        }
        return 0;
    }
    else
    {
        return 2;
    }
}
