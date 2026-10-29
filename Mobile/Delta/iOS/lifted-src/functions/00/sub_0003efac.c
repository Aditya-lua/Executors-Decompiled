/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3efac..0x3efe4 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3efac_0 {
    char padding_0[24];
    long long field_18;
} st_3efac_0;


st_3efac_0 * sub_3efac(long long a0)
{
    st_3efac_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_400fc(a0 + 24);
    if (!v2)
        return v2;
    return sub_3a064(a0, v2->field_18) + 4;
}
