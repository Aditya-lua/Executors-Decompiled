/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d4cf4..0x9d4d58 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_9d4cf4(long long a0, int a1, unsigned int a2)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w21
    unsigned int v4;  // w21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1 & ~(a1 >> 31);
    if ((int)v2 < (int)a2)
        a2 = v2;
    v3 = a2 + 1;
    while (1)
    {
        v4 = v3 - 1;
        if (v3 == 1)
            return 1;
        v3 = v4;
        if (sub_9d4888(a0, " ") != 1)
            return 0;
    }
}
