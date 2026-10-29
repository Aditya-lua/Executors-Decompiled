/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c5df4..0x9c5edc (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_9c60f4;
extern long long g_f08398;
extern long long g_f127a0;

char sub_9c5df4(char a0, unsigned long long a1)
{
    unsigned long long v4;  // x0
    char v5;  // x0
    char v6;  // x0
    char *v0;  // [bp-0x198]
    unsigned int v1;  // [bp-0x190]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    while (1)
    {
        v0 = &v1;
        v1 = a1;
        if (g_f127a0 && (v4 = sub_ad66d4(g_f127a0, &v1), !(v4 >> 31 & 1)))
        {
            v5 = sub_ad69f8(g_f127a0, v4);
            if (!v5)
                break;
        }
        else
        {
            v5 = sub_a99ef4(&v0, &g_f08398, 15, 8, &g_9c60f4);
            if (!v5 || (v5 = *(long long *)v5, !v5))
                break;
        }
        if (!(*(char *)(v5 + 8) & 1))
            break;
        a1 = *(int *)(v5 + 4);
    }
    if (!a0)
        return v5;
    v6 = sub_a34bbc(a1);
    if (!v6)
    {
        *(unsigned long long *)a0 = 0;
        return v5;
    }
    *(unsigned long long *)a0 = v6;
    return sub_a34bd8();
}
