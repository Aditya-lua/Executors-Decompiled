/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf091c..0xaf0a18 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

int sub_af091c(long long a0, long long a1, unsigned int a2)
{
    unsigned long v5;  // x21
    unsigned long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if ((int)sub_ad69e4(a1) < 1)
        return 1;
    v0 = a2 + 2;
    v1 = &g_c7c2eb;
    sub_9d524c(a0, "%*s");
    sub_aec458(a0, sub_ad69f8(a1, 0));
    if ((int)sub_ad69e4(a1) < 2)
        return 1;
    v5 = 1;
    do
    {
        sub_9d4888(a0, "\n");
        v1 = &g_c7c2eb;
        sub_9d524c(a0, "%*s");
        sub_aec458(a0, sub_ad69f8(a1, v5));
        v5 = (unsigned int)v5 + 1;
    } while ((int)v5 < (int)sub_ad69e4(a1));
    return 1;
}
