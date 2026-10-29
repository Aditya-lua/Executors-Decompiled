/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa40abc..0xa40bcc (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a40abc_0 {
    char padding_0[40];
    struct st_a40abc_0 *field_28;
} st_a40abc_0;


st_a40abc_0 * sub_a40abc(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5)
{
    st_a40abc_0 *v2;  // x0
    st_a40abc_0 *v3;  // x19
    st_a40abc_0 *v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(72, "crypto/evp/digest.c", 131);
    if (!v2)
        return 0;
    v3 = v2;
    sub_a50dbc();
    if (sub_a3f7f8(v3, a4, 0, a5) && sub_a3fe10(v3, a0, a1))
        v4 = sub_a3ff7c(v3, a2, a3) != 0;
    else
        v4 = 0;
    if (!sub_a50db0(v3, 0x400))
    {
        sub_a5d6b0(v3->field_28);
        v3->field_28 = 0;
    }
    sub_a3f3d0(v3, 0, 0);
    sub_a66ec0(v3, 72);
    sub_a6c2e4(v3, "crypto/evp/digest.c", 140);
    return v4;
}
