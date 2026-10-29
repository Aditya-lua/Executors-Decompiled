/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c29f0..0x9c2a14 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c29f0_0 {
    unsigned short field_0;
} st_9c29f0_0;


int sub_9c29f0(unsigned long a0, st_9c29f0_0 **a1)
{
    unsigned int v0;  // w9

    v0 = (((((a0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a0 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((a0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a0 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    *(unsigned short *)*a1 = v0 >> 16;
    *a1 = *a1 + 1;
    return 1;
}
