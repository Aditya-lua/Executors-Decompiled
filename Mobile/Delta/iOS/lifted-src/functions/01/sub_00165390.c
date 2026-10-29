/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x165390..0x1653d4 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_165390_0 {
    long long field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_165390_0;


st_165390_0 * sub_165390(st_165390_0 *a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_16526c();
    v2 = a0->field_0;
    if (!v2)
        return a0;
    sub_4e14(v2, (long long)(a0->field_18 - v2) >> 3, 8);
    return a0;
}
