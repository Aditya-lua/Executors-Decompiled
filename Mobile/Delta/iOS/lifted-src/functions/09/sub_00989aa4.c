/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989aa4..0x989af4 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989aa4_0 {
    char padding_0[120];
    long long field_78;
    char padding_80[128];
    unsigned long long field_100;
} st_989aa4_0;


long long sub_989aa4(unsigned long a0, st_989aa4_0 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if ((a1->field_100 & 0xff0000) != 0x30000)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    a1->field_100 = a1->field_100 & 0xffffffffff00ffff | 0x40000;
    sub_9860e8(a1->field_78);
    a1->field_78 = 0;
    return 1;
}
