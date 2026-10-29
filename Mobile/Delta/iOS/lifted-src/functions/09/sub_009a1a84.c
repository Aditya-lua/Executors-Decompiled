/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a1a84..0x9a1d74 (752 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a1a84_0 {
    void* field_0;
    long long field_8;
} st_9a1a84_0;

extern long long g_afa308;

long long sub_9a1a84(void* a0, st_9a1a84_0 *a1, unsigned long a2, long long a3)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    long long v20;  // w11
    long long v21;  // x9
    unsigned long v22;  // x10
    long long i;  // x22
    unsigned short *v24;  // x24
    void* v25;  // x19
    long long v26;  // x0
    unsigned long v27;  // x8
    long long v28;  // x20
    long long v29;  // x8
    unsigned long long v12;  // x22
    long long v30;  // x0
    long long v31;  // x21
    long long v32;  // x1
    unsigned long v38;  // x10
    long long v39;  // x20
    unsigned long long v13;  // x21
    void* v40;  // x8
    void* v41;  // x21
    long long v42;  // x0
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    long long v17;  // x9
    void* v18;  // x8
    void* v19;  // x10
    unsigned short *v0;  // [bp-0x48], Other Possible Types: void*
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    if (a3)
    {
        return 1;
    }
    else if (!(int)a0[1288])
    {
        v1 = v10;
        v2 = v11;
        v3 = v12;
        v4 = v13;
        v5 = v14;
        v6 = v15;
        v7 = &v9;
        v8 = v16;
        v17 = a1->field_8;
        if (v17)
        {
            v18 = a1->field_0;
            v19 = v18;
            v20 = *(char *)v19;
            *(int *)&a0[2600] = v20;
            a1->field_0 = v19 + 1;
            a1->field_8 = v17 - 1;
            if (v20 != 1)
            {
                *(int *)&a0[2600] = -0x1;
                return 1;
            }
            v21 = v17 - 3;
            if ((unsigned long long)v17 < 3 || (v22 = (short)v18[1], i = (unsigned int)((v22 & 0xff00) >> 8) | (unsigned int)v22 * 0x100 & 0xff00ff00, (unsigned long long)i > (unsigned long long)v21))
            {
                v25 = a0;
                sub_a368c8();
                v32 = 357;
            }
            else
            {
                v24 = v18 + 3;
                a1->field_0 = (char *)v24 + i;
                a1->field_8 = v21 - i;
                v25 = a0;
                sub_ad6958((long long)a0[2624], sub_a9b2c0);
                if (i)
                {
                    v26 = sub_ad61b4();
                    *(long long *)&v25[2624] = v26;
                    if (!v26)
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/extensions_srvr.c", 369, "tls_parse_ctos_status_request");
                        sub_9a58a4(v25, 80, 0x8000f, 0);
                        return 0;
                    }
                    do
                    {
                        if (i == 1 || !(v27 = *v24, v28 = (unsigned int)((v27 & 0xff00) >> 8) | (unsigned int)v27 * 0x100 & 0xff00ff00, v29 = i - 2, i = v29 - v28, (unsigned long long)v29 >= (unsigned long long)v28 && v28))
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/statem/extensions_srvr.c", 383, "tls_parse_ctos_status_request");
                            sub_9a58a4(v25, 50, 110, 0);
                            return 0;
                        }
                        v0 = v24 + 1;
                        v30 = sub_a9b2a8(0, &v0, v28);
                        if (!v30)
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/statem/extensions_srvr.c", 391, "tls_parse_ctos_status_request");
                            sub_9a58a4(v25, 50, 110, 0);
                            return 0;
                        }
                        v31 = v30;
                        v24 = (char *)v0 + v28;
                        if (v0 != v24)
                        {
                            sub_a368c8(sub_a9b2c0(v31));
                            sub_a369bc("ssl/statem/extensions_srvr.c", 397, "tls_parse_ctos_status_request");
                            sub_9a58a4(v25, 50, 110, 0);
                            return 0;
                        }
                        if (!sub_ad68a0((long long)v25[2624], v31))
                        {
                            sub_a368c8(sub_a9b2c0(v31));
                            sub_a369bc("ssl/statem/extensions_srvr.c", 404, "tls_parse_ctos_status_request");
                            sub_9a58a4(v25, 80, 0xc0103, 0);
                            return 0;
                        }
                    } while (i);
                }
                else
                {
                    *(unsigned long long *)&v25[2624] = 0;
                }
                if ((unsigned long long)a1->field_8 >= 2 && !(v38 = *(short *)a1->field_0, v39 = (unsigned int)((v38 & 0xff00) >> 8) | (unsigned int)v38 * 0x100 & 0xff00ff00, a1->field_8 - 2 != v39))
                {
                    v40 = a1->field_0 + 2;
                    v41 = v40 + v39;
                    a1->field_0 = v41;
                    a1->field_8 = 0;
                    if (!v39)
                        return 1;
                    v0 = v40;
                    sub_ad6958((long long)v25[2632], &g_afa308);
                    v42 = sub_afa314(0, &v0, v39);
                    *(long long *)&v25[2632] = v42;
                    if (v42 && v0 == v41)
                        return 1;
                    sub_a368c8();
                    v32 = 423;
                }
                else
                {
                    sub_a368c8();
                    v32 = 412;
                }
            }
        }
        else
        {
            v25 = a0;
            sub_a368c8();
            v32 = 344;
        }
        sub_a369bc("ssl/statem/extensions_srvr.c", v32, "tls_parse_ctos_status_request");
        sub_9a58a4(v25, 50, 110, 0);
        return 0;
    }
    else
    {
        return 1;
    }
}
