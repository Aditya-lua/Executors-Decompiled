/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb6c74c..0xb6c764 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b6c74c_1 {
    char padding_0[8];
    struct st_b6c74c_0 *field_8;
} st_b6c74c_1;

typedef struct st_b6c74c_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_b6c74c_0;


void sub_b6c74c(unsigned long a0, st_b6c74c_1 *a1)
{
    goto *((void *)(a1->field_8->field_18));
}
