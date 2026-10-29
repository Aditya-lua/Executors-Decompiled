/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2dd98..0xb2df04 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_b2dd98(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7, char a8, long long a9, long long a10)
{
    long long v5;  // x0
    char v0;  // [bp-0x8a8]
    long long v1;  // [bp-0x870]
    char v2;  // [bp-0x868]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]

    v4 = &a8;
    v3 = *(long long *)&g_10002b0;
    if (sub_c68800(&v0, &v2, 0x800, 0) && sub_c68d5c(&v0, a10, 2) && sub_c6876c(&v0, 1) && sub_a6ebd4(&v0, a3, a4) && sub_a6ebd4(&v0, a5, a6) && sub_a6e970(&v0))
    {
        if (!sub_a6ec4c() || !sub_c68eb8(&v0, &v1) || !sub_a6eaf8(&v0))
            goto LABEL_b2debc;
        v5 = sub_b2d890(a0, a1, a2, &v2, v1, a9, a10);
    }
    else
    {
LABEL_b2debc:
        sub_a6ed4c(&v0);
        v5 = 0;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v5;
    ___stack_chk_fail();
}
