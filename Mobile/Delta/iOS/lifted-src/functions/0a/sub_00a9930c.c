/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9930c..0xa99328 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9930c_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_a9930c_0;


unsigned int * sub_a9930c(unsigned int *a0, st_a9930c_0 *a1)
{
    if (*a0 != a1->field_0)
        return a0;
    goto *((void *)(a1->field_8));
}
