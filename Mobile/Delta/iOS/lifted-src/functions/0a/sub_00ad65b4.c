/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad65b4..0xad664c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad65b4_0 {
    unsigned int field_0;
    char padding_4[4];
    struct st_ad65b4_1 *field_8;
} st_ad65b4_0;

typedef struct st_ad65b4_1 {
    struct st_ad65b4_0 *field_0;
} st_ad65b4_1;


st_ad65b4_0 * sub_ad65b4(st_ad65b4_0 *a0, st_ad65b4_0 *a1)
{
    unsigned long v5;  // x10
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_ad65b4_0 *v9;  // x9
    st_ad65b4_0 **iter;  // x8
    unsigned long long v11;  // x11
    unsigned long long v12;  // x11
    st_ad65b4_0 *v13;  // x19
    unsigned long v14;  // x10
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v5 = a0->field_0;
    if ((int)v5 < 1)
        return 0;
    v0 = v6;
    v1 = v7;
    v2 = &v4;
    v3 = v8;
    v9 = 0;
    iter = a0->field_8;
    v11 = v5 * 8;
    while (1)
    {
        v12 = v11;
        if (*iter == a1)
            break;
        iter += 1;
        v9 = (unsigned int)v9 + 1;
        v11 = v12 - 8;
        if (v12 == 8)
            return 0;
    }
    v13 = *iter;
    v14 = (unsigned int)v5 - 1;
    if ((unsigned int)v14 != (unsigned int)v9)
    {
        _memmove(iter, iter + 1, (long long)((v14 - (char *)v9) * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(v14 - (char *)v9, 3) & 0x7fffffff8 & 0x7ffffffff);
        v9 = a0->field_0 - 1;
    }
    a0->field_0 = (unsigned int)v9;
    return v13;
}
