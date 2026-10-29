/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19b2e8..0x19b514 (556 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_19b2e8_1 {
    char padding_0[80];
    unsigned long long field_50;
} st_19b2e8_1;

typedef struct st_19b2e8_0 {
    char field_0;
} st_19b2e8_0;

typedef struct st_19b2e8_5 {
    unsigned long long field_0;
} st_19b2e8_5;

typedef struct st_19b2e8_2 {
    char padding_0[1664];
    unsigned long long field_680;
} st_19b2e8_2;

typedef struct st_19b2e8_4 {
    char padding_0[376];
    struct st_19b2e8_5 *field_178;
} st_19b2e8_4;

typedef struct st_19b2e8_3 {
    char padding_0[96];
    struct st_19b2e8_2 *field_60;
} st_19b2e8_3;

extern st_19b2e8_3 *g_f0d198;
extern st_19b2e8_4 *g_f0d3d8;

int sub_19b2e8(st_19b2e8_1 *a0)
{
    st_19b2e8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_19b2e8_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_50 == g_f0d198->field_60->field_680)
        return 0;
    g_f0d3d8->field_178();
}
