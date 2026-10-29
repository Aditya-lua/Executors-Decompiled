/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaee888..0xaee950 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_eb9570;

long long sub_aee888(unsigned long a0, long long a1, unsigned long a2)
{
    unsigned long v3;  // x20
    long long v4;  // x1
    long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long v7;  // x8
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a2;
    if ((int)sub_ad69e4(a1) < 1)
        return a2;
    v3 = 0;
    do
    {
        v4 = v3;
        v5 = sub_ad69f8(a1, v4);
        v6 = sub_9c1a94(v5, v4);
        if (v6 == 5)
        {
            v7 = 0;
            goto LABEL_aee8cc;
        }
        else if (v6 == 0x11)
        {
            v7 = 1;
LABEL_aee8cc:
            sub_aeefc4(0, *(long long *)&(&g_eb9570)[8 + 16 * v7], &v0);
        }
        else
        {
            sub_aef608(0, v5, &v0);
        }
    } while ((v3 = (unsigned int)v3 + 1, (int)sub_ad69e4(a1) > (int)v3));
    return v0;
}
