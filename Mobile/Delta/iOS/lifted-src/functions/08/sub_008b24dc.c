/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b24dc..0x8b2670 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b24dc_0 {
    char field_0;
} st_8b24dc_0;

typedef struct st_8b24dc_2 {
    unsigned long long field_0;
} st_8b24dc_2;

typedef struct st_8b24dc_1 {
    char padding_0[416];
    struct st_8b24dc_2 *field_1a0;
} st_8b24dc_1;

extern st_8b24dc_1 *g_f0d3d8;
extern char g_f12662;

void sub_8b24dc(void)
{
    st_8b24dc_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_8b24dc_0 *v1;  // [bp-0x48]
    st_8b24dc_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_8b24dc_0 *v3;  // [bp-0x38]
    char v4;  // [bp-0x30]
    unsigned int v5;  // [bp-0x24]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    if (g_f12662 & 1)
        return;
    sub_24f270();
    sub_8c5c6c(0);
    v3 = &v2;
    v2 = &v3;
    v5 = 8;
    v4 = 0;
    g_f0d3d8->field_1a0();
}
