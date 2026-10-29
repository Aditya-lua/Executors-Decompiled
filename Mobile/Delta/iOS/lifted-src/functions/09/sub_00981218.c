/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x981218..0x981228 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_981218_0 {
    char padding_0[154];
    unsigned short field_9a;
} st_981218_0;


unsigned int sub_981218(st_981218_0 *a0)
{
    return 1 & ~a0->field_9a;
}
