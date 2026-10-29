/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc44a8..0xc4538 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c44a8_1 {
    struct st_c44a8_2 *field_0;
    char padding_8[56];
    unsigned long long field_40;
    char padding_48[32];
    unsigned long long field_68;
    char padding_70[8];
    unsigned long long field_78;
} st_c44a8_1;

typedef struct st_c44a8_3 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_c44a8_2 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_c44a8_3;

typedef struct st_c44a8_2 {
    unsigned long long field_0;
} st_c44a8_2;

typedef struct st_c44a8_0 {
    char field_0;
} st_c44a8_0;


unsigned long long sub_c44a8(st_c44a8_3 *a0, st_c44a8_1 *a1, int a2, unsigned long a3)
{
    st_c44a8_1 *v2;  // x8
    unsigned long long v3;  // x9
    unsigned long long v4;  // 4140
    unsigned long long v5;  // 4142
    unsigned long long v6;  // x9
    unsigned int v7;  // w9
    unsigned long v8;  // x9
    st_c44a8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_c44a8_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if ((unsigned long long)*(long long *)&a1->padding_8[24 + 8 * a2] > a3)
        return 0xffffffffffffffec;
    v2 = &(&a1->field_0)[a2];
    if (v2->field_78 - 8 > v2->field_0)
        return 0xffffffffffffffec;
    a0->field_0 = *(long long *)v2->field_0;
    v3 = v2->field_40;
    v4 = ((((((v3 & 0xaaaaaaaaaaaaaaaa) >> 1 | v3 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v3 & 0xaaaaaaaaaaaaaaaa) >> 1 | v3 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v3 & 0xaaaaaaaaaaaaaaaa) >> 1 | v3 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v3 & 0xaaaaaaaaaaaaaaaa) >> 1 | v3 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
    v5 = (((((((v3 & 0xaaaaaaaaaaaaaaaa) >> 1 | v3 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v3 & 0xaaaaaaaaaaaaaaaa) >> 1 | v3 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v3 & 0xaaaaaaaaaaaaaaaa) >> 1 | v3 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v3 & 0xaaaaaaaaaaaaaaaa) >> 1 | v3 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
    v6 = ((((v5 | v4) & 0xffff0000ffff0000) >> 16 | (v5 | v4) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v5 | v4) & 0xffff0000ffff0000) >> 16 | (v5 | v4) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
    if (!v6)
        v7 = 64;
    else
        v7 = Clz(v6);
    a0->field_8 = v7;
    v8 = a1->field_68;
    a0->field_18 = a1->field_68;
    a0->field_20 = v8 + 8;
    a0->field_10 = v2->field_0;
    return 0;
}
