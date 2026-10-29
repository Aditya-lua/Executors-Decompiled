/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa04518..0xa0459c (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a04518_0 {
    char padding_0[24];
    struct st_a04518_1 *field_18;
} st_a04518_0;

typedef struct st_a04518_1 {
    struct st_a04518_0 *field_0;
} st_a04518_1;


st_a04518_0 ** sub_a04518(st_a04518_0 **a0, st_a04518_0 **a1)
{
    long long v2;  // x19
    long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 786690;
    v3 = 163;
    if (a0 && a1)
    {
        if (*a0->field_18)
            *a0->field_18();
        v2 = 108;
        v3 = 167;
    }
    sub_a368c8();
    sub_a369bc("crypto/dso/dso_lib.c", v3, "DSO_bind_func");
    sub_a36abc(37, v2, 0);
    return 0;
}
