/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb06aa4..0xb06ad0 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b06aa4_0 {
    char padding_0[176];
    unsigned long long field_b0;
} st_b06aa4_0;


void sub_b06aa4(st_b06aa4_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    _memcpy();
    a0->field_b0 = &a0[1].padding_0[8];
    return;
}
