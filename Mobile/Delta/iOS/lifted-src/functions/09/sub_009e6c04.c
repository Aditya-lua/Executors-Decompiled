/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e6c04..0x9e6c64 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e6c04_0 {
    struct st_9e6c04_0 *field_0;
    char field_8;
    char padding_9[23];
    char field_20;
    char padding_21[23];
    char field_38;
    char padding_39[23];
    struct st_9e6c04_0 *field_50;
    struct st_9e6c04_0 *field_58;
    unsigned int field_60;
} st_9e6c04_0;


st_9e6c04_0 * sub_9e6c04(void)
{
    st_9e6c04_0 *v2;  // x0
    st_9e6c04_0 *v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bf4c(104, "crypto/bn/bn_mont.c", 231);
    if (!v2)
        return v2;
    *(unsigned int *)&v2->field_0 = 0;
    v3 = v2;
    sub_991a38(&v2->field_8);
    sub_991a38(&v3->field_20);
    sub_991a38(&v3->field_38);
    v3->field_50 = 0;
    v3->field_58 = 0;
    v3->field_60 = 1;
    return v3;
}
