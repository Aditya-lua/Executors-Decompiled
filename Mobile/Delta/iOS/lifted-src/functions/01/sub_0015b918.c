/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15b918..0x15ba98 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_15b918_0 {
    char field_0;
} st_15b918_0;


unsigned long long sub_15b918(void* a0)
{
    void* v8;  // x19
    unsigned long v9;  // x0
    unsigned long v10;  // x20
    unsigned long v11;  // x1
    unsigned long long v12;  // x2
    long long v13;  // x0
    long long v14;  // x8
    long long v15;  // x21
    unsigned long long v16;  // x0
    long long v17;  // x8
    st_15b918_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_15b918_0 *v1;  // [bp-0x58]
    st_15b918_0 **v2;  // [bp-0x50], Other Possible Types: char
    st_15b918_0 *v3;  // [bp-0x48]
    st_15b918_0 **v4;  // [bp-0x40], Other Possible Types: char
    st_15b918_0 *v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a0;
    v1 = &v0;
    v0 = &v1;
    if ((long long)a0[32])
    {
        v9 = sub_e24b4(v8, (long long)a0[32] + 1);
        v10 = (long long)v8[24];
        if (v9 > (unsigned long long)(long long)v8[24])
        {
            if (!(sub_d6f78(v8) & 1))
                v10 = (long long)v8[24];
            else
                return 1;
        }
        if (sub_e24b4(v8, (long long)v8[32] + 1) > v10 * 2)
        {
            *(unsigned long long *)v8 = *(long long *)v8 + 0xc4ceb9fe1a85ec54;
            v11 = (long long)v8[32] + 1;
            v12 = 1;
        }
        else
        {
            v11 = (long long)v8[32] * 2 + 2;
            v12 = 0;
        }
        sub_1537b4(v8, v11, v12);
        return 1;
    }
    else
    {
        v3 = &v2;
        v2 = &v3;
        *(uint128_t *)&v8[24] = 0x70000000000000000;
        *(unsigned long long *)&v8[40] = sub_e24b4(v8, 8);
        v5 = &v4;
        v4 = &v5;
        v13 = sub_e24b4(v8, 8);
        v14 = 0xff;
        if ((unsigned long long)v13 < 0xff)
            v14 = v13;
        v15 = v14 + 8;
        v16 = sub_d6520(_malloc());
        v17 = v16 + v15 * 8;
        *(unsigned long long *)&v8[8] = v16;
        *(long long *)&v8[16] = v17;
        _bzero(v17, v14 + 16);
        *(char *)((long long)v8[16] + v15) = 1;
        *(double *)&v8[48] = 1.6e-322;
        return 1;
    }
}
