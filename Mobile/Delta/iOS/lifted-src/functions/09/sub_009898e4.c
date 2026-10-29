/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9898e4..0x989934 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9898e4_0 {
    char padding_0[104];
    char field_68;
    char padding_69[7];
    long long field_70;
    char padding_78[137];
    char field_101;
} st_9898e4_0;


unsigned long long sub_9898e4(unsigned long a0, st_9898e4_0 *a1)
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

    if (a1->field_101 != 2)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_988ecc(a1->field_70, &a1->field_68);
    if (!(unsigned int)v8)
        return v8;
    a1->field_101 = 3;
    return 1;
}
