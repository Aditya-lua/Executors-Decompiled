/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e70f4..0x9e7168 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e70f4_0 {
    unsigned int field_0;
    char padding_4[4];
    char field_8;
    char padding_9[23];
    char field_20;
    char padding_21[47];
    unsigned long long field_50;
    unsigned long long field_58;
} st_9e70f4_0;


unsigned long long sub_9e70f4(st_9e70f4_0 *a0, unsigned long a1, unsigned int a2, long long a3, long long a4, unsigned int a5, unsigned long a6)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e4c34(&a0->field_20);
    if (!v2)
        return v2;
    v3 = sub_9e4db0(a3, a4, &a0->field_8);
    if (!v3)
        return v3;
    a0->field_0 = a2;
    a0->field_50 = a5 | a6 * 0x100000000;
    a0->field_58 = 0;
    return 1;
}
