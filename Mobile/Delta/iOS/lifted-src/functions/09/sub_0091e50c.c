/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91e50c..0x91e6c0 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_91e50c_0 {
    char field_0;
} st_91e50c_0;


long long sub_91e50c(void* a0)
{
    unsigned long v12;  // x8
    unsigned long long *v13;  // x9
    unsigned long v14;  // x12
    unsigned long v15;  // x11
    void* v16;  // x0
    unsigned long long *i;  // x20
    unsigned long long *v18;  // q2
    st_91e50c_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_91e50c_0 *v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    void* v4;  // [bp-0x60]
    unsigned long v5;  // [bp-0x58]
    unsigned long v6;  // [bp-0x50]
    uint128_t v7;  // [bp-0x50], Other Possible Types: unsigned long
    unsigned long long *v8;  // [bp-0x48]
    unsigned long long *v9;  // [bp-0x40]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v1 = &v0;
    v0 = &v1;
    v12 = (long long)a0[32];
    if (v12 >= 0x200)
    {
        *(unsigned long long *)&a0[32] = (v12 ^ 0xfffffffffffffe00) + (v12 + (~(unsigned int)v12 | 0x7ffffffffffffe00)) * 2 + 2;
    }
    else
    {
        v13 = (long long)a0[24];
        v14 = -*(long long *)a0;
        v15 = *(long long *)a0 + (char *)v13 + 0x2 * v13 + 2 * (v14 | ~v13) + 2 * (v14 & ~v13) + 2;
        if (v15 > (unsigned long long)((long long)a0[16] - (long long)a0[8]))
        {
            v16 = a0;
            if (v13 != (long long)a0[16])
            {
                v7 = sub_12a38(v16, 0x200);
                return sub_8b232c(a0, &v7);
            }
            v7 = sub_12a38(v16, 0x200);
            sub_8b4d48(a0, &v7);
        }
        else
        {
            sub_ec54();
            v3 = sub_12a38(a0, 0x200);
            v4 = a0;
            v5 = 0x200;
            v2 = v3;
            sub_8b0148(&v7, &v2);
            v3 = 0;
            i = (long long)a0[16];
            while (i != (long long)a0[8])
            {
                sub_8b4f08(&v7, (char *)i - 8);
            }
            v6 = *(long long *)a0;
            v8 = (long long)a0[8];
            v18 = (unsigned long long *)(int128_t)a0[16];
            *(uint128_t *)a0 = v7;
            *(uint128_t *)&a0[16] = (uint128_t)v9;
            v9 = v18;
            sub_2217c(&v3, 0);
            return sub_1089c(&v6);
        }
    }
    v7 = *(long long *)(long long)a0[8];
    *(long long *)&a0[8] = (long long)a0[8] + 8;
    return sub_8c5adc(a0, &v7);
}
