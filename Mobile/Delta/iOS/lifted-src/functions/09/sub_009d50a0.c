/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d50a0..0x9d5124 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d50a0_0 {
    unsigned int field_0;
    char padding_4[4];
    struct st_9d50a0_0 *field_8;
} st_9d50a0_0;


st_9d50a0_0 * sub_9d50a0(unsigned int a0, long long a1)
{
    st_9d50a0_0 *v2;  // x0
    st_9d50a0_0 *v3;  // x8
    st_9d50a0_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(112, "crypto/bio/bio_meth.c", 39);
    if (v2)
    {
        v3 = sub_a6d9b4(a1, "crypto/bio/bio_meth.c", 42);
        v4 = v2;
        v4->field_8 = v3;
        if (v3)
        {
            v4->field_0 = a0;
            return v4;
        }
    }
    sub_a6c2e4();
    return 0;
}
