/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb00aec..0xb00b9c (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f0d568;

int sub_b00aec(char *a0, long long a1, unsigned int a2)
{
    long long v2;  // x1
    unsigned long v3;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(g_f0d568 >> 2 & 1))
    {
        v2 = a2 * 8;
        v3 = a0 + 168;
        if (!(g_f0d568 & 1))
            sub_9b8880(a1, v2, v3);
        else
            sub_9bf0e0(a1, v2, v3);
    }
    else
    {
        sub_9b9440(a1, a2 * 8, a0 + 168);
    }
    sub_a93220(a0 + 80);
    *(unsigned long long *)&a0[0x88] = 0;
    *a0 = *a0 | 2;
    return 1;
}
