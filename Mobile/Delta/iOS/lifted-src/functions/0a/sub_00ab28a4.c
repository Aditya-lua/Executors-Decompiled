/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab28a4..0xab2948 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab28a4_0 {
    struct st_ab28a4_0 *field_0;
    struct st_ab28a4_0 *field_8;
    struct st_ab28a4_0 *field_10;
    struct st_ab28a4_0 *field_18;
} st_ab28a4_0;


st_ab28a4_0 * sub_ab28a4(void)
{
    st_ab28a4_0 *v2;  // x19
    st_ab28a4_0 *v3;  // x0
    st_ab28a4_0 *v4;  // x0
    st_ab28a4_0 *v5;  // x0
    st_ab28a4_0 *v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(40, "crypto/rsa/rsa_mp.c", 36);
    if (!v2)
        return v2;
    v3 = sub_9e4988();
    v2->field_0 = v3;
    if (v3)
    {
        v4 = sub_9e4988();
        v2->field_8 = v4;
        if (v4)
        {
            v5 = sub_9e4988();
            v2->field_10 = v5;
            if (v5)
            {
                v6 = sub_9e4988();
                v2->field_18 = v6;
                if (v6)
                    return v2;
            }
        }
    }
    sub_9e48d4(v3);
    sub_9e48d4(v2->field_8);
    sub_9e48d4(v2->field_10);
    sub_9e48d4(v2->field_18);
    sub_a6c2e4(v2, "crypto/rsa/rsa_mp.c", 54);
    return 0;
}
