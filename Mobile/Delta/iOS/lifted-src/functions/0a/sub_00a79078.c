/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa79078..0xa79120 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a79078_0 {
    struct st_a79078_0 *field_0;
    struct st_a79078_0 *field_8;
} st_a79078_0;


st_a79078_0 * sub_a79078(st_a79078_0 **a0)
{
    st_a79078_0 *v2;  // x19
    st_a79078_0 *v3;  // x0
    st_a79078_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(16, "crypto/provider_core.c", 259);
    if (!v2)
        return v2;
    if (!*a0 || (v3 = sub_a6d9b4(*a0, "crypto/provider_core.c", 264), v2->field_0 = v3, v3))
    {
        if (a0[1])
        {
            v4 = sub_a6d9b4(a0[1], "crypto/provider_core.c", 269);
            v2->field_8 = v4;
            if (v4)
                return v2;
        }
        else
        {
            return v2;
        }
    }
    sub_a6c2e4();
    sub_a6c2e4(v2, "crypto/provider_core.c", 276);
    return 0;
}
