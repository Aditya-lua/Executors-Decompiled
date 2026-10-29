/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x404bdc..0x404c00 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_404bdc_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_404bdc_0;


double sub_404bdc(st_404bdc_0 *ptr, st_404bdc_0 *ptr1)
{
    uint128_t v0;  // q0

    memset(ptr, 0, 24);
    v0 = ptr1->field_0;
    ptr->field_0 = v0;
    ptr->field_10 = ptr1->field_10;
    memset(ptr1, 0, 24);
    return (unsigned long long)v0;
}
