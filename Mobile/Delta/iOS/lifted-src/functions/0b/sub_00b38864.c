/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb38864..0xb38994 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b38864_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    char field_10;
    char padding_11[7];
    long long field_18;
    struct st_b38864_0 *field_20;
} st_b38864_0;


st_b38864_0 * sub_b38864(long long a0, long long a1)
{
    st_b38864_0 *v2;  // x0
    st_b38864_0 *v3;  // x0
    st_b38864_0 *v4;  // x0
    st_b38864_0 *v5;  // x0
    st_b38864_0 *v6;  // x0
    st_b38864_0 *v7;  // x0
    st_b38864_0 *v8;  // x0
    st_b38864_0 *v9;  // x0
    st_b38864_0 *v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6fbc4(a1, "bits");
    if (v2)
    {
        v3 = sub_a6fe3c(v2, sub_9ffc20(a0));
        if (!(unsigned int)v3)
            return v3;
    }
    v4 = sub_a6fbc4(a1, "security-bits");
    if (v4)
    {
        v5 = sub_a6fe3c(v4, sub_9ffc68(a0));
        if (!(unsigned int)v5)
            return v5;
    }
    v6 = sub_a6fbc4(a1, "max-size");
    if (v6)
    {
        v7 = sub_a6fe3c(v6, sub_9ffc34(a0));
        if (!(unsigned int)v7)
            return v7;
    }
    v8 = sub_a6fbc4(a1, "encoded-pub-key");
    if (v8)
    {
        if (v8->field_8 == 5)
        {
            v9 = sub_9ff4b4(a0, &v8->field_10, v8->field_18, 0);
            v8->field_20 = v9;
            if (!v9)
                return v9;
        }
        else
        {
            return 0;
        }
    }
    v10 = sub_9fd864(a0, 0, a1);
    if (!(unsigned int)v10)
        return v10;
    return sub_9fd8d8(a0, 0, a1, 1) != 0;
}
