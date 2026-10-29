/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad6b74..0xad7048 (1236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad6b74_0 {
    struct st_ad6b74_0 *field_0;
    unsigned int field_1;
    char field_2;
    char padding_3[5];
    struct st_ad6b74_0 *field_8;
    struct st_ad6b74_0 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    struct st_ad6b74_0 *field_30;
    char padding_38[16];
    struct st_ad6b74_0 *field_48;
    char padding_50[8];
    struct st_ad6b74_0 *field_58;
    char padding_60[8];
    struct st_ad6b74_0 *field_68;
    char padding_70[24];
    struct st_ad6b74_0 *field_88;
    char padding_90[64];
    struct st_ad6b74_0 *field_d0;
} st_ad6b74_0;

typedef struct st_ad6b74_2 {
    unsigned long long field_0;
} st_ad6b74_2;

extern st_ad6b74_2 *g_50;
extern st_ad6b74_2 *g_b8;
extern char g_10002b0;

st_ad6b74_0 * sub_ad6b74(st_ad6b74_0 *a0, long long a1, st_ad6b74_0 *a2, st_ad6b74_0 *a3, long long a4, unsigned long long a5, unsigned long a6, unsigned long a7)
{
    st_ad6b74_0 *v18;  // x20
    st_ad6b74_0 *ptr;  // x0
    st_ad6b74_0 *v28;  // w23
    st_ad6b74_0 *v29;  // x22
    st_ad6b74_0 *v30;  // x0
    st_ad6b74_0 *v31;  // x0
    st_ad6b74_0 *v33;  // x28
    st_ad6b74_0 *v34;  // x21
    st_ad6b74_0 *v35;  // x0
    st_ad6b74_0 *v36;  // x0
    st_ad6b74_0 *v20;  // x19
    unsigned int v21;  // w8
    st_ad6b74_0 *v22;  // x26
    unsigned long long v23;  // x8
    st_ad6b74_0 *v25;  // x19
    st_ad6b74_0 *v26;  // x22
    long long *v27;  // x21
    unsigned long long v0;  // [bp-0x278]
    st_ad6b74_0 *v1;  // [bp-0x260]
    st_ad6b74_0 *v2;  // [bp-0x250]
    st_ad6b74_0 *v3;  // [bp-0x240]
    st_ad6b74_0 *v4;  // [bp-0x200]
    st_ad6b74_0 *v5;  // [bp-0x1f8]
    st_ad6b74_0 *v6;  // [bp-0x1f0]
    st_ad6b74_0 *v7;  // [bp-0x1e8]
    st_ad6b74_0 *v8;  // [bp-0x1d8]
    st_ad6b74_0 *v9;  // [bp-0x1c8]
    st_ad6b74_0 *v10;  // [bp-0x1b8]
    st_ad6b74_0 *v11;  // [bp-0x1a8]
    st_ad6b74_0 *v12;  // [bp-0x198]
    long long v13;  // [bp-0x188]
    char v14;  // [bp-0x178]
    unsigned long v15;  // [bp-0x78]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v0 = a5;
    v15 = *(long long *)&g_10002b0;
    v2 = (st_ad6b74_0 *)0;
    v3 = (st_ad6b74_0 *)0;
    v1 = (st_ad6b74_0 *)0;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/store/store_lib.c", 82, "OSSL_STORE_open_ex");
        sub_a36abc(44, 0xc0102, 0);
        goto LABEL_ad7008;
    }
    v18 = a2;
    v13 = "file";
    sub_a6db20(&v14, a0, 0x100);
    ptr = _strchr(&v14, 58);
    if (ptr && !(v20 = ptr, *(char *)&ptr->field_0 = 0, !sub_a6e200(&v14, "file")))
    {
        if (*((char *)&v20->field_0 + 1) == 47)
        {
            v21 = *((char *)&v20->field_0 + 2);
            if (v21 == 47)
                v22 = 1;
            else
                v22 = 2;
            v23 = ((v21 != 47) * 8 | (char)(v21 != 47) >> 61) & 0x7fffffff8 & 0x7ffffffff;
        }
        else
        {
            v23 = 8;
            v22 = 2;
        }
        *(char **)((char *)&v13 + v23) = &v14;
    }
    else
    {
        v22 = 1;
    }
    sub_a36c8c();
    if (!a3 || sub_a76ed8(&v1, a3, a4) && sub_a76f68(&v1))
    {
        v26 = 1;
        v27 = &v13;
        v28 = (st_ad6b74_0 *)1;
        do
        {
            v29 = v26;
            sub_a36c8c();
            v30 = sub_ad8454(*v27);
            if (v30)
            {
                v33 = v30;
                sub_a36e70();
                if (!v33->field_48)
                    (*(long long *)&v33->padding_3[3])();
                v33->field_48();
            }
            sub_a36cd4();
            v31 = sub_ad7b44(a1, *v27, v18);
            v25 = v31;
            if (v31)
            {
                sub_a77638(sub_ad7e54(v25));
                if (*(long long *)&v25->padding_90[48])
                {
                    (*(long long *)&v25->padding_90[48])();
                }
                else if (*(long long *)&v25->padding_70[8])
                {
                    (*(long long *)&v25->padding_70[8])();
                }
                else
                {
                    sub_ad7acc(v25);
                    v25 = 0;
                    sub_a76d80(&v1);
                    v28 = (st_ad6b74_0 *)0;
                    v31 = 0;
                }
            }
        } while (!v31 && (v27 += 1, v26 = (char *)&v29->field_0 + 1, v29 < v22));
        if (v31 && !v28)
        {
            v34 = v31;
            if (!v18 || (v18 = sub_a6d9b4(v18, "crypto/store/store_lib.c", 189), v18))
            {
                v35 = sub_a6bffc(120, "crypto/store/store_lib.c", 190);
                if (!v35)
                    goto LABEL_ad6f48;
                v35->field_20 = v18;
                v35->field_0 = 0;
                *(st_ad6b74_0 **)&v35->field_1 = v25;
                *(st_ad6b74_0 **)&v35->padding_3[3] = v34;
                v35->field_8 = a6;
                v35->field_10 = a7;
                *(uint128_t *)v35->padding_38 = (uint128_t)v1;
                *(uint128_t *)&v35->field_48 = (uint128_t)v2;
                *(uint128_t *)&v35->field_58 = (uint128_t)v3;
                sub_a36cd4();
            }
            else
            {
LABEL_ad6f48:
                sub_a36e70();
                v12 = (st_ad6b74_0 *)0;
                v11 = (st_ad6b74_0 *)0;
                v10 = (st_ad6b74_0 *)0;
                v9 = (st_ad6b74_0 *)0;
                v8 = (st_ad6b74_0 *)0;
                v7 = (st_ad6b74_0 *)0;
                v4 = 0;
                v5 = v25;
                v6 = v34;
                if (!v25)
                    g_50();
                g_b8();
            }
        }
        else
        {
            sub_a36e70();
            v36 = v31;
            if (v36)
            {
                v12 = (st_ad6b74_0 *)0;
                v11 = (st_ad6b74_0 *)0;
                v10 = (st_ad6b74_0 *)0;
                v9 = (st_ad6b74_0 *)0;
                v8 = (st_ad6b74_0 *)0;
                v7 = (st_ad6b74_0 *)0;
                v4 = 0;
                v5 = v25;
                v6 = v36;
                if (!v25)
                    g_50();
                g_b8();
            }
LABEL_ad6fd8:
            sub_ad7acc(v25);
            sub_a6c2e4(0, "crypto/store/store_lib.c", 235);
            sub_a6c2e4(0, "crypto/store/store_lib.c", 236);
LABEL_ad7008:
            v35 = 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/store/store_lib.c", 115, "OSSL_STORE_open_ex");
        sub_a36e70(sub_a36abc(44, 0x8000f, 0), 0x8000f, 0);
        v25 = 0;
        goto LABEL_ad6fd8;
    }
    if (*(long long *)&g_10002b0 == v15)
        return v35;
    ___stack_chk_fail();
}
