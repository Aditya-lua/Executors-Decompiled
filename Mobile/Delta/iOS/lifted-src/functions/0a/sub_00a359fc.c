/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa359fc..0xa35a64 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f128d0;
extern long long g_f128d8;

unsigned int sub_a359fc(unsigned int *a0)
{
    unsigned int *v2;  // x19
    unsigned int v3;  // w0
    unsigned int *v4;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    v3 = sub_a357f4();
    if (!v3)
        return v3;
    if (!sub_a7c198(g_f128d0))
        return 1;
    if (*(long long *)v2)
    {
        do
        {
            v4 = v2;
            sub_a66794(g_f128d8, v4);
            v2 = v4 + 4;
        } while (*(long long *)&v4[4]);
    }
    sub_a7c1b4(g_f128d0);
    return 1;
}
