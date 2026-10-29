/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa54fa4..0xa55054 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a54fa4_0 {
    char padding_0[104];
    struct st_a54fa4_0 *field_68;
} st_a54fa4_0;


st_a54fa4_0 * sub_a54fa4(st_a54fa4_0 *a0, st_a54fa4_0 *a1, long long a2, long long a3, long long a4)
{
    st_a54fa4_0 *v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a55a28(a1, a2, a3, a4);
    if (v2)
    {
        if (a0 && a1 && sub_a5a074(a0, a1))
        {
            a0->field_68 = v2;
            sub_a54814(a0);
            return v2;
        }
        sub_a368c8();
        sub_a369bc("crypto/evp/keymgmt_lib.c", 65, "evp_keymgmt_util_assign_pkey");
        sub_a36abc(6, 0xc0103, 0);
    }
    sub_a55970(a1, v2);
    return 0;
}
