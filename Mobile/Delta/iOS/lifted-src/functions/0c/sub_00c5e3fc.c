/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5e3fc..0xc5e4dc (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_efd4e0;

unsigned long long sub_c5e3fc(unsigned long a0, unsigned long a1, unsigned long long i)
{
    unsigned long long count;  // x0
    unsigned long long v5;  // 4106
    unsigned long long v6;  // x8
    unsigned long v7;  // x9
    unsigned long long v0;  // [bp-0x60]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!i)
        return 0;
    do
    {
        count = _write();
        v5 = arm64g_calculate_condition(2, count, 1, 0);
        if (v5 & 1)
        {
            v7 = *(int *)___error();
            v0 = 1;
            v1 = 2 | v7 * 0x100000000;
            if ((unsigned int)v7 != 4)
                return 2 | v7 * 0x100000000;
            sub_c40ff0(&v1);
        }
        else if (count)
        {
            v6 = i - count;
            if (i < count)
                sub_c73bb0();
            i = v6;
        }
        else
        {
            return &g_efd4e0;
        }
    } while (i);
    return 0;
}
