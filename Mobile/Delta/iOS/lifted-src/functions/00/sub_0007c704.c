/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7c704..0x7c884 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7c704_0 {
    char field_0;
} st_7c704_0;


long long sub_7c704(long long a0, long long a1, long long a2, long long a3, long long a4)
{
    long long v6;  // x0
    long long v7;  // x23
    long long v16;  // x0
    unsigned long long v17;  // 4106
    long long v8;  // w0
    long long v9;  // x24
    long long v10;  // x0
    unsigned long long v11;  // 4106
    long long v12;  // x0
    unsigned long long v13;  // 4106
    long long v14;  // x0
    unsigned long long v15;  // 4106
    st_7c704_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_7c704_0 *v1;  // [bp-0x68]
    unsigned int v2;  // [bp-0x5c]
    unsigned long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = 480;
    v2 = 12;
    v6 = sub_7ad24(a4, &v3, 4);
    if (480 > v3)
        return -0x1;
    if (2 > (unsigned long long)a3)
        return 0;
    v7 = v6;
    v8 = (unsigned int)sub_79064(v6 + 400, &v2, a2, a3);
    if (v8 == a3)
    {
        return 1;
    }
    else if (v8 != 1)
    {
        v9 = sub_783ac(6, a3, v2);
        v10 = sub_7845c(v7 + 452, v9, v7 + 400, a3, v2, 0);
        v11 = arm64g_calculate_condition(130, v10, 120, 0);
        if (v11 & 1)
            return v10;
        v12 = sub_78aac(a0, a1, v7 + 452, v2, v9);
        v13 = arm64g_calculate_condition(130, v12, 120, 0);
        if (v13 & 1)
            return v12;
        v14 = sub_78ce8(v7, v7 + 452, v2, v9, v7 + 236, 164);
        v15 = arm64g_calculate_condition(130, v14, 120, 0);
        if (v15 & 1)
            return v14;
        v16 = sub_77ec8(a0 + v12, a1 - v12, a2, a3, v7);
        v17 = arm64g_calculate_condition(130, v16, 120, 0);
        if (v17 & 1)
        {
            return v16;
        }
        else if (!v16)
        {
            return v16;
        }
        else
        {
            return a0 + v12 + v16 - a0;
        }
    }
    return 0;
}
