/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa93ccc..0xa93ddc (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a93ccc_0 {
    char padding_0[8];
    char field_8;
    char field_9;
    char field_a;
    char field_b;
    char field_c;
    char field_d;
    char field_e;
    char field_f;
} st_a93ccc_0;


st_a93ccc_0 * sub_a93ccc(st_a93ccc_0 *a0, unsigned long long a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v10;  // x8
    unsigned long long v11;  // x8
    unsigned long long v12;  // x9
    unsigned long long v2;  // x8
    unsigned long long v3;  // x9
    unsigned long long v4;  // x8
    unsigned long long v5;  // x9
    unsigned long long v6;  // x8
    unsigned long long v7;  // x9
    unsigned long long v8;  // x8
    unsigned long long v9;  // x9

    v0 = a0->field_f + (a1 & 0xff);
    a0->field_f = v0;
    if (0xff >= a1 && 0x100 > v0)
        return a0;
    v1 = (v0 >> 8) + (a1 >> 8 & 0xff) + a0->field_e;
    a0->field_e = v1;
    v2 = a1 >> 16;
    if (!v2 && v1 < 0x100)
        return a0;
    v3 = (v1 >> 8) + (v2 & 0xff) + a0->field_d;
    a0->field_d = v3;
    v4 = a1 >> 24;
    if (!v4 && v3 < 0x100)
        return a0;
    v5 = (v3 >> 8) + (v4 & 0xff) + a0->field_c;
    a0->field_c = v5;
    v6 = a1 >> 32;
    if (!v6 && v5 < 0x100)
        return a0;
    v7 = (v5 >> 8) + (v6 & 0xff) + a0->field_b;
    a0->field_b = v7;
    v8 = a1 >> 40;
    if (!v8 && v7 < 0x100)
        return a0;
    v9 = (v7 >> 8) + (v8 & 0xff) + a0->field_a;
    a0->field_a = v9;
    v10 = a1 >> 48;
    if (!v10 && v9 < 0x100)
        return a0;
    v11 = (v9 >> 8) + (v10 & 0xff) + a0->field_9;
    a0->field_9 = v11;
    v12 = a1 >> 56;
    if (!v12 && v11 < 0x100)
        return a0;
    a0->field_8 = a0->field_8 + (char)v12 + (char)((unsigned int)v11 >> 8);
    return a0;
}
