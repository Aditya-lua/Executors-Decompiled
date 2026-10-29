/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xada238..0xada298 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ada238_1 {
    char padding_0[16];
    struct st_ada238_0 *field_10;
} st_ada238_1;

typedef struct st_ada238_0 {
    struct st_ada238_0 *field_0;
} st_ada238_0;


st_ada238_0 ** sub_ada238(unsigned long long a0, unsigned long a1, st_ada238_1 **a2)
{
    st_ada238_0 **v0;  // [bp-0x60], Other Possible Types: unsigned int
    unsigned long long v1;  // [bp-0x58]
    st_ada238_0 **v2;  // [bp-0x50]
    st_ada238_0 **v3;  // [bp-0x40]
    st_ada238_0 **v4;  // [bp-0x30]
    st_ada238_0 **v5;  // [bp-0x20]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = 0;
    v3 = (st_ada238_0 **)0;
    v4 = (st_ada238_0 **)0;
    v0 = (st_ada238_0 **)0;
    v2 = (st_ada238_0 **)0;
    v0 = 5;
    v1 = a0;
    if (!*a2->field_10)
        return 0;
    *a2->field_10();
}
