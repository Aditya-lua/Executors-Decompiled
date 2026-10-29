/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd6848..0xbd6878 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd6848_1 {
    char padding_0[8];
    struct st_bd6848_0 *field_8;
} st_bd6848_1;

typedef struct st_bd6848_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_bd6848_0;


void sub_bd6848(unsigned long a0, st_bd6848_1 *a1)
{
    goto *((void *)(a1->field_8->field_18));
}
