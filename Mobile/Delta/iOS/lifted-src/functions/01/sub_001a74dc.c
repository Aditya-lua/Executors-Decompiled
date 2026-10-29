/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a74dc..0x1a75c4 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a74dc_0 {
    char padding_0[28];
    unsigned int field_1c;
} st_1a74dc_0;


long long sub_1a74dc(st_1a74dc_0 *a0, long long a1, long long a2)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x23
    long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_1c1e04();
    if (v2 != a1)
        return v2;
    v3 = sub_1be8a0(a0, v2, a2);
    if (v3 != a1)
    {
        sub_1ae56c(a0);
        v4 = sub_1d324c(a0, v3, a2);
        v5 = sub_1a84ec(a0, v4, a2);
        if (v5 != v4)
        {
            sub_1a2804(a0, a0->field_1c);
            return v5;
        }
        sub_1be924();
    }
}
