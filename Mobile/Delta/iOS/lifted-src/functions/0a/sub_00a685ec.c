/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa685ec..0xa68678 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a680ec;
extern long long g_f08ef0;
extern char g_f12a90;
extern char g_f12a98;
extern long long g_f12be0;
extern char g_f12be8;

int sub_a685ec(unsigned long long a0, unsigned int a1)
{
    char v2;  // x8
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (!v2)
    {
        a0 = 0;
        if (sub_a7c208(&g_f08ef0, &g_a680ec) && *(int *)&g_f12be8)
            a0 = sub_a7bbe0(&g_f12be0);
        if (!a0 & g_f12a90)
            v2 = (char)&g_f12a98;
        else
            v2 = a0;
        if (!a0 && !(v3 = a0, g_f12a90 & 1))
            goto LABEL_a68608;
    }
    v3 = a0;
    *(unsigned int *)(v2 + 324) = a1;
LABEL_a68608:
    return v3;
}
