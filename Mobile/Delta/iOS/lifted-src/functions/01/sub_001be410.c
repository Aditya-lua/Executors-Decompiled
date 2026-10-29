/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1be410..0x1be494 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1be410_0 {
    char padding_0[24];
    struct st_1be410_1 *field_18;
} st_1be410_0;

typedef struct st_1be410_1 {
    unsigned long long field_0;
} st_1be410_1;

extern char g_e70890;

st_1be410_0 * sub_1be410(st_1be410_0 *a0, long long a1)
{
    unsigned long long *v6;  // x0
    unsigned long long *v0;  // [bp-0x60]
    char *v1;  // [bp-0x58]
    long long v2;  // [bp-0x50]
    char v3;  // [bp-0x41]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    a0->field_18 = 0;
    v6 = sub_166ec(&v3, 1);
    v1 = &v3;
    v2 = 1;
    *v6 = &g_e70890;
    sub_1af858(v6 + 1, a1);
    v0 = 0;
    a0->field_18 = v6;
    sub_2217c(&v0, 0);
    return a0;
}
