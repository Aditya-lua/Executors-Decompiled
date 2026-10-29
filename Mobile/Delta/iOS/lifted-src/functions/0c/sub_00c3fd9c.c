/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3fd9c..0xc3fdcc (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3fd9c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    long long field_10;
} st_c3fd9c_0;

extern long long g_efd090;

void sub_c3fd9c(st_c3fd9c_0 *a0)
{
    unsigned long long v5;  // x30
    unsigned long v0;  // [bp-0x20]
    unsigned long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v0 = a0->field_0;
    v1 = a0->field_8;
    sub_c40110(&v0, &g_efd090, a0->field_10, 1, 0);
}
