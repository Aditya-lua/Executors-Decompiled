/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x979b18..0x979b34 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_979b18_0 {
    char padding_0[1456];
    unsigned long long field_5b0;
    char padding_5b8[104];
    unsigned long long field_620;
} st_979b18_0;


st_979b18_0 * sub_979b18(st_979b18_0 *a0, unsigned int a1, unsigned long a2)
{
    a0->field_620 = a0->field_620 & 0xffffffff80000000 | (a0->field_620 & 0xffffffffbfffffff | ((a1 != 0) * 0x40000000 | (char)(a1 != 0) >> 0x22) & 0x40000000) & 0x7fffffff;
    a0->field_5b0 = a2;
    return a0;
}
