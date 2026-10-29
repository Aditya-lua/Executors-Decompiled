/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb53ae8..0xb53b8c (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b53ae8(long long *a0, long long a1, unsigned long long *a2, unsigned long a3, long long a4, long long a5)
{
    unsigned long v3;  // x8
    char v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a16b20(a0[2]);
    if (a1)
    {
        if (a3 >= v3 && (!a0[45] || a0[45] == a5) && (int)sub_ac8c70(a4, a5, a1, &v0, a0[2]) >= 1)
            v3 = v0;
        else
            return 0;
    }
    *a2 = v3;
    return 1;
}
