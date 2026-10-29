/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5cfc8..0xc5cffc (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5cfc8_0 {
    unsigned long long field_0;
    long long field_8;
} st_c5cfc8_0;


void sub_c5cfc8(st_c5cfc8_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    if (a0->field_0)
    {
        v0 = &v1;
        _free(a0->field_8);
    }
    _free();
    return;
}
