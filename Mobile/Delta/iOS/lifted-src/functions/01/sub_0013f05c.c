/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13f05c..0x13f148 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13f05c_1 {
    char padding_0[84];
    unsigned int field_54;
} st_13f05c_1;

typedef struct st_13f05c_0 {
    char field_0;
} st_13f05c_0;


st_13f05c_1 ** sub_13f05c(st_13f05c_1 **a0, st_13f05c_1 **a1, void* a2)
{
    st_13f05c_1 **v7;  // x0
    unsigned long iter;  // x8
    void* v9;  // x9
    void* v10;  // x11
    void* v11;  // x9
    void* v12;  // x10
    unsigned long v13;  // x11
    unsigned long v14;  // x11
    st_13f05c_1 **v15;  // x0
    st_13f05c_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_13f05c_0 *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x20]
    unsigned long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    if (a0 == a1)
        return a0;
    v4 = 0;
    v3 = &v4;
    v7 = a0 + 1;
    *(st_13f05c_1 **)a2 = *a0;
    if (v7 != a1)
    {
        iter = 0;
        v9 = a2;
        while (1)
        {
            v10 = v9;
            v11 = v9 + 8;
            if (*(int *)(*(long long *)v9 + 84) <= (int)*v7->field_54)
            {
                *(st_13f05c_1 **)v11 = *v7;
                v7 += 1;
                iter += 8;
                v9 = v11;
                if (v7 == a1)
                    break;
            }
            else
            {
                *(long long *)&v10[8] = *(long long *)v9;
                v12 = a2;
                if (v10 != a2)
                {
                    v13 = iter;
                    while (1)
                    {
                        v14 = v13;
                        v12 = a2 + v14;
                        if (*(int *)(*(long long *)((char *)v12 - 8) + 84) <= (int)*v7->field_54)
                            break;
                        *(long long *)v12 = *(long long *)((char *)v12 - 8);
                        v13 = v14 - 8;
                        if (v14 == 8)
                        {
                            v12 = a2;
                            break;
                        }
                    }
                }
                v15 = v7 + 1;
                *(st_13f05c_1 **)v12 = *v7;
                iter += 8;
                v7 = v15;
                v9 = v11;
                if (v7 == a1)
                    break;
            }
        }
    }
    v2 = 0;
    return sub_13e9e8(&v2, 0);
}
