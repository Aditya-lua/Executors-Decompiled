/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1ee54..0xa1eee4 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a1ee54(unsigned long a0, long long a1, long long a2, long long a3, long long *a4, long long a5, long long a6, long long a7)
{
    long long v3;  // x0
    long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a3;
    if (a3 || a5 && a6)
    {
        v3 = sub_a1ffd8(a1, a2, a5, a6, a7);
        if (!v3)
        {
            *(unsigned int *)a4 = 0;
            return v3;
        }
        *(unsigned int *)a4 = sub_a03638();
        sub_a16990(v3);
    }
    else
    {
        *(unsigned int *)a4 = sub_a16b20(a7);
    }
    return 1;
}
