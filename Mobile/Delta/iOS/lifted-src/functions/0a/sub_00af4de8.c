/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf4de8..0xaf4e7c (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af4de8_0 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[8];
    char field_10;
} st_af4de8_0;


long long sub_af4de8(st_af4de8_0 *a0, long long a1)
{
    long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    _time(&v0);
    if (a0 && !(a0->field_10 >> 6 & 1))
    {
        if (a0->field_4 == 24)
        {
            return sub_9c0e70(a0, v0, 0, a1);
        }
        else if (a0->field_4 == 23)
        {
            return sub_9c556c(a0, v0, 0, a1);
        }
    }
    return sub_9c4f78(a0, v0, 0, a1);
}
