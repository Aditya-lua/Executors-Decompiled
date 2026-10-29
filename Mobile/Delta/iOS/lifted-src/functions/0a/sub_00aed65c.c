/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaed65c..0xaed8cc (624 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aed65c_0 {
    struct st_aed65c_0 *field_0;
    long long field_8;
} st_aed65c_0;

typedef struct st_aed65c_1 {
    long long field_0;
    struct st_aed65c_0 *field_8;
} st_aed65c_1;

extern long long g_eb8aa8;
extern long long g_eb8b30;

st_aed65c_0 * sub_aed65c(st_aed65c_0 *a0, st_aed65c_0 *a1, st_aed65c_0 *a2, unsigned long long a3)
{
    unsigned long long len;  // x22
    unsigned long long v3;  // 4120
    long long v4;  // x1
    st_aed65c_0 *v5;  // x20
    long long v6;  // x23
    st_aed65c_0 *v7;  // x23
    st_aed65c_1 *v8;  // x24
    st_aed65c_0 *v9;  // x24
    long long v10;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && a1 && a2)
    {
        len = a3;
        v3 = arm64g_calculate_condition(1, a3 & 0xffffffff, 1, 0);
        if (!(v3 & 1))
        {
            if ((int)len < 65)
                goto LABEL_aed728;
LABEL_aed69c:
            sub_a368c8();
            sub_a369bc("crypto/x509/v3_sxnet.c", 173, "SXNET_add_id_INTEGER");
            v4 = 132;
            goto LABEL_aed6e8;
        }
        len = _strlen(a2);
        if (65 <= (int)len)
            goto LABEL_aed69c;
LABEL_aed728:
        v5 = a0->field_0;
        if (a0->field_0)
        {
LABEL_aed734:
            if ((int)sub_ad69e4(v5->field_8) >= 1)
            {
                v7 = 0;
                while (1)
                {
                    v8 = sub_ad69f8(v5->field_8, v7);
                    if (!sub_9c0ffc(v8->field_0, a1))
                        break;
                    v7 = (unsigned int)v7 + 1;
                    if ((int)(unsigned int)v7 >= (int)sub_ad69e4(v5->field_8))
                        goto LABEL_aed7f8;
                }
                if (!v8->field_8)
                    goto LABEL_aed7f8;
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_sxnet.c", 188, "SXNET_add_id_INTEGER");
                sub_a36abc(0x22, 133, 0);
                if (!a0->field_0)
                    goto LABEL_aed8b8;
            }
            else
            {
LABEL_aed7f8:
                v6 = 524301;
                v9 = sub_9cde20(&g_eb8aa8);
                if (!v9)
                {
                    v10 = 195;
                }
                else if (sub_9c026c(v9->field_8, a2, len))
                {
                    if (sub_ad68a0(v5->field_8, v9))
                    {
                        sub_9cf124(v9->field_0);
                        v9->field_0 = a1;
                        a0->field_0 = v5;
                        return 1;
                    }
                    v6 = 524303;
                    v10 = 0xcc;
                }
                else
                {
                    v10 = 200;
                }
LABEL_aed874:
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_sxnet.c", v10, "SXNET_add_id_INTEGER");
                sub_a36abc(0x22, v6, 0);
                sub_9cd960(v9, &g_eb8aa8);
                if (!a0->field_0)
                {
LABEL_aed8b8:
                    sub_9cd960(v5, &g_eb8b30);
                }
            }
        }
        else
        {
            v6 = 524301;
            v5 = sub_9cde20(&g_eb8b30);
            if (v5)
            {
                if (sub_9c19dc(v5->field_0, 0))
                    goto LABEL_aed734;
                v9 = 0;
                v10 = 182;
                goto LABEL_aed874;
            }
            else
            {
                v9 = 0;
                v10 = 178;
                goto LABEL_aed874;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_sxnet.c", 167, "SXNET_add_id_INTEGER");
        v4 = 107;
LABEL_aed6e8:
        sub_a36abc(0x22, v4, 0);
    }
    return 0;
}
