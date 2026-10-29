/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x140d40..0x1414c4 (1924 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_140d40_0 {
    char field_0;
} st_140d40_0;

typedef struct st_140d40_4 {
    unsigned long long field_0;
} st_140d40_4;

typedef struct st_140d40_1 {
    char padding_0[256];
    unsigned long long field_100;
} st_140d40_1;

typedef struct st_140d40_3 {
    char padding_0[376];
    struct st_140d40_4 *field_178;
} st_140d40_3;

typedef struct st_140d40_2 {
    char padding_0[96];
    struct st_140d40_1 *field_60;
} st_140d40_2;

extern st_140d40_2 *g_f0d198;
extern st_140d40_3 *g_f0d3d8;

unsigned long long sub_140d40(unsigned long a0)
{
    st_140d40_0 **v0;  // [bp-0xc0], Other Possible Types: char
    st_140d40_0 *v1;  // [bp-0xb8]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (~g_f0d198->field_60->field_100 & 0x800000000000400)
        return 0;
    g_f0d3d8->field_178();
}
