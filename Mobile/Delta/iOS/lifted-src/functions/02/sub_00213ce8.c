/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x213ce8..0x213f58 (624 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_213ce8_2 {
    char padding_0[2];
    char field_2;
    char padding_3[77];
    struct st_213ce8_1 *field_50;
    char padding_58[32];
    unsigned long long field_78;
} st_213ce8_2;

typedef struct st_213ce8_1 {
    char padding_0[32];
    struct st_213ce8_2 *field_20;
} st_213ce8_1;

typedef struct st_213ce8_0 {
    char field_0;
} st_213ce8_0;

typedef struct st_213ce8_6 {
    unsigned long long field_0;
} st_213ce8_6;

typedef struct st_213ce8_3 {
    char padding_0[1664];
    struct st_213ce8_1 *field_680;
} st_213ce8_3;

typedef struct st_213ce8_5 {
    char padding_0[376];
    struct st_213ce8_6 *field_178;
} st_213ce8_5;

typedef struct st_213ce8_4 {
    char padding_0[96];
    struct st_213ce8_3 *field_60;
} st_213ce8_4;

extern st_213ce8_4 *g_f0d198;
extern st_213ce8_5 *g_f0d3d8;

unsigned long long sub_213ce8(st_213ce8_2 *a0)
{
    st_213ce8_1 *v4;  // x8
    unsigned long v5;  // x9
    st_213ce8_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_213ce8_0 *v1;  // [bp-0x80]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_50;
    if (v4 == g_f0d198->field_60->field_680)
        return 0;
    v5 = a0->field_2;
    if (v5 >> 2 & 1)
    {
        a0->field_2 = (char)v5 & 251;
        a0->field_78 = v4->field_20;
        v4->field_20 = a0;
    }
    g_f0d3d8->field_178();
}
