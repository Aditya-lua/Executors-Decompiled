/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae7388..0xae743c (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_ae7388(unsigned long a0, long long a1, unsigned long a2)
{
    unsigned long long v5;  // x20
    unsigned long v0;  // [bp-0x80]
    char v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v0 = a2;
    if ((int)sub_ad69e4(a1) >= 1)
    {
        v5 = 0;
        do
        {
            sub_9c3058(&v1, 80, sub_ad69f8(a1, v5));
            sub_aeefc4(0, &v1, &v0);
            v5 = (unsigned int)v5 + 1;
        } while ((int)v5 < (int)sub_ad69e4(a1));
        a2 = v0;
    }
    if (*(long long *)&g_10002b0 == v2)
        return a2;
    ___stack_chk_fail();
}
