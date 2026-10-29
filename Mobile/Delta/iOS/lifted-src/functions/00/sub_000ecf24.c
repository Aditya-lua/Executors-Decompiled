/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xecf24..0xefa18 (10996 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ecf24_1 {
    char padding_0[80];
    unsigned long long field_50;
} st_ecf24_1;

typedef struct st_ecf24_0 {
    char field_0;
} st_ecf24_0;

typedef struct st_ecf24_5 {
    unsigned long long field_0;
} st_ecf24_5;

typedef struct st_ecf24_2 {
    char padding_0[1664];
    unsigned long long field_680;
} st_ecf24_2;

typedef struct st_ecf24_4 {
    char padding_0[376];
    struct st_ecf24_5 *field_178;
} st_ecf24_4;

typedef struct st_ecf24_3 {
    char padding_0[96];
    struct st_ecf24_2 *field_60;
} st_ecf24_3;

extern st_ecf24_3 *g_f0d198;
extern st_ecf24_4 *g_f0d3d8;
extern char g_10002b0;

int sub_ecf24(st_ecf24_1 *a0)
{
    long long v5;  // x0
    long long v6;  // x26
    long long v7;  // x0
    st_ecf24_0 **v0;  // [bp-0x1d8], Other Possible Types: char
    st_ecf24_0 *v1;  // [bp-0x1d0]
    unsigned long v2;  // [bp-0x70]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_50 != g_f0d198->field_60->field_680)
        g_f0d3d8->field_178();
    if (*(long long *)&g_10002b0 == v2)
        return 0;
    v5 = ___stack_chk_fail();
    sub_138cc(v6 + 8);
    v7 = __Unwind_Resume(v5);
    __Unwind_Resume(v7);
}
