/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2cd4..0xac2ce4 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2cd4_0 {
    char padding_0[9];
    char field_9;
    unsigned long long field_a;
    unsigned int field_12;
} st_ac2cd4_0;


st_ac2cd4_0 * sub_ac2cd4(st_ac2cd4_0 *a0, char a1)
{
    a0->field_9 = a1;
    *(unsigned long long *)&(&a0->field_9)[1] = 0;
    *(unsigned int *)((char *)&a0->field_a + 2) = 0;
    return a0;
}
