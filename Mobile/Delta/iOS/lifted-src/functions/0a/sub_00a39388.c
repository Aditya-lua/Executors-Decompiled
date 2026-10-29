/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa39388..0xa39410 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a39388_0 {
    char padding_0[20];
    unsigned long long field_14;
    char padding_1c[4];
    struct st_a39388_0 *field_20;
} st_a39388_0;


st_a39388_0 * sub_a39388(long long a0)
{
    st_a39388_0 *v2;  // x20
    st_a39388_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(2568, "crypto/evp/bio_b64.c", 70);
    if (!v2)
        return v2;
    *(unsigned long *)&(v2->padding_0)[1] = 4294967297;
    v3 = sub_a4aef0();
    *(st_a39388_0 **)v2->padding_1c = v3;
    if (!v3)
    {
        sub_a6c2e4(v2, "crypto/evp/bio_b64.c", 77);
        return 0;
    }
    sub_9d3d24(a0, v2);
    sub_9d3d2c(a0, 1);
    return 1;
}
