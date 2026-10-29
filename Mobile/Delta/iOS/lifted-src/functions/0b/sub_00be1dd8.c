/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe1dd8..0xbe1e70 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_be1dd8(unsigned long long *a0, unsigned long long *a1, unsigned long long a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // x19
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a2)
        return 1;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    while (1)
    {
        v12 = a2;
        if (*a0 == 12)
        {
            if (*a1 != 12)
                break;
        }
        else
        {
            if (*a1 == 12 || !(sub_be18b4(a0, a1) & 1))
                break;
        }
        if (!(sub_be18b4(a0 + 8, a1 + 8) & 1))
            break;
        a1 += 16;
        a0 += 16;
        a2 = v12 - 1;
        if (v12 == 1)
            return 1;
    }
    return 0;
}
