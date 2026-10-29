/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x984a84..0x984b64 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_984a84(unsigned long a0, unsigned int a1, unsigned long a2, long long a3, long long a4)
{
    long long v6;  // x20
    unsigned long v7;  // x0
    unsigned long n;  // [bp-0x48]
    unsigned long v1;  // [bp-0x40]
    char v2;  // [bp-0x38]
    unsigned long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (4 > a1 && !(n = 16, v1 = 0, !a0 || 1 < a2 || a1 != 3 && a2))
    {
        v6 = a0 + a1 * 208;
        v7 = sub_984d38(v6, a3, a4, &v1, &v2, &n);
        if ((unsigned int)v7)
        {
            *(unsigned long *)(v6 + a2 * 8 + 48) = v1;
            _memcpy(v6 + a2 * 16 + 106, &v2, n);
            sub_a66ec0(&v2, 16);
            v7 = 1;
        }
    }
    else
    {
        sub_c625b8();
        v7 = 0;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v7;
    ___stack_chk_fail();
}
