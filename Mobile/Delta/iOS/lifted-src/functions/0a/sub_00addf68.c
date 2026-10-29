/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaddf68..0xade168 (512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_addf68_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_addf68_0;

typedef struct st_addf68_1 {
    struct st_addf68_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_addf68_1 *field_8;
    struct st_addf68_1 *field_10;
} st_addf68_1;

extern long long g_adde64;

st_addf68_1 * sub_addf68(st_addf68_1 *a0, st_addf68_0 *a1, st_addf68_1 *a2, st_addf68_1 **a3, st_addf68_1 *a4)
{
    st_addf68_1 *v2;  // x0
    st_addf68_1 *v3;  // x25
    st_addf68_1 *v4;  // x0
    st_addf68_1 *v6;  // x23
    st_addf68_1 *v7;  // x0
    long long v8;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3[1] && a3[1] <= *a3)
        return 0;
    v2 = sub_a6bffc(24, "crypto/x509/pcy_node.c", 70);
    if (!v2)
        return v2;
    v2->field_0 = a1;
    *(st_addf68_1 **)&v2->field_1 = a2;
    if (a0)
    {
        v3 = v2;
        if (sub_a99eac(a1->field_8) == 746)
        {
            v2 = v3;
            if (a0->field_8)
            {
                sub_a6c2e4(v2, "crypto/x509/pcy_node.c", 129);
                return 0;
            }
            a0->field_8 = v2;
        }
        else
        {
            v4 = *(long long *)&a0->field_1;
            if (!v4)
            {
                v4 = sub_ad6270(&g_adde64);
                *(st_addf68_1 **)&a0->field_1 = v4;
                if (!v4)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/pcy_node.c", 0x55, "ossl_policy_level_add_node");
                    sub_a36abc(0x22, 0x8000b, 0);
                    sub_a6c2e4(v3, "crypto/x509/pcy_node.c", 129);
                    return 0;
                }
            }
            v2 = v3;
            if (!sub_ad68a0(v4, v3))
            {
                sub_a368c8(v2);
                sub_a369bc("crypto/x509/pcy_node.c", 89, "ossl_policy_level_add_node");
                sub_a36abc(0x22, 0x8000f, 0);
                sub_a6c2e4(v3, "crypto/x509/pcy_node.c", 129);
                return 0;
            }
        }
    }
    if (a4)
    {
        v6 = v2;
        v7 = a3[4];
        if (v7 || !(v7 = sub_ad61b4(NULL), a3[4] = v7, !v7))
        {
            v2 = v6;
            if (sub_ad68a0(v7, a1))
                goto LABEL_ade050;
            v8 = 103;
        }
        else
        {
            v8 = 99;
        }
        sub_a368c8();
        sub_a369bc("crypto/x509/pcy_node.c", v8, "ossl_policy_level_add_node");
        sub_a36abc(0x22, 0x8000f, 0);
        v2 = v6;
        if (!a0)
        {
            sub_a6c2e4(v2, "crypto/x509/pcy_node.c", 129);
            return 0;
        }
        else if (a0->field_8 != v2)
        {
            sub_ad692c(*(long long *)&a0->field_1);
            sub_a6c2e4(v6, "crypto/x509/pcy_node.c", 129);
            return 0;
        }
        else
        {
            a0->field_8 = 0;
            sub_a6c2e4(v2, "crypto/x509/pcy_node.c", 129);
            return 0;
        }
    }
    else
    {
LABEL_ade050:
        *a3 = (char *)&*a3->field_0 + 1;
        if (!a2)
            return v2;
        *(int *)&a2->field_8 = (int)a2->field_8 + 1;
        return v2;
    }
}
