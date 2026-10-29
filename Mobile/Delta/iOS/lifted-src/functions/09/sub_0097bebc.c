/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97bebc..0x97bee0 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97bebc_1 {
    unsigned long long field_0;
} st_97bebc_1;

typedef struct st_97bebc_0 {
    char padding_0[32];
    unsigned long long field_20;
    char padding_28[50];
    struct st_97bebc_1 *field_5a;
} st_97bebc_0;


unsigned long long * sub_97bebc(st_97bebc_0 *a0, unsigned long long *a1)
{
    if (!(a0->padding_28)[1])
        return 0;
    if (!a1)
        return 1;
    *a1 = a0->field_20;
    return 1;
}
