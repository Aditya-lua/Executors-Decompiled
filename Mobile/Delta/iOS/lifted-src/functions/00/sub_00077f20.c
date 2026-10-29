/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x77f20..0x77f48 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_77f20_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_77f20_0;


unsigned long long sub_77f20(st_77f20_0 *a0, unsigned long a1, unsigned long a2)
{
    a0->field_0 = 0;
    a0->field_8 = 0;
    a0->field_10 = a1;
    a0->field_18 = a1;
    a0->field_20 = a1 + a2 - 8;
    if (a2 >= 9)
        return 0;
    return 0xffffffffffffffba;
}
