/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad979c..0xad97ec (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad979c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    long long field_10;
} st_ad979c_0;


st_ad979c_0 * sub_ad979c(void)
{
    st_ad979c_0 *v2;  // x0
    st_ad979c_0 *v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c();
    if (!v2)
        return 0;
    v3 = v2;
    sub_ad9384(v2->field_10);
    sub_ad93b4(v3->field_10);
    return v3->field_0 - v3->field_8;
}
