/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0aa1c..0xa0ab18 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a0aa1c(long long a0, unsigned long a1, unsigned long long a2, unsigned long long a3, long long a4, unsigned long long a5)
{
    unsigned long long v6;  // x0
    char v0;  // [bp-0x72]
    char v1;  // [bp-0x71]
    char v2[40];  // [bp-0x70]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    strcpy(v2, "SigEd25519 no Ed25519 collisions");
    v6 = sub_a3fe04();
    if ((unsigned int)v6)
    {
        if (!a2)
        {
            v6 = 1;
        }
        else if (a5 > 0xff)
        {
            v6 = 0;
        }
        else
        {
            v0 = a3 != 0;
            v1 = a5;
            v6 = sub_a3fe10(a0, v2, 32);
            if ((unsigned int)v6)
            {
                v6 = sub_a3fe10(a0, &v0, 2);
                if ((unsigned int)v6)
                    v6 = sub_a3fe10(a0, a4, a5) != 0;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return v6;
    ___stack_chk_fail();
}
