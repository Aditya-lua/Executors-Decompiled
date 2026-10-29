/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe153c..0xe15c4 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_e153c_4 {
    unsigned int field_0;
    char padding_4[8];
    unsigned int field_c;
} st_e153c_4;

typedef struct st_e153c_0 {
    char padding_0[256];
    char field_100;
} st_e153c_0;

typedef struct st_e153c_2 {
    char padding_0[24];
    struct st_e153c_1 *field_18;
} st_e153c_2;

typedef struct st_e153c_1 {
    char padding_0[48];
    struct st_e153c_0 *field_30;
} st_e153c_1;

typedef struct st_e153c_3 {
    char padding_0[8];
    struct st_e153c_2 *field_8;
    char padding_10[64];
    unsigned long long field_50;
    struct st_e153c_4 *field_58;
} st_e153c_3;

typedef struct st_e153c_8 {
    char field_0;
} st_e153c_8;

typedef struct st_e153c_5 {
    char padding_0[80];
    unsigned long long field_50;
} st_e153c_5;

typedef struct st_e153c_6 {
    char padding_0[1376];
    struct st_e153c_5 *field_560;
} st_e153c_6;

typedef struct st_e153c_7 {
    char padding_0[96];
    struct st_e153c_6 *field_60;
} st_e153c_7;

extern st_e153c_7 *g_f0d198;

int sub_e153c(st_e153c_3 *a0)
{
    unsigned int v4;  // w8
    unsigned int *v5;  // x9
    st_e153c_8 **v0;  // [bp-0x20], Other Possible Types: char
    st_e153c_8 *v1;  // [bp-0x18]
    st_e153c_8 **v2;  // [bp-0x10], Other Possible Types: char
    st_e153c_8 *v3;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a0->field_50 != g_f0d198->field_60->field_560->field_50)
    {
        v3 = &v2;
        v2 = &v3;
        v4 = a0->field_8->field_18->field_30->field_100;
    }
    else
    {
        v4 = 0;
    }
    v5 = &a0->field_58->field_0;
    *v5 = v4;
    v5[3] = 1;
    a0->field_58 = a0->field_58 + 1;
    return 1;
}
