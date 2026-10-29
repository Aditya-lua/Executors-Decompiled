/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3f5c0..0xa3f728 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3f5c0_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
    char padding_10[24];
    struct st_a3f5c0_0 *field_28;
} st_a3f5c0_0;


st_a3f5c0_0 * sub_a3f5c0(long long a0, st_a3f5c0_0 *a1, long long a2, long long a3)
{
    st_a3f5c0_0 *v2;  // x19
    st_a3f5c0_0 *v3;  // x0
    st_a3f5c0_0 *v4;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(72, "crypto/evp/digest.c", 131);
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/digest.c", 112, "evp_md_ctx_new_ex");
        sub_a36abc(13, 0x80006, 0);
        sub_a5d6b0(0);
        return v2;
    }
    v3 = sub_a5d5a8(a2, a0, a3);
    if (v3)
    {
        v4 = v3;
        if (!a1 || (int)sub_a5e6b8(v4, a1->field_8, a1->field_0) > 0)
        {
            sub_a50d68(v2, v4);
            return v2;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/digest.c", 112, "evp_md_ctx_new_ex");
        sub_a36abc(13, 0x80006, 0);
        v4 = 0;
    }
    sub_a5d6b0(v4);
    if (!sub_a50db0(v2, 0x400))
    {
        sub_a5d6b0(v2->field_28);
        v2->field_28 = 0;
    }
    sub_a3f3d0(v2, 0, 0);
    sub_a66ec0(v2, 72);
    sub_a6c2e4(v2, "crypto/evp/digest.c", 140);
    return 0;
}
