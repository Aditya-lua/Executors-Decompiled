/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae4454..0xae44a8 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae4454_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
} st_ae4454_0;


long long sub_ae4454(unsigned long a0, st_ae4454_0 *a1, unsigned long a2)
{
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a2;
    sub_aef208("authority", a1->field_0, &v0);
    sub_aef608("pathlen", a1->field_8, &v0);
    return v0;
}
