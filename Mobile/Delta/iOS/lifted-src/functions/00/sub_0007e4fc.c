/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7e4fc..0x7e780 (644 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7e4fc_1 {
    char padding_0[28];
    unsigned int field_1c;
} st_7e4fc_1;

typedef struct st_7e4fc_0 {
    char field_0;
} st_7e4fc_0;


unsigned long long sub_7e4fc(long long a0, long long a1, long long a2, unsigned long long a3, unsigned long long *a4, long long a5, long long a6, st_7e4fc_1 *a7, unsigned long a8, unsigned long a9, unsigned int a10)
{
    unsigned long long v16;  // x21
    unsigned long long v17;  // x27
    void* v26;  // x20
    unsigned long long v27;  // x0
    unsigned long long v28;  // 4110
    unsigned long long v29;  // x0
    unsigned long long v30;  // 4106
    long long v18;  // x8
    unsigned int v19;  // w25
    unsigned long long v20;  // x0
    unsigned long long v21;  // 4106
    void* v22;  // x19
    void* v23;  // x19
    unsigned long long v24;  // x8
    long long v25;  // x22
    unsigned long v0;  // [bp-0xf0]
    unsigned long v1;  // [bp-0xe8]
    unsigned long v2;  // [bp-0xe0]
    unsigned long long v3;  // [bp-0xd0]
    unsigned long v4;  // [bp-0xc0]
    unsigned long v5;  // [bp-0xb8]
    unsigned int v6;  // [bp-0xac]
    st_7e4fc_0 **v7;  // [bp-0xa0], Other Possible Types: char
    st_7e4fc_0 *v8;  // [bp-0x98]
    unsigned int v9;  // [bp-0x90]
    unsigned int v10;  // [bp-0x8c]
    unsigned int v11;  // [bp-0x88]
    unsigned long long v12;  // [bp-0x80]
    unsigned long long v13;  // [bp-0x78]
    unsigned int v14;  // [bp-0x70]
    char *v15;  // [bp-0x10]

    v15 = &a8;
    v8 = &v7;
    v7 = &v8;
    v6 = a7->field_1c;
    v16 = a4[1];
    v3 = *a4;
    v4 = a8 + 212;
    v5 = a9 - 212;
    v17 = v16 - v3;
    v18 = (long long)(v17) >> 3;
    if (v16 != v3)
        v19 = a3 / v18 > 19;
    else
        v19 = 1;
    v1 = a4[4];
    v2 = a4[6];
    v0 = a4[5];
    v20 = sub_82bc0(a0, a1, a2, a3, v4, v5, a5, a6, CONCAT(sub_82758(a7), v6), CONCAT(a10, v19));
    v21 = arm64g_calculate_condition(130, v20, 120, 0);
    if (v21 & 1)
    {
        return v20;
    }
    else if (4 > (long long)(a1 - v20))
    {
        return 0xffffffffffffffba;
    }
    else
    {
        v22 = a0 + v20;
        if (127 >= (unsigned long long)v18)
        {
            *(char *)v22 = v17 >> 3;
            v23 = v22 + 1;
            v24 = v3;
            if (v16 == v24)
            {
                _memcpy(a6 + 2064, a5 + 2064, 3552);
                return v22 + 1 - a0;
            }
        }
        else if (126 >= (unsigned long long)((unsigned long long)(v18) >> 8))
        {
            *(char *)v22 = (char)v18 * 0 | (char)((unsigned long long)(v18) >> 8) | 128;
            *(char *)&v22[1] = v17 >> 3;
            v23 = v22 + 2;
            v24 = v3;
            if (v16 == v24)
            {
                _memcpy(a6 + 2064, a5 + 2064, 3552);
                return v22 + 2 - a0;
            }
        }
        else
        {
            *(char *)v22 = 0xff;
            *(unsigned short *)&v22[1] = 0x8100 + (unsigned short)((unsigned int)v17 >> 3);
            v23 = v22 + 3;
            v24 = v3;
            if (v16 == v24)
            {
                _memcpy(a6 + 2064, a5 + 2064, 3552);
                return v22 + 3 - a0;
            }
        }
        v25 = a0 + a1;
        v26 = v23 + 1;
        sub_7c8ac(a4, v18, a5 + 2064, a6 + 2064, v26, v25, v6, a8, v4, v5);
        v27 = v12;
        v28 = arm64g_calculate_condition(130, v27, 120, 0);
        if (v28 & 1)
            return v27;
        *(char *)v23 = (char)v9 * 64 + (char)v10 * 16 + (char)v11 * 4;
        v29 = sub_83548(v26 + v27, v25 - (v26 + v27), a6 + 2836, v0, a6 + 2064, v2, a6 + 4288, v1, v24, v18, CONCAT(a10, v14));
        v30 = arm64g_calculate_condition(0x22, v29, 0x77, 0);
        if (v30 & 1)
            return v29;
        if (!v13 || 4 <= v29 + v13)
            return v26 + v27 + v29 - a0;
        return 0;
        return v26 + v27 + v29 - a0;
    }
}
