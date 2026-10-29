/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97b310..0x97b358 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97b310_0 {
    long long field_0;
    char padding_8[8];
    unsigned long long field_10;
} st_97b310_0;


st_97b310_0 * sub_97b310(st_97b310_0 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_97b310_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    a0->field_0 = a1;
    if (!a1)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_9d46fc(a1, 41, 0, 0);
    if ((unsigned int)v8 < 1200)
        return v8;
    a0->field_10 = v8 & 0xffffffff;
    return v8;
}
