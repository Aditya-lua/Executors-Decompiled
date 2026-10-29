/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x74744..0x74950 (524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_74744_0 {
    char field_0;
} st_74744_0;


long long sub_74744(void* a0, long long a1, unsigned long long *a2, unsigned long long *a3, long long a4)
{
    unsigned long v15;  // x23
    long long v16;  // x0
    long long v17;  // x1
    long long v18;  // x21
    long long v19;  // x8
    unsigned long v20;  // x9
    long long v21;  // x24
    st_74744_0 **v0;  // [bp-0xb8], Other Possible Types: char
    st_74744_0 *v1;  // [bp-0xb0]
    unsigned long v2;  // [bp-0xa8]
    char v3;  // [bp-0xa0], Other Possible Types: long long, unsigned long
    long long v4;  // [bp-0x98]
    long long v5;  // [bp-0x98]
    uint128_t v6;  // [bp-0x90], Other Possible Types: long long
    unsigned long v7;  // [bp-0x88]
    unsigned long v8;  // [bp-0x78]
    unsigned long v9;  // [bp-0x70]
    char v10;  // [bp-0x61]
    st_74744_0 **v11;  // [bp-0x60], Other Possible Types: char
    st_74744_0 *v12;  // [bp-0x58], Other Possible Types: unsigned long
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v1 = &v0;
    v0 = &v1;
    if (a4 < 1)
        return a1;
    v15 = (long long)a0[8];
    if (a4 > (long long)((long long)a0[16] - v15))
    {
        v16 = sub_29ccc(a0, a4 - *(long long *)a0 + v15);
        sub_30f60(&v3, v16, a1 - *(long long *)a0, a0);
        v2 = *a2;
        sub_740e0(&v3, &v2, a4);
        v12 = &v11;
        v11 = &v12;
        _memcpy(v6, a1, (long long)a0[8] - a1);
        v17 = *(long long *)a0;
        v6 = _INSERT(CONCAT(v6, 0), 0, v6 + (long long)a0[8] - a1);
        *(long long *)&a0[8] = a1;
        v18 = v4 + v17 - a1;
        _memcpy(v18, v17, a1 - v17);
        v19 = *(long long *)a0;
        *(long long *)a0 = v18;
        v20 = (long long)a0[16];
        *(uint128_t *)&a0[8] = v6;
        v6 = v19;
        v7 = v20;
        v3 = v19;
        v5 = v19;
        sub_2f3b0(&v3);
        return v4;
    }
    v21 = v15 - a1;
    if (a4 <= v21)
    {
        sub_668fc(a0, a1, v15, a1 + a4);
        v8 = *a2;
        sub_72478(&v8, a4, a1);
        return a1;
    }
    v9 = *a2;
    sub_75174(&v9, v21);
    v3 = v9;
    v12 = *a3;
    *(unsigned long long *)&a0[8] = sub_75860(a0, &v3, &v12, (long long)a0[8]);
    if (v21 < 1)
        return a1;
    sub_668fc(a0, a1, v15, a1 + a4);
    v11 = v3;
    v12 = *a2;
    sub_730fc(&v10, &v12, &v11, a1);
    return a1;
}
