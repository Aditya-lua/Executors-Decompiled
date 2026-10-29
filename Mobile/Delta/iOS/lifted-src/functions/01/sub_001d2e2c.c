/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d2e2c..0x1d324c (1056 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d2e2c_1 {
    char padding_0[48];
    struct st_1d2e2c_2 *field_30;
} st_1d2e2c_1;

typedef struct st_1d2e2c_2 {
    unsigned long long field_0;
} st_1d2e2c_2;

typedef struct st_1d2e2c_0 {
    char field_0;
} st_1d2e2c_0;

extern char g_10002b0;

void sub_1d2e2c(st_1d2e2c_1 **a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    st_1d2e2c_0 **v0;  // [bp-0xf0], Other Possible Types: char
    st_1d2e2c_0 *v1;  // [bp-0xe8]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (sub_1a2fa4())
        *a0->field_30();
    if (*(long long *)&g_10002b0 == v2)
        return;
    ___stack_chk_fail();
    __debugbreak();
}
