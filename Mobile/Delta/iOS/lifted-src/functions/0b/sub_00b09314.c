/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb09314..0xb09394 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b09314_1 {
    unsigned long long field_0;
    unsigned short field_5[4];
    unsigned short field_b;
} st_b09314_1;

typedef struct st_b09314_0 {
    char padding_0[108];
    char field_6c;
    char padding_6d[311];
    unsigned int field_1a4;
    unsigned long long field_1a8;
    char padding_1b0[320];
    unsigned int field_2f0;
    unsigned long long field_2f4;
    char padding_2fc[16];
    unsigned long long field_30c;
    unsigned short field_311[4];
    char field_317;
    char padding_318[24];
    char field_330;
    char padding_331[15];
    unsigned long long field_340;
} st_b09314_0;

typedef struct st_b09314_2 {
    unsigned long long field_0;
    char padding_8[16];
    char field_18[13];
    unsigned short field_1d[4];
    char field_23;
    char padding_24[24];
    char field_3c;
    char padding_3d[15];
    unsigned long long field_4c;
} st_b09314_2;


char sub_b09314(st_b09314_0 *a0, st_b09314_1 *a1, unsigned long a2)
{
    st_b09314_2 *v0;  // x8
    unsigned long long v1;  // x9
    unsigned long v2;  // x9
    unsigned long long v3;  // x9
    unsigned long v4;  // x9
    unsigned long v5;  // d0

    if (a2 != 13)
        return 0;
    v0 = &(&a0->field_2f0)[1];
    v1 = a1->field_0;
    *(long long *)&v0->field_18[5] = *(long long *)((char *)&a1->field_0 + 5);
    *(unsigned long long *)&v0->field_18[0] = v1;
    v2 = *(short *)((char *)&a1->field_5[1] + 1);
    v3 = (unsigned int)((v2 & 0xff00) >> 8) | (unsigned int)v2 * 0x100 & 0xff00ff00;
    if (!(a0->field_6c >> 1 & 1))
    {
        v4 = (unsigned int)v3 - 16;
        if (16 > (unsigned int)v3)
            return 0;
        *(unsigned short *)((char *)&a0->field_30c + 7) = (((((v4 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v4 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v4 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v4 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
        v3 = v4;
    }
    *(unsigned long long *)&a0->padding_331[6] = v3 & 0xffffffff;
    a0->field_1a4 = a0->field_2f0;
    v5 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*(double *)&v0->field_0 ^ *(unsigned long long *)&*(double *)&v0->field_18[0]);
    a0->field_1a8 = v5;
    a0->padding_318[15] = a0->padding_318[15] & 253;
    return 16;
}
