/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95ce18..0x95ce60 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_95ce18(void* a0, long long a1)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((long long)a0[32])
        v2 = sub_95f0c4((long long)a0[32], 0x66, 0, a1);
    else
        v2 = sub_960f58((long long)a0[24], 0x66, 0);
    return (int)v2 > 0;
}
