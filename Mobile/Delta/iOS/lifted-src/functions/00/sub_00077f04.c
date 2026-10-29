/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x77f04..0x77f20 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_77f04_0 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned int field_4;
} st_77f04_0;


int sub_77f04(st_77f04_0 *a0, unsigned int a1)
{
    a0->field_0 = 0;
    a0->field_2 = a1;
    a0->field_4 = 0;
    *(unsigned long long *)&a0[1 + a1] = 0;
    return 0;
}
