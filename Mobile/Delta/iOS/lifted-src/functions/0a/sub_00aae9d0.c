/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaae9d0..0xaaec5c (652 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aae9d0_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    struct st_aae9d0_0 *field_10;
} st_aae9d0_0;


st_aae9d0_0 * sub_aae9d0(st_aae9d0_0 *a0, st_aae9d0_0 **a1, long long a2, long long a3)
{
    st_aae9d0_0 *v3;  // x23
    st_aae9d0_0 *v4;  // x25
    st_aae9d0_0 *v5;  // x22
    st_aae9d0_0 *v6;  // x24
    st_aae9d0_0 *v7;  // x21
    st_aae9d0_0 *v8;  // x20
    st_aae9d0_0 *v9;  // x26
    st_aae9d0_0 *v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0)
        return a0;
    v3 = sub_a6fbc4(a2, "properties");
    v4 = sub_a6fbc4(a2, "digest");
    v5 = sub_a6fbc4(a2, "mgf");
    v6 = sub_a6fbc4(a2, "mgf1-digest");
    v7 = sub_a6fbc4(a2, "saltlen");
    if (v3)
    {
        if (v3->field_8 == 4)
            goto LABEL_aaea7c;
        if (*(int *)a1)
            goto LABEL_aaea84;
LABEL_aaeab8:
        if (!v4 && !v5 && !v6 && !v7)
        {
            sub_a3f52c(0);
            sub_a3f52c(0);
            return 1;
        }
        if (!sub_ab8bf4(a0))
            return 0;
        *(unsigned int *)a1 = 1;
        if (!v5)
            goto LABEL_aaeb20;
LABEL_aaea88:
        sub_ab8cbc(0);
        v0 = 0;
        if (v5->field_8 == 4)
        {
            v9 = v5->field_10;
            v0 = v9;
            goto LABEL_aaeaf0;
        }
        if (sub_a7168c(v5, &v0))
        {
            v9 = v5->field_10;
LABEL_aaeaf0:
            if (!sub_a6e200(v9, sub_ab8fcc()))
                goto LABEL_aaeb20;
        }
        return 0;
    }
    else
    {
LABEL_aaea7c:
        if (!*(int *)a1)
            goto LABEL_aaeab8;
LABEL_aaea84:
        if (v5)
            goto LABEL_aaea88;
LABEL_aaeb20:
        if (v4)
        {
            v0 = 0;
            if (v4->field_8 == 4)
            {
                v0 = v4->field_10;
                goto LABEL_aaeb5c;
            }
            else if (sub_a7168c(v5, &v0))
            {
LABEL_aaeb5c:
                v4 = sub_a40ca8(a3);
                if (v4 && sub_ab8c68(a0, sub_ab8e28(v4)))
                    goto LABEL_aaeb88;
            }
            else
            {
                v4 = 0;
            }
        }
        else
        {
LABEL_aaeb88:
            if (!v6)
            {
                v8 = 0;
                goto LABEL_aaebf0;
            }
            v0 = 0;
            if (v6->field_8 == 4)
            {
                v0 = v6->field_10;
                goto LABEL_aaebc4;
            }
            if (sub_a7168c(v5, &v0))
            {
LABEL_aaebc4:
                v8 = sub_a40ca8(a3);
                if (!v8)
                {
                    sub_a3f52c(v4);
                    sub_a3f52c(v8);
                    return 0;
                }
                if (sub_ab8c78(a0, sub_ab8e28(v8)))
                {
LABEL_aaebf0:
                    if (!v7)
                    {
                        sub_a3f52c(v4);
                        sub_a3f52c(v8);
                        return 1;
                    }
                    else if (sub_a6fc2c(v7, &v0) && sub_ab8c88(a0, (unsigned int)v0))
                    {
                        sub_a3f52c(v4);
                        sub_a3f52c(v8);
                        return 1;
                    }
                }
                goto LABEL_aaec24;
            }
        }
        v8 = 0;
LABEL_aaec24:
        sub_a3f52c(v4);
        sub_a3f52c(v8);
        return 0;
    }
}
