/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8ad208..0x8adfbc (3508 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8ad208_1 {
    struct st_8ad208_0 *field_0;
    char padding_8[8];
    struct st_8ad208_2 *field_10;
} st_8ad208_1;

typedef struct st_8ad208_2 {
    unsigned long long field_0;
} st_8ad208_2;

typedef struct st_8ad208_0 {
    char field_0;
} st_8ad208_0;

extern unsigned long long g_e82dd8;
extern unsigned long long g_e82ed0;
extern unsigned long long g_e82f48;
extern char g_10002b0;

void sub_8ad208(st_8ad208_1 *a0, unsigned long long *a1)
{
    st_8ad208_0 **v0;  // [bp-0x560], Other Possible Types: char
    st_8ad208_0 *v1;  // [bp-0x558]
    st_8ad208_0 *v2;  // [bp-0x550]
    st_8ad208_0 **v3;  // [bp-0x518], Other Possible Types: char
    st_8ad208_0 **v4;  // [bp-0x510], Other Possible Types: char
    st_8ad208_0 *v5;  // [bp-0x480]
    st_8ad208_0 **v6;  // [bp-0x478], Other Possible Types: char
    st_8ad208_0 *v7;  // [bp-0x470]
    unsigned long v8;  // [bp-0x70]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (*(char *)a0->field_0 == 1)
    {
        v7 = &v4;
        v4 = &v7;
        if (*a1 && *(long long *)a0->field_10)
            (g_e82f48 - 0x2e3bc700)();
        v5 = &v3;
        v3 = &v5;
        v2 = &v6;
        v6 = &v2;
        (g_e82ed0 - 0xb7923e00)();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v8)
            return;
        ___stack_chk_fail();
        (g_e82dd8 - 0x900d0d00)();
    }
}
