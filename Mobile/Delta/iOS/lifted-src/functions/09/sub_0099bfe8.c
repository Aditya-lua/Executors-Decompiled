/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99bfe8..0x99bffc (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99bfe8_0 {
    char padding_0[120];
    unsigned int field_78;
    char padding_7c[2844];
    unsigned long long field_b98;
} st_99bfe8_0;


int sub_99bfe8(st_99bfe8_0 *a0)
{
    if (a0->field_78)
        a0->field_b98 = 0;
    return 1;
}
