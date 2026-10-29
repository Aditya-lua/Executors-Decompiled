/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e6fac..0x9e70f4 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char sub_9e6fac(char *a0, long long a1, long long a2, long long a3)
{
    char idx;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a7c17c(a1))
        return 0;
    sub_a7c1b4(a1);
    if (*(long long *)a0)
        return *(long long *)a0;
    idx = sub_a6bf4c(104, "crypto/bn/bn_mont.c", 231);
    if (!idx)
        return idx;
    *(unsigned int *)idx = 0;
    sub_991a38(idx + 8);
    sub_991a38(idx + 32);
    sub_991a38(idx + 56);
    *(unsigned long long *)(idx + 80) = 0;
    *(unsigned long long *)(idx + 88) = 0;
    *(unsigned int *)(idx + 96) = 1;
    if (sub_9e6cc0(idx, a2, a3) && sub_a7c198(a1))
    {
        if (*(long long *)a0)
        {
            sub_9e4838(idx + 8);
            sub_9e4838(idx + 32);
            sub_9e4838(idx + 56);
            if (*(char *)(idx + 96) & 1)
                sub_a6c2e4(idx, "crypto/bn/bn_mont.c", 0x101);
            idx = *(long long *)a0;
        }
        else
        {
            *(unsigned long long *)a0 = idx;
        }
        sub_a7c1b4(a1);
        return idx;
    }
    sub_9e4838(idx + 8);
    sub_9e4838(idx + 32);
    sub_9e4838(idx + 56);
    if (*(char *)(idx + 96) & 1)
        sub_a6c2e4(idx, "crypto/bn/bn_mont.c", 0x101);
    return 0;
}
