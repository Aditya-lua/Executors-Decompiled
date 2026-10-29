/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac0ad4..0xac0b98 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac0ad4_0 {
    char padding_0[200];
    char field_c8;
    char padding_c9[167];
    long long field_170;
    char padding_178[8];
    unsigned long long field_180;
    char field_188;
    char padding_189[31];
    unsigned int field_1a8;
} st_ac0ad4_0;


long long sub_ac0ad4(st_ac0ad4_0 *a0, long long a1, long long a2)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    long long v16;  // x19
    unsigned long long v17;  // x24
    char *v18;  // x20
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
    {
        return 1;
    }
    else if ((a0->field_1a8 >> 1 & 0x7fffffff) == 1)
    {
        return 0;
    }
    else
    {
        v0 = v9;
        v1 = v10;
        v2 = v11;
        v3 = v12;
        v4 = v13;
        v5 = v14;
        v6 = &v8;
        v7 = v15;
        v16 = a0->field_170;
        v17 = a0->field_180;
        v18 = &a0->field_c8;
        _bzero(&v18[v17], v16 - v17);
        v18[v17] = a0->field_188;
        *(&v18[v16] - 1) = *(&v18[v16] - 1) | 128;
        sub_abc8a0(a0, v18, v16, v16);
        a0->field_1a8 = 2;
        sub_abcb00(a0, a1, a2, v16, 0);
        return 1;
    }
}
