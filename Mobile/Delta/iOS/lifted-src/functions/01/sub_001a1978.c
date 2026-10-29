/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a1978..0x1a1a30 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a1978_1 {
    char padding_0[80];
    unsigned long long field_50;
} st_1a1978_1;

typedef struct st_1a1978_0 {
    char field_0;
} st_1a1978_0;

typedef struct st_1a1978_4 {
    unsigned long long field_0;
} st_1a1978_4;

typedef struct st_1a1978_2 {
    char padding_0[1664];
    unsigned long long field_680;
} st_1a1978_2;

typedef struct st_1a1978_5 {
    struct st_1a1978_4 *field_0;
} st_1a1978_5;

typedef struct st_1a1978_3 {
    char padding_0[96];
    struct st_1a1978_2 *field_60;
} st_1a1978_3;

extern st_1a1978_3 *g_f0d198;
extern st_1a1978_5 *g_f0d3d8;

int sub_1a1978(st_1a1978_1 *a0)
{
    st_1a1978_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1a1978_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_50 == g_f0d198->field_60->field_680)
        return 0;
    (*(long long *)g_f0d3d8)();
}
