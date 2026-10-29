/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d1eb8..0x3d2040 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d1eb8_1 {
    char field_0;
    char padding_1[1579];
    unsigned int field_62c;
    unsigned int field_630;
} st_3d1eb8_1;

typedef struct st_3d1eb8_0 {
    char field_0;
} st_3d1eb8_0;

extern unsigned int g_d0da20[4];
extern unsigned long g_fffffffffffffff0;

unsigned long long sub_3d1eb8(unsigned long long a0, st_3d1eb8_1 *a1)
{
    unsigned long long idx;  // x20
    unsigned long v5;  // x8
    unsigned long long v14;  // x9
    unsigned int *v15;  // x11
    unsigned long long v17;  // 4106
    unsigned int v18;  // w10
    unsigned long v6;  // x9
    unsigned int v7;  // w10
    unsigned int v8;  // w11
    unsigned int i;  // w10
    unsigned long long index;  // x10
    unsigned long long v11;  // w9
    unsigned int v12;  // w11
    unsigned int *v13;  // x11
    st_3d1eb8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3d1eb8_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    idx = a0 + 0x4000;
    v1 = &v0;
    v0 = &v1;
    if (15 >= *(int *)(idx + 2084))
        sub_3ce8a0();
    v5 = *(int *)(idx + 2080);
    v6 = (&a1->field_0)[v5 >> 23];
    if (v6 != 0xff)
    {
        v7 = a1->padding_1[0x4ff + v6];
        v8 = *(int *)(idx + 2084);
        if ((int)v7 <= (int)v8)
        {
            *(unsigned int *)(idx + 2080) = (unsigned int)v5 << ((char)v7 & 31);
            *(unsigned int *)(idx + 2084) = v8 - v7;
            return a1->padding_1[0x3ff + v6];
        }
        return 0xffffffff;
    }
    else
    {
        i = (unsigned int)v5 >> 16;
        if (a1->field_62c > i)
        {
            index = 10;
            v11 = 10;
            v12 = *(int *)(idx + 2084) - 10;
            if (10 > *(int *)(idx + 2084))
                return 0xffffffff;
        }
        else
        {
            v13 = &a1->field_630;
            v14 = (char *)&g_fffffffffffffff0 + 6;
            do
            {
                v15 = v13;
                v14 -= 1;
                v13 = v15 + 1;
            } while (*v15 <= i);
            v17 = arm64g_calculate_condition(18, v14, 0x11, 0);
            if (!(v17 & 1))
            {
                *(int *)(idx + 2084) = *(int *)(idx + 2084) - 16;
                return 0xffffffff;
            }
            index = -v14;
            v11 = (unsigned int)index;
            v12 = *(int *)(idx + 2084) - v11;
            if (*(int *)(idx + 2084) < v11)
                return 0xffffffff;
        }
        v18 = (g_d0da20[index] & (unsigned int)v5 >> ((char)-v11 & 31)) + *(int *)&a1[1].padding_1[23 + 4 * index];
        if (v18 <= 0xff)
        {
            *(unsigned int *)(idx + 2084) = v12;
            *(unsigned int *)(idx + 2080) = (unsigned int)v5 << ((char)v11 & 31);
            return a1->padding_1[0x3ff + v18];
        }
        return 0xffffffff;
    }
}
