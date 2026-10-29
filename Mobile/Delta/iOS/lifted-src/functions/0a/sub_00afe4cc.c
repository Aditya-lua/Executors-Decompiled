/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafe4cc..0xafe60c (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afe4cc_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    struct st_afe4cc_0 *field_10;
} st_afe4cc_0;


st_afe4cc_0 * sub_afe4cc(st_afe4cc_0 **a0, long long a1, st_afe4cc_0 *a2, long long a3, long long a4, long long a5)
{
    st_afe4cc_0 *v2;  // x0
    st_afe4cc_0 *v3;  // x0
    st_afe4cc_0 *v4;  // x24
    st_afe4cc_0 *v5;  // x0
    st_afe4cc_0 *v6;  // x23
    st_afe4cc_0 *v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
    {
        v2 = sub_a6fbc4(a1, "mac");
        if (!v2)
        {
            a2 = 0;
        }
        else if (v2->field_8 == 4)
        {
            a2 = v2->field_10;
        }
        else
        {
            return 0;
        }
    }
    v3 = sub_a6fbc4(a1, "properties");
    if (v3)
    {
        if (v3->field_8 != 4)
            return 0;
        v4 = v3->field_10;
        if (a2)
            goto LABEL_afe56c;
LABEL_afe528:
        v5 = *a0;
        if (!v5)
            return 1;
    }
    else
    {
        v4 = 0;
        if (!a2)
            goto LABEL_afe528;
LABEL_afe56c:
        v6 = sub_a58724(a5, a2, v4);
        sub_a57f0c(*a0);
        if (v6)
            v7 = sub_a57e48(v6);
        else
            v7 = 0;
        *a0 = v7;
        sub_a58aa4(v6);
        v5 = *a0;
        if (!v5)
            return v5;
    }
    if (!sub_afe250(v5, a1, a3, a4, 0, v4, 0, 0))
    {
        sub_a57f0c(*a0);
        *a0 = 0;
        return 0;
    }
    return 1;
}
