/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa44250..0xa44310 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a44250(long long a0, long long a1, unsigned long a2, unsigned int a3)
{
    unsigned int v2;  // w0
    long long v3;  // x20
    unsigned long long v4;  // 4118
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a4fdf4(sub_a2d030());
    v3 = sub_a50904(a0) * 8;
    sub_9ffdd8(a0);
    if (!a3 && !(v4 = arm64g_calculate_condition(145, v2 - 3, 3, 0), v4 & 1))
    {
        if (!(sub_9c0050(a1, v3) >> 31 & 1))
            return 1;
    }
    else
    {
        if (!(sub_9bf864(a1, v3) >> 31 & 1))
            return 1;
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/e_aria.c", 76, "aria_init_key");
    sub_a36abc(6, 176, 0);
    return 0;
}
