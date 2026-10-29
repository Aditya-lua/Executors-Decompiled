/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc61c14..0xc61c5c (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c61c14_0 {
    char padding_0[1568];
    unsigned int field_620;
} st_c61c14_0;

extern unsigned long long g_d28490[4];

long long sub_c61c14(unsigned long a0, unsigned long a1, unsigned long a2, st_c61c14_0 *a3)
{
    unsigned int v0;  // w9
    unsigned long long v1;  // x9

    v0 = (a3->field_620 * 0x40000 | a3->field_620 >> 14) & 0xfffc0007 & 7;
    if (3 >= v0)
        v1 = g_d28490[v0];
    else
        v1 = 2;
    if (!*(long long *)&a3->padding_0[1096 + 8 * v1])
        return 0;
}
