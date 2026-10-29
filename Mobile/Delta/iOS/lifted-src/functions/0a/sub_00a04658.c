/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa04658..0xa04724 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a04658_0 {
    unsigned long long field_0;
    char padding_8[12];
    char field_14;
    char padding_15[19];
    struct st_a04658_1 *field_28;
} st_a04658_0;

typedef struct st_a04658_1 {
    char field_0;
} st_a04658_1;


char sub_a04658(st_a04658_0 *a0, char a1)
{
    long long v2;  // x1
    char *v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if (a1 || !(a1 = *(long long *)&a0[1].padding_8[0], !*(long long *)&a0[1].padding_8[0]))
        {
            if (a0->field_14 & 1)
                return sub_a6d9b4(a1, "crypto/dso/dso_lib.c", 284);
            v3 = a0->field_28;
            if (a0->field_28 || !(v3 = *(long long *)(a0->field_0 + 40), !*(long long *)(a0->field_0 + 40)))
                v3();
            return sub_a6d9b4(a1, "crypto/dso/dso_lib.c", 284);
        }
        sub_a368c8();
        sub_a369bc("crypto/dso/dso_lib.c", 274, "DSO_convert_filename");
        v2 = 111;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/dso/dso_lib.c", 268, "DSO_convert_filename");
        v2 = 786690;
    }
    sub_a36abc(37, v2, 0);
    return 0;
}
