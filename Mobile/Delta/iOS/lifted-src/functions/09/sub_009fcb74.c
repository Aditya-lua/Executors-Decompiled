/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fcb74..0x9fcce0 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fcb74_2 {
    char padding_0[8];
    struct st_9fcb74_3 *field_8;
    char padding_10[16];
    struct st_9fcb74_1 *field_20;
} st_9fcb74_2;

typedef struct st_9fcb74_3 {
    unsigned int field_0;
} st_9fcb74_3;

typedef struct st_9fcb74_0 {
    struct st_9fcb74_0 *field_0;
} st_9fcb74_0;

typedef struct st_9fcb74_1 {
    char padding_0[112];
    long long field_70;
} st_9fcb74_1;

extern unsigned int g_e8d220;

st_9fcb74_0 ** sub_9fcb74(long long a0, st_9fcb74_2 *a1)
{
    st_9fcb74_1 *v3;  // x22
    st_9fcb74_0 **v4;  // x19
    unsigned long v5;  // x1
    st_9fcb74_1 *v6;  // x0
    st_9fcb74_0 **v7;  // w0
    st_9fcb74_0 **v8;  // x0
    unsigned long long v9;  // x22
    long long v10;  // x1
    st_9fcb74_0 **v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = a1->field_20;
    v4 = sub_9c7910();
    if (v4)
    {
        v5 = v4 + 1;
        v6 = v3;
        if (a1->field_8 != &g_e8d220)
            v7 = (st_9fcb74_0 **)(unsigned int)sub_9fd468(v6, v5);
        else
            v7 = (st_9fcb74_0 **)(unsigned int)sub_9fd594(v6, v5);
        *(unsigned int *)v4 = (unsigned int)v7;
        if (v7 > 0)
        {
            v8 = sub_9c1acc(v3->field_70, 0);
            if (!v8)
            {
                sub_a6c2e4(v0, "crypto/dh/dh_ameth.c", 152);
                sub_9c7940(v4);
                return 0;
            }
            v9 = sub_9cf110();
            sub_9cf124(v8);
            if ((int)v9 > 0)
            {
                if (sub_afbeac(a0, sub_a99624(*(int *)a1->field_8), 16, v4, v0, v9))
                    return 1;
                sub_a6c2e4(v0, "crypto/dh/dh_ameth.c", 152);
                sub_9c7940(v4);
                return 0;
            }
            sub_a368c8();
            v10 = 143;
        }
        else
        {
            sub_a368c8();
            v10 = 129;
        }
    }
    else
    {
        sub_a368c8();
        v10 = 124;
    }
    sub_a369bc("crypto/dh/dh_ameth.c", v10, "dh_pub_encode");
    sub_a36abc(5, 0x8000d, 0);
    sub_a6c2e4(v0, "crypto/dh/dh_ameth.c", 152);
    sub_9c7940(v4);
    return 0;
}
