/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x217ef8..0x218414 (1308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_217ef8_1 {
    char padding_0[80];
    unsigned long long field_50;
} st_217ef8_1;

typedef struct st_217ef8_0 {
    char field_0;
} st_217ef8_0;

typedef struct st_217ef8_5 {
    unsigned long long field_0;
} st_217ef8_5;

typedef struct st_217ef8_2 {
    char padding_0[1664];
    unsigned long long field_680;
} st_217ef8_2;

typedef struct st_217ef8_4 {
    char padding_0[376];
    struct st_217ef8_5 *field_178;
} st_217ef8_4;

typedef struct st_217ef8_3 {
    char padding_0[96];
    struct st_217ef8_2 *field_60;
} st_217ef8_3;

extern st_217ef8_3 *g_f0d198;
extern st_217ef8_4 *g_f0d3d8;
extern char g_10002b0;

int sub_217ef8(st_217ef8_1 *a0)
{
    st_217ef8_0 **v0;  // [bp-0x108], Other Possible Types: char
    st_217ef8_0 *v1;  // [bp-0x100]
    st_217ef8_0 **v2;  // [bp-0xe8], Other Possible Types: char
    st_217ef8_0 *v3;  // [bp-0xe0]
    unsigned long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_50 != g_f0d198->field_60->field_680)
    {
        v3 = &v2;
        v2 = &v3;
        g_f0d3d8->field_178();
    }
    if (*(long long *)&g_10002b0 == v4)
        return 0;
    __Unwind_Resume(__Unwind_Resume(__Unwind_Resume(___stack_chk_fail())));
}
