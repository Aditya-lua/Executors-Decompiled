/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fd850..0x1fe9e8 (4504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fd850_0 {
    char field_0;
} st_1fd850_0;

typedef struct st_1fd850_2 {
    unsigned long long field_0;
} st_1fd850_2;

typedef struct st_1fd850_1 {
    char padding_0[376];
    struct st_1fd850_2 *field_178;
} st_1fd850_1;

extern st_1fd850_1 *g_f0d3d8;
extern char g_10002b0;

void sub_1fd850(unsigned long a0)
{
    unsigned long long v19;  // x28
    unsigned long long v20;  // x27
    unsigned long long v21;  // x24
    unsigned long long v22;  // x23
    unsigned long long v23;  // x22
    unsigned long long v24;  // x21
    unsigned long long v25;  // x20
    unsigned long long v26;  // x19
    unsigned long long v27;  // x30
    st_1fd850_0 **v0;  // [bp-0xf8], Other Possible Types: char
    st_1fd850_0 *v1;  // [bp-0xf0]
    st_1fd850_0 *v2;  // [bp-0xe8]
    unsigned long long v3;  // [bp-0xc8]
    unsigned long long v4;  // [bp-0xc0]
    unsigned long long v5;  // [bp-0xb8]
    st_1fd850_0 **v6;  // [bp-0xa0], Other Possible Types: char
    unsigned long v7;  // [bp-0x58]
    unsigned long long v8;  // [bp-0x50]
    unsigned long long v9;  // [bp-0x48]
    unsigned long long v10;  // [bp-0x40]
    unsigned long long v11;  // [bp-0x38]
    unsigned long long v12;  // [bp-0x30]
    unsigned long long v13;  // [bp-0x28]
    unsigned long long v14;  // [bp-0x20]
    unsigned long long v15;  // [bp-0x18]
    char *v16;  // [bp-0x10]
    unsigned long long v17;  // [bp-0x8]
    char v18;  // [bp+0x0]

    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = v23;
    v13 = v24;
    v14 = v25;
    v15 = v26;
    v16 = &v18;
    v17 = v27;
    v7 = *(long long *)&g_10002b0;
    v1 = &v0;
    v2 = &v6;
    v0 = &v1;
    v3 = 0;
    v4 = 0;
    v5 = 0;
    v6 = &v2;
    g_f0d3d8->field_178();
}
