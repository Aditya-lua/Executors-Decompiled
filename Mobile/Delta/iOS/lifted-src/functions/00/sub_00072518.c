/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x72518..0x726d8 (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_72518_0 {
    char field_0;
} st_72518_0;


long long sub_72518(void* a0, long long a1, long long a2, unsigned long a3, long long a4)
{
    long long v11;  // x19
    long long v12;  // x21
    long long v21;  // x24
    long long v22;  // x0
    unsigned long v13;  // x22
    long long v14;  // x0
    long long v15;  // x1
    long long v16;  // x21
    long long v17;  // x8
    unsigned long v18;  // x9
    long long v19;  // x23
    long long v20;  // x1
    st_72518_0 **v0;  // [bp-0x98], Other Possible Types: char
    st_72518_0 *v1;  // [bp-0x90]
    char v2;  // [bp-0x88], Other Possible Types: long long
    long long v3;  // [bp-0x80]
    long long v4;  // [bp-0x80]
    uint128_t v5;  // [bp-0x78], Other Possible Types: long long
    unsigned long v6;  // [bp-0x70]
    st_72518_0 **v7;  // [bp-0x60], Other Possible Types: char
    st_72518_0 *v8;  // [bp-0x58]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a1;
    v1 = &v0;
    v0 = &v1;
    if (a4 < 1)
        return v11;
    v12 = a2;
    v13 = (long long)a0[8];
    if (a4 > (long long)((long long)a0[16] - v13))
    {
        v14 = sub_29ccc(a0, a4 - *(long long *)a0 + v13);
        sub_30f60(&v2, v14, v11 - *(long long *)a0, a0);
        sub_73fdc(&v2, v12, a4);
        v8 = &v7;
        v7 = &v8;
        _memcpy(v5, v11, (long long)a0[8] - v11);
        v15 = *(long long *)a0;
        v5 = _INSERT(CONCAT(v5, 0), 0, v5 + (long long)a0[8] - v11);
        *(long long *)&a0[8] = v11;
        v16 = v3 + v15 - v11;
        _memcpy(v16, v15, v11 - v15);
        v17 = *(long long *)a0;
        *(long long *)a0 = v16;
        v18 = (long long)a0[16];
        *(uint128_t *)&a0[8] = v5;
        v5 = v17;
        v6 = v18;
        v2 = v17;
        v4 = v17;
        sub_2f3b0(&v2);
        return v3;
    }
    v19 = v13 - v11;
    if (a4 > v19)
    {
        v20 = v19 + v12;
        v21 = a3 - v20;
        sub_6505c(v13, v20, v21);
        *(unsigned long *)&a0[8] = v13 + v21;
        if (v19 < 1)
            return v11;
        sub_668fc(a0, v11, v13, v11 + a4);
        v22 = v11;
    }
    else
    {
        sub_668fc(a0, v11, v13, v11 + a4);
        v22 = v11;
        v19 = a4;
    }
    sub_6505c(v22, v12, v19);
    return v11;
}
