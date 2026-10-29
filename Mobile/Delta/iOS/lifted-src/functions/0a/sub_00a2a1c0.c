/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2a1c0..0xa2a2dc (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2a1c0_1 {
    char padding_0[63];
    struct st_a2a1c0_0 *field_3f;
    struct st_a2a1c0_0 *field_47;
} st_a2a1c0_1;

typedef struct st_a2a1c0_0 {
    char padding_0[16];
    char field_10;
    char field_11;
    char padding_12[62];
    struct st_a2a1c0_0 *field_50;
    struct st_a2a1c0_0 *field_58;
} st_a2a1c0_0;


st_a2a1c0_0 * sub_a2a1c0(st_a2a1c0_0 *a0, long long a1, st_a2a1c0_0 *a2)
{
    st_a2a1c0_0 *v5;  // x20
    st_a2a1c0_0 *v6;  // x0
    st_a2a1c0_0 *v7;  // x0
    st_a2a1c0_0 *v8;  // x0
    st_a2a1c0_0 *v9;  // x0
    st_a2a1c0_1 *v0;  // [bp-0x48]
    st_a2a1c0_0 *v1;  // [bp-0x40]
    st_a2a1c0_0 *v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = 0;
    v2 = 0;
    if (!a0)
        return a0;
    v5 = sub_a6fbc4(a1, "pub");
    if (a2)
    {
        v6 = sub_a6fbc4(a1, "priv");
        if (v5 || v6)
            goto LABEL_a2a228;
    }
    else
    {
        v6 = 0;
        if (v5)
        {
LABEL_a2a228:
            if (v6)
            {
                v7 = sub_a71440();
                if (!(unsigned int)v7)
                {
                    return v7;
                }
                else if (v2 != a0->field_58)
                {
                    sub_a6d4c0(a0->field_50);
                    a0->field_50 = 0;
                    return 0;
                }
            }
            v0 = &a0->field_11;
            if (v5)
            {
                v8 = sub_a71440(v5, &v0, 57, &v1);
                if (!(unsigned int)v8)
                {
                    return v8;
                }
                else if (v1 == a0->field_58)
                {
                    a0->field_10 = a0->field_10 | 1;
                    return 1;
                }
            }
            else
            {
                v9 = sub_a2a0d4(a0);
                if ((unsigned int)v9)
                {
                    a0->field_10 = a0->field_10 | 1;
                    return 1;
                }
                return v9;
            }
        }
    }
    return 0;
}
