/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5f2b4..0xc5f2ec (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5f2b4_1 {
    char padding_0[8];
    struct st_c5f2b4_0 *field_8;
} st_c5f2b4_1;

typedef struct st_c5f2b4_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_c5f2b4_0;


void sub_c5f2b4(unsigned long long *a0, st_c5f2b4_1 *a1)
{
    if (*a0 != 0x8000000000000000)
        goto *((void *)(a1->field_8->field_18));
}
