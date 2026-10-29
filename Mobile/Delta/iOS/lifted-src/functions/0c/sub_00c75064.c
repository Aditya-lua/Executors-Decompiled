/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc75064..0xc750cc (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c75064_0 {
    unsigned long long field_0;
    long long field_8;
} st_c75064_0;


unsigned long long sub_c75064(st_c75064_0 *a0)
{
    unsigned long long v5;  // x8
    unsigned long long v6;  // x0
    unsigned long v0;  // [bp-0x38]
    long long v1;  // [bp-0x30]
    long long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a0->field_0 * 2;
    if (4 >= v5)
        v5 = 4;
    v6 = sub_c6c158();
    if (v0 != 1)
    {
        a0->field_0 = v5;
        a0->field_8 = v1;
        return v6;
    }
    sub_c6b970(v1, v2);
}
