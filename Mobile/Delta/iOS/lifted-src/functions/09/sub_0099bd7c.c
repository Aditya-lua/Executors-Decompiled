/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99bd7c..0x99bdb4 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99bd7c_0 {
    char padding_0[3056];
    long long field_bf0;
} st_99bd7c_0;


int sub_99bd7c(st_99bd7c_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a6c2e4(a0->field_bf0, "ssl/statem/extensions.c", 1170);
    a0->field_bf0 = 0;
    return 1;
}
