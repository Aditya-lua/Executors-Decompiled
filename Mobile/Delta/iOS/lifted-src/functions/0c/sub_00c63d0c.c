/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc63d0c..0xc64058 (844 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c63d0c_0 {
    struct st_c63d0c_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_c63d0c_0 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c63d0c_0;


st_c63d0c_0 * sub_c63d0c(st_c63d0c_0 **a0, unsigned long long *a1)
{
    unsigned long long v2;  // x21
    unsigned long long v3;  // x22
    st_c63d0c_0 *v4;  // x8
    unsigned long long v5;  // x10
    st_c63d0c_0 *v41;  // x0
    unsigned long v6;  // cc_dep1
    st_c63d0c_0 *v42;  // x8
    unsigned long v7;  // cc_dep2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a1;
    v3 = a1[1];
    if (v3 < v2)
    {
LABEL_c64040:
        return 0;
    }
    if (!a0[2])
    {
        v41 = sub_991b48();
        if (v41)
        {
            v41->field_0 = 0;
            *(unsigned long long *)&v41->field_1 = 0;
            v41->field_8 = v2;
            v41->field_10 = v3;
            v42 = *a0;
            if (v42)
                *(st_c63d0c_0 **)&v42->field_1 = v41;
            v41->field_0 = v42;
            *(unsigned long long *)&v41->field_1 = 0;
            *a0 = v41;
            if (!a0[1])
                a0[1] = v41;
        }
        goto LABEL_c64040;
    }
    v4 = a0[1];
    v5 = v4->field_10;
    v6 = v2;
    v7 = v5;
    if (v2 <= v5)
        goto LABEL_0xc63d94;
    else
        goto LABEL_0xc63d44;
}
