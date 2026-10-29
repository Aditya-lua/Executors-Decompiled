/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50dbc..0xa50dd0 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50dbc_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_a50dbc_0;


st_a50dbc_0 * sub_a50dbc(st_a50dbc_0 *a0, int a1)
{
    a0->field_18 = a0->field_18 | a1;
    return a0;
}
