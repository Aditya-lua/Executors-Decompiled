/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa311a0..0xa311ec (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a311a0_0 {
    long long field_0;
    char field_8;
} st_a311a0_0;


unsigned long long sub_a311a0(unsigned long long a0, st_a311a0_0 *a1)
{
    unsigned long v2;  // x8
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    if (v2 & 1)
        return a0;
    a1->field_8 = (char)v2 | 1;
    v3 = sub_ad68a0(a1->field_0, a0);
    if ((int)v3 < 1)
        return v3;
    a1->field_8 = a1->field_8 & 254;
    return v3;
}
