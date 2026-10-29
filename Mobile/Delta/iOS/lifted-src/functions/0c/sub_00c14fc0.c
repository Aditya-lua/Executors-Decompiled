/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc14fc0..0xc14ff4 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c14fc0_0 {
    long long field_0;
    unsigned long long field_8;
} st_c14fc0_0;


void sub_c14fc0(st_c14fc0_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    if (a0->field_8)
    {
        v0 = &v1;
        _free(a0->field_0);
    }
    _free();
    return;
}
