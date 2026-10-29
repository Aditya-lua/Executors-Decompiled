/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b5580..0x1b5648 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_1b5580(long long a0, long long a1, long long a2, long long a3)
{
    long long v6;  // x0
    long long v7;  // x0
    char v0;  // [bp-0x60]
    unsigned short v1;  // [bp-0x44]
    char v2;  // [bp-0x42]
    char v3;  // [bp-0x41]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = 23854;
    v3 = 0;
    v6 = sub_1a5708(a1, a2, &v1, &v2, &v0, &v3, &v3);
    if (v6 != a2)
    {
        sub_1c5f48(a0, a1, v6, 0);
        sub_5ccc(a3, &v0);
        v7 = sub_6b08(a3);
        if (2 > (unsigned long long)(v7 - 1))
            return v6 + 2;
    }
    else
    {
        v7 = sub_1a8238();
    }
    sub_1b4c90(v7);
}
