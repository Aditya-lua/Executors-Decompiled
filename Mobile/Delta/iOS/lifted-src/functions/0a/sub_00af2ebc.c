/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf2ebc..0xaf2f6c (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_af2ebc(long long a0, unsigned int a1, unsigned long a2)
{
    unsigned long long *v9;  // x8
    long long v10;  // x0
    unsigned long long v11;  // 4112
    long long v12;  // x0
    unsigned int v0;  // [bp-0x2b0]
    char *v1;  // [bp-0x2a8]
    char v2;  // [bp-0x2a0]
    char v3;  // [bp-0x288]
    char v4;  // [bp-0x1a8]
    char v5;  // [bp-0x160]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v0 = a1;
    if (a1 != 1)
    {
        if (a1 != 2)
            goto LABEL_af2f3c;
        v1 = &v2;
        v9 = &v3;
    }
    else
    {
        v1 = &v4;
        v9 = &v5;
    }
    *v9 = a2;
    v10 = sub_ad6894(a0, &v0, 0);
    v11 = arm64g_calculate_condition(1, v10 & 0xffffffff, 1, 0);
    if (!(v11 & 1))
    {
        v12 = sub_ad69f8(a0, v10);
    }
    else
    {
LABEL_af2f3c:
        v12 = 0;
    }
    if (*(long long *)&g_10002b0 == v6)
        return v12;
    ___stack_chk_fail();
}
