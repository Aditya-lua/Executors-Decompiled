/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a5538..0x9a565c (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a5538_0 {
    struct st_9a5538_1 *field_0;
    long long field_8;
} st_9a5538_0;

typedef struct st_9a5538_1 {
    char field_0;
} st_9a5538_1;


long long sub_9a5538(void* a0, st_9a5538_0 *a1)
{
    long long v2;  // x8
    char *v3;  // x22
    long long v4;  // x20
    unsigned long long v5;  // x23
    char *v6;  // x24
    unsigned long long v7;  // x23
    unsigned long v8;  // x21
    void* v9;  // x0
    long long v10;  // x1
    long long v11;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(long long)a0[5544])
    {
        *(unsigned short *)&a0[2898] = 0;
        return 1;
    }
    v2 = a1->field_8;
    if (v2 && !(v3 = a1->field_0, v4 = v2 - 1, v4 != *v3))
    {
        a1->field_0 = &v3[v2];
        a1->field_8 = 0;
        if (v4)
        {
            v5 = (long long)a0[5552];
            if ((long long)a0[5552])
            {
                v6 = (long long)a0[5544];
                do
                {
                    v7 = v5;
                    v8 = *v6;
                    v6 += 1;
                    if (_memchr(v3 + 1, v8, v4))
                    {
                        *(char *)&a0[2898] = v8;
                        *(char *)&a0[2899] = 1;
                        return 1;
                    }
                } while ((v5 = v7 - 1, v7 != 1));
            }
            *(char *)&a0[2899] = 2;
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_srvr.c", 2437, "tls_parse_ctos_server_cert_type");
            v9 = a0;
            v10 = 43;
        }
        else
        {
            sub_a368c8();
            v11 = 2422;
LABEL_9a55f4:
            sub_a369bc("ssl/statem/extensions_srvr.c", v11, "tls_parse_ctos_server_cert_type");
            v9 = a0;
            v10 = 50;
        }
    }
    else
    {
        sub_a368c8();
        v11 = 2417;
        goto LABEL_9a55f4;
    }
    sub_9a58a4(v9, v10, 110, 0);
    return 0;
}
