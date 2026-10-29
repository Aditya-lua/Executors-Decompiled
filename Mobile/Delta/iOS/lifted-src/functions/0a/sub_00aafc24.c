/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaafc24..0xaafc34 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aafc24_1 {
    char padding_0[24];
    struct st_aafc24_0 *field_18;
} st_aafc24_1;

typedef struct st_aafc24_0 {
    char padding_0[72];
    unsigned int field_48;
} st_aafc24_0;


int sub_aafc24(st_aafc24_1 *a0)
{
    if (a0)
        a0 = a0->field_18->field_48;
    return (unsigned int)a0;
}
