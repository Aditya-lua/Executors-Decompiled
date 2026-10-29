/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fead0..0x9feb74 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fead0_0 {
    char padding_0[8];
    char field_8;
    char padding_9[51];
    unsigned int field_3c;
    char padding_40[136];
    unsigned long long field_c8;
} st_9fead0_0;


st_9fead0_0 * sub_9fead0(long long a0, long long a1)
{
    st_9fead0_0 *v2;  // x0
    st_9fead0_0 *v3;  // x20
    st_9fead0_0 *v4;  // x0
    st_9fead0_0 *v5;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a60658(a1);
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_group_params.c", 47, "ossl_dh_new_by_nid_ex");
        sub_a36abc(5, 114, 0);
        return 0;
    }
    v3 = v2;
    v4 = sub_9ffb30(a0);
    if (!v4)
        return v4;
    v5 = v4;
    sub_a60868(&v4->field_8, v3);
    v5->field_3c = sub_a60850(v3);
    v5->field_c8 = v5->field_c8 + 1;
    return v5;
}
