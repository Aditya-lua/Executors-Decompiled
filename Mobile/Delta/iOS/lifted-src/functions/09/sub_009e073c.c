/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e073c..0x9e07e0 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_9e073c(long long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, long long a5, long long a6, long long a7, unsigned long a8, long long a9, long long a10)
{
    unsigned int v1;  // w25
    unsigned int v2;  // w8
    char *v0;  // [bp-0x10]

    v0 = &a8;
    if (sub_9dfcdc())
    {
        sub_9e5708(a0);
        v1 = 1;
    }
    else
    {
        v1 = 0;
    }
    if (sub_9dfcdc(a5, a6, a7, a8, a10, a9))
    {
        sub_9e5708(a5);
        v2 = 1;
    }
    else
    {
        v2 = 0;
    }
    return v2 & v1;
}
