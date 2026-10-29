/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa558b4..0xa558e8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a558b4_0 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[24];
    long long field_20;
} st_a558b4_0;


st_a558b4_0 * sub_a558b4(st_a558b4_0 *a0, long long a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = &v2;
    v1 = v3;
    return sub_a4f0d8(a0->field_20, a0->field_4, 0, a1) != 0;
}
