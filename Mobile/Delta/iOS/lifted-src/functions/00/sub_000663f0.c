/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x663f0..0x66400 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_663f0_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_663f0_0;

typedef struct st_663f0_2 {
    struct st_663f0_0 *field_0;
} st_663f0_2;

typedef struct st_663f0_1 {
    char padding_0[80];
    struct st_663f0_2 *field_50;
} st_663f0_1;


void sub_663f0(st_663f0_1 *a0)
{
    goto *((void *)(*(long long *)(*(long long *)a0->field_50 + 16)));
}
