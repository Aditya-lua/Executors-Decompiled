/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c44a0..0x9c45c4 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_9c47c8;
extern long long g_d2c230;
extern unsigned long long g_f08390;
extern char g_f12798;

unsigned long long sub_9c44a0(unsigned long long a0, long long a1, long long a2, long long a3, unsigned int a4)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v0;  // [bp-0x70]
    unsigned int v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    if (!a0)
        a0 = &v0;
    sub_a6afb8();
    v1 = a4;
    if (*(long long *)&g_f12798)
    {
        sub_ad6ae4(*(long long *)&g_f12798);
        v4 = sub_ad66d4(*(long long *)&g_f12798, &v1);
        if (v4 >> 31 & 1)
            goto LABEL_9c454c;
        v5 = sub_ad69f8(*(long long *)&g_f12798, v4);
        if (v5)
            goto LABEL_9c4570;
LABEL_9c4518:
        if (1 <= (int)sub_9c214c(a0, a1, a2, a3, g_f08390 & 10246))
            return *(long long *)a0;
    }
    else
    {
LABEL_9c454c:
        v5 = sub_a99ef4(&v1, &g_d2c230, 28, 40, &g_9c47c8);
        if (!v5)
            goto LABEL_9c4518;
LABEL_9c4570:
        if ((int)sub_9c2158() >= 1)
            return *(long long *)a0;
    }
    return 0;
}
