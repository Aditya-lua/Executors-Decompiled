/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x846d4..0x848f0 (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_846d4_1 {
    char padding_0[136];
    unsigned long long field_88;
} st_846d4_1;

typedef struct st_846d4_0 {
    char field_0;
} st_846d4_0;


unsigned long long sub_846d4(unsigned long a0, st_846d4_1 *a1, unsigned long long a2, unsigned long long a3, void* a4, long long a5, unsigned long a6, unsigned long long a7)
{
    unsigned long long v6;  // x8
    unsigned long long v7;  // w23
    unsigned long long v16;  // 4127
    unsigned long long v17;  // x9
    unsigned long long v18;  // x10
    unsigned int v19;  // w10
    unsigned int v20;  // w9
    unsigned long long v8;  // x9
    unsigned long long v9;  // w8
    unsigned long long v10;  // x25
    void* iter;  // x19
    long long v12;  // x1
    void* v13;  // x0
    unsigned long long v14;  // x21
    unsigned long long v15;  // x0
    unsigned long long v0;  // [bp-0x90]
    long long v1;  // [bp-0x78]
    st_846d4_0 **v2;  // [bp-0x70], Other Possible Types: char
    st_846d4_0 *v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    unsigned long v5;  // [bp+0x0]

    v4 = &v5;
    v3 = &v2;
    v2 = &v3;
    v6 = 200;
    if (!a7)
        v6 = 0;
    v7 = 3;
    if (a3 < 0x400 - v6)
        v8 = 3;
    else
        v8 = 4;
    if (a3 >= 0x4000 - v6)
        v8 += 1;
    if (a7)
        v7 = *(int *)&a1->padding_0[0];
    *(unsigned int *)v5 = 0;
    if (!a3)
        return sub_82f78(a4, a5);
    v9 = *(int *)&a1->padding_0[0];
    if (v9 == 1)
    {
        return sub_82ee0(a4, a5);
    }
    else if (v9)
    {
        v10 = 0;
        iter = a4 + v8;
        v1 = a5;
        if (a7 && v9 == 2)
        {
            _memcpy(iter, &a1->padding_0[4], a1->field_88);
            v10 = a1->field_88;
            iter += v10;
        }
        v12 = a4 + a5 - iter;
        v0 = a2;
        v13 = iter;
        v14 = a3;
        if (v8 == 3)
            v15 = sub_799f4(v13, v12);
        else
            v15 = sub_7a0a0(v13, v12);
        v16 = arm64g_calculate_condition(130, v15 - 1, 121, 0);
        if (v16 & 1)
            return 0;
        v17 = v15 + v10;
        if (a7 || v17 < v14)
        {
            v18 = 3;
            if (v17 > 0x3ff)
                v18 = 4;
            if (v17 & 0xffffffffffffc000)
                v18 += 1;
            if (v18 <= v8)
            {
                v19 = v7 + (unsigned int)v14 * 16;
                if (v8 == 5)
                {
                    *(unsigned int *)a4 = v19 + (unsigned int)v17 * 0x400000 + 12;
                    *(char *)&a4[4] = v17 >> 10;
                }
                else if (v8 == 4)
                {
                    *(unsigned int *)a4 = v19 + (unsigned int)v17 * 0x40000 + 8;
                }
                else
                {
                    v20 = v19 + (unsigned int)v17 * 0x4000;
                    *(unsigned short *)a4 = v20;
                    *(char *)&a4[2] = v20 >> 16;
                }
                *(unsigned int *)v5 = 1;
                return iter + v15 - a4;
            }
        }
        return sub_82f78();
    }
    return sub_82f78(a4, a5);
}
