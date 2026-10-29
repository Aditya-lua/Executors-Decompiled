/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5a588..0xa5a654 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_a5a588(void* a0, void* a1)
{
    void* v3;  // x8
    unsigned int v0;  // [bp-0x24]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a0 == a1)
    {
        return 1;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (a1)
    {
        if (!(long long)a0[96] && !(long long)a1[96])
        {
            if (*(int *)a0 == *(int *)a1)
            {
                v3 = (long long)a0[8];
                if (!v3)
                    return 0xfffffffe;
                if ((long long)v3[144])
                {
                    (long long)v3[144]();
                }
                else if ((long long)v3[48])
                {
                    goto *((void *)((long long)v3[48]));
                }
                return 0xfffffffe;
            }
            else
            {
                return 0xffffffff;
            }
        }
        sub_c67d60();
        return v0;
    }
    else
    {
        return 0;
    }
}
