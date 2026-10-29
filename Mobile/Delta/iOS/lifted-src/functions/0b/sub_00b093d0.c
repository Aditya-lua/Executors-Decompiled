/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb093d0..0xb093f4 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b093d0_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_b093d0_0;

typedef struct st_b093d0_1 {
    struct st_b093d0_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_b093d0_1;

extern st_b093d0_1 g_ed2170;

long long sub_b093d0(unsigned int a0)
{
    if (2 < a0)
        return 0;
    return (&g_ed2170.field_0)[a0]->field_8;
}
