/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac404c..0xac4058 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac404c_0 {
    char padding_0[160];
    struct st_ac404c_1 *field_a0;
} st_ac404c_0;

typedef struct st_ac404c_1 {
    unsigned long long field_0;
} st_ac404c_1;


long long sub_ac404c(st_ac404c_0 *a0)
{
    return *(long long *)a0->field_a0;
}
