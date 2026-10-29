/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7fe70..0x7ff98 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7fe70_0 {
    uint128_t field_0;
    unsigned int field_10;
} st_7fe70_0;

typedef struct st_7fe70_1 {
    uint128_t field_0;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
} st_7fe70_1;

extern char g_cbf308;

double sub_7fe70(unsigned long long a0, long long a1, long long a2, long long a3)
{
    unsigned long long v8;  // x0
    unsigned long long iter;  // x8
    unsigned int v10;  // w9
    st_7fe70_0 *v11;  // x8
    unsigned long long v12;  // 4151
    unsigned int v13;  // w8
    unsigned int v14;  // w8
    unsigned int v15;  // w9
    st_7fe70_1 *v16;  // x9
    uint128_t v0;  // [bp-0x80]
    unsigned int v1;  // [bp-0x70]
    unsigned int v2;  // [bp-0x6c]
    unsigned int v3;  // [bp-0x68]
    uint128_t v4;  // [bp-0x60]
    unsigned int v5;  // [bp-0x50]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = sub_7fa30(a1, a2, a3);
    iter = 262145 > v8;
    if (0x20000 >= v8)
        iter += 1;
    if (0x4000 >= v8)
        iter += 1;
    if (!(unsigned int)a0)
    {
        v10 = 3;
        goto LABEL_7feec;
    }
    else if (!(a0 >> 31 & 1))
    {
        if ((unsigned int)a0 < 22)
            v10 = a0;
        else
            v10 = 22;
LABEL_7feec:
        v16 = &(&g_cbf308)[(unsigned int)iter * 644 + v10 * 28];
        v4 = v16->field_0;
        v14 = v16->field_14;
        v5 = v16->field_10;
        v15 = v16->field_18;
    }
    else
    {
        v11 = &(&g_cbf308)[(unsigned int)iter * 644];
        v4 = v11->field_0;
        v5 = v11->field_10;
        v12 = arm64g_calculate_condition(129, a0 & 0xffffffff, 0x20000, 0);
        if (v12 & 1)
            v13 = a0;
        else
            v13 = 0xfffe0000;
        v14 = -v13;
        v15 = 1;
    }
    v0 = v4;
    v1 = v5;
    v2 = v14;
    v3 = v15;
    sub_7f578(&v0, a1, a2, a3, 0);
    return *(unsigned long long *)&v4;
}
