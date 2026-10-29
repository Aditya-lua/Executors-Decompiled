/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x408170..0x4081b8 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_408170_0 {
    char padding_0[48];
    unsigned int field_30;
} st_408170_0;


st_408170_0 * sub_408170(st_408170_0 *a0, unsigned int *a1, unsigned long long *a2)
{
    unsigned long long v0;  // x8
    unsigned int v1;  // w9
    unsigned int v2;  // w8

    v0 = *a2;
    *a2 = v0 + (v0 | 1) + (~v0 | 1) + 1;
    v1 = *a1;
    v2 = a0->field_30 + 1;
    *a1 = ~((v2 ^ v1) + (v2 & v1) * 2) + ((v2 ^ v1) + (v2 & v1) * 2) * 2;
    return a0;
}
