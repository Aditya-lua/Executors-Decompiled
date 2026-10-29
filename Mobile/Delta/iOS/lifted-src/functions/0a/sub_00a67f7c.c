/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa67f7c..0xa68024 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a67f7c_0 {
    char padding_0[320];
    unsigned int field_140;
} st_a67f7c_0;


st_a67f7c_0 * sub_a67f7c(long long a0, long long a1)
{
    st_a67f7c_0 *v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(328, "crypto/context.c", 446);
    if (!v2)
        return v2;
    if (sub_a67cc4(v2))
    {
        if (sub_9d6718(v2, a1) && sub_a77694(v2, a0, a1))
        {
            v2->field_140 = 1;
            return v2;
        }
        sub_a67ea4(v2);
    }
    else
    {
        sub_a6c2e4(v2, "crypto/context.c", 449);
    }
    return 0;
}
