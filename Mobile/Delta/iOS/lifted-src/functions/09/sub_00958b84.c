/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x958b84..0x958e4c (712 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_958b84_2 {
    char padding_0[28];
    unsigned int field_1c;
    char padding_20[88];
    struct st_958b84_0 *field_78;
} st_958b84_2;

typedef struct st_958b84_3 {
    char padding_0[8];
    struct st_958b84_1 *field_8;
    char padding_10[104];
    struct st_958b84_0 *field_78;
    char padding_80[1168];
    long long field_510;
    char field_518;
    char padding_519[7];
    long long field_520;
    char padding_528[856];
    struct st_958b84_2 *field_880;
    char padding_888[208];
    struct st_958b84_0 *field_958;
    char padding_960[48];
    struct st_958b84_0 *field_990;
    unsigned long long field_998;
} st_958b84_3;

typedef struct st_958b84_0 {
    struct st_958b84_0 *field_0;
} st_958b84_0;

typedef struct st_958b84_1 {
    long long field_0;
    char padding_8[32];
    struct st_958b84_0 *field_28;
    char padding_30[120];
    struct st_958b84_0 *field_a8;
    char padding_b0[960];
    long long field_470;
} st_958b84_1;


st_958b84_0 ** sub_958b84(st_958b84_3 *a0, st_958b84_0 **a1, st_958b84_0 **a2)
{
    st_958b84_0 **v2;  // w0
    st_958b84_1 *v3;  // x24
    st_958b84_0 **v12;  // x0
    st_958b84_0 **v4;  // x23
    st_958b84_0 **v5;  // x0
    st_958b84_0 **v6;  // x19
    long long v7;  // x1
    long long v8;  // x22
    unsigned int v10;  // w0
    st_958b84_0 **v11;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        v2 = (st_958b84_0 **)(unsigned int)sub_ad69e4(a1);
        if (a2)
            return 0;
        if (!v2)
            return 0;
    }
    else if (!a2)
    {
        return 0;
    }
    v3 = a0->field_8;
    v4 = a0->field_880->field_78;
    if (!a0->field_880->field_78)
        v4 = v3->field_28;
    v5 = sub_af50b4(v3->field_0, v3->field_470);
    if (!v5)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_cert.c", 452, "ssl_verify_internal");
        sub_a36abc(20, 0x8000b, 0);
        return 0;
    }
    v6 = v5;
    if (a1)
    {
        if (sub_af5208(v6, v4, sub_ad69f8(a1, 0), a1))
            goto LABEL_958c80;
        sub_a368c8();
        v7 = 459;
        goto LABEL_958e10;
    }
    else
    {
        if (sub_af51d0(v6, v4, a2))
        {
LABEL_958c80:
            v8 = sub_975ff4(v6);
            sub_986440(v8, sub_962ea8(a0));
            sub_af5e78(v6, a0->field_880->field_1c & 0x30000);
            if (!sub_af5094(v6))
                goto LABEL_958e28;
            if ((int)sub_ad69e4(a0->field_520) >= 1)
                sub_af5e88(v6, &a0->field_518);
            sub_af5df4();
            sub_af8850(v8, a0->field_510);
            if (a0->field_958)
                sub_af5e80(v6);
            if (v3->field_a8)
                v3->field_a8();
            v10 = sub_af4814(v6);
            v11 = v10 & ~((int)(v10) >> 31);
            a0->field_998 = sub_af509c(v6);
            sub_aded90(a0->field_990);
            a0->field_990 = 0;
            if (a1 && sub_98e304(v6))
            {
                v12 = sub_af50a4(v6);
                a0->field_990 = v12;
                if (!v12)
                {
                    sub_a368c8();
                    sub_a369bc("ssl/ssl_cert.c", 519, "ssl_verify_internal");
                    sub_a36abc(20, 0x8000b, 0);
                    v11 = 0;
                }
            }
            sub_af8a34(a0->field_510, v8);
        }
        else
        {
            sub_a368c8();
            v7 = 464;
LABEL_958e10:
            sub_a369bc("ssl/ssl_cert.c", v7, "ssl_verify_internal");
            sub_a36abc(20, 0x8000b, 0);
LABEL_958e28:
            v11 = 0;
        }
        sub_af5130(v6);
        return v11;
    }
}
