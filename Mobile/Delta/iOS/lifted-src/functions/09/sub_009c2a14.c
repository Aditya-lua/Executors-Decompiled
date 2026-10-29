/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c2a14..0x9c2a34 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c2a14_0 {
    unsigned int field_0;
} st_9c2a14_0;


int sub_9c2a14(unsigned long a0, st_9c2a14_0 **a1)
{
    *(unsigned int *)*a1 = (((((a0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a0 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((a0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a0 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    *a1 = *a1 + 1;
    return 1;
}
