/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98a178..0x98a300 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98a178_1 {
    struct st_98a178_0 *field_0;
    char padding_8[112];
    unsigned int field_78;
    char padding_7c[20];
    long long field_90;
    unsigned long long field_98;
    unsigned long long field_a0;
    char field_a8;
} st_98a178_1;

typedef struct st_98a178_0 {
    unsigned int field_0;
    char padding_4[348];
    unsigned long long field_160;
    char padding_168[1816];
    unsigned long long field_880;
} st_98a178_0;

extern long long g_98a3b0;
extern long long g_98a3d4;
extern long long g_98a3d8;
extern long long g_e88728;

unsigned long long sub_98a178(st_98a178_1 *a0)
{
    st_98a178_0 *v5;  // x0
    st_98a178_0 *v6;  // x0
    unsigned long v7;  // x8
    unsigned long long v8;  // x0
    unsigned long long v9;  // w0
    long long v10;  // x1
    long long v11;  // x0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a0->field_0;
    v6 = v5;
    if (v6)
    {
        v7 = v5->field_0;
        if (!(unsigned int)v7)
            goto LABEL_98a1b8;
        v6 = v5;
        if (v7 >> 7 & 1 && !(v5 = sub_980dc8(), v6 = v5, !v6))
        {
LABEL_98a1b8:
            v6 = sub_95f0c4();
            if (v6)
            {
                v8 = sub_9d3c1c(sub_9d8f0c());
                if (v8)
                {
                    sub_95f514(a0->field_0, v8, v8);
                    sub_963068(a0->field_0, 0x100000);
                    sub_993e88(v5, &g_e88728, a0);
                    v9 = (unsigned int)sub_9a0e78(0, v5->field_880 + 128, a0->field_78 != 0, 57, 1184, &g_98a3b0, &g_98a3d4, a0, &g_98a3d8, a0);
                    if (!v9)
                        return v9;
                    v5->field_160 = v5->field_160 | 0x2000;
                    return 1;
                }
                sub_a368c8();
                v10 = 722;
                goto LABEL_98a27c;
                goto LABEL_98a27c;
            }
        }
    }
    sub_a368c8(v6);
    v10 = 718;
LABEL_98a27c:
    sub_a369bc("ssl/quic/quic_tls.c", v10, "ossl_quic_tls_configure");
    v1 = 1;
    v2 = "internal error";
    v0 = 1;
    sub_a36abc(20, 393, "handshake layer error, error code %llu (0x%llx) (\"%s\")");
    if (*(int *)&a0->padding_7c[0])
    {
        v11 = sub_a37190(a0->field_90);
        a0->field_98 = 1;
        a0->field_a0 = "internal error";
        a0->field_a8 = a0->field_a8 | 2;
        sub_a36cd4(v11);
    }
    return 0;
}
