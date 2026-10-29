/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91e324..0x91e50c (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_91e324_0 {
    char field_0;
} st_91e324_0;


unsigned long long sub_91e324(void* a0)
{
    void* v8;  // x19
    unsigned long v9;  // x0
    unsigned long long v18;  // x23
    unsigned long long v19;  // x0
    long long v20;  // x8
    unsigned long v10;  // x20
    unsigned long v11;  // x8
    long long v12;  // x1
    unsigned long long v13;  // x2
    unsigned long long v14;  // x0
    unsigned long long v15;  // x8
    unsigned long long v16;  // x21
    unsigned long long v17;  // x22
    st_91e324_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_91e324_0 *v1;  // [bp-0x68]
    st_91e324_0 **v2;  // [bp-0x60], Other Possible Types: char
    st_91e324_0 *v3;  // [bp-0x58]
    st_91e324_0 **v4;  // [bp-0x50], Other Possible Types: char
    st_91e324_0 *v5;  // [bp-0x48]
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
            if (!(sub_8b2d7c(v8) & 1))
                v10 = (long long)v8[24];
            else
                return 1;
        }
        if (sub_e24b4(v8, (long long)v8[32] + 1) > v10 * 2)
        {
            v11 = (0x899d73fc350bd8aa & *(long long *)v8 * 2) + (*(long long *)v8 ^ 0xc4ceb9fe1a85ec55);
            *(unsigned long long *)v8 = ~v11 + v11 * 2;
            v12 = ((long long)v8[32] ^ 2) + ((long long)v8[32] * 2 & 4) - 1;
            v13 = 1;
        }
        else
        {
            v12 = (((long long)v8[32] * 2 & 4) + ((long long)v8[32] ^ 2)) * 2 - 2;
            v13 = 0;
        }
        sub_8b4988(v8, v12, v13);
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
        v14 = sub_e24b4(v8, 8);
        v15 = 0xff;
        if (v14 < 0xff)
            v15 = v14;
        v16 = v15 + 8;
        v17 = v16 * 16;
        v18 = ((18 & v16 * 2) + (v16 ^ 9) ^ v17) + ((18 & v16 * 2) + (v16 ^ 9) & v17) * 2;
        v19 = sub_d6520(_malloc());
        v20 = v19 + v17;
        *(unsigned long long *)&v8[8] = v19;
        *(long long *)&v8[16] = v20;
        _bzero(v20, (v18 - 1 ^ -v17) + ((-v18 | -v17) + v18) * 2);
        *(char *)((long long)v8[16] + v16) = 1;
        *(double *)&v8[48] = 1.6e-322;
        return 1;
    }
}
