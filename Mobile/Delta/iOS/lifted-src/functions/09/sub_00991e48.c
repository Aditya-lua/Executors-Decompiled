/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991e48..0x991e5c (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_991e48_0 {
    char padding_0[3296];
    unsigned long long field_ce0;
} st_991e48_0;


long long sub_991e48(st_991e48_0 *a0, unsigned int a1)
{
    return *(short *)(a0->field_ce0 + (__ROL__(a1, 1) & 2 & 3 ^ 2));
}
