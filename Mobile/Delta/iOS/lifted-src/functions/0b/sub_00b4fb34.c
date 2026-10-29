/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4fb34..0xb4fba8 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4fb34_0 {
    long long field_0;
    char padding_8[8];
    char field_10;
    char padding_11[255];
    long long field_110;
    char padding_118[40];
    unsigned int field_140;
    char padding_144[276];
    unsigned int field_258;
} st_b4fb34_0;


unsigned long long sub_b4fb34(st_b4fb34_0 *a0, long long a1, long long a2, long long a3, long long a4)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    return sub_a82420(a0->field_0, a0->field_258, a3, a4, &a0->field_10, a0->field_110, a0->field_140, a1, a2);
}
