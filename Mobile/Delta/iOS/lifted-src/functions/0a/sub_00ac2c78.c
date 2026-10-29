/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2c78..0xac2c84 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2c78_0 {
    char padding_0[20];
    unsigned int field_14;
} st_ac2c78_0;


st_ac2c78_0 * sub_ac2c78(st_ac2c78_0 *a0, unsigned long a1)
{
    a0->field_14 = (((((a1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((a1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    return a0;
}
