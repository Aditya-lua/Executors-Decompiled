/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x84bc8..0x84da4 (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_84bc8_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    char field_c;
    char padding_d[139];
    long long field_98;
    unsigned long long field_a0;
} st_84bc8_0;

typedef struct st_84bc8_2 {
    char padding_0[4];
    unsigned int field_4;
} st_84bc8_2;

typedef struct st_84bc8_1 {
    char field_0;
} st_84bc8_1;


unsigned long long sub_84bc8(long long a0, st_84bc8_0 *a1, long long a2, unsigned long long a3, long long a4, long long a5, long long a6, st_84bc8_2 *a7, void* a8, long long a9, unsigned int a10, unsigned long long *a11)
{
    unsigned int v8;  // w9
    void* v9;  // x16
    void* v10;  // x16
    unsigned int v11;  // w9
    void* v12;  // x10
    void* iter;  // x24
    unsigned long long v14;  // x0
    unsigned long long v15;  // 4106
    void* v0;  // [bp-0x98]
    void* v1;  // [bp-0x88]
    unsigned int v2;  // [bp-0x7c]
    void* v3;  // [bp-0x78]
    st_84bc8_1 **v4;  // [bp-0x70], Other Possible Types: char
    st_84bc8_1 *v5;  // [bp-0x68]
    void* *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp+0x14]

    v6 = &a8;
    v5 = &v4;
    v4 = &v5;
    v8 = a7->field_4;
    *(unsigned int *)a11 = 0;
    if (4 > a9)
        return 0xffffffffffffffba;
    if (127 >= a3)
    {
        v9 = a8;
        *(char *)v9 = a3;
        v10 = v9 + 1;
        if (!a3)
            return 1;
    }
    else if (126 >= a3 >> 8)
    {
        *(char *)a8 = (char)a3 * 0 | (char)(a3 >> 8) | 128;
        *(char *)&a8[1] = a3;
        v10 = a8 + 2;
    }
    else
    {
        *(char *)a8 = 0xff;
        *(unsigned short *)&a8[1] = (unsigned short)a3 + 0x8100;
        v10 = a8 + 3;
    }
    v11 = a10;
    v0 = a8;
    v12 = a8 + a9;
    iter = v10 + 1;
    v3 = v10;
    if (v7)
    {
        v2 = v11;
        v1 = v12;
        *(char *)v10 = (char)a1->field_0 * 64 + (char)a1->field_4 * 16 + (char)a1->field_8 * 4;
        _memcpy(iter, &a1->field_c, a1->field_98);
        v12 = v1;
        v11 = v2;
        iter += a1->field_98;
    }
    else
    {
        *(char *)v10 = 252;
    }
    v14 = sub_83548(iter, v12 - iter, a0 + 772, a5, a0, a6, a0 + 2224, a4, a2, a3, CONCAT(v11, v8 > 57));
    v15 = arm64g_calculate_condition(130, v14, 120, 0);
    if (v15 & 1)
        return v14;
    if (v7 && a1->field_a0 && a1->field_a0 + v14 < 4 || 4 > (long long)(iter + v14 - v3))
        return 0;
    *(unsigned int *)a11 = 1;
    return iter + v14 - v0;
    return 0;
}
