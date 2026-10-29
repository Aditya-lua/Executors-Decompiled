/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd989c..0xbd98f0 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd989c_0 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    long long field_20;
    char padding_28[16];
    unsigned long long field_38;
} st_bd989c_0;


st_bd989c_0 * sub_bd989c(st_bd989c_0 *a0)
{
    st_bd989c_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (v2->field_0)
        v2 = _free(a0->field_8);
    if (a0->field_18)
        v2 = _free(a0->field_20);
    if (!a0->field_38)
        return v2;
    return _free();
}
