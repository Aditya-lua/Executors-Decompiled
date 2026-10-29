/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xada93c..0xada98c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f12fd8;

int sub_ada93c(unsigned long a0, long long a1)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((sub_9c7b68(a1) & 0xfffffffe) != 4)
        return 1;
    v2 = sub_c4c40(a1);
    _fputs(v2, g_f12fd8);
    _fflush(g_f12fd8);
    return 1;
}
