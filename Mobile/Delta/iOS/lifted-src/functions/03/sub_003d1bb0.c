/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d1bb0..0x3d1c2c (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d1bb0_0 {
    char field_0;
} st_3d1bb0_0;


char sub_3d1bb0(uint128_t *a0, char *a1)
{
    char *v4;  // x20
    char *v5;  // x20
    unsigned int v6;  // w0
    st_3d1bb0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3d1bb0_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (*a1)
    {
        v4 = a1 + 1;
        do
        {
            v5 = v4;
            v6 = sub_3d706c(a0);
            if (v6 != *(v5 - 1))
                return 0;
        } while ((v4 = v5 + 1, *v5));
    }
    a0[12] = a0[13];
    return 1;
}
