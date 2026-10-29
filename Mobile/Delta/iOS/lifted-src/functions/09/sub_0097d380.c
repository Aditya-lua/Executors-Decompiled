/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97d380..0x97d3d0 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97d380_0 {
    char padding_0[88];
    long long field_58;
} st_97d380_0;


void sub_97d380(st_97d380_0 **a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    sub_97b8d8(*a0->field_58, 0);
    sub_97b868(*a0->field_58);
}
