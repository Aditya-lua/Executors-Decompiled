/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x215a2c..0x215d94 (872 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_215a2c_1 {
    char padding_0[80];
    unsigned long long field_50;
} st_215a2c_1;

typedef struct st_215a2c_0 {
    char field_0;
} st_215a2c_0;

typedef struct st_215a2c_5 {
    unsigned long long field_0;
} st_215a2c_5;

typedef struct st_215a2c_2 {
    char padding_0[1664];
    unsigned long long field_680;
} st_215a2c_2;

typedef struct st_215a2c_4 {
    char padding_0[376];
    struct st_215a2c_5 *field_178;
} st_215a2c_4;

typedef struct st_215a2c_3 {
    char padding_0[96];
    struct st_215a2c_2 *field_60;
} st_215a2c_3;

extern st_215a2c_3 *g_f0d198;
extern st_215a2c_4 *g_f0d3d8;

int sub_215a2c(st_215a2c_1 *a0)
{
    st_215a2c_0 **v0;  // [bp-0xa8], Other Possible Types: char
    st_215a2c_0 *v1;  // [bp-0xa0]
    st_215a2c_0 *v2;  // [bp-0x98]
    st_215a2c_1 *v3;  // [bp-0x78]
    st_215a2c_0 **v4;  // [bp-0x68], Other Possible Types: char
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v3 = a0;
    if (a0->field_50 == g_f0d198->field_60->field_680)
        return 0;
    v2 = &v4;
    v4 = &v2;
    g_f0d3d8->field_178();
}
