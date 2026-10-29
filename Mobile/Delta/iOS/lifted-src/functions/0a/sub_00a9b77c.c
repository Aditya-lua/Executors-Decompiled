/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9b77c..0xa9b8b0 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_82031f;
extern unsigned long long g_c7c2eb;

unsigned long long sub_a9b77c(unsigned long a0, long long *a1, long long a2, unsigned long long a3)
{
    unsigned long long v4;  // x21
    long long *v5;  // x24
    unsigned long v0;  // [bp-0x60], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = a3;
    v1 = &g_c7c2eb;
    if ((int)sub_9d524c(a2, "%*sIssuer: ") < 1 || (int)sub_9c3834(a2, *a1, 0, &g_82031f) < 1)
    {
LABEL_a9b890:
        return 0;
    }
    if ((int)sub_ad69e4(a1[1]) < 1)
        return 1;
    v4 = 0;
    do
    {
        v5 = sub_ad69f8(a1[1], v4);
        v0 = (unsigned int)a3 * 2;
        v1 = &g_c7c2eb;
        if ((int)sub_9d524c(a2, "\n%*s") < 1 || (int)sub_9c3060(a2, *v5) < 1 || (int)sub_9d4888(a2, " - ") < 1 || (int)sub_aec458(a2, v5[1]) <= 0)
            goto LABEL_a9b890;
    } while ((v4 = (unsigned int)v4 + 1, (int)v4 < (int)sub_ad69e4(a1[1])));
    return 1;
}
