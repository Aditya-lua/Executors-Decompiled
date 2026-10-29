/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa683d0..0xa684ec (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a680ec;
extern long long g_f08ef0;
extern char g_f12a90;
extern unsigned int g_f12a98;
extern long long g_f12be0;
extern char g_f12be8;

unsigned long long sub_a683d0(unsigned long a0)
{
    unsigned int v2;  // x0
    unsigned long long v3;  // x0
    unsigned int v4;  // x0
    unsigned int v5;  // w8
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    switch (a0)
    {
    case 0:
        v4 = 0;
        if (sub_a7c208(&g_f08ef0, &g_a680ec) && *(int *)&g_f12be8)
            v4 = sub_a7bbe0(&g_f12be0);
        if (v4 != &g_f12a98)
            v5 = !v4 & g_f12a90;
        else
            v5 = 1;
        if (v5)
            v6 = "Global default library context";
        else
            v6 = "Thread-local default library context";
        return v6;
    case 15805080:
        return "Global default library context";
    default:
        v2 = 0;
        if (sub_a7c208(&g_f08ef0, &g_a680ec) && *(int *)&g_f12be8)
            v2 = sub_a7bbe0(&g_f12be0);
        if (!v2 & g_f12a90)
            v2 = (unsigned int)&g_f12a98;
        if (v2 == a0)
            v3 = "Thread-local default library context";
        else
            v3 = "Non-default library context";
        return v3;
    }
}
