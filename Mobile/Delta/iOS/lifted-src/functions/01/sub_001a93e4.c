/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a93e4..0x1a93f4 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a93e4_1 {
    char padding_0[8];
    struct st_1a93e4_2 *field_8;
} st_1a93e4_1;

typedef struct st_1a93e4_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_1a93e4_0;

typedef struct st_1a93e4_2 {
    struct st_1a93e4_0 *field_0;
} st_1a93e4_2;


void sub_1a93e4(st_1a93e4_1 *a0)
{
    goto *((void *)(*(long long *)(*(long long *)a0->field_8 + 32)));
}
