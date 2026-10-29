/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad9530..0xad95f8 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad9530_0 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_ad9530_0 *field_10;
    char padding_18[16];
    struct st_ad9530_0 *field_28;
    struct st_ad9530_0 *field_30;
    struct st_ad9530_0 *field_38;
    char padding_40[8];
    unsigned int field_48;
} st_ad9530_0;


st_ad9530_0 * sub_ad9530(st_ad9530_0 *a0, unsigned long a1, unsigned int a2)
{
    st_ad9530_0 *v2;  // x19
    st_ad9530_0 *v3;  // x0
    st_ad9530_0 *v4;  // x20
    st_ad9530_0 *v5;  // x0
    st_ad9530_0 *v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0;
    v2 = sub_a6bffc(88, "crypto/thread/arch.c", 21);
    if (!v2)
        return v2;
    v3 = sub_ad9324();
    v4 = v2;
    v4->field_28 = v3;
    if (v3)
    {
        v5 = sub_ad9324();
        v2->field_30 = v5;
        if (v5)
        {
            v6 = sub_ad9428();
            v2->field_38 = v6;
            if (v6)
            {
                v2->field_8 = a1;
                v2->field_10 = a0;
                v2->field_48 = a2;
                if (sub_ad9168(v2) == 1)
                    return v2;
            }
        }
    }
    sub_ad94ec(&v2->field_38);
    sub_ad93e4(&v2->field_30);
    sub_ad93e4(&v4->field_28);
    sub_a6c2e4(v2, "crypto/thread/arch.c", 43);
    return 0;
}
