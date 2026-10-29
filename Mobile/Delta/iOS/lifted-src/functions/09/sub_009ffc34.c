/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ffc34..0x9ffc68 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ffc34_0 {
    char padding_0[8];
    long long field_8;
} st_9ffc34_0;


int sub_9ffc34(st_9ffc34_0 *a0)
{
    unsigned long long v3;  // x30
    unsigned int v4;  // w0
    unsigned long long v5;  // 4129
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0->field_8)
        return -0x1;
    v0 = &v2;
    v1 = v3;
    v4 = sub_9e46a8(a0->field_8);
    v5 = arm64g_calculate_condition(177, v4, 7, 0);
    return (int)((v5 & 1 ? v4 + 14 : v4 + 7)) >> 3;
}
