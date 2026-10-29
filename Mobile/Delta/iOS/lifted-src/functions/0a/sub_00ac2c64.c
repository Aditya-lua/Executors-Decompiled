/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2c64..0xac2c78 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2c64_0 {
    char padding_0[16];
    unsigned int field_10;
    unsigned long long field_14;
    unsigned int field_1c;
} st_ac2c64_0;


st_ac2c64_0 * sub_ac2c64(st_ac2c64_0 *a0, unsigned long a1)
{
    a0->field_10 = (((((a1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((a1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    *(unsigned long long *)&(&a0->field_10)[1] = 0;
    *(unsigned int *)((char *)&a0->field_14 + 4) = 0;
    return a0;
}
