/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa40484..0xa40520 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a40484_0 {
    char padding_0[40];
    struct st_a40484_0 *field_28;
} st_a40484_0;


st_a40484_0 * sub_a40484(long long a0)
{
    st_a40484_0 *v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(72, "crypto/evp/digest.c", 131);
    if (!v2)
    {
        return v2;
    }
    else if (!sub_a40520(v2, a0))
    {
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
    else
    {
        return v2;
    }
}
