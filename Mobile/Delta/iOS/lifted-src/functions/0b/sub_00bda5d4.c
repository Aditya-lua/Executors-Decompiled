/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbda5d4..0xbda618 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bda5d4_0 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_bda5d4_0;


st_bda5d4_0 * sub_bda5d4(st_bda5d4_0 *a0)
{
    st_bda5d4_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (v2->field_0)
        v2 = _free(a0->field_8);
    if (!a0->field_18)
        return v2;
    return _free();
}
