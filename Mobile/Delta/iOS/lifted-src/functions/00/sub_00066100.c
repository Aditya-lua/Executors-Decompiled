/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x66100..0x66110 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_66100_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_66100_0;

typedef struct st_66100_2 {
    struct st_66100_0 *field_0;
} st_66100_2;

typedef struct st_66100_1 {
    char padding_0[80];
    struct st_66100_2 *field_50;
} st_66100_1;


void sub_66100(st_66100_1 *a0)
{
    goto *((void *)(*(long long *)(*(long long *)a0->field_50 + 24)));
}
