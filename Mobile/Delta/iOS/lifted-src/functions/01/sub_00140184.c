/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x140184..0x1404c4 (832 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_140184_0 {
    char field_0;
} st_140184_0;

typedef struct st_140184_5 {
    unsigned long long field_0;
} st_140184_5;

typedef struct st_140184_1 {
    char padding_0[256];
    unsigned long long field_100;
} st_140184_1;

typedef struct st_140184_4 {
    char padding_0[376];
    struct st_140184_5 *field_178;
} st_140184_4;

typedef struct st_140184_2 {
    char padding_0[96];
    struct st_140184_1 *field_60;
} st_140184_2;

extern st_140184_2 *g_f0d198;
extern st_140184_4 *g_f0d3d8;

unsigned long long sub_140184(long long a0)
{
    unsigned long long v6;  // x0
    long long v7;  // x0
    st_140184_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_140184_0 *v1;  // [bp-0x58]
    st_140184_0 *v2;  // [bp-0x50]
    st_140184_0 **v3;  // [bp-0x38], Other Possible Types: char
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (~g_f0d198->field_60->field_100 & 0x800000000000400)
        return 0;
    v2 = &v3;
    v3 = &v2;
    v6 = sub_13e800();
    if (v6 && *(long long *)(v6 + 24))
        g_f0d3d8->field_178();
    v7 = sub_c60d14(a0);
    sub_13e9ac(&v2);
    __Unwind_Resume(v7);
}
