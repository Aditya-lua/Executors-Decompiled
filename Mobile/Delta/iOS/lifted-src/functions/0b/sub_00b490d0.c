/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb490d0..0xb49144 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b490d0_0 {
    long long field_0;
    char padding_8[232];
    unsigned long long field_f0;
} st_b490d0_0;


unsigned long long sub_b490d0(st_b490d0_0 *a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x20
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0)
    {
        v2 = sub_a7c198(a0->field_0);
        if (!(unsigned int)v2)
            return v2;
    }
    v3 = a0->field_f0;
    sub_a66ec0(v3 + 40, 111);
    sub_a66ec0(v3 + 151, 111);
    sub_a66ec0(v3 + 262, 111);
    v4 = sub_b46508(a0);
    if (!a0->field_0)
        return v4;
    sub_a7c1b4(a0->field_0);
    return v4;
}
