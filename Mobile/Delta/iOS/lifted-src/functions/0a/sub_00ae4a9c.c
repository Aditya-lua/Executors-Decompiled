/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae4a9c..0xae4bf4 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

int sub_ae4a9c(unsigned long a0, long long a1, long long a2, unsigned long long a3)
{
    long long *v4;  // x22
    unsigned long v5;  // x22
    long long *v6;  // x25
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if ((int)sub_ad69e4(a1) < 1)
        return 1;
    v4 = sub_ad69f8(a1, 0);
    v0 = a3;
    v1 = &g_c7c2eb;
    sub_9d524c(a2, "%*sPolicy: ");
    sub_9c3060(a2, *v4);
    if (v4[1])
    {
        sub_9d4888(a2, "\n");
        sub_ae5974(a2, v4[1], (unsigned int)a3 + 2);
    }
    if ((int)sub_ad69e4(a1) < 2)
        return 1;
    v5 = 1;
    do
    {
        sub_9d4888(a2, "\n");
        v6 = sub_ad69f8(a1, v5);
        v0 = a3;
        v1 = &g_c7c2eb;
        sub_9d524c(a2, "%*sPolicy: ");
        sub_9c3060(a2, *v6);
        if (v6[1])
        {
            sub_9d4888(a2, "\n");
            sub_ae5974(a2, v6[1], (unsigned int)a3 + 2);
        }
    } while ((v5 = (unsigned int)v5 + 1, (int)sub_ad69e4(a1) > (int)v5));
    return 1;
}
