/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6bab4..0xa6bb24 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f08ff0;

void sub_a6bab4(void)
{
    unsigned long long v5;  // 4110
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    long long v9;  // x20
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
    v9 = sub_a7bbe0(&g_f08ff0);
    sub_a7bbe8(&g_f08ff0, 0);
    sub_a6bb24(0, v9);
    sub_a6bc24(v9);
}
