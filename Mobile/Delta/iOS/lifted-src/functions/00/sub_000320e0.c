/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x320e0..0x3211c (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_320e0(char *a0, unsigned long long i)
{
    unsigned int v0;  // w0
    char *v1;  // x8
    unsigned int v2;  // w0
    unsigned long long v3;  // x1
    char *v4;  // x8

    if (!i)
        return 2166136261;
    v0 = 2166136261;
    do
    {
        v1 = a0;
        v2 = v0;
        v3 = i;
        v4 = v1 + 1;
        i = v3 - 1;
        v0 = 16777619 * (v2 ^ *v1);
        a0 = v4;
    } while (i);
    return 16777619 * (v2 ^ *v1);
}
