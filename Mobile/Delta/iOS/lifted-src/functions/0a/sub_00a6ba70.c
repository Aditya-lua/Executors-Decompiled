/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6ba70..0xa6bab4 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f08ff0;

void sub_a6ba70(unsigned long a0)
{
    unsigned long long v5;  // 4110
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = arm64g_calculate_condition(2, g_f08ff0, 1, 0);
    if (v5 & 1)
        return;
    v0 = v6;
    v1 = v7;
    v2 = &v4;
    v3 = v8;
    sub_a7bbe0(&g_f08ff0);
}
