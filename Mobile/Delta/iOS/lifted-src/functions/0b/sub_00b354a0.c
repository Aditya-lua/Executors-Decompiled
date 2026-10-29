/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb354a0..0xb35518 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b354a0_0 {
    char padding_0[36];
    unsigned int field_24;
} st_b354a0_0;


unsigned long long sub_b354a0(st_b354a0_0 *a0, long long a1, unsigned long a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_b35a4c(a1, 1);
    if (!(unsigned int)v3)
        return v3;
    v4 = sub_b35b54(a0, a1);
    if ((int)v4 < 1)
        return v4;
    a0->field_24 = 0x2000;
}
