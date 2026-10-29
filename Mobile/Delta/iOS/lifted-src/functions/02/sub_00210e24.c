/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x210e24..0x211a40 (3100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_210e24_1 {
    char padding_0[80];
    unsigned long long field_50;
} st_210e24_1;

typedef struct st_210e24_0 {
    char field_0;
} st_210e24_0;

typedef struct st_210e24_5 {
    unsigned long long field_0;
} st_210e24_5;

typedef struct st_210e24_2 {
    char padding_0[1664];
    unsigned long long field_680;
} st_210e24_2;

typedef struct st_210e24_4 {
    char padding_0[376];
    struct st_210e24_5 *field_178;
} st_210e24_4;

typedef struct st_210e24_3 {
    char padding_0[96];
    struct st_210e24_2 *field_60;
} st_210e24_3;

extern st_210e24_3 *g_f0d198;
extern st_210e24_4 *g_f0d3d8;

int sub_210e24(st_210e24_1 *a0)
{
    st_210e24_0 **v0;  // [bp-0x178], Other Possible Types: char
    st_210e24_0 *v1;  // [bp-0x170]
    st_210e24_1 *v2;  // [bp-0x78]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = a0;
    if (a0->field_50 == g_f0d198->field_60->field_680)
        return 0;
    g_f0d3d8->field_178();
}
