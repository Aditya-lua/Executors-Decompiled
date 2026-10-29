/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae7ff8..0xae81b0 (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae7ff8_0 {
    struct st_ae7ff8_0 *field_0;
    struct st_ae7ff8_0 *field_8;
    struct st_ae7ff8_0 *field_10;
    struct st_ae7ff8_0 *field_18;
} st_ae7ff8_0;

extern unsigned long long g_c7c2eb;

st_ae7ff8_0 * sub_ae7ff8(unsigned long a0, st_ae7ff8_0 *a1, long long a2, unsigned long long a3)
{
    st_ae7ff8_0 *v4;  // x23
    st_ae7ff8_0 **v5;  // x23
    st_ae7ff8_0 *v6;  // x23
    st_ae7ff8_0 *v7;  // x23
    st_ae7ff8_0 **v8;  // x23
    st_ae7ff8_0 *v9;  // x23
    st_ae7ff8_0 **v10;  // x20
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_ist.c", 97, "i2r_issuer_sign_tool");
        sub_a36abc(0x22, 0x80106, 0);
        return 0;
    }
    if (a1->field_0)
    {
        v0 = a3;
        v1 = &g_c7c2eb;
        sub_9d524c(a2, "%*ssignTool    : ");
        sub_9d3fec(a2, a1->field_0->field_8, (int)a1->field_0->field_0);
        v4 = a1;
        v5 = &v4->field_8;
        if (!v4->field_8)
            goto LABEL_ae80ec;
        sub_9d3fec(a2, "\n", 1);
LABEL_ae80c0:
        v0 = a3;
        v1 = &g_c7c2eb;
        sub_9d524c(a2, "%*scATool      : ");
        sub_9d3fec(a2, *v5->field_8, (int)*v5->field_0);
LABEL_ae80ec:
        v7 = a1;
        v8 = &v7->field_10;
        if (!v7->field_10)
            goto LABEL_ae8138;
        sub_9d3fec(a2, "\n", 1);
LABEL_ae810c:
        v0 = a3;
        v1 = &g_c7c2eb;
        sub_9d524c(a2, "%*ssignToolCert: ");
        sub_9d3fec(a2, *v8->field_8, (int)*v8->field_0);
LABEL_ae8138:
        v10 = &a1->field_18;
        if (!a1->field_18)
            return 1;
        sub_9d3fec(a2, "\n", 1);
    }
    else
    {
        v6 = a1;
        v5 = &v6->field_8;
        if (v6->field_8)
            goto LABEL_ae80c0;
        v9 = a1;
        v8 = &v9->field_10;
        if (v9->field_10)
            goto LABEL_ae810c;
        v10 = &a1->field_18;
        if (!a1->field_18)
            return 1;
    }
    v0 = a3;
    v1 = &g_c7c2eb;
    sub_9d524c(a2, "%*scAToolCert  : ");
    sub_9d3fec(a2, *v10->field_8, (int)*v10->field_0);
    return 1;
}
