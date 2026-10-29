/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0c918..0xb0c984 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0c918_0 {
    char padding_0[240];
    char field_f0;
} st_b0c918_0;


unsigned long long sub_b0c918(st_b0c918_0 *a0, long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned int v4;  // w21
    char *v5;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_b0c6ec(a0, a1);
    if (!(unsigned int)v3)
        return v3;
    v4 = a0->field_f0;
    v5 = &a0->field_f0;
    sub_b0c984(v5);
    if (!v4)
        return sub_b0ca28(a0, v5) != 0;
    *v5 = v4;
    return sub_b0ca28(a0, v5) != 0;
}
