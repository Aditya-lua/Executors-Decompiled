/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb65b14..0xb65b48 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_b65b14(void* a0)
{
    unsigned long v0;  // x9
    void* v1;  // x0

    if (!*(long long *)a0)
    {
        return a0;
    }
    else if (*(long long *)a0 == 0x8000000000000000)
    {
        v0 = (long long)a0[16];
        v1 = (long long)a0[8];
        *(char *)(long long)a0[8] = 0;
        if (!v0)
            return v1;
    }
}
