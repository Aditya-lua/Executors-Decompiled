/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989da0..0x989df8 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989da0_0 {
    char padding_0[112];
    long long field_70;
    char padding_78[136];
    unsigned long long field_100;
} st_989da0_0;

typedef struct st_989da0_1 {
    char padding_0[88];
    unsigned long long field_58;
} st_989da0_1;


st_989da0_0 * sub_989da0(st_989da0_0 *a0, st_989da0_1 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_989da0_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if ((a0->field_100 & 0xfe00) != 0x200)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_989088(a0->field_70);
    if ((unsigned int)v8 || a0->field_100 >> 39 & 1)
        return v8;
    a0->field_100 = a0->field_100 | 0x8000000000;
    a1->field_58 = a1->field_58 + 1;
    return v8;
}
