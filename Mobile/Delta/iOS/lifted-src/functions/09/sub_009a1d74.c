/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a1d74..0x9a1d9c (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a1d74_0 {
    char padding_0[608];
    unsigned long long field_260;
    char padding_268[128];
    unsigned long long field_2e8;
    char padding_2f0[452];
    unsigned int field_4b4;
} st_9a1d74_0;


int sub_9a1d74(st_9a1d74_0 *a0)
{
    if (a0->field_260 && a0->field_2e8)
        return 1;
    a0->field_4b4 = 1;
    return 1;
}
