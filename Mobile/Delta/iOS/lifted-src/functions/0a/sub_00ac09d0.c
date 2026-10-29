/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac09d0..0xac0ad4 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac09d0_1 {
    char padding_0[168];
    unsigned long long field_a8;
    char padding_b0[8];
    unsigned long long field_b8;
    char padding_c0[32];
    unsigned int field_e0;
} st_ac09d0_1;

typedef struct st_ac09d0_0 {
    char padding_0[200];
    char field_c8;
    char padding_c9[167];
    long long field_170;
    char padding_178[8];
    long long field_180;
    char padding_188[32];
    unsigned int field_1a8;
} st_ac09d0_0;


long long sub_ac09d0(st_ac09d0_0 *a0, unsigned long long a1, long long a2)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    st_ac09d0_1 *v19;  // x21
    long long n;  // x21
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    long long v16;  // x20
    long long v17;  // x8
    long long v18;  // x22
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
    if ((a0->field_1a8 & 0xfffffffe) == 2)
        return 0;
    v16 = a0->field_170;
    v17 = a0->field_180;
    if (v17)
    {
        v18 = v16 - v17;
        v19 = &a0->field_c8;
        if ((unsigned long long)v18 > (unsigned long long)a2)
        {
            _memcpy(&v19->padding_0[v17]);
            a0->field_180 = a0->field_180 + a2;
            return 1;
        }
        _memcpy(&v19->padding_0[v17]);
        sub_abc8a0(a0, v19, v16, v16);
        a1 += v18;
        a0->field_180 = 0;
        a2 -= v18;
    }
    n = a2;
    if ((unsigned long long)n >= (unsigned long long)v16)
        n = sub_abc8a0(a0);
    if (!n)
        return 1;
    _memcpy(&a0->field_c8, a1 + a2 - n, n);
    a0->field_180 = n;
    return 1;
}
