/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3f2ec..0xa3f310 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3f2ec_1 {
    unsigned long long field_0;
} st_a3f2ec_1;

typedef struct st_a3f2ec_0 {
    struct st_a3f2ec_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_a3f2ec_0;

extern st_a3f2ec_0 g_e93538;

long long sub_a3f2ec(unsigned int a0)
{
    if (3 < a0)
        return 0;
    return *(long long *)(&g_e93538.field_0)[a0];
}
