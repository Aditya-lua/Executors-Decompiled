/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1e9d8..0xa1ed58 (896 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1e9d8_0 {
    char padding_0[80];
    long long field_50;
} st_a1e9d8_0;


unsigned long long sub_a1e9d8(unsigned long long *a0, long long *a1, long long a2, st_a1e9d8_0 *a3)
{
    long long v2;  // x19
    unsigned long long v3;  // x20
    unsigned long long v12;  // 4129
    unsigned long v13;  // x24
    unsigned int v14;  // w0
    unsigned long long v15;  // 4157
    unsigned long v16;  // x26
    long long v17;  // x1
    unsigned long long v18;  // x25
    unsigned long long v19;  // x24
    unsigned long long v20;  // x26
    unsigned long long v21;  // x22
    unsigned long long v4;  // x0
    long long v22;  // x1
    unsigned long long v5;  // x26
    long long v6;  // x25
    unsigned long long v7;  // x26
    long long v8;  // x1
    long long v9;  // x1
    unsigned long long v10;  // x21
    unsigned int v11;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9dddcc(a3->field_50);
    if (!v2)
    {
        v21 = 0;
        v3 = 0;
        v10 = 0;
        goto LABEL_a1ec6c;
    }
    sub_9de064(v2);
    v3 = sub_9de208(v2);
    if (!v3)
    {
        sub_a368c8();
        v8 = 66;
        goto LABEL_a1eb58;
    }
    v4 = sub_962b90(a3);
    if (v4)
    {
        v5 = v4;
        v6 = sub_9ffdd0(a3);
        v7 = v5;
        if (sub_a198e8(a3) >> 12 & 1)
        {
            if (sub_a1ab70(v6, v3, 0))
            {
                v7 = v3;
                if (sub_9e7dc8(v7, v7, v5, v2))
                    goto LABEL_a1ea80;
                sub_a368c8();
                v8 = 88;
LABEL_a1eb58:
                sub_a369bc("crypto/ec/ecdh_ossl.c", v8, "ossl_ecdh_simple_compute_key");
                v9 = 524291;
                goto LABEL_a1ebf0;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ecdh_ossl.c", 84, "ossl_ecdh_simple_compute_key");
                v9 = 524304;
                goto LABEL_a1ebf0;
            }
        }
LABEL_a1ea80:
        v10 = sub_a1a56c(v6);
        if (!v10)
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ecdh_ossl.c", 95, "ossl_ecdh_simple_compute_key");
            v17 = 524304;
            goto LABEL_a1ec60;
        }
        if (!sub_a1b804(v6, v10, 0, a2, v7, v2))
        {
            sub_a368c8();
            v22 = 100;
            goto LABEL_a1ec54;
        }
        if (!sub_a1b3cc(v6, v10, v3, 0, v2))
        {
            sub_a368c8();
            v22 = 110;
LABEL_a1ec54:
            sub_a369bc("crypto/ec/ecdh_ossl.c", v22, "ossl_ecdh_simple_compute_key");
            v17 = 155;
            goto LABEL_a1ec60;
        }
        v11 = sub_a1ad1c(v6);
        v12 = arm64g_calculate_condition(177, v11, 7, 0);
        v13 = (v12 & 1 ? v11 + 14 : v11 + 7);
        v14 = sub_9e46a8(v3);
        v15 = arm64g_calculate_condition(177, v14, 7, 0);
        v16 = (v15 & 1 ? v14 + 14 : v14 + 7);
        if ((int)((unsigned int)v16) >> 3 > (int)((unsigned int)v13) >> 3)
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ecdh_ossl.c", 121, "ossl_ecdh_simple_compute_key");
            v17 = 786691;
LABEL_a1ec60:
            sub_a36abc(16, v17, 0);
            v21 = 0;
            goto LABEL_a1ec6c;
        }
        v18 = (long long)(v13 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v13, 61) & 0xe00000001fffffff & 0x1fffffff;
        v19 = sub_a6bf4c(v18, "crypto/ec/ecdh_ossl.c", 124);
        if (!v19)
        {
            v21 = 0;
            goto LABEL_a1ec70;
        }
        v20 = (long long)(v16 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v16, 61) & 0xe00000001fffffff & 0x1fffffff;
        _bzero(v19, v18 - v20);
        if ((unsigned int)v20 == sub_9e5350(v3, v19 + v18 - v20))
        {
            *a0 = v19;
            *a1 = v18;
            v21 = 1;
LABEL_a1ec6c:
            v19 = 0;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ecdh_ossl.c", 129, "ossl_ecdh_simple_compute_key");
            sub_a36abc(16, 0x80003, 0);
            v21 = 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdh_ossl.c", 72, "ossl_ecdh_simple_compute_key");
        v9 = 125;
LABEL_a1ebf0:
        sub_a36abc(16, v9, 0);
        v21 = 0;
        v10 = 0;
        goto LABEL_a1ec6c;
    }
LABEL_a1ec70:
    sub_9e4cf0(v3);
    sub_a1a298(v10);
    sub_9de17c(v2);
    sub_9dded4(v2);
    sub_a6c2e4(v19, "crypto/ec/ecdh_ossl.c", 145);
    return v21;
}
