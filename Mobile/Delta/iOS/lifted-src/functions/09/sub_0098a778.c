/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98a778..0x98aa38 (704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98a778_2 {
    char padding_0[56];
    struct st_98a778_3 *field_38;
    char padding_40[60];
    struct st_98a778_1 *field_7c;
    char padding_84[36];
    char field_a8;
} st_98a778_2;

typedef struct st_98a778_3 {
    unsigned long long field_0;
} st_98a778_3;

typedef struct st_98a778_1 {
    unsigned int field_0[2];
    struct st_98a778_1 *field_8;
    struct st_98a778_1 *field_10;
    char field_18;
    char padding_19[31];
    unsigned int field_38;
    char padding_3c[20];
    unsigned long long field_50;
    unsigned long long field_58;
} st_98a778_1;

typedef struct st_98a778_0 {
    struct st_98a778_0 *field_0;
    struct st_98a778_0 *field_8;
    struct st_98a778_0 *field_10;
    char field_18;
    char padding_19[31];
    unsigned int field_38;
    char padding_3c[20];
    unsigned long long field_50;
    unsigned long long field_58;
} st_98a778_0;


st_98a778_0 * sub_98a778(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, st_98a778_0 *a5, unsigned long a6, unsigned long a7, char a8, unsigned long a9, unsigned long a10, unsigned long a11, unsigned long a12, unsigned long a13, unsigned long a14, long long a15, unsigned long a16, unsigned long a17, unsigned long a18, unsigned long a19, long long a20, unsigned long a21, st_98a778_0 *a22, unsigned long a23, unsigned long a24, unsigned long a25, unsigned long a26, unsigned long a27, st_98a778_0 *a28, unsigned long a29, st_98a778_2 *a30, st_98a778_0 **a31)
{
    st_98a778_0 *v1;  // x0
    st_98a778_0 *v2;  // x19
    long long v3;  // x1
    st_98a778_0 **v4;  // x8
    long long v6;  // x1
    char *v0;  // [bp-0x10]

    v0 = &a8;
    v1 = sub_a6bffc(96, "ssl/quic/quic_tls.c", 113);
    if (!v1)
    {
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_tls.c", 118, "quic_new_record_layer");
        sub_a36abc(20, 0xc0103, 0);
        return 0;
    }
    v2 = v1;
    v1->field_0 = a30;
    *(unsigned int *)&v1->field_8 = (unsigned int)a5;
    if (a22 && !sub_9d3d38(a22))
    {
        v2->field_38 = 80;
        sub_a368c8();
        v3 = 125;
        goto LABEL_98a9a0;
    }
    sub_9d3c28(v2->field_10);
    v2->field_10 = a22;
    v2->field_58 = a29;
    *a31 = v2;
    if (a28)
    {
        v4 = &a28->field_8;
        while (1)
        {
            if (*(int *)((char *)v4 - 8) == 2)
            {
                v2->field_50 = *v4;
            }
            else if (!*(int *)((char *)v4 - 8))
            {
                break;
            }
            v4 += 2;
        }
    }
    if (!a5)
        return 1;
    if (!*(int *)&v2->field_0[1].padding_19[3])
        (*(long long *)&v2->field_0->field_38)();
    if (!sub_a4fe08(a15, "AES-128-GCM") && !sub_a4fe08(a15, "AES-256-GCM") && !sub_a4fe08(a15, "CHACHA20-POLY1305"))
    {
        v2->field_38 = 80;
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_tls.c", 168, "quic_new_record_layer");
        v6 = 249;
LABEL_98a9b0:
        sub_a36abc(20, v6, 0);
        v2->field_0[1].padding_3c[12] = v2->field_0[1].padding_3c[12] | 2;
        *a31 = 0;
        sub_9d3c28(v2->field_10);
        sub_a6c2e4(v2, "ssl/quic/quic_tls.c", 207);
        return 0;
    }
    if (sub_a40a98(a20))
        (*(long long *)&v2->field_0->field_38)();
    v2->field_38 = 80;
    sub_a368c8();
    v3 = 175;
LABEL_98a9a0:
    sub_a369bc("ssl/quic/quic_tls.c", v3, "quic_new_record_layer");
    v6 = 786691;
    goto LABEL_98a9b0;
}
