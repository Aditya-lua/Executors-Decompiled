/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c480c..0x1c49b0 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c480c_0 {
    char field_0;
} st_1c480c_0;


char * sub_1c480c(long long a0, char *a1, char *a2, long long a3, unsigned int a4, unsigned int a5)
{
    long long v6;  // x19
    char *v7;  // x0
    char *v8;  // x24
    char *v9;  // x0
    char *v10;  // x23
    char *v11;  // x23
    char *v12;  // x0
    unsigned long v13;  // x2
    unsigned long v14;  // x1
    unsigned long long v15;  // 4126
    st_1c480c_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_1c480c_0 *v1;  // [bp-0x60]
    unsigned int v2;  // [bp-0x58]
    unsigned int v3;  // [bp-0x54]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
        return a1;
    v6 = a0;
    if (*a1 == 42)
    {
        sub_1acf2c(v6, 0, -0x1);
        return a1 + 1;
    }
    v7 = sub_1c0044(v6, a1);
    if (v7 == a1)
        return a1;
    v8 = v7;
    v3 = 0;
    v9 = sub_1c2ba0(v6, v8, a2, &v3);
    if (v9 == v8)
        sub_1bee80();
    v10 = v9;
    if (v9 != a2)
    {
        if (*v10 == 44)
        {
            v2 = 0xffffffff;
            v11 = sub_1c2ba0(v6, v10 + 1, a2, &v2);
            v12 = sub_1aff44(v6, v11, a2);
            if (v12 != v11)
            {
                v13 = v2;
                v14 = v3;
                v15 = arm64g_calculate_condition(1, v13 & 0xffffffff, 1, 0);
                if (v15 & 1)
                {
                    sub_1acf2c(v6, v14, 0xffffffffffffffff, a3, a4, a5, 1);
                    return v12;
                }
                if ((int)v13 >= (int)v14)
                {
                    sub_1acf2c(v6, v14, v13, a3, a4, a5, 1);
                    return v12;
                }
                sub_1bee80();
            }
        }
        else
        {
            v12 = sub_1aff44(v6, v10, a2);
            if (v12 != v10)
            {
                v13 = v3;
                sub_1acf2c(v6, v13, v13, a3, a4, a5, 1);
                return v12;
            }
        }
    }
    sub_1b1b80();
    sub_1bee80();
}
