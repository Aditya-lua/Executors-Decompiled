/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb612e0..0xb61358 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b612e0_0 {
    char padding_0[56];
    struct st_b612e0_1 *field_38;
} st_b612e0_0;

typedef struct st_b612e0_1 {
    char padding_0[60];
    unsigned int field_3c;
    unsigned int field_40;
    unsigned int field_44;
} st_b612e0_1;


unsigned int sub_b612e0(st_b612e0_0 *a0)
{
    unsigned int *v0;  // [bp-0x28]
    unsigned int v1;  // [bp-0x14]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!sub_b611f4(a0))
    {
        v0 = a0->field_38;
        v0[15] = 0;
        v0[16] = 0;
        v0[0x11] = 0;
        v1 = sub_b610bc(a0);
        return v1;
    }
    v1 = 0xfffffffe;
    return v1;
}
