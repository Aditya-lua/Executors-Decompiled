/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x981378..0x981384 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_981378_0 {
    char padding_0[154];
    unsigned short field_9a;
} st_981378_0;


unsigned int sub_981378(st_981378_0 *a0)
{
    return __ROL__(a0->field_9a, 26) & 4227858433 & 1;
}
