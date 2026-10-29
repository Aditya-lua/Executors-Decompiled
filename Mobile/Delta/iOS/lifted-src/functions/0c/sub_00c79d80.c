/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc79d80..0xc79e14 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c79d80_0 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c79d80_0;


unsigned long long sub_c79d80(st_c79d80_0 *a0, long long a1, long long a2)
{
    long long v2;  // x8
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if ((unsigned long long)a2 > a0->field_0 - a0->field_10)
    {
        v3 = sub_c5f940(a0);
        if (v3)
            return v3;
        v2 = a0->field_0;
    }
    if ((unsigned long long)v2 <= (unsigned long long)a2)
    {
        *(char *)&a0->field_18 = 1;
        v4 = sub_c5fafc(a1, a2);
        *(char *)&a0->field_18 = 0;
        return v4;
    }
    _memcpy(a0->field_8 + a0->field_10);
    a0->field_10 = a0->field_10 + a2;
    return 0;
}
