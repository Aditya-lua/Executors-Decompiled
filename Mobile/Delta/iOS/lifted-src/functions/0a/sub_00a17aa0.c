/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa17aa0..0xa17b90 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e8ef70;
extern unsigned long long g_e8ef80;
extern unsigned long long g_e8ef90;

unsigned long long sub_a17aa0(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if ((int)a0[1] == 6)
    {
        v4 = sub_a7168c();
        if (!(unsigned int)v4)
            return v4;
    }
    else if ((int)a0[1] == 4)
    {
        v0 = a0[2];
        v3 = a0[2] != 0;
        if (!(unsigned int)v3)
            return v3;
    }
    else
    {
        return 0;
    }
    if (!v0)
    {
        *(unsigned int *)a1 = 4;
        return 1;
    }
    if (sub_a6e200(v0, "uncompressed"))
    {
        if (sub_a6e200(v0, "compressed"))
        {
            if (!sub_a6e200(v0, "hybrid") && (int)g_e8ef90 >= 0)
            {
                *(int *)a1 = g_e8ef90;
                return 1;
            }
        }
        else
        {
            if ((int)g_e8ef80 >= 0)
            {
                *(int *)a1 = g_e8ef80;
                return 1;
            }
        }
    }
    else
    {
        if ((int)g_e8ef70 >= 0)
        {
            *(int *)a1 = g_e8ef70;
            return 1;
        }
    }
    return 0;
}
