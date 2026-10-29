/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaafc0c..0xaafc18 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aafc0c_1 {
    char padding_0[24];
    struct st_aafc0c_0 *field_18;
} st_aafc0c_1;

typedef struct st_aafc0c_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_aafc0c_0;


long long sub_aafc0c(unsigned long a0, unsigned long a1, unsigned long a2, st_aafc0c_1 *a3)
{
    goto *((void *)(a3->field_18->field_20));
}
