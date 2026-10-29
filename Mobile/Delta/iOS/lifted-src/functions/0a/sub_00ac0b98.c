/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac0b98..0xac0d40 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac0b98_0 {
    char padding_0[200];
    char field_c8;
    char padding_c9[167];
    unsigned long long field_170;
    char padding_178[8];
    unsigned long long field_180;
    char field_188;
    char padding_189[31];
    unsigned int field_1a8;
} st_ac0b98_0;


unsigned long long sub_ac0b98(st_ac0b98_0 *a0, long long a1, unsigned long long a2)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v19;  // x24
    char *v20;  // x23
    unsigned long long v21;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long node;  // x19
    long long iter;  // x21
    unsigned long long v18;  // x22
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a2)
        return 1;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    if (a0->field_1a8 == 2)
        return 0;
    node = a2;
    iter = a1;
    v18 = a0->field_170;
    v19 = a0->field_180;
    if (a0->field_1a8 != 3)
    {
        v20 = &a0->field_c8;
        _bzero(&v20[v19], v18 - v19);
        v20[v19] = a0->field_188;
        *(&v20[v18] - 1) = *(&v20[v18] - 1) | 128;
        sub_abc8a0(a0, v20, v18, v18);
        a0->field_1a8 = 3;
        a0->field_180 = 0;
        if (v18 <= node)
            goto LABEL_ac0c98;
    }
    else if (v19)
    {
        if (v19 >= node)
            v19 = node;
        _memcpy();
        a0->field_180 = a0->field_180 - v19;
        node -= v19;
        if (!node)
            return 1;
        iter += v19;
        if (v18 <= node)
            goto LABEL_ac0c98;
    }
    else if (node >= v18)
    {
LABEL_ac0c98:
        v21 = v18 * node / v18;
        node -= v21;
        sub_abcb00(a0, iter, v21, v18);
        if (!node)
            return 1;
        iter += v21;
    }
    sub_abcb00(a0, &a0->field_c8, v18, v18);
    _memcpy(iter, &a0->field_c8, node);
    a0->field_180 = v18 - node;
    return 1;
}
