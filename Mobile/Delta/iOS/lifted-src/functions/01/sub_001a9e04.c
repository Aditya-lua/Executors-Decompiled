/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a9e04..0x1a9e40 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a9e04_0 {
    char padding_0[32];
    unsigned int field_20;
} st_1a9e04_0;


st_1a9e04_0 * sub_1a9e04(st_1a9e04_0 *a0, st_1a9e04_0 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0 == a1)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    a0->field_20 = a1->field_20;
    sub_1b1974();
    return a0;
}
