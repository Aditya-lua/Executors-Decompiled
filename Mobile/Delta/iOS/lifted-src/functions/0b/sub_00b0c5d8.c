/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0c5d8..0xb0c644 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0c5d8_0 {
    char padding_0[128];
    char field_80;
} st_b0c5d8_0;


unsigned long long sub_b0c5d8(st_b0c5d8_0 *a0, long long a1)
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
    v3 = sub_b0c370(a0, a1);
    if (!(unsigned int)v3)
        return v3;
    v4 = a0->field_80;
    v5 = &a0->field_80;
    sub_b0e784(v5);
    if (!v4)
        return sub_b0e808(a0, v5) != 0;
    *v5 = v4;
    return sub_b0e808(a0, v5) != 0;
}
