/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa04724..0xa04850 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a04724_0 {
    char padding_0[72];
    struct st_a04724_1 *field_48;
} st_a04724_0;

typedef struct st_a04724_1 {
    unsigned long long field_0;
} st_a04724_1;


unsigned long long * sub_a04724(unsigned long a0, unsigned long a1)
{
    st_a04724_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a03a10();
    if (!v2->field_48)
    {
        sub_a368c8();
        sub_a369bc("crypto/dso/dso_lib.c", 296, "DSO_pathbyaddr");
        sub_a36abc(37, 108, 0);
        return 0;
    }
    v2->field_48();
}
