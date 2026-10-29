/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b38e8..0x1b38f8 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b38e8_1 {
    char padding_0[8];
    struct st_1b38e8_2 *field_8;
} st_1b38e8_1;

typedef struct st_1b38e8_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_1b38e8_0;

typedef struct st_1b38e8_2 {
    struct st_1b38e8_0 *field_0;
} st_1b38e8_2;


void sub_1b38e8(st_1b38e8_1 *a0)
{
    goto *((void *)(*(long long *)(*(long long *)a0->field_8 + 32)));
}
