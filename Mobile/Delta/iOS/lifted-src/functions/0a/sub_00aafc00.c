/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaafc00..0xaafc0c (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aafc00_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_aafc00_0;

typedef struct st_aafc00_1 {
    char padding_0[24];
    struct st_aafc00_0 *field_18;
} st_aafc00_1;


long long sub_aafc00(unsigned long a0, unsigned long a1, unsigned long a2, st_aafc00_1 *a3)
{
    goto *((void *)(a3->field_18->field_18));
}
