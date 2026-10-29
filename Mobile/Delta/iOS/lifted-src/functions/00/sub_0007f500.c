/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7f500..0x7f54c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_7f500(unsigned long a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // 4106
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_7df74();
    if (!a1)
        return 0;
    v3 = arm64g_calculate_condition(130, v2, 120, 0);
    if (v3 & 1)
        return 0;
}
