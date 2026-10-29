/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb93848..0xb93860 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b93848_1 {
    char padding_0[8];
    struct st_b93848_0 *field_8;
} st_b93848_1;

typedef struct st_b93848_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_b93848_0;


void sub_b93848(unsigned long a0, st_b93848_1 *a1)
{
    goto *((void *)(a1->field_8->field_18));
}
