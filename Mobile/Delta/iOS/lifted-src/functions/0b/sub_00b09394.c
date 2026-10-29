/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb09394..0xb093d0 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b09394(unsigned int *a0, unsigned int *a1, unsigned long a2)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w8
    unsigned int v2;  // w8

    if (a2 != 12)
        return 0;
    v0 = *a1;
    a0[105] = v0;
    a0[188] = v0;
    v1 = a1[1];
    a0[106] = v1;
    a0[189] = v1;
    v2 = a1[2];
    a0[107] = v2;
    a0[190] = v2;
    return 1;
}
