/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa60ed4..0xa60efc (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a60ed4_0 {
    char padding_0[32];
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned int field_30;
} st_a60ed4_0;


st_a60ed4_0 * sub_a60ed4(st_a60ed4_0 *a0, void* a1, void* a2, void* a3)
{
    if (a1)
        *(unsigned long long *)a1 = a0->field_20;
    if (a2)
        *(unsigned long long *)a2 = a0->field_28;
    if (a3)
        *(unsigned int *)a3 = a0->field_30;
    return a0;
}
