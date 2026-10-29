/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x127c0..0x1281c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_127c0_0 {
    long long field_0;
} st_127c0_0;


unsigned long long * sub_127c0(st_127c0_0 **a0)
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
