/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd954c..0xbd95b0 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd954c_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
} st_bd954c_0;


st_bd954c_0 * sub_bd954c(st_bd954c_0 *a0)
{
    st_bd954c_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0 == 0x8000000000000000)
        return a0;
    v2 = sub_b9f1a4(a0->field_8, a0->field_10);
    if (!a0->field_0)
        return v2;
    return _free();
}
