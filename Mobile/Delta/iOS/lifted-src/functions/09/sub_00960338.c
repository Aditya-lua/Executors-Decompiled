/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x960338..0x9603a0 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_960338(unsigned long a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v3;  // w0
    unsigned long long v4;  // x0
    unsigned int v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a2 >> 31 & 1)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 2498, "SSL_peek");
        sub_a36abc(20, 271, 0);
        return 0xffffffff;
    }
    v3 = (unsigned int)sub_9603a0();
    if (0 < v3)
        v4 = v0;
    else
        v4 = v3;
    return v4;
}
