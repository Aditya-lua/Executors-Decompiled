/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x987bac..0x987bc8 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_987bac_0 {
    char padding_0[256];
    char field_100;
} st_987bac_0;


void sub_987bac(st_987bac_0 *a0, unsigned long a1)
{
    if (!(a0->field_100 >> 1 & 1))
        return;
}
