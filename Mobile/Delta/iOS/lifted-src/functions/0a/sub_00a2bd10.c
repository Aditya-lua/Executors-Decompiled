/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2bd10..0xa2be04 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2bd10_0 {
    long long field_0;
    long long field_8;
    char padding_10[1];
    char field_11;
    char padding_12[62];
    long long field_50;
} st_a2bd10_0;


st_a2bd10_0 * sub_a2bd10(unsigned long a0, st_a2bd10_0 *a1, unsigned long long *a2, long long a3, long long a4)
{
    st_a2bd10_0 *v3;  // x0
    st_a2bd10_0 *v5;  // x0
    long long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_c67c9c(*(long long *)(sub_962b90() + 0x88));
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecx_meth.c", 841, "pkey_ecd_digestsign448");
        sub_a36abc(16, 116, 0);
        return 0;
    }
    if (a1)
    {
        if (113 >= *a2)
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ecx_meth.c", 850, "pkey_ecd_digestsign448");
            sub_a36abc(16, 100, 0);
            return 0;
        }
        *(char *)&v0 = 0;
        v5 = sub_a08450(v3->field_0, a1, a3, a4, &v3->field_11, v3->field_50, 0, 0, v0, v3->field_8);
        if (!(unsigned int)v5)
            return v5;
    }
    *a2 = 114;
    return 1;
}
