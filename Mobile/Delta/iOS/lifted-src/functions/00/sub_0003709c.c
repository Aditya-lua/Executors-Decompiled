/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3709c..0x371f8 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3709c_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_3709c_1;

typedef struct st_3709c_4 {
    char padding_0[256];
    unsigned long long field_100;
    unsigned long long field_108;
    struct st_3709c_2 *field_110;
    unsigned long long field_118;
} st_3709c_4;

typedef struct st_3709c_3 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_10;
    char padding_11[255];
    long long field_110;
    unsigned long long field_118;
    struct st_3709c_2 *field_120;
    long long field_128;
} st_3709c_3;

typedef struct st_3709c_2 {
    char padding_0[88];
    struct st_3709c_1 *field_58;
} st_3709c_2;

typedef struct st_3709c_0 {
    char field_0;
} st_3709c_0;

extern char g_e64730;

st_3709c_3 * sub_3709c(st_3709c_3 *a0, unsigned long a1, long long a2, unsigned long a3, st_3709c_2 *a4, long long a5)
{
    st_3709c_4 *v6;  // x23
    st_3709c_1 *v7;  // x8
    unsigned long long v16;  // x24
    unsigned long long v8;  // x24
    unsigned long long *iter;  // x26
    unsigned long long ptr;  // x0
    unsigned long long v11;  // x24
    unsigned long long v12;  // x0
    unsigned long long v13;  // x25
    unsigned long long v14;  // x0
    unsigned long long v15;  // x0
    st_3709c_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_3709c_0 *v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    a0->field_0 = &g_e64730;
    a0->field_8 = a1;
    a0->field_110 = a2;
    a0->field_118 = a3;
    a0->field_120 = a4;
    a0->field_128 = a5;
    v6 = &a0->field_10;
    v2 = 0;
    sub_348a4(v6, 0x100, &v2);
    v7 = a4->field_58;
    if (!v7)
        return a0;
    v8 = (unsigned long long)v7->padding_0;
    if (!v8)
        return a0;
    iter = &v7->field_8;
    do
    {
        ptr = _strchr(v8, 46);
        if (ptr)
        {
            v11 = sub_9c9c(a5, v8, ptr - v8);
            v12 = sub_cd98(a5, ptr + 1);
            if (!v11 || (v13 = v12, !v12 || sub_37060(a2, v13) || (v2 = v11, v3 = v13, v14 = sub_34a28(&v2, a4), v14 >> 31 & 1)))
                continue;
        }
        else
        {
            v15 = sub_cd98(a5, v8);
            if (!v15 || (v16 = v15, sub_37060(a2, v16) || (v2 = 0, v3 = v16, v14 = sub_34a28(&v2, a4), v14 >> 31 & 1)))
                continue;
        }
        v6->padding_0[v14 & 0xffffffff] = 1;
    } while ((v8 = *iter, iter += 1, v8));
    return a0;
}
