/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab9840..0xab9870 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab9840_1 {
    char padding_0[24];
    struct st_ab9840_0 *field_18;
} st_ab9840_1;

typedef struct st_ab9840_0 {
    char padding_0[96];
    unsigned long long field_60;
} st_ab9840_0;


long long sub_ab9840(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, st_ab9840_1 *a5)
{
    if (a5->field_18->field_60)
        goto *((void *)(a5->field_18->field_60));
}
