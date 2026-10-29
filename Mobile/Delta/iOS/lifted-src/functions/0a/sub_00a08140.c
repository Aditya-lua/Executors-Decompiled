/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa08140..0xa08254 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a08140(unsigned long a0, long long a1, unsigned int a2, long long a3, unsigned long long a4, unsigned long a5)
{
    unsigned long v6;  // x0
    unsigned long v7;  // x19
    char v0;  // [bp-0x4a]
    char v1;  // [bp-0x49]
    char v2[16];  // [bp-0x48]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    strcpy(v2, "SigEd448");
    if (a4 > 0xff)
    {
        v6 = 0;
    }
    else
    {
        v0 = a2 != 0;
        v1 = a4;
        v6 = sub_a40ca8();
        if (v6)
        {
            v7 = v6;
            if (sub_a3fe04(a1, v7, 0) && sub_a3fe10(a1, v2, 8) && sub_a3fe10(a1, &v0, 2))
            {
                if (!sub_a3fe10(a1, a3, a4))
                    v6 = 0;
                else
                    v6 = 0xffffffff;
            }
            else
            {
                v6 = 0;
            }
            sub_a3f52c(v7);
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return v6;
    ___stack_chk_fail();
}
