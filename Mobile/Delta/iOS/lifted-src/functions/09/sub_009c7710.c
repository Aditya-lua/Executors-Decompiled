/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c7710..0x9c7770 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c7710_0 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[8];
    unsigned long long field_10;
} st_9c7710_0;


st_9c7710_0 * sub_9c7710(st_9c7710_0 *a0, st_9c7710_0 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_9c7710_0 *v8;  // w0
    unsigned long long v9;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    a0->field_4 = a1->field_4;
    v8 = (st_9c7710_0 *)(unsigned int)sub_9c7770();
    if (!v8)
        return v8;
    v9 = a0->field_10 & 128;
    a0->field_10 = v9;
    a0->field_10 = a1->field_10 & 0xffffffffffffff7f | v9;
    return 1;
}
