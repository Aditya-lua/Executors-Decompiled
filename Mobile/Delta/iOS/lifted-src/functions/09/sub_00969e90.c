/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x969e90..0x969f28 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern void g_d280f4;
extern char g_10002b0;

long long sub_969e90(void)
{
    unsigned long v4;  // x0
    void* v5;  // x8
    unsigned long long v6;  // x9
    unsigned long long v7;  // x9
    char v0;  // [bp-0x4a]
    unsigned long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if ((int)sub_a5b508() > 0)
    {
        v4 = sub_a99eb4(&v0);
        if ((unsigned int)v4)
        {
            v5 = &g_d280f4;
            v6 = 45;
            do
            {
                v7 = v6;
                if (*(int *)((char *)v5 - 4) == (unsigned int)v4)
                {
                    if (*(long long *)&g_10002b0 == v1)
                        return *(short *)v5;
                    ___stack_chk_fail();
                }
            } while ((v5 += 8, v6 = v7 - 1, v7 != 1));
        }
        else
        {
            if (*(long long *)&g_10002b0 == v1)
                return v4;
            ___stack_chk_fail();
        }
    }
    if (*(long long *)&g_10002b0 == v1)
        return 0;
    ___stack_chk_fail();
}
