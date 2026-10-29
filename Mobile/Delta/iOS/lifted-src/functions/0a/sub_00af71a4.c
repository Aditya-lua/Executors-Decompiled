/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf71a4..0xaf74ac (776 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af71a4_0 {
    unsigned long long field_0;
    struct st_af71a4_1 *field_8;
} st_af71a4_0;

typedef struct st_af71a4_2 {
    char field_0;
    char field_1;
    char field_2;
    char padding_3[5];
    unsigned long long field_8;
    unsigned long long field_10;
} st_af71a4_2;

typedef struct st_af71a4_4 {
    char padding_0[148];
    int field_94;
    char padding_98[88];
    struct st_af71a4_3 *field_f0;
} st_af71a4_4;

typedef struct st_af71a4_3 {
    struct st_af71a4_0 *field_0;
    long long field_8;
    char padding_10[8];
    struct st_af71a4_2 *field_18;
    long long field_20;
    unsigned int field_28;
    unsigned int field_2c;
} st_af71a4_3;

typedef struct st_af71a4_1 {
    char field_0;
} st_af71a4_1;

extern char g_10002b0;

unsigned int sub_af71a4(st_af71a4_4 *a0, long long a1, unsigned int a2)
{
    st_af71a4_3 *v10;  // x28
    unsigned int v11;  // w8
    st_af71a4_2 *v20;  // x25
    unsigned int v21;  // w19
    unsigned int v22;  // x23
    st_af71a4_0 *v23;  // x8
    unsigned long long v24;  // x0
    long long v25;  // x26
    long long v26;  // x27
    unsigned int v12;  // x22
    unsigned int v13;  // x26
    unsigned int v14;  // x20
    unsigned int v15;  // w24
    unsigned int v16;  // w21
    unsigned int v17;  // w27
    st_af71a4_2 *v18;  // x0
    unsigned int v19;  // w8
    unsigned int v0;  // [bp-0xc4]
    unsigned int v1;  // [bp-0xc0]
    unsigned int i;  // [bp-0xbc]
    unsigned int v3;  // [bp-0xb8]
    unsigned int v4;  // [bp-0xb4]
    unsigned int v5;  // [bp-0xb0]
    char v6;  // [bp-0xa8]
    unsigned long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v10 = a0->field_f0;
    if (!a2)
        v11 = 10;
    else
        v11 = 5;
    if ((int)a2 >= a0->field_94)
        v11 &= 3;
    if ((int)v10->field_2c >= 0)
        v11 &= 12;
    v3 = v11;
    v4 = 0;
    if (v11 & v10->field_28 && !(i = sub_ad69e4(v10->field_8), (int)i < 1))
    {
        v12 = 0;
        v13 = 0;
        v14 = 0;
        v15 = 0;
        v0 = 0x100;
        v1 = 0x100;
        v16 = 0x100;
        v17 = 0x100;
        do
        {
            v18 = sub_ad69f8(v10->field_8, v12);
            v19 = v18->field_0;
            if (!(v3 >> ((char)v19 & 31) & 1))
                continue;
            v20 = v18;
            if (v1 != v19)
            {
                v16 = 0x100;
                v0 = *(char *)&v10->field_0->field_8[v20->field_2];
                v1 = v19;
            }
            v21 = v20->field_1;
            if (v17 == v21)
            {
                v22 = v20->field_2;
                if (v22 && *(char *)&v10->field_0->field_8[v22] < v0)
                    continue;
                if (v16 == v22)
                    goto LABEL_af73a8;
                v23 = v10->field_0;
            }
            else
            {
                sub_a6c2e4(v14, "crypto/x509/x509_vfy.c", 2969);
                v5 = 0;
                if (v21 == 1)
                {
                    v24 = sub_afb038(sub_a19700(a1), &v5);
                }
                else if (!v21)
                {
                    v24 = sub_afc3f8(a1, &v5);
                }
                else
                {
                    v25 = 133;
                    v26 = 2877;
LABEL_af7474:
                    sub_a368c8();
                    sub_a369bc("crypto/x509/x509_vfy.c", v26, "dane_i2d");
                    sub_a36abc(11, v25, 0);
                    if (*(long long *)&g_10002b0 == v7)
                        return 0xffffffff;
                    ___stack_chk_fail();
                }
                v15 = v24;
                v25 = 524301;
                v26 = 2882;
                if (v24 >> 31 & 1 || !(v14 = v5, v14))
                    goto LABEL_af7474;
                v23 = v10->field_0;
                v22 = v20->field_2;
                v0 = *(char *)&v10->field_0->field_8[v22];
                v17 = v21;
            }
            v4 = v15;
            if (*(long long *)(v23->field_0 + v22 * 8))
            {
                v13 = (unsigned int)&v6;
                if (sub_a40abc(v14, v15, &v6, &v4))
                {
                    v16 = v22;
                }
                else
                {
                    sub_a6c2e4(v14, "crypto/x509/x509_vfy.c", 3034);
                    if (*(long long *)&g_10002b0 == v7)
                        return 0xffffffff;
                    ___stack_chk_fail();
                }
            }
            else
            {
                v16 = v22;
                v13 = v14;
            }
LABEL_af73a8:
            if (v20->field_10 == v4 && !_memcmp(v13, v20->field_8))
            {
                if (12 >> ((char)v1 & 31) & 1 || (int)v10->field_2c < 0)
                {
                    if (sub_af3b1c(a1))
                    {
                        sub_afc404(v10->field_20);
                        v10->field_2c = a2;
                        v10->field_18 = v20;
                        v10->field_20 = a1;
                        sub_a6c2e4(v14, "crypto/x509/x509_vfy.c", 3034);
                        if (*(long long *)&g_10002b0 == v7)
                            return 12 >> ((char)v1 & 31) & 1;
                        ___stack_chk_fail();
                    }
                    else
                    {
                        sub_a6c2e4(v14, "crypto/x509/x509_vfy.c", 3034);
                        if (*(long long *)&g_10002b0 == v7)
                            return 0xffffffff;
                        ___stack_chk_fail();
                    }
                }
                break;
            }
            v12 += 1;
        } while (i != v12);
    }
    else
    {
        v14 = 0;
    }
    sub_a6c2e4(v14, "crypto/x509/x509_vfy.c", 3034);
    if (*(long long *)&g_10002b0 == v7)
        return 0;
    ___stack_chk_fail();
}
