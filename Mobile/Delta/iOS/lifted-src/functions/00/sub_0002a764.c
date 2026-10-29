/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a764..0x2a7c0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a764_0 {
    long long field_0;
} st_2a764_0;


unsigned long long * sub_2a764(st_2a764_0 **a0)
{
    long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (!*v2)
        return v2;
    sub_c84c(v2, *v2);
}
