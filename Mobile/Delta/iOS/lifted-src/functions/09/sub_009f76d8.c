/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f76d8..0x9f770c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_9f76d8(void)
{
    unsigned int *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(104, "crypto/ct/ct_sct.c", 24);
    if (v2)
    {
        v2[22] = 0xffffffff;
        *v2 = 0xffffffff;
    }
    return (unsigned int)v2;
}
