/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbead18..0xbead78 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bead18_2 {
    char padding_0[8];
    struct st_bead18_0 *field_8;
} st_bead18_2;

typedef struct st_bead18_0 {
    char padding_0[24];
    struct st_bead18_1 *field_18;
} st_bead18_0;

typedef struct st_bead18_1 {
    unsigned long long field_0;
} st_bead18_1;


int sub_bead18(long long *a0, st_bead18_2 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_be7e80(*a0) & 1)
        return 1;
    a1->field_8->field_18();
}
