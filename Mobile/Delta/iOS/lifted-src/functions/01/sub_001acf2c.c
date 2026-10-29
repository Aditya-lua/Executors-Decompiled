/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1acf2c..0x1ad08c (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1acf2c_4 {
    char padding_0[8];
    struct st_1acf2c_1 *field_8;
} st_1acf2c_4;

typedef struct st_1acf2c_2 {
    unsigned long long field_0;
    struct st_1acf2c_1 *field_8;
} st_1acf2c_2;

typedef struct st_1acf2c_1 {
    unsigned long long field_0;
    struct st_1acf2c_1 *field_8;
    struct st_1acf2c_2 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned int field_28;
    unsigned int field_2c;
    unsigned int field_30;
    char field_34;
} st_1acf2c_1;

typedef struct st_1acf2c_3 {
    char padding_0[32];
    unsigned int field_20;
    char padding_24[20];
    struct st_1acf2c_2 *field_38;
} st_1acf2c_3;

typedef struct st_1acf2c_0 {
    char field_0;
} st_1acf2c_0;

extern char g_e6fa38;
extern char g_e6fd68;
extern char g_e6fdc8;

long long sub_1acf2c(st_1acf2c_3 *a0, unsigned long a1, unsigned long a2, st_1acf2c_4 *a3, unsigned int a4, unsigned int a5, char a6)
{
    st_1acf2c_2 *v8;  // x21
    st_1acf2c_2 *v9;  // x28
    st_1acf2c_1 *v10;  // x9
    st_1acf2c_1 *v11;  // x25
    unsigned int v12;  // w22
    st_1acf2c_1 *v13;  // x8
    st_1acf2c_1 *v14;  // x0
    st_1acf2c_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_1acf2c_0 *v1;  // [bp-0x78]
    st_1acf2c_1 *v2;  // [bp-0x70]
    st_1acf2c_1 *v3;  // [bp-0x70]
    st_1acf2c_2 *v4;  // [bp-0x68]
    st_1acf2c_1 *v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v8 = operatornew(16);
    v9 = a0->field_38;
    v10 = v9->field_8;
    v8->field_0 = &g_e6fa38;
    v8->field_8 = v10;
    v4 = v8;
    v9->field_8 = 0;
    v11 = operatornew(56);
    v12 = a0->field_20;
    v13 = a3->field_8;
    v11->field_0 = &g_e6fd68;
    v11->field_8 = v13;
    v11->field_10 = v4;
    v11->field_18 = a1;
    v11->field_20 = a2;
    v11->field_28 = v12;
    v11->field_2c = a4;
    v11->field_30 = a5;
    v11->field_34 = a6;
    v2 = v11;
    v5 = 0;
    a3->field_8 = 0;
    v14 = operatornew(16);
    v14->field_0 = &g_e6fdc8;
    v14->field_8 = v2;
    v9->field_8 = v14;
    a0->field_38 = v4;
    v3 = 0;
    a3->field_8 = v2;
    a0->field_20 = v12 + 1;
    sub_63c08(&v3, 0);
    return sub_63c08(&v5, 0);
}
