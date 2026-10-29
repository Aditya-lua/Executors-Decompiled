/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa64404..0xa64420 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

unsigned int sub_a64404(long long *a0)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a50ac8(*a0);
    return v2 & ~((int)(v2) >> 31);
}
