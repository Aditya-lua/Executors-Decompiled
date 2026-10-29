/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc350a4..0xc35180 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c350a4_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    long long field_18;
} st_c350a4_0;


unsigned long long sub_c350a4(st_c350a4_0 *a0)
{
    unsigned long long v2;  // x20
    unsigned long v3;  // x23
    unsigned long long v4;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_c3527c(a0->field_18);
    _free(a0->field_18);
    v2 = a0->field_8;
    v3 = a0->field_10 + 1;
    while (1)
    {
        v4 = v3 - 1;
        if (v3 == 1)
            break;
        v2 += 64;
        sub_c2636c();
        v3 = v4;
    }
    if (!a0->field_0)
        return v2;
    return _free();
}
