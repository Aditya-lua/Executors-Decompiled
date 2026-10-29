/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2ce4..0xac2cf0 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2ce4_0 {
    char padding_0[10];
    unsigned int field_a;
} st_ac2ce4_0;


st_ac2ce4_0 * sub_ac2ce4(st_ac2ce4_0 *a0, unsigned long a1)
{
    *(unsigned int *)&(a0->padding_0)[1] = (((((a1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((a1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    return a0;
}
