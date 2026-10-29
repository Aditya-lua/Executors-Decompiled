/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x954348..0x954360 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_954348_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_954348_0;


st_954348_0 * sub_954348(st_954348_0 **a0)
{
    st_954348_0 *v0;  // x0

    v0 = *a0;
    if (v0)
        *a0 = v0->field_10;
    return v0;
}
