/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fcd9c..0x9fcf44 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fcd9c_1 {
    char padding_0[120];
    long long field_78;
} st_9fcd9c_1;

typedef struct st_9fcd9c_0 {
    struct st_9fcd9c_0 *field_0;
    long long field_4;
} st_9fcd9c_0;

typedef struct st_9fcd9c_2 {
    char padding_0[8];
    struct st_9fcd9c_3 *field_8;
    char padding_10[16];
    struct st_9fcd9c_1 *field_20;
} st_9fcd9c_2;

typedef struct st_9fcd9c_3 {
    unsigned int field_0;
} st_9fcd9c_3;

extern unsigned int g_e8d220;

st_9fcd9c_0 * sub_9fcd9c(long long a0, st_9fcd9c_2 *a1)
{
    st_9fcd9c_0 *v3;  // x19
    unsigned long v4;  // x1
    st_9fcd9c_0 *v5;  // w0
    st_9fcd9c_0 *v6;  // x0
    unsigned long long v7;  // x22
    long long v8;  // x1
    long long v9;  // x1
    long long v10;  // x1
    st_9fcd9c_0 *v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_9c7910();
    if (!v3)
    {
        sub_a368c8();
        v10 = 0xbb;
        goto LABEL_9fcea8;
    }
    v4 = &v3->field_4;
    if (a1->field_8 != &g_e8d220)
        v5 = (st_9fcd9c_0 *)(unsigned int)sub_9fd468(a1->field_20, v4);
    else
        v5 = (st_9fcd9c_0 *)(unsigned int)sub_9fd594(a1->field_20, v4);
    *(unsigned int *)&v3->field_0 = (unsigned int)v5;
    if (v5 <= 0)
    {
        sub_a368c8();
        v10 = 193;
LABEL_9fcea8:
        sub_a369bc("crypto/dh/dh_ameth.c", v10, "dh_priv_encode");
        v9 = 524301;
        goto LABEL_9fcefc;
    }
    *(unsigned int *)((char *)&v3->field_0 + 4) = 16;
    v6 = sub_9c1acc(a1->field_20->field_78, 0);
    if (v6)
    {
        v7 = sub_9cf110();
        sub_9c7a84(v6);
        if ((int)v7 > 0)
        {
            if (sub_9ca82c(a0, sub_a99624(*(int *)a1->field_8), 0, 16, v3, v0, v7))
                return 1;
            sub_a6c4e8(v0, v7 & 0xffffffff, "crypto/dh/dh_ameth.c", 217);
        }
        else
        {
            sub_a368c8();
            v8 = 211;
LABEL_9fcef0:
            sub_a369bc("crypto/dh/dh_ameth.c", v8, "dh_priv_encode");
            v9 = 106;
LABEL_9fcefc:
            sub_a36abc(5, v9, 0);
        }
        sub_9c7940(v3);
        return 0;
    }
    sub_a368c8();
    v8 = 202;
    goto LABEL_9fcef0;
}
