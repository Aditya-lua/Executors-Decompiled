/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97e438..0x97e490 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97e438_0 {
    char padding_0[160];
    long long field_a0;
    char padding_a8[168];
    unsigned short field_150;
} st_97e438_0;


unsigned long long sub_97e438(st_97e438_0 *a0, unsigned short a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_150 >> 5 & 1)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (sub_977368(a0->field_a0))
        return 0;
    if (!a1)
        return 1;
    v8 = sub_97733c(a0->field_a0);
    if (!(unsigned int)v8)
        return v8;
    return 1;
}
