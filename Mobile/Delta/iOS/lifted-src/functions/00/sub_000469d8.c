/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x469d8..0x46a30 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_469d8_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_469d8_0;


st_469d8_0 * sub_469d8(st_469d8_0 *a0, unsigned long i)
{
    unsigned long v6;  // x8
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    st_469d8_0 *v10;  // x0
    unsigned long v0;  // [bp-0x28]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    v6 = a0->field_10;
    if (a0->field_10 == i)
        return a0;
    v1 = v7;
    v2 = v8;
    v3 = &v5;
    v4 = v9;
    do
    {
        a0->field_10 = v6 - 48;
        v0 = v6 - 24;
        v10 = sub_10344(&v0);
        v6 = a0->field_10;
    } while (a0->field_10 != i);
    return v10;
}
