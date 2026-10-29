/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xefa3c..0xefcd8 (668 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_efa3c_6 {
    char padding_0[2];
    char field_2;
    char padding_3[5];
    struct st_efa3c_2 *field_8;
    char padding_10[48];
    struct st_efa3c_3 *field_40;
    char padding_48[8];
    struct st_efa3c_5 *field_50;
    struct st_efa3c_7 *field_58;
    char padding_60[24];
    unsigned long long field_78;
} st_efa3c_6;

typedef struct st_efa3c_3 {
    char padding_0[8];
    struct st_efa3c_4 *field_8;
} st_efa3c_3;

typedef struct st_efa3c_7 {
    struct st_efa3c_8 *field_0;
    char padding_8[4];
    unsigned int field_c;
} st_efa3c_7;

typedef struct st_efa3c_8 {
    char padding_0[2];
    char field_2;
} st_efa3c_8;

typedef struct st_efa3c_2 {
    char padding_0[24];
    struct st_efa3c_1 *field_18;
} st_efa3c_2;

typedef struct st_efa3c_1 {
    char padding_0[48];
    unsigned long long field_30;
} st_efa3c_1;

typedef struct st_efa3c_5 {
    char padding_0[32];
    struct st_efa3c_6 *field_20;
    char padding_28[32];
    char field_48;
} st_efa3c_5;

typedef struct st_efa3c_4 {
    long long field_0;
} st_efa3c_4;

typedef struct st_efa3c_0 {
    char field_0;
} st_efa3c_0;

typedef struct st_efa3c_9 {
    char padding_0[1408];
    unsigned long long field_580;
} st_efa3c_9;

typedef struct st_efa3c_11 {
    char padding_0[376];
    struct st_efa3c_4 *field_178;
} st_efa3c_11;

typedef struct st_efa3c_10 {
    char padding_0[96];
    struct st_efa3c_9 *field_60;
} st_efa3c_10;

extern st_efa3c_10 *g_f0d198;
extern st_efa3c_11 *g_f0d3d8;

st_efa3c_8 * sub_efa3c(st_efa3c_6 *a0)
{
    st_efa3c_8 *v4;  // x0
    st_efa3c_7 *v5;  // x8
    unsigned long v6;  // x8
    st_efa3c_5 *v7;  // x9
    st_efa3c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_efa3c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_8->field_18->field_30 != g_f0d198->field_60->field_580)
        return 0;
    v4 = sub_f0640(*(long long *)a0->field_40->field_8);
    if (!v4)
    {
        return v4;
    }
    else if ((a0->field_50->field_48 ^ 3) & (v4->field_2 ^ 3))
    {
        v5 = a0->field_58;
        v5->field_0 = v4;
        v5->field_c = 8;
        a0->field_58 = a0->field_58 + 1;
        v6 = a0->field_2;
        if (v6 >> 2 & 1)
        {
            v7 = a0->field_50;
            a0->field_2 = (char)v6 & 251;
            a0->field_78 = v7->field_20;
            v7->field_20 = a0;
        }
        g_f0d3d8->field_178();
    }
    return 0;
}
