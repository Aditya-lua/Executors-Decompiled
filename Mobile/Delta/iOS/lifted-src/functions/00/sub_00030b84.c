/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x30b84..0x30c24 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_30b84(void* a0, void* a1, void* a2)
{
    unsigned int v0;  // w9
    unsigned long v1;  // x8
    unsigned long v2;  // x8
    unsigned long v3;  // x8

    v0 = *(int *)a1;
    if ((unsigned int)*(int *)a0 > v0)
    {
        v1 = *(long long *)a0;
        if (v0 > (unsigned int)*(int *)a2)
        {
            *(long long *)a0 = *(long long *)a2;
        }
        else
        {
            *(long long *)a0 = *(long long *)a1;
            *(unsigned long *)a1 = v1;
            if ((unsigned int)v1 <= (unsigned int)*(int *)a2)
                return 1;
            *(long long *)a1 = *(long long *)a2;
        }
        *(unsigned long *)a2 = v1;
        return 1;
    }
    else if (v0 > (unsigned int)*(int *)a2)
    {
        v2 = *(long long *)a1;
        *(long long *)a1 = *(long long *)a2;
        *(unsigned long *)a2 = v2;
        if ((unsigned int)*(int *)a0 <= (unsigned int)*(int *)a1)
            return 1;
        v3 = *(long long *)a0;
        *(long long *)a0 = *(long long *)a1;
        *(unsigned long *)a1 = v3;
        return 1;
    }
    else
    {
        return 0;
    }
}
