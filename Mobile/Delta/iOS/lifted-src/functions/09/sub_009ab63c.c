/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ab63c..0x9ab924 (744 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ab63c_0 {
    char padding_0[200];
    struct st_9ab63c_1 *field_c8;
} st_9ab63c_0;

typedef struct st_9ab63c_3 {
    int field_0;
    char padding_4[212];
    struct st_9ab63c_2 *field_d8;
} st_9ab63c_3;

typedef struct st_9ab63c_5 {
    char padding_0[8];
    struct st_9ab63c_0 *field_8;
    char padding_10[8];
    struct st_9ab63c_3 *field_18;
    char padding_20[40];
    unsigned int field_48;
    char padding_4c[2100];
    struct st_9ab63c_4 *field_880;
    char padding_888[300];
    char field_9b4;
} st_9ab63c_5;

typedef struct st_9ab63c_1 {
    unsigned int field_0;
} st_9ab63c_1;

typedef struct st_9ab63c_2 {
    char padding_0[80];
    char field_50;
} st_9ab63c_2;

typedef struct st_9ab63c_4 {
    char padding_0[28];
    unsigned int field_1c;
    char padding_20[64];
    struct st_9ab63c_1 *field_60;
} st_9ab63c_4;


unsigned long long sub_9ab63c(st_9ab63c_5 *a0, unsigned int a1)
{
    st_9ab63c_0 *v4;  // x21
    unsigned int v5;  // x20
    unsigned long long v6;  // x0
    unsigned int v7;  // x0
    unsigned int v0;  // [bp-0x40]
    unsigned int v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    if (a1 != 5)
    {
        if (a1 != 4)
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_clnt.c", 3807, "tls_prepare_client_certificate");
            sub_9a58a4(a0, 80, 0xc0103, 0);
            return 0;
        }
        if (a0->field_880->field_60)
            a0->field_880->field_60();
        if (sub_96cc84(a0, 0) && *(long long *)&a0->padding_4c[900] && (!(a0->field_880->field_1c & 196609) || sub_96baa8(a0, 0, 0, 0, 0xfffffffe)))
            goto LABEL_9ab8c8;
    }
    v4 = a0->field_8;
    if (*(long long *)&v4[2].padding_0[104] && !(v5 = sub_970614(a0, &v1, &v0), !v5))
    {
        if (v5 >> 31 & 1)
        {
            *(unsigned int *)&a0->padding_4c[28] = 4;
            return 5;
        }
    }
    else
    {
        if (v4->field_c8)
            v4->field_c8();
        v5 = 0;
    }
    *(unsigned int *)&a0->padding_4c[28] = 1;
    if (v5 == 1 && v0 && v1)
    {
        if (!sub_9643f8(a0) || !sub_96466c(a0, v0))
            goto LABEL_9ab7f0;
        v5 = 1;
    }
    else if (v5 == 1)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 3775, "tls_prepare_client_certificate");
        sub_a36abc(20, 106, 0);
LABEL_9ab7f0:
        v5 = 0;
    }
    sub_afc404(v1);
    sub_a5a4c8(v0);
    if (!v5 || !sub_96cc84(a0, 0) || !*(long long *)&a0->padding_4c[900] || a0->field_880->field_1c & 196609 && !sub_96baa8(a0, 0, 0, 0, 0xfffffffe))
    {
        if (a0->field_48 == 0x300)
        {
            *(unsigned int *)&a0->padding_4c[756] = 0;
            sub_957628(a0, 1, 41);
            return 2;
        }
        *(unsigned int *)&a0->padding_4c[756] = 2;
        *(unsigned int *)&a0[1].padding_4c[315] = 0;
        v6 = sub_9545a8(a0, 0);
        if (!(unsigned int)v6)
            return v6;
    }
    if (a0->field_18->field_d8->field_50 >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000 || a0->field_9b4 & 1)
        *(unsigned int *)&a0[1].padding_4c[315] = 0;
LABEL_9ab8c8:
    if (*(int *)&a0[1].padding_4c[423] == 4)
        v7 = 1;
    else
        v7 = 2;
    return v7;
}
