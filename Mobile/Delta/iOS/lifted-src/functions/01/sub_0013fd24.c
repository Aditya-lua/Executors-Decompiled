/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13fd24..0x13ffc4 (672 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13fd24_0 {
    char field_0;
} st_13fd24_0;

typedef struct st_13fd24_4 {
    unsigned long long field_0;
} st_13fd24_4;

typedef struct st_13fd24_1 {
    char padding_0[256];
    unsigned long long field_100;
} st_13fd24_1;

typedef struct st_13fd24_3 {
    char padding_0[376];
    struct st_13fd24_4 *field_178;
} st_13fd24_3;

typedef struct st_13fd24_2 {
    char padding_0[96];
    struct st_13fd24_1 *field_60;
} st_13fd24_2;

extern st_13fd24_2 *g_f0d198;
extern st_13fd24_3 *g_f0d3d8;

unsigned long long sub_13fd24(long long a0)
{
    unsigned long long v6;  // x0
    st_13fd24_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_13fd24_0 *v1;  // [bp-0x48]
    st_13fd24_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_13fd24_0 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (~g_f0d198->field_60->field_100 & 0x800000000000400)
        return 0;
    v3 = &v2;
    v2 = &v3;
    v6 = sub_13e800();
    if (v6 && *(long long *)(v6 + 24))
        g_f0d3d8->field_178();
    sub_c60d14(a0);
}
