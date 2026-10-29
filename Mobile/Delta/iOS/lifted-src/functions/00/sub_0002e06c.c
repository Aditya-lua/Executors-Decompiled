/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2e06c..0x2e0c4 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2e06c_0 {
    long long field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_2e06c_0;


st_2e06c_0 * sub_2e06c(st_2e06c_0 *a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_2a0ec();
    v2 = a0->field_0;
    if (!v2)
        return a0;
    sub_4e14(v2, 7905747460161236407 * ((long long)(a0->field_18 - v2) >> 3), 8);
    return a0;
}
