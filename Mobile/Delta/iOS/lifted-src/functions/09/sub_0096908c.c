/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96908c..0x9690cc (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96908c_1 {
    char padding_0[2176];
    struct st_96908c_0 *field_880;
    char padding_888[480];
    unsigned long long field_a68;
    unsigned long long field_a70;
} st_96908c_1;

typedef struct st_96908c_0 {
    char padding_0[30];
    char field_1e;
} st_96908c_0;

extern char g_d2825c;

st_96908c_1 * sub_96908c(st_96908c_1 *a0, unsigned long long *a1, unsigned long long *a2)
{
    unsigned long long v0;  // x8

    if (a0->field_a70)
    {
        *a1 = a0->field_a70;
        *a2 = a0->field_a68;
        return a0;
    }
    *a1 = &g_d2825c;
    v0 = 2;
    if (!(a0->field_880->field_1e & 3))
        v0 = 3;
    *a2 = v0;
    return a0;
}
