/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2c90..0xac2c9c (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2c90_0 {
    char padding_0[24];
    unsigned int field_18;
} st_ac2c90_0;


st_ac2c90_0 * sub_ac2c90(st_ac2c90_0 *a0, unsigned long a1)
{
    a0->field_18 = (((((a1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((a1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    return a0;
}
