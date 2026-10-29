/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa54918..0xa549b4 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a54918_0 {
    char padding_0[104];
    struct st_a54918_0 *field_68;
} st_a54918_0;


st_a54918_0 * sub_a54918(st_a54918_0 *a0, st_a54918_0 *a1)
{
    st_a54918_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    if (a0 && a1)
    {
        v2 = sub_a5ba1c();
        if (v2)
        {
            v2 = v2;
            if (sub_a5a074())
            {
                v2->field_68 = a1;
                sub_a54814(v2);
                return v2;
            }
            sub_a368c8();
            sub_a369bc("crypto/evp/keymgmt_lib.c", 65, "evp_keymgmt_util_assign_pkey");
            sub_a36abc(6, 0xc0103, 0);
        }
    }
    sub_a5a4c8(v2);
    return 0;
}
