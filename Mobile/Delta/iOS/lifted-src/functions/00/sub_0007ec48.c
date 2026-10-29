/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7ec48..0x7ee8c (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7ec48_1 {
    char padding_0[2056];
    unsigned int field_808;
} st_7ec48_1;

typedef struct st_7ec48_0 {
    char field_0;
} st_7ec48_0;


unsigned long long sub_7ec48(long long a0, unsigned long long a1, st_7ec48_1 *ptr, st_7ec48_1 *ptr1, unsigned int *a4, unsigned int a5, long long a6, long long a7)
{
    unsigned int v5;  // w27
    unsigned long long v6;  // x8
    unsigned long long v7;  // x0
    unsigned long long v8;  // 4106
    long long v9;  // x24
    unsigned long long v10;  // x0
    unsigned long long v11;  // 4106
    unsigned long long v12;  // x25
    unsigned long long v13;  // x0
    unsigned long long v14;  // x8
    st_7ec48_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_7ec48_0 *v1;  // [bp-0x70]
    unsigned int v2;  // [bp-0x64]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0], Other Possible Types: unsigned int

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = 0xff;
    v5 = ptr->field_808;
    _memcpy(ptr1, ptr, 2064);
    if (!a5)
    {
        v6 = 63;
        if (ptr->field_808 == 2)
            v6 = 6;
        if (a1 > v6)
        {
            v7 = sub_794c0(a6, &v2, a0, a1, a6, a7);
            v8 = arm64g_calculate_condition(130, v7, 120, 0);
            if (v8 & 1)
            {
                return v7;
            }
            else if (v7 == a1)
            {
                *a4 = 1;
                return 0;
            }
            else if (v7 > (a1 >> 7) + 4)
            {
                v9 = a7 - 0x400;
                if (ptr->field_808 == 1)
                    v5 = sub_79cf0(ptr, a6, v2) != 0;
                _bzero(ptr1, 0x808);
                v10 = sub_7a7d4(ptr1, a6, v2, sub_79b58(11, a1, v2, a6 + 0x400, v9, ptr1, a6, v4), a6 + 0x400, v9);
                v11 = arm64g_calculate_condition(130, v10, 120, 0);
                if (v11 & 1)
                    return v10;
                v12 = sub_79df8(ptr1, a6, v2);
                v13 = sub_7a930(a4 + 1, 128, ptr1, v2, v10, a6 + 0x400, v9);
                if (v5)
                {
                    v14 = sub_79df8(ptr, a6, v2);
                    if (a1 > v14 && (a1 <= v13 + 12 || v14 <= v13 + v12))
                    {
                        _memcpy(ptr1, ptr, 2064);
                        *a4 = 3;
                        return 0;
                    }
                }
                if (a1 > v13 + v12)
                {
                    *a4 = 2;
                    ptr1->field_808 = 1;
                    return v13;
                }
                _memcpy(ptr1, ptr, 2064);
            }
        }
    }
    *a4 = 0;
    return 0;
}
