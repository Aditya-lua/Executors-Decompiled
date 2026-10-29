/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x986278..0x9862fc (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_986278(long long a0, unsigned long long *a1, long long a2)
{
    unsigned long v6;  // x22
    char v0;  // [bp-0x50]
    unsigned long v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = 0;
    v6 = 0;
    if (sub_987f90())
    {
        do
        {
            v6 = v2 + v6 - v1;
        } while (sub_987f90(a0, &v3, &v1, &v0, a2));
    }
    *a1 = v6;
    return 1;
}
