/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb43584..0xb43650 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b43584_0 {
    unsigned long long field_0;
    struct st_b43584_0 *field_8;
} st_b43584_0;


st_b43584_0 * sub_b43584(long long *a0)
{
    unsigned long long v2;  // x20
    st_b43584_0 *v3;  // x0
    st_b43584_0 *v4;  // x21
    st_b43584_0 *v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0())
    {
        v2 = *a0;
        if (sub_a2f9e0())
        {
            v3 = sub_a6bffc(40, "providers/implementations/macs/cmac_prov.c", 63);
            if (v3 && !(v4 = v3, v5 = sub_9f204c(), v4->field_8 = v5, !v5))
            {
                v4->field_0 = v2;
                if (sub_9f2134(v5, a0[1]) && sub_afde10(v4 + 1, a0 + 2))
                    return v4;
                sub_9f20b4(v4->field_8);
                sub_afdddc(v4 + 1);
            }
            sub_a6c2e4();
        }
    }
    return 0;
}
