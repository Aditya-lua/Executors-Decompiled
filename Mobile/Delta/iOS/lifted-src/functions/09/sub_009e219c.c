/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e219c..0x9e227c (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e219c_1 {
    unsigned long long field_0;
} st_9e219c_1;

typedef struct st_9e219c_0 {
    struct st_9e219c_1 *field_0;
    unsigned int field_8;
} st_9e219c_0;


unsigned long long sub_9e219c(st_9e219c_0 *a0, int *a1, unsigned long long a2)
{
    unsigned long long v2;  // w0
    unsigned long long v3;  // x9
    unsigned int v12;  // w16
    unsigned long long v14;  // 4121
    unsigned long long v4;  // w8
    unsigned long long *v5;  // x10
    unsigned int v6;  // w11
    unsigned long long v7;  // x9
    unsigned long idx;  // x12
    unsigned long long v9;  // x13
    unsigned long long v10;  // x14
    unsigned int v11;  // w15
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned int)sub_9e5c70();
    if (!v2)
        return v2;
    v3 = a0->field_8;
    if ((int)v3 >= 1)
    {
        v4 = 0;
        v5 = a0->field_0;
        v6 = (unsigned int)v3 * 64 - 1;
        do
        {
            v7 = v3;
            idx = v7 - 1;
            v9 = v5[idx];
            if (v9)
            {
                v10 = 0x8000000000000000;
                v11 = 0xffffffc0;
                v12 = v6;
                do
                {
                    if (v10 & v9)
                    {
                        if (a2 > v4)
                            a1[v4] = v12;
                        v4 += 1;
                    }
                    v10 >>= 1;
                    v12 -= 1;
                    v14 = arm64g_calculate_condition(33, v11, 1, 0);
                    v11 += 1;
                } while (!(v14 & 1));
            }
        } while ((v6 -= 64, v3 = idx, (long long)v7 > 1));
        if (v4 >= 1 && *a1 > 661)
            return 0;
    }
    else
    {
        v4 = 0;
    }
    if (a2 <= v4)
        return v4 + 1;
    a1[v4] = -0x1;
    return v4 + 1;
}
