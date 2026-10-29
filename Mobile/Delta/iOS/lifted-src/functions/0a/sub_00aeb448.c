/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeb448..0xaeb46c (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aeb448_0 {
    char padding_0[232];
    unsigned int field_e8;
} st_aeb448_0;


int sub_aeb448(st_aeb448_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_aea7f4();
    return a0->field_e8;
}
