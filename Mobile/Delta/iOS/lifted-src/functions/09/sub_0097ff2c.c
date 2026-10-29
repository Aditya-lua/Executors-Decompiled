/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97ff2c..0x980028 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97ff2c_2 {
    char padding_0[120];
    struct st_97ff2c_0 *field_78;
    struct st_97ff2c_1 *field_80;
} st_97ff2c_2;

typedef struct st_97ff2c_0 {
    char padding_0[160];
    long long field_a0;
    char padding_a8[168];
    unsigned short field_150;
} st_97ff2c_0;

typedef struct st_97ff2c_3 {
    struct st_97ff2c_2 *field_0;
    long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned int field_20;
    char padding_24[4];
    unsigned long long field_28;
} st_97ff2c_3;

typedef struct st_97ff2c_1 {
    char padding_0[112];
    long long field_70;
} st_97ff2c_1;


unsigned long long sub_97ff2c(st_97ff2c_3 *a0)
{
    st_97ff2c_0 *v3;  // x20
    st_97ff2c_2 *v4;  // x20
    unsigned short v5;  // x22
    long long v6;  // x0
    unsigned short v7;  // x8
    unsigned long v8;  // x10
    unsigned short v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = a0->field_0->field_78;
    if (v3->field_150 >> 5 & 1 || sub_977368(v3->field_a0) || !sub_97733c(v3->field_a0) || !sub_97e490(a0->field_0, &a0->field_20))
        return 0xfffffffe;
    a0->field_20 = 786691;
    if (sub_97fe5c(a0->field_0, a0->field_8, a0->field_10, &v0))
    {
        v4 = a0->field_0;
        v5 = v0;
        if (v5)
        {
            v6 = sub_97724c(v4->field_78->field_a0);
            sub_98959c(v6, v4->field_80);
        }
        if (a0->field_10 == v5 && a0->field_28 & 1)
            sub_988eb8(v4->field_80->field_70);
        v7 = v0;
        v8 = a0->field_10;
        a0->field_8 = a0->field_8 + v7;
        a0->field_10 = v8 - v7;
        a0->field_18 = a0->field_18 + v7;
        return v8 == v7;
    }
    return 0xfffffffe;
}
