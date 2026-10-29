/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97d7bc..0x97d854 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97d7bc_1 {
    char padding_0[184];
    struct st_97d7bc_1 *field_b8;
} st_97d7bc_1;

typedef struct st_97d7bc_0 {
    char padding_0[88];
    long long field_58;
} st_97d7bc_0;


st_97d7bc_1 * sub_97d7bc(void)
{
    st_97d7bc_1 *v8;  // x8
    st_97d7bc_1 *v9;  // x0
    st_97d7bc_0 *v0;  // [bp-0x58]
    st_97d7bc_1 *v1;  // [bp-0x40]
    st_97d7bc_1 *v2;  // [bp-0x38]
    st_97d7bc_1 *v3;  // [bp-0x30]
    unsigned int v4;  // [bp-0x24]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    if (!sub_97f48c())
        return 0;
    sub_ad9384(sub_c4ba8(v0->field_58));
    v4 = 1;
    if (v3)
    {
        if (!v2)
            goto LABEL_97d824;
        v8 = &v2->field_b8;
        goto LABEL_97d820;
    }
    else if (v1)
    {
        v8 = &v1[1].field_b8;
LABEL_97d820:
        *(unsigned int *)&v8->padding_0[0] = 0;
    }
LABEL_97d824:
    v9 = sub_97d854(&v0);
    sub_ad93b4(sub_c4ba8(v0->field_58));
    return v9;
}
