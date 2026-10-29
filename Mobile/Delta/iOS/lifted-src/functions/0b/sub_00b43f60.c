/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb43f60..0xb43fd0 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b43f60_0 {
    unsigned long long field_0;
    struct st_b43f60_0 *field_8;
} st_b43f60_0;


st_b43f60_0 * sub_b43f60(unsigned long a0)
{
    st_b43f60_0 *v2;  // x0
    st_b43f60_0 *v3;  // x8
    st_b43f60_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0())
    {
        v2 = sub_a6bffc(160, "providers/implementations/macs/hmac_prov.c", 83);
        if (v2)
        {
            v3 = sub_a64420();
            v4 = v2;
            v4->field_8 = v3;
            if (v3)
            {
                v4->field_0 = a0;
                return v4;
            }
        }
        sub_a6c2e4();
    }
    return 0;
}
