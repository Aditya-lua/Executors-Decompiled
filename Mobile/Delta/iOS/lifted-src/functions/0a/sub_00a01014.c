/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa01014..0xa01020 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a01014_0 {
    char padding_0[192];
    unsigned long long field_c0;
} st_a01014_0;

typedef struct st_a01014_1 {
    char padding_0[32];
    struct st_a01014_0 *field_20;
} st_a01014_1;


long long sub_a01014(st_a01014_1 *a0)
{
    return a0->field_20->field_c0;
}
