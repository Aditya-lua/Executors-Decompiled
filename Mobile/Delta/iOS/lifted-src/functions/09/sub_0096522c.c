/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96522c..0x965504 (728 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96522c_1 {
    char padding_0[344];
    struct st_96522c_2 *field_158;
} st_96522c_1;

typedef struct st_96522c_0 {
    char padding_0[24];
    unsigned long long field_18;
    unsigned long long field_20;
} st_96522c_0;

typedef struct st_96522c_2 {
    struct st_96522c_0 *field_0;
} st_96522c_2;

typedef struct st_96522c_3 {
    char padding_0[6];
    unsigned short field_6;
} st_96522c_3;

typedef struct st_96522c_4 {
    unsigned int field_0;
    unsigned short field_4;
    unsigned short field_6;
} st_96522c_4;

extern long long g_965930;
extern long long g_965960;
extern long long g_96597c;
extern long long g_965ac0;

unsigned long long sub_96522c(st_96522c_1 *a0, unsigned long long a1, unsigned long long a2, unsigned long long n)
{
    unsigned long long v2;  // x0
    unsigned int *v3;  // x8
    st_96522c_4 *v12;  // x8
    unsigned long long v13;  // x9
    unsigned long long v14;  // x10
    unsigned long v15;  // x10
    unsigned long v16;  // x24
    unsigned long v17;  // x9
    unsigned long v18;  // x9
    unsigned long long v19;  // x2
    unsigned long v20;  // x8
    long long v21;  // x1
    unsigned long long v4;  // x21
    unsigned long long v22;  // w0
    long long v23;  // x1
    long long v24;  // x1
    unsigned long long v5;  // x0
    unsigned long long v6;  // x9
    st_96522c_3 *v7;  // x8
    unsigned long v8;  // x10
    unsigned long v9;  // x10
    unsigned long v10;  // x9
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && a2 && n)
    {
        if (a1 == 1)
        {
            v2 = sub_a6bf4c(n + 4, "ssl/ssl_rsa.c", 818);
            if (!v2)
                return v2;
            v3 = v2;
            *v3 = (unsigned int)(1.724153959e-314 >> 0);
            v4 = v2;
            _memcpy(v3 + 1, a2, n);
            v5 = sub_96522c(a0, 2, v4, n + 4);
            sub_a6c2e4(v4, "ssl/ssl_rsa.c", 827);
            return v5;
        }
        if (a1 == 2 && (long long)n >= 0)
        {
            v6 = n;
            v7 = a2;
            do
            {
                if (v6 < 4 || (v6 >> 1 & 0x7fffffffffffffff | 1) == 3 || (v8 = v7->field_6, v9 = (unsigned int)((v8 & 0xff00) >> 8) | (unsigned int)v8 * 0x100 & 0xff00ff00, v10 = v6 - 8, v10 < v9))
                    goto LABEL_965470;
            } while ((v7 = &v7->padding_0[v9 + 8], v6 = v10 - v9, v10 != v9));
            if (*(long long *)a0->field_158)
            {
                v11 = sub_a6c1b4(*(long long *)(*(long long *)a0->field_158 + 24), n, "ssl/ssl_rsa.c", 840);
                if (!v11)
                    return v11;
                *(unsigned long long *)(*(long long *)a0->field_158 + 24) = v11;
                _memcpy();
                v12 = a2;
                v13 = n;
                *(unsigned long long *)(*(long long *)a0->field_158 + 32) = n;
                while (v13 >= 4 && (v14 = v13 & 0xfffffffffffffffe, (v13 & 0xfffffffffffffffe) != 4 && (v13 & 0xfffffffffffffffe) != 6 && (v15 = v12->field_6, v16 = (unsigned int)((v15 & 0xff00) >> 8) | (unsigned int)v15 * 0x100 & 0xff00ff00, v17 = v13 - 8, v17 >= v16)))
                {
                    v18 = v12->field_0;
                    v19 = (((((v18 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v18 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v18 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v18 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                    v20 = v12->field_4;
                    v21 = (unsigned int)((v20 & 0xff00) >> 8) | (unsigned int)v20 * 0x100 & 0xff00ff00;
                    if (v19 == 464)
                        v22 = (unsigned int)sub_9a1188(a0, v21, &g_965930, 0, 0, &g_965960, 0);
                    else
                        v22 = (unsigned int)sub_9a11a8(a0, v21, v19, &g_96597c, 0, 0, &g_965ac0, 0);
                    v13 = v17 - v16;
                    if (!v22)
                        break;
                    v12 = (char *)v12 + v16 + 8;
                    if (!v13)
                        return 1;
                }
                sub_a368c8();
                v23 = 853;
LABEL_965488:
                sub_a369bc("ssl/ssl_rsa.c", v23, "SSL_CTX_use_serverinfo_ex");
                v24 = 388;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/ssl_rsa.c", 836, "SSL_CTX_use_serverinfo_ex");
                v24 = 786691;
            }
        }
        else
        {
LABEL_965470:
            sub_a368c8();
            v23 = 832;
            goto LABEL_965488;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_rsa.c", 805, "SSL_CTX_use_serverinfo_ex");
        v24 = 786690;
    }
    sub_a36abc(20, v24, 0);
    return 0;
}
