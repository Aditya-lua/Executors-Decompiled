/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x996e84..0x996ed0 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_996e84(unsigned long a0, unsigned int a1, long long a2, long long a3)
{
    unsigned int v3;  // w0
    char *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = &v2;
    v3 = sub_a36ae4(20, a2, a3, &v2);
    *(unsigned int *)(a0 + 4104) = a1;
    return v3;
}
