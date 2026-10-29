/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb11540..0xb11620 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b11540_2 {
    char padding_0[168];
    unsigned long long field_a8;
    char padding_b0[8];
    unsigned long long field_b8;
    char padding_c0[8];
    struct st_b11540_1 *field_c8;
} st_b11540_2;

typedef struct st_b11540_0 {
    char padding_0[200];
    char field_c8;
    char padding_c9[167];
    unsigned long long field_170;
    char padding_178[8];
    long long field_180;
    char padding_188[8];
    struct st_b11540_1 *field_190;
} st_b11540_0;

typedef struct st_b11540_1 {
    unsigned long long field_0;
} st_b11540_1;


int sub_b11540(st_b11540_0 *a0, long long ptr, long long n)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    long long n1;  // x24
    st_b11540_2 *v22;  // x23
    unsigned long long v13;  // x24
    unsigned long long v14;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    long long v20;  // x8
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (!n)
        return 1;
    v0 = v11;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = &v10;
    v9 = v19;
    v20 = a0->field_180;
    if (!v20)
        a0->field_190();
    n1 = a0->field_170 - v20;
    v22 = &a0->field_c8;
    if ((unsigned long long)n1 > (unsigned long long)n)
    {
        _memcpy(&v22->padding_0[v20], ptr, n);
        a0->field_180 = a0->field_180 + n;
        return 1;
    }
    _memcpy(&v22->padding_0[v20], ptr, n1);
    a0->field_190();
}
