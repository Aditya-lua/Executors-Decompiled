/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d1570..0x3d15e4 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d1570_0 {
    char field_0;
} st_3d1570_0;


double sub_3d1570(uint128_t *a0)
{
    unsigned int v4;  // w0
    uint128_t v5;  // q0
    uint128_t v6;  // q0
    st_3d1570_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3d1570_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_3d1bb0();
    v5 = a0[13];
    a0[12] = v5;
    if (!v4)
    {
        sub_3d1bb0(a0, "#?RGBE\n");
        v6 = a0[13];
        a0[12] = v6;
        return *(unsigned long long *)&v6;
    }
    return *(unsigned long long *)&v5;
}
