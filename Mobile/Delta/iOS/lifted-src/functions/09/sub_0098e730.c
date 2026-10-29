/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98e730..0x98e7b8 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98e730_0 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
    char padding_18[8];
    char field_20;
} st_98e730_0;


unsigned long long sub_98e730(long long a0, st_98e730_0 *a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6ed9c();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_a6ed9c(a0, a1->field_0);
    if (!(unsigned int)v3)
        return v3;
    if (a1->field_8)
    {
        v4 = sub_a6ed9c(a0);
        if (!(unsigned int)v4)
            return v4;
    }
    if (!(a1->field_20 & 1))
        return 1;
    v5 = sub_a6ed9c(a0, a1->field_10);
    if (!(unsigned int)v5)
        return v5;
    return 1;
}
