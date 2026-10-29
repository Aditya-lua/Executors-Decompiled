/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc138e4..0xc1390c (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_c138e4(void)
{
    unsigned long long ptr;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = _malloc(1432);
    if (ptr)
        return ptr;
    sub_c6ba70(8, 1432);
}
