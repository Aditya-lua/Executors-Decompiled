/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac6da0..0xac6e70 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ac6da0(unsigned long a0, long long a1, long long a2, unsigned long long *a3)
{
    unsigned int v2;  // w0
    unsigned long long v3;  // 4132
    unsigned long v4;  // x8
    unsigned long long v5;  // x23
    unsigned long long v6;  // x0
    unsigned int v7;  // w0
    unsigned int v8;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_975ffc(sub_9ffdd0()))
    {
        v2 = sub_9e46a8();
        v3 = arm64g_calculate_condition(177, v2, 7, 0);
        v4 = (v3 & 1 ? v2 + 14 : v2 + 7);
        v5 = (long long)(v4 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v4, 61) & 0xe00000001fffffff & 0x1fffffff;
    }
    else
    {
        v5 = 0;
    }
    v6 = sub_a50ac8(a1);
    if (!v5)
    {
        return 0;
    }
    else if ((int)v6 >= 1)
    {
        v7 = sub_9c7680(0, (unsigned int)v5 + 1, 2);
        v8 = sub_9c7680(0, v6, 4);
        *a3 = sub_9c7680(1, v8 + v7 * 2 + sub_9c7680(0, a2, 4), 16);
        return 1;
    }
    else
    {
        return 0;
    }
}
