/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb04210..0xb0430c (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b04210(long long *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v2;  // x21
    long long v3;  // x19
    long long v4;  // x23
    long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2 >> 1;
    v3 = a0[14];
    sub_a4bbe4(a0[12]);
    sub_a4bbe4(a0[11]);
    a0[11] = 0;
    a0[12] = 0;
    switch (v2)
    {
    case 16:
        v4 = "AES-128-CTR";
        break;
    case 32:
        v4 = "AES-256-CTR";
        break;
    case 24:
        v4 = "AES-192-CTR";
        break;
    default:
        return 0;
    }
    a0[12] = sub_a4e104(v3);
    v5 = sub_a4e104(v3, v4, 0);
    a0[11] = v5;
    if (!a0[12])
    {
        return 0;
    }
    else if (!v5)
    {
        return 0;
    }
}
