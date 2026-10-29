/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x955ddc..0x955e34 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_955ddc_0 {
    char padding_0[24];
    unsigned int field_18;
} st_955ddc_0;


unsigned long long sub_955ddc(st_955ddc_0 *a0, long long a1, long long *a2)
{
    unsigned long v2;  // x9
    long long v3;  // x20
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_18;
    if ((char)(v2 >> 24) == 3)
    {
        v3 = 2;
        v4 = sub_c68d5c(a1, v2 & 0xffff, 2);
        if (!(unsigned int)v4)
            return v4;
    }
    else
    {
        v3 = 0;
    }
    *a2 = v3;
    return 1;
}
