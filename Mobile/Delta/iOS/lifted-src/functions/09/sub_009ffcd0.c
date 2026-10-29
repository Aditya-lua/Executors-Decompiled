/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ffcd0..0x9ffd38 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_9ffcd0(unsigned long long *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1 && !a0[1])
    {
        return 0;
    }
    else if (!a3 && !a0[3])
    {
        return 0;
    }
    else
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        sub_a60cac(a0 + 1);
        sub_9feb80(a0);
        a0[25] = a0[25] + 1;
        return 1;
    }
}
