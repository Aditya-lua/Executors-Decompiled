/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb44428..0xb444cc (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b44428_0 {
    struct st_b44428_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
    long long field_18;
} st_b44428_0;


st_b44428_0 * sub_b44428(long long *a0, st_b44428_0 *a1)
{
    long long v2;  // x0
    st_b44428_0 *v3;  // x0
    st_b44428_0 *v4;  // x0
    st_b44428_0 *v5;  // x0
    st_b44428_0 *v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2aec(*a0);
    if (a1 && a1->field_0)
    {
        v3 = sub_afe114(a0 + 2, a1, v2);
        if (!(unsigned int)v3)
            return v3;
        v4 = sub_a6fbc4(a1, "key");
        if (v4)
        {
            if (v4->field_8 == 5)
            {
                v5 = sub_b444cc(a0, v4->field_10, v4->field_18);
                if (!(unsigned int)v5)
                    return v5;
            }
            else
            {
                return 0;
            }
        }
        if (sub_a6fbc4(a1, "tls-data-size"))
        {
            v6 = sub_a70ef8();
            if (!(unsigned int)v6)
                return v6;
        }
    }
    return 1;
}
