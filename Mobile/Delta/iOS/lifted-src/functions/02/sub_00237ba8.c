/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x237ba8..0x237bec (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_237ba8_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_237ba8_0;


st_237ba8_0 * sub_237ba8(st_237ba8_0 *a0, unsigned long i)
{
    unsigned long v5;  // x8
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long v9;  // x0
    st_237ba8_0 *v10;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = a0->field_10;
    if (a0->field_10 == i)
        return a0;
    v0 = v6;
    v1 = v7;
    v2 = &v4;
    v3 = v8;
    do
    {
        v9 = v5 - 32;
        a0->field_10 = v9;
        v10 = sub_168634(v9);
        v5 = a0->field_10;
    } while (a0->field_10 != i);
    return v10;
}
