/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a3dd4..0x1a3e0c (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a3dd4_2 {
    char padding_0[8];
    unsigned long long field_8;
    char field_10;
} st_1a3dd4_2;

typedef struct st_1a3dd4_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned int field_10;
} st_1a3dd4_1;

typedef struct st_1a3dd4_0 {
    unsigned int field_0;
    char padding_4[12];
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    char padding_28[40];
    unsigned long long field_50;
} st_1a3dd4_0;


st_1a3dd4_1 * sub_1a3dd4(st_1a3dd4_1 *a0, st_1a3dd4_0 *a1)
{
    st_1a3dd4_2 *v0;  // x9

    a1->field_0 = 0xfffffc1e;
    v0 = a1->field_20 + (a0->field_10 - 1) * 24;
    v0->field_8 = a1->field_10;
    v0->field_10 = 1;
    a1->field_50 = a0->field_8;
    return a0;
}
