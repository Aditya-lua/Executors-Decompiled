/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x958664..0x9587c0 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_958664_0 {
    struct st_958664_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_958664_0 *field_8;
    struct st_958664_0 *field_10;
    struct st_958664_0 *field_18;
    struct st_958664_0 *field_20;
    struct st_958664_0 *field_28;
    long long field_30;
    char padding_38[8];
    long long field_40;
    char padding_48[8];
    long long field_50;
    char padding_58[24];
    long long field_70;
    long long field_78;
    char field_80;
    char padding_81[39];
    long long field_a8;
} st_958664_0;


void sub_958664(st_958664_0 *a0)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // 4102
    st_958664_0 *v4;  // x21
    st_958664_0 *i;  // x22
    st_958664_0 *v6;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return;
    do
    {
        /* unsupported instruction */;
        v2 = /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v3 = arm64g_calculate_condition(19, v2, 1, 0);
    if (!(v3 & 1))
    {
        /* unsupported instruction */;
    }
    else if ((int)v2 > 1)
    {
        return;
    }
    sub_a5a4c8(*(long long *)&a0->field_1);
    if (a0->field_20)
    {
        v4 = 0;
        i = 0;
        do
        {
            v6 = a0->field_18 + v4;
            sub_afc404(v6->field_0);
            v6->field_0 = 0;
            sub_a5a4c8(*(long long *)&v6->field_1);
            *(unsigned long long *)&v6->field_1 = 0;
            sub_aded90(v6->field_8);
            v6->field_8 = 0;
            sub_a6c2e4(v6->field_10, "ssl/ssl_cert.c", 0x101);
            i = (char *)&i->field_0 + 1;
            v6->field_10 = 0;
            v6->field_18 = 0;
            v4 = &v4->field_20;
        } while (i < a0->field_20);
    }
    sub_a6c2e4(a0->padding_38, "ssl/ssl_cert.c", 285);
    sub_a6c2e4(a0->padding_48, "ssl/ssl_cert.c", 286);
    sub_a6c2e4(a0->field_28, "ssl/ssl_cert.c", 287);
    sub_af295c(a0->field_70);
    sub_af295c(*(long long *)&a0->padding_58[16]);
    sub_9a0d50(&a0->field_78);
    sub_a6c2e4(*(long long *)&a0->padding_81[31], "ssl/ssl_cert.c", 292);
    sub_a6c2e4(a0->field_18, "ssl/ssl_cert.c", 294);
    sub_a6c2e4();
    return;
}
