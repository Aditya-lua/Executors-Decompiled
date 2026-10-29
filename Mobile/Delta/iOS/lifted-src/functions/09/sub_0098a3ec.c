/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98a3ec..0x98a6b8 (716 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98a3ec_1 {
    struct st_98a3ec_0 *field_0;
    char padding_8[80];
    struct st_98a3ec_2 *field_58;
    char padding_60[24];
    unsigned int field_78;
    char padding_7c[20];
    long long field_90;
    long long field_98;
    long long field_a0;
    char field_a8;
} st_98a3ec_1;

typedef struct st_98a3ec_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    char padding_10[336];
    unsigned long long field_160;
} st_98a3ec_0;

typedef struct st_98a3ec_2 {
    unsigned long long field_0;
} st_98a3ec_2;


long long sub_98a3ec(st_98a3ec_1 *a0)
{
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    long long v22;  // x8
    unsigned long long v23;  // x0
    char v24;  // w0
    unsigned int v25;  // w0
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    unsigned long v17;  // x8
    st_98a3ec_0 *v18;  // x20
    unsigned long v19;  // x8
    long long v20;  // x1
    long long v21;  // x20
    long long v0;  // [bp-0x60]
    long long v1;  // [bp-0x58]
    long long v2;  // [bp-0x50]
    char v3;  // [bp-0x3c]
    char v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    if (a0->field_a8 >> 1 & 1)
        return 0;
    v5 = v12;
    v6 = v13;
    v7 = v14;
    v8 = v15;
    v9 = &v11;
    v10 = v16;
    sub_a36c8c();
    v17 = a0->field_a8;
    if (!(v17 & 1))
    {
        v18 = a0->field_0;
        if (v18 && !(v19 = v18->field_0, (unsigned int)v19 && (!(v19 >> 7 & 1) || (v18 = sub_980dc8(v18), !v18))))
        {
            if (a0->field_78)
            {
                if (*(long long *)(v18->field_8 + 704))
                    goto LABEL_98a4e0;
                sub_a368c8();
                v20 = 799;
            }
            else
            {
                if (!*(long long *)&v18[7].padding_10[264] || !*(long long *)&v18[7].padding_10[272])
                {
                    sub_a368c8();
                    sub_a369bc("ssl/quic/quic_tls.c", 803, "ossl_quic_tls_tick");
                    v21 = "ALPN must be configured when using QUIC";
                    goto LABEL_98a634;
                }
LABEL_98a4e0:
                if (sub_98a178(a0))
                {
                    v18->field_160 = v18->field_160 | 0x4000;
                    if (a0->field_78)
                        sub_95fc24(a0->field_0);
                    else
                        sub_95fe78(a0->field_0);
                    v17 = a0->field_a8 | 1;
                    a0->field_a8 = v17;
                    goto LABEL_98a560;
                }
                else
                {
                    sub_a368c8();
                    v20 = 807;
                }
            }
        }
        else
        {
            sub_a368c8();
            v20 = 788;
        }
        sub_a369bc("ssl/quic/quic_tls.c", v20, "ossl_quic_tls_tick");
        v21 = "internal error";
        v1 = 1;
        v2 = "internal error";
        v0 = 1;
        sub_a36abc(20, 393, "handshake layer error, error code %llu (0x%llx) (\"%s\")");
        if (*(int *)&a0->padding_7c[0])
        {
            sub_a37190(a0->field_90);
            v22 = 1;
            goto LABEL_98a668;
        }
        goto LABEL_98a67c;
    }
    else
    {
LABEL_98a560:
        if (!(v17 >> 2 & 1))
            v23 = sub_95fc90(a0->field_0);
        else
            v23 = sub_9602d0(a0->field_0, 0, 0);
        if ((int)v23 > 0)
        {
            if (a0->field_a8 >> 2 & 1)
            {
                sub_a36cd4();
                return 1;
            }
            sub_9615f0(a0->field_0, &v4, &v3);
            if (v4 && v3)
            {
                a0->field_a8 = a0->field_a8 | 4;
                sub_a36cd4();
                a0->field_58();
            }
            sub_a368c8();
            sub_a369bc("ssl/quic/quic_tls.c", 851, "ossl_quic_tls_tick");
            v21 = "no application protocol negotiated";
LABEL_98a634:
            v1 = 376;
            v2 = v21;
            v0 = 376;
            sub_a36abc(20, 393, "handshake layer error, error code %llu (0x%llx) (\"%s\")");
            if (*(int *)&a0->padding_7c[0])
            {
                sub_a37190(a0->field_90);
                v22 = 376;
LABEL_98a668:
                a0->field_98 = v22;
                a0->field_a0 = v21;
                a0->field_a8 = a0->field_a8 | 2;
                sub_a36cd4();
            }
        }
        else
        {
            v24 = sub_a36e0c();
            v25 = sub_9625ac(a0->field_0, v23, v24 > 0);
            if (12 >= v25 && 1 << ((char)v25 & 31) & 6172)
            {
                sub_a36cd4();
                return 1;
            }
            sub_98a300(a0, 1, "internal error", 842, "ossl_quic_tls_tick");
        }
LABEL_98a67c:
        return 0;
    }
}
