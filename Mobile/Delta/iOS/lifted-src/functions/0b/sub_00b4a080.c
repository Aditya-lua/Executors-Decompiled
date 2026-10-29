/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4a080..0xb4a0e8 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4a080_0 {
    long long field_0;
    char padding_8[232];
    unsigned long long field_f0;
} st_b4a080_0;


unsigned long long sub_b4a080(st_b4a080_0 *a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0)
    {
        v2 = sub_a7c198(a0->field_0);
        if (!(unsigned int)v2)
            return v2;
    }
    sub_a66ec0(a0->field_f0 + 40, 64);
    sub_a66ec0(a0->field_f0 + 104, 64);
    v3 = sub_b46508(a0);
    if (!a0->field_0)
        return v3;
    sub_a7c1b4(a0->field_0);
    return v3;
}
