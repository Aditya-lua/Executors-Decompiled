/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa69b18..0xa69b58 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a69b18(unsigned long a0, void* a1, void* a2)
{
    unsigned int v0;  // w9
    unsigned long v1;  // x8
    unsigned int i;  // w10

    v0 = *(int *)a1;
    if (*(int *)a1)
    {
        v1 = 0;
        do
        {
            i = v0;
            v1 += 1;
            v0 >>= 8;
        } while (0xff < i);
        *(unsigned int *)a2 = i;
    }
    else
    {
        v1 = 0;
    }
}
