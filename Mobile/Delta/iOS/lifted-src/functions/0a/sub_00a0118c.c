/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0118c..0xa0124c (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a0118c_0 {
    char padding_0[8];
    long long field_8;
} st_a0118c_0;


long long sub_a0118c(long long a0, st_a0118c_0 *a1)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a5ed4c(a1);
    v3 = sub_a01fbc(a1->field_8);
    if (v3)
    {
        v4 = v3;
        if (sub_a02200() && sub_a01490(v4, a0, 1) && sub_a5ab14(v2, 116, v4))
            return 1;
        sub_a01fd4(v4);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/dsa/dsa_ameth.c", 485, "dsa_pkey_import_from");
        sub_a36abc(10, 0x8000a, 0);
    }
    return 0;
}
