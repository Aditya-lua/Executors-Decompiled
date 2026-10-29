/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae6c10..0xae6e1c (524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae6c10_0 {
    struct st_ae6c10_0 *field_0;
    struct st_ae6c10_0 *field_8;
} st_ae6c10_0;

typedef struct st_ae6c10_1 {
    char padding_0[8];
    long long field_8;
    struct st_ae6c10_0 *field_10;
} st_ae6c10_1;

extern long long g_ae75b0;
extern long long g_afa344;
extern long long g_eb6850;

st_ae6c10_0 * sub_ae6c10(st_ae6c10_0 **a0, long long a1, st_ae6c10_1 *a2)
{
    st_ae6c10_0 *v2;  // x21
    st_ae6c10_0 *v3;  // x0
    st_ae6c10_0 *v13;  // x0
    st_ae6c10_0 *v14;  // x8
    st_ae6c10_0 *v4;  // x21
    st_ae6c10_0 *v5;  // x0
    st_ae6c10_0 *v6;  // x22
    st_ae6c10_0 *v7;  // w0
    st_ae6c10_0 *v8;  // x19
    long long v9;  // x20
    long long v10;  // x22
    st_ae6c10_0 *v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2->field_10;
    if (!v2)
    {
        v8 = 0;
        v9 = 124;
        v10 = 74;
        goto LABEL_ae6cac;
    }
    if (_strncmp(a2->field_8, "fullname", 8))
    {
        if (_strcmp(a2->field_8, "relativename"))
            return 0;
        v3 = sub_afa384();
        if (!v3)
            return 0xffffffff;
        v4 = v3;
        v5 = sub_ae4a14(a1, a2->field_10);
        if (!v5)
        {
            sub_a368c8(sub_afa390(v4));
            sub_a369bc("crypto/x509/v3_crld.c", 92, "set_dist_point_name");
            sub_a36abc(0x22, 150, 0);
            return 0xffffffff;
        }
        v6 = v5;
        v7 = (st_ae6c10_0 *)(unsigned int)sub_af083c(v4, v6, 0x1001);
        sub_ae4a74(a1, v6);
        v8 = v4->field_0;
        v4->field_0 = 0;
        sub_afa390(v4);
        if (v7 && (int)sub_ad69e4(v8) >= 1)
        {
            v2 = 0;
            if (!*(int *)(sub_ad69f8(v8, sub_ad69e4(v8) - 1) + 16))
            {
LABEL_ae6c9c:
                if (*a0)
                {
                    v9 = 160;
                    v10 = 115;
                    goto LABEL_ae6cac;
                }
                else
                {
                    v13 = sub_9cde20(&g_eb6850);
                    *a0 = v13;
                    if (v13)
                    {
                        if (v2)
                        {
                            *(unsigned int *)&v13->field_0 = 0;
                            v13->field_8 = v2;
                            return 1;
                        }
                        v14 = v13;
                        *(unsigned int *)&v14->field_0 = 1;
                        v14->field_8 = v8;
                        return 1;
                    }
LABEL_ae6cd8:
                    v11 = v2;
                }
            }
            else
            {
                v9 = 161;
                v10 = 108;
LABEL_ae6cac:
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_crld.c", v10, "set_dist_point_name");
                sub_a36abc(0x22, v9, 0);
                goto LABEL_ae6cd8;
            }
        }
        else
        {
            v11 = 0;
        }
    }
    else
    {
        v2 = sub_ae702c(a1, v2);
        v8 = 0;
        v11 = 0;
        if (v2)
            goto LABEL_ae6c9c;
    }
    sub_ad6958(v11, &g_ae75b0);
    sub_ad6958(v8, &g_afa344);
    return 0xffffffff;
}
