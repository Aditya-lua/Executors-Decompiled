/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaafc18..0xaafc24 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aafc18_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_aafc18_0;

typedef struct st_aafc18_1 {
    char padding_0[24];
    struct st_aafc18_0 *field_18;
} st_aafc18_1;


long long sub_aafc18(unsigned long a0, unsigned long a1, unsigned long a2, st_aafc18_1 *a3)
{
    goto *((void *)(a3->field_18->field_10));
}
