/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ac1cc..0x9ac34c (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ac1cc_0 {
    char *field_0;
    unsigned long long field_8;
} st_9ac1cc_0;


long long sub_9ac1cc(long long *a0, st_9ac1cc_0 *a1)
{
    unsigned long long v2;  // x9
    char *v3;  // x10
    long long v12;  // x2
    long long v4;  // w11
    unsigned long long v5;  // x9
    unsigned long long v6;  // x20
    unsigned long long v7;  // x0
    unsigned long long v8;  // x9
    long long v9;  // x1
    long long *v10;  // x0
    long long v11;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    if (v2 && !(v3 = a1->field_0, v4 = *v3, a1->field_0 = v3 + 1, a1->field_8 = v2 - 1, *v3 != 1))
    {
        v5 = v2 - 4;
        if (v2 >= 4 && !(v6 = v3[1] * 0x10000 | v3[2] * 0x100 | v3[3], a1->field_0 = v3 + 4, a1->field_8 = v5, v5 != v6))
        {
            v7 = sub_a6bf4c(v6, "ssl/statem/statem_clnt.c", 2933);
            a0[330] = v7;
            if (v7)
            {
                a0[331] = v6;
                v8 = a1->field_8;
                if (v6 <= a1->field_8)
                {
                    _memcpy();
                    a1->field_0 = &a1->field_0[v6];
                    a1->field_8 = v8 - v6;
                    return 1;
                }
                sub_a368c8();
                v9 = 2941;
LABEL_9ac2c8:
                sub_a369bc("ssl/statem/statem_clnt.c", v9, "tls_process_cert_status_body");
                v10 = a0;
                v11 = 50;
                v12 = 159;
            }
            else
            {
                a0[331] = 0;
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_clnt.c", 2936, "tls_process_cert_status_body");
                v10 = a0;
                v11 = 80;
                v12 = 524303;
            }
        }
        else
        {
            sub_a368c8();
            v9 = 2930;
            goto LABEL_9ac2c8;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 2925, "tls_process_cert_status_body");
        v10 = a0;
        v11 = 50;
        v12 = 329;
    }
    sub_9a58a4(v10, v11, v12, 0);
    return 0;
}
