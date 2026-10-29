/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa35970..0xa359fc (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f128d0;
extern long long g_f128d8;

int sub_a35970(unsigned int a0, void* a1)
{
    void* v2;  // x19
    unsigned int v3;  // w0
    unsigned long v4;  // x8
    void* v5;  // x10
    void* v6;  // x10
    void* v8;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    v3 = sub_a357f4();
    if (!v3)
        return v3;
    v4 = *(long long *)v2;
    if (*(long long *)v2)
    {
        v5 = v2 + 16;
        do
        {
            v6 = v5;
            *(unsigned long long *)((char *)v6 - 16) = v4 | __ROL__(a0, 23) & 0x7f800000 & 0x7fffffff;
            v4 = *(long long *)v6;
            v5 = v6 + 16;
        } while (*(long long *)v6);
    }
    if (!sub_a7c198(g_f128d0))
        return 1;
    if (*(long long *)v2)
    {
        do
        {
            v8 = v2;
            sub_a66794(g_f128d8, v8);
            v2 = v8 + 16;
        } while ((long long)v8[16]);
    }
    sub_a7c1b4(g_f128d0);
    return 1;
}
