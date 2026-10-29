/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad5dbc..0xad5f30 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f09220;
extern long long g_f09228;
extern long long g_f09230;
extern unsigned long long g_f09238;
extern long long g_f09240;
extern long long g_f09248;
extern unsigned long long g_f09250;
extern long long g_f09258;
extern long long g_f09260;
extern unsigned long long g_f09268;
extern long long g_f09270;
extern long long g_f09278;
extern unsigned long long g_f09280;
extern long long g_f09288;
extern long long g_f09290;
extern unsigned long long g_f09298;
extern long long g_f092a0;
extern long long g_f092a8;
extern unsigned long long g_f092b0;
extern long long g_f092b8;
extern long long g_f092c0;

long long sub_ad5dbc(long long a0, long long a1)
{
    unsigned long long *v2;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return 0;
    }
    else if (a1)
    {
        if ((sub_9e5528(g_f09228, a0) || (v2 = &g_f09220, sub_9e5528(g_f09230, a1))) && (sub_9e5528(g_f09240, a0) || (v2 = &g_f09238, sub_9e5528(g_f09248, a1))) && (sub_9e5528(g_f09258, a0) || (v2 = &g_f09250, sub_9e5528(g_f09260, a1))) && (sub_9e5528(g_f09270, a0) || (v2 = &g_f09268, sub_9e5528(g_f09278, a1))) && (sub_9e5528(g_f09288, a0) || (v2 = &g_f09280, sub_9e5528(g_f09290, a1))) && (sub_9e5528(g_f092a0, a0) || (v2 = &g_f09298, sub_9e5528(g_f092a8, a1))) && (sub_9e5528(g_f092b8, a0) || !(v2 = &g_f092b0, !sub_9e5528(g_f092c0, a1))))
            return 0;
        return *v2;
    }
    else
    {
        return 0;
    }
}
