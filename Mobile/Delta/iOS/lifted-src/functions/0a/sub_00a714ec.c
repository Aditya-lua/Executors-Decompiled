/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa714ec..0xa715c0 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a714ec_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_a714ec_0;


long long sub_a714ec(st_a714ec_0 *a0, unsigned long a1, unsigned long a2, unsigned int a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_8 != a3)
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 1421, "set_string_internal");
        sub_a36abc(15, 129, 0);
        return 0;
    }
    a0->field_20 = a2;
    if (!a0->field_10)
        return 1;
    if (a2 > a0->field_18)
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 1428, "set_string_internal");
        sub_a36abc(15, 116, 0);
        return 0;
    }
    _memcpy(a0->field_10);
    if (a3 == 4 && a0->field_18 > a2)
        *(char *)(a0->field_10 + a2) = 0;
    return 1;
}
