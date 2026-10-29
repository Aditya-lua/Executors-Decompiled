/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x962ee4..0x962ef0 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_962ee4_0 {
    char padding_0[152];
    unsigned int field_98;
} st_962ee4_0;

typedef struct st_962ee4_1 {
    char padding_0[344];
    struct st_962ee4_0 *field_158;
} st_962ee4_1;


int sub_962ee4(st_962ee4_1 *a0)
{
    return a0->field_158->field_98;
}
