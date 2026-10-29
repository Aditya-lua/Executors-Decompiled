/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d9324..0x9d936c (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9d9324(unsigned long long *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *(unsigned int *)&a0[5] = 0;
    *(unsigned int *)&a0[7] = 0;
    *(unsigned int *)&a0[6] = 0;
    v2 = sub_a6bffc(112, "crypto/bio/bss_sock.c", 83);
    a0[8] = v2;
    return v2 != 0;
}
