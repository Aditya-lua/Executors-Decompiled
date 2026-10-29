/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa14694..0xa146a0 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a14694_1 {
    char padding_0[32];
    struct st_a14694_0 *field_20;
} st_a14694_1;

typedef struct st_a14694_0 {
    char padding_0[96];
    unsigned long long field_60;
} st_a14694_0;


long long sub_a14694(st_a14694_1 *a0)
{
    return a0->field_20->field_60;
}
