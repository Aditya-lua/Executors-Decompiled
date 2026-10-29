/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x981520..0x9816f8 (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_981520_2 {
    char padding_0[24];
    struct st_981520_1 *field_18;
    char padding_20[24];
    long long field_38;
    char padding_40[64];
    uint128_t field_80;
} st_981520_2;

typedef struct st_981520_1 {
    struct st_981520_1 *field_0;
    struct st_981520_0 *field_8;
    char padding_10[32];
    struct st_981520_1 *field_30;
    char padding_38[1000];
    long long field_420;
    char padding_428[504];
    unsigned long long field_620;
    char padding_628[24];
    struct st_981520_1 *field_640;
} st_981520_1;

typedef struct st_981520_0 {
    char padding_0[1760];
    struct st_981520_1 *field_6e0;
} st_981520_0;


st_981520_1 * sub_981520(st_981520_2 *a0, st_981520_1 *a1, long long a2, unsigned int a3, unsigned int a4)
{
    st_981520_1 *v8;  // x19
    st_981520_1 *v9;  // x0
    st_981520_2 *v0;  // [bp-0x80]
    uint128_t v1;  // [bp-0x78]
    long long v2;  // [bp-0x68]
    st_981520_1 *v3;  // [bp-0x60], Other Possible Types: unsigned int
    st_981520_1 *v4;  // [bp-0x50]
    unsigned int v5;  // [bp-0x4c]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v3 = (st_981520_1 *)0;
    v4 = (st_981520_1 *)0;
    v0 = a0;
    v1 = a0->field_80;
    v2 = a2;
    v3 = a3;
    v5 = a4;
    v8 = sub_976edc(&v0);
    if (!v8)
    {
        sub_983138(a2);
        return v8;
    }
    if (a1)
    {
        v8->field_30 = a1;
        v8->field_620 = v8->field_620 | 0x20000000000;
        if (a1->field_8->field_6e0)
        {
            sub_a6c2e4(v8->field_640, "ssl/quic/quic_port.c", 558);
            v9 = sub_a6d9b4(v8->field_30->field_8->field_6e0, "ssl/quic/quic_port.c", 559);
            v8->field_640 = v9;
            if (v9)
                goto LABEL_98167c;
            sub_976fa4(v8);
        }
        else
        {
LABEL_98167c:
            if (sub_976730(v8))
            {
                sub_9857d8(v8->field_420, a0->field_38);
                return v8;
            }
            sub_a6c2e4(v8, "ssl/quic/quic_port.c", 570);
        }
    }
    else if (a0->field_18)
    {
        a0->field_18();
    }
    else
    {
        sub_c62050(v8);
    }
    return 0;
}
