/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaea460..0xaea530 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_aea460(unsigned long a0, long long a1, unsigned long a2)
{
    unsigned long long v6;  // x20
    long long *v7;  // x0
    unsigned long v0;  // [bp-0xe0]
    char v1;  // [bp-0xd8]
    char v2;  // [bp-0x88]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v0 = a2;
    if ((int)sub_ad69e4(a1) >= 1)
    {
        v6 = 0;
        do
        {
            v7 = sub_ad69f8(a1, v6);
            sub_9c3058(&v2, 80, *v7);
            sub_9c3058(&v1, 80, v7[1]);
            sub_aeefc4(&v2, &v1, &v0);
            v6 = (unsigned int)v6 + 1;
        } while ((int)v6 < (int)sub_ad69e4(a1));
        a2 = v0;
    }
    if (*(long long *)&g_10002b0 == v3)
        return a2;
    ___stack_chk_fail();
}
