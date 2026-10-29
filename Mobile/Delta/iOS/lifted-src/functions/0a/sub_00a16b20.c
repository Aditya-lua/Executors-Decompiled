/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa16b20..0xa16b68 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a16b20(unsigned long a0)
{
    unsigned long v4;  // x0
    unsigned int v5;  // w0
    unsigned long v0;  // [bp-0x20]
    unsigned long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a0 && sub_9ffdd0())
    {
        v4 = sub_c4ba8();
        if (v4)
        {
            v0 = v4;
            v1 = v4;
            v5 = sub_a03638(&v0, 0);
            return v5 & ~((int)(v5) >> 31);
        }
    }
    return 0;
}
