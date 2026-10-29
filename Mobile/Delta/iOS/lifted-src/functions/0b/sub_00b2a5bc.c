/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2a5bc..0xb2a660 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2a5bc_0 {
    unsigned long long field_0;
    struct st_b2a5bc_0 *field_8;
} st_b2a5bc_0;


st_b2a5bc_0 * sub_b2a5bc(long long a0, long long a1)
{
    st_b2a5bc_0 *v2;  // x0
    st_b2a5bc_0 *v3;  // x19
    st_b2a5bc_0 *v4;  // x0
    st_b2a5bc_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(24, "providers/implementations/exchange/kdf_exch.c", 53);
    if (!v2)
        return v2;
    v3 = v2;
    v2->field_0 = a1;
    v4 = sub_a537e4(sub_9f2aec(a1), a0, 0);
    if (v4)
    {
        v5 = sub_a53488();
        v3->field_8 = v5;
        sub_a53b90(v4);
        if (v5)
            return v3;
    }
    sub_a6c2e4(v3, "providers/implementations/exchange/kdf_exch.c", 70);
    return 0;
}
