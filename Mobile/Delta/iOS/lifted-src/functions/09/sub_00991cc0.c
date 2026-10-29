/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991cc0..0x991cec (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_991cc0_0 {
    char padding_0[104];
    unsigned int field_68;
} st_991cc0_0;


unsigned int sub_991cc0(st_991cc0_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (0x4000 < a3)
    {
        v0 = &v2;
        v1 = v3;
        sub_c64ab4();
        return 0xffffffff;
    }
    a0->field_68 = 1;
}
