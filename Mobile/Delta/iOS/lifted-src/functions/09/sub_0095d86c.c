/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95d86c..0x95d9b8 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95d86c_0 {
    struct st_95d86c_0 *field_0;
    struct st_95d86c_0 *field_1;
} st_95d86c_0;


st_95d86c_0 * sub_95d86c(st_95d86c_0 **a0, long long a1)
{
    st_95d86c_0 *v5;  // x19
    st_95d86c_0 *ptr;  // x0
    st_95d86c_0 *v7;  // x0
    st_95d86c_0 *v8;  // x21
    st_95d86c_0 *v9;  // x0
    st_95d86c_0 *v0;  // [bp-0x48]
    st_95d86c_0 *v1;  // [bp-0x40]
    st_95d86c_0 *v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = 0;
    v2 = 0;
    v0 = 0;
    v5 = sub_a6d9b4(a1, "ssl/ssl_conf.c", 673);
    if (v5)
    {
        ptr = _strchr(v5, 44);
        if (ptr)
        {
            *(char *)&ptr->field_0 = 0;
            if (*((char *)&ptr->field_0 + 1) && sub_a6dc50((char *)&ptr->field_0 + 1, &v0, 0, &v1) && sub_a6dc50(v5, &v0, 0, &v2))
            {
                v7 = a0[3];
                if (!a0[3])
                    goto LABEL_95d93c;
                goto LABEL_95d8fc;
            }
            goto LABEL_95d94c;
        }
        if (!sub_a6dc50(v5, &v0, 0, &v2))
            goto LABEL_95d94c;
        v1 = v2;
        v7 = a0[3];
        if (v7)
        {
LABEL_95d8fc:
            if (sub_95ef58(v7))
            {
                v8 = 1;
                v9 = a0[4];
                if (v9)
                    goto LABEL_95d994;
            }
            else
            {
                v8 = sub_962bc4(a0[3], v2, v1);
                v9 = a0[4];
                if (v9)
                {
LABEL_95d994:
                    if (sub_95ef48(v9))
                        v8 = 1;
                    else
                        v8 = sub_962c80(a0[4], v2, v1);
                }
            }
        }
        else
        {
LABEL_95d93c:
            v8 = 0;
            v9 = a0[4];
            if (v9)
                goto LABEL_95d994;
        }
    }
    else
    {
LABEL_95d94c:
        v8 = 0;
    }
    sub_a6c2e4(v5, "ssl/ssl_conf.c", 718);
    return v8;
}
