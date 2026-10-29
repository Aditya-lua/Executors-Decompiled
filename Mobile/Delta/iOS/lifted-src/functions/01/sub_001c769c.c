/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c769c..0x1c7708 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c769c_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_1c769c_0;

extern char g_e6ffa8;

unsigned long long * sub_1c769c(st_1c769c_0 *a0)
{
    unsigned long long *v6;  // x0
    unsigned long long v7;  // x9
    unsigned long v0;  // [bp-0x50]
    char *v1;  // [bp-0x48]
    long long v2;  // [bp-0x40]
    char v3;  // [bp-0x31]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_12ad0(&v3, 1);
    v2 = 1;
    v7 = a0->field_8;
    *v6 = &g_e6ffa8;
    v6[1] = v7;
    v0 = 0;
    v1 = &v3;
    sub_2217c(&v0, 0);
    return v6;
}
