/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfa9cc..0xbfaa34 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfa9cc_0 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
    long long field_18;
} st_bfa9cc_0;


unsigned long long sub_bfa9cc(st_bfa9cc_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_c00070(a0->field_10, a0->field_18);
    if (!a0->field_8)
        return v2;
    return _free();
}
