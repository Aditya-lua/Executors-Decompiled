/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x64448..0x64524 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_64448_2 {
    struct st_64448_0 *field_0;
    char padding_8[112];
    unsigned long long field_78;
} st_64448_2;

typedef struct st_64448_0 {
    char padding_0[48];
    struct st_64448_1 *field_30;
} st_64448_0;

typedef struct st_64448_1 {
    unsigned long long field_0;
} st_64448_1;

typedef struct st_64448_3 {
    char field_0;
} st_64448_3;

extern char g_10002e8;

int sub_64448(st_64448_2 *a0)
{
    st_64448_3 **v0;  // [bp-0x50], Other Possible Types: char
    st_64448_3 *v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_78)
        return 0;
    v2 = a0->field_78;
    v3 = &g_10002e8;
    a0->field_0->field_30();
}
