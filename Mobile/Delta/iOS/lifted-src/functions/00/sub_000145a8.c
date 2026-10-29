/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x145a8..0x146a8 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_145a8_0 {
    char padding_0[88];
    char field_58;
    char padding_59[39];
    unsigned int field_80;
    unsigned long long field_84;
    unsigned long long field_8c;
    char padding_94[68];
    long long field_d8;
} st_145a8_0;


long long sub_145a8(st_145a8_0 *a0, unsigned long a1, long long a2)
{
    long long v6;  // x0
    unsigned long long v7;  // x25
    long long v8;  // w0
    unsigned long v9;  // x0
    long long v10;  // x0
    unsigned long v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x68]
    unsigned int v2;  // [bp-0x5c]
    unsigned long long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v2 = a0->field_80;
    v3 = *(long long *)&(&a0->field_80)[1];
    sub_f8d0();
    v6 = sub_18934(a0, 0);
    v7 = *(long long *)&(&a0->field_80)[1];
    v8 = (unsigned int)sub_1ef30(a0, 93, &v2, 0);
    v0 = a1;
    v1 = *(long long *)((char *)&a0->field_84 + 4);
    v9 = sub_404c(*(long long *)&a0->padding_94[64], 48);
    sub_7088(v9, &v0, a2, v6);
    if (a0->field_58 != 1)
        return v9;
    if (!v8)
        v7 = 0xffffffffffffffff;
    v10 = sub_404c();
    sub_84f8(v10, *(long long *)&(&a0->field_80)[1], v7);
    v0 = v9;
    sub_1c9f0(&a0[5].padding_0[24], &v0);
    *(long long *)(sub_12484(&a0[5].padding_0[24], &v0) + 8) = v10;
    return v9;
}
