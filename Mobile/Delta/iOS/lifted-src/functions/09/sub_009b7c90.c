/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b7c90..0x9b7e14 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b7c90_0 {
    struct st_9b7c90_1 *field_0;
    long long field_8;
} st_9b7c90_0;

typedef struct st_9b7c90_1 {
    unsigned short field_0;
} st_9b7c90_1;

typedef struct st_9b7c90_3 {
    char padding_0[2304];
    struct st_9b7c90_2 *field_900;
    char padding_908[744];
    long long field_bf0;
    char padding_bf8[32];
    unsigned long long field_c18;
} st_9b7c90_3;

typedef struct st_9b7c90_2 {
    char padding_0[864];
    unsigned long long field_360;
} st_9b7c90_2;


unsigned long long sub_9b7c90(st_9b7c90_3 *a0, st_9b7c90_0 *a1)
{
    unsigned long v2;  // x9
    unsigned long v3;  // x8
    unsigned short *v4;  // x0
    unsigned long v5;  // x8
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    long long v9;  // x2
    st_9b7c90_3 *v10;  // x0
    long long v11;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8 - 2;
    if ((unsigned long long)a1->field_8 >= 2)
    {
        v3 = *(short *)a1->field_0;
        v4 = a1->field_0 + 1;
        v5 = (unsigned int)((v3 & 0xff00) >> 8) | (unsigned int)v3 * 0x100 & 0xff00ff00;
        a1->field_0 = v4;
        a1->field_8 = v2;
        if (v5 > v2)
            goto LABEL_9b7cc4;
        a1->field_0 = (char *)v4 + v5;
        a1->field_8 = v2 - v5;
        v6 = sub_9e4db0(v4, v5, 0);
        a0->field_c18 = v6;
        if (!v6)
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_srvr.c", 3225, "tls_process_cke_srp");
            v10 = a0;
            v11 = 80;
            v9 = 524291;
        }
        else if (!(sub_9e53a8() >> 31 & 1) || sub_9e4828(a0->field_c18))
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_srvr.c", 3229, "tls_process_cke_srp");
            v10 = a0;
            v11 = 47;
            v9 = 371;
        }
        else
        {
            sub_a6c2e4(a0->field_900->field_360, "ssl/statem/statem_srvr.c", 3232);
            v7 = sub_a6d9b4(a0->field_bf0, "ssl/statem/statem_srvr.c", 3233);
            a0->field_900->field_360 = v7;
            if (v7)
                return sub_970d44(a0) != 0;
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_srvr.c", 3235, "tls_process_cke_srp");
            v9 = 524303;
            v10 = a0;
            v11 = 80;
        }
    }
    else
    {
LABEL_9b7cc4:
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 3221, "tls_process_cke_srp");
        v10 = a0;
        v11 = 50;
        v9 = 347;
    }
    sub_9a58a4(v10, v11, v9, 0);
    return 0;
}
