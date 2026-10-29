/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc599c..0xc5b94 (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c599c_0 {
    char field_0;
} st_c599c_0;

extern unsigned long long g_e6ce70;
extern unsigned long long g_e6ce88;
extern unsigned long long g_e6cf08;

long long sub_c599c(long long a0, long long a1, long long a2, unsigned int *a3, long long a4, long long a5, long long a6, unsigned int a7)
{
    long long v11;  // x26
    unsigned int v12;  // x21
    unsigned long long v21;  // x0
    unsigned long long v22;  // 4106
    long long v13;  // x20
    long long v14;  // x0
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4110
    long long v17;  // x1
    long long v18;  // x2
    unsigned long long v19;  // 4106
    unsigned int *v20;  // x28
    long long v0;  // [bp-0xa8]
    long long v1;  // [bp-0xa0]
    long long v2;  // [bp-0x98]
    unsigned int v3;  // [bp-0x8c]
    long long v4;  // [bp-0x88]
    st_c599c_0 **v5;  // [bp-0x80], Other Possible Types: char
    st_c599c_0 *v6;  // [bp-0x78]
    unsigned int v7;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned int *v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a1;
    v6 = &v5;
    v7 = a4;
    v4 = a2;
    v5 = &v6;
    v8 = a3;
    if (a7)
    {
        a5 = sub_c4c40(a7);
        a6 = sub_c4ba8(a7);
    }
    v0 = a6;
    v1 = a5;
    v3 = 0;
    v2 = v11;
    while (1)
    {
        if (!*(int *)(a0 + 30104))
            v12 = 5;
        else
            v12 = 1;
        if ((unsigned long long)a4 < v12)
            break;
        if ((unsigned long long)a4 >= 4 && !*(int *)(a0 + 30104))
        {
            v20 = v8;
            if ((*v20 & 0xfffffff0) == 407710288)
            {
                v21 = sub_c5ff0(v20, a4);
                v22 = arm64g_calculate_condition(130, v21, 120, 0);
                if (!(v22 & 1))
                {
                    v7 = a4 - v21;
                    v8 = (char *)v20 + v21;
                    goto *((void *)(g_e6ce70));
                }
                else
                {
                    goto *((void *)(g_e6cf08));
                }
            }
            else
            {
                goto *((void *)(g_e6ce88));
            }
        }
        v13 = v4;
        if (a7)
        {
            v14 = sub_c6020(a0, a7);
            v15 = arm64g_calculate_condition(50, v14, 0x77, 0);
            if (!(v15 & 1))
                return v14;
        }
        else
        {
            v14 = sub_c5f0c(a0, v1, v0);
            v16 = arm64g_calculate_condition(130, v14, 120, 0);
            if (v16 & 1)
                return v14;
        }
        sub_c6f14(a0, v11, v13);
        v17 = v11;
        v18 = v13;
        v14 = sub_c4d68(a0, v17, v18, &v8, &v7);
        if (sub_77ec4(v14, v17, v18, &v8, &v7) == 10 & v3 & 1)
            return -0x48;
        v19 = arm64g_calculate_condition(130, v14, 120, 0);
        if (v19 & 1)
            return v14;
        v11 += v14;
        v4 = v13 - v14;
        v3 = 1;
        a4 = v7;
    }
    if (!a4)
        return v11 - v2;
    return -0x48;
}
