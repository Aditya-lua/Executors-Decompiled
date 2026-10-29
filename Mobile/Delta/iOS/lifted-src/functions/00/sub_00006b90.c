/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6b90..0x6ba8 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6b90_1 {
    char padding_0[64];
    struct st_6b90_2 *field_40;
} st_6b90_1;

typedef struct st_6b90_0 {
    unsigned long long field_0;
} st_6b90_0;

typedef struct st_6b90_2 {
    struct st_6b90_0 *field_0;
} st_6b90_2;


void sub_6b90(unsigned long a0, st_6b90_1 *a1)
{
    goto *((void *)(*(long long *)*(long long *)a1->field_40));
}
