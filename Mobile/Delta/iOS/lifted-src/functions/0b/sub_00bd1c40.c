/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd1c40..0xbd1ca8 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd1c40_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
} st_bd1c40_1;

typedef struct st_bd1c40_0 {
    char padding_0[16];
    struct st_bd1c40_1 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_bd1c40_0;


st_bd1c40_0 * sub_bd1c40(st_bd1c40_0 *a0)
{
    unsigned long v7;  // x9
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    unsigned long long *v13;  // x19
    unsigned long long v14;  // x20
    st_bd1c40_0 *dst;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v7 = a0->field_20;
    if (!v7)
        return a0;
    v0 = v8;
    v1 = v9;
    v2 = v10;
    v3 = v11;
    v4 = &v6;
    v5 = v12;
    v13 = a0->field_10;
    v14 = v13[2];
    if (a0->field_18 != v14)
    {
        dst = _memmove(v13[1] + 264 * v14, v13[1] + 264 * a0->field_18, v7 * 264);
        v7 = a0->field_20;
        a0 = dst;
    }
    v13[2] = v7 + v14;
    return a0;
}
