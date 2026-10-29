/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa18eec..0xa18f5c (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a18eec_0 {
    char padding_0[24];
    long long field_18;
    long long field_20;
    long long field_28;
    char padding_30[32];
    long long field_50;
    char padding_58[8];
    unsigned long long field_60;
} st_a18eec_0;


unsigned long long sub_a18eec(st_a18eec_0 *a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x20
    unsigned long long v4;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9dddcc(a0->field_50);
    if (!v2)
        return v2;
    v3 = v2;
    v4 = sub_a1b804(a0->field_18, a0->field_20, a0->field_28, 0, 0, v3);
    sub_9dded4(v3);
    if ((unsigned int)v4 != 1)
        return v4;
    a0->field_60 = a0->field_60 + 1;
    return v4;
}
