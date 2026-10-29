/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d73d8..0x9d7648 (624 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d73d8_1 {
} st_9d73d8_1;

typedef struct st_9d73d8_2 {
    char padding_0[109];
    char field_6d;
    unsigned short field_6e;
    char padding_70[20];
    struct st_9d73d8_0 *field_84;
    char padding_8c[76];
    struct st_9d73d8_0 *field_d8;
    char padding_e0[28];
    struct st_9d73d8_0 *field_fc;
} st_9d73d8_2;

typedef struct st_9d73d8_4 {
    unsigned long long field_0;
    struct st_9d73d8_0 *field_8;
    struct st_9d73d8_0 *field_10;
    struct st_9d73d8_0 *field_18;
    struct st_9d73d8_0 *field_20;
} st_9d73d8_4;

typedef struct st_9d73d8_0 {
    char padding_0[2];
    unsigned short field_2;
    unsigned int field_4;
    uint128_t field_8;
    struct st_9d73d8_1 *field_18;
} st_9d73d8_0;

typedef struct st_9d73d8_3 {
    char padding_0[56];
    unsigned int field_38;
    char padding_3c[4];
    struct st_9d73d8_2 *field_40;
} st_9d73d8_3;

extern char g_10002b0;

st_9d73d8_0 * sub_9d73d8(st_9d73d8_3 *a0, st_9d73d8_4 *a1, unsigned long a2, st_9d73d8_0 *a3, unsigned long a4, st_9d73d8_0 **a5)
{
    st_9d73d8_2 *v18;  // x8
    st_9d73d8_0 *v19;  // x10
    st_9d73d8_0 *v28;  // w9
    long long v29;  // x1
    st_9d73d8_0 *v32;  // x0
    unsigned int v20;  // w10
    st_9d73d8_0 *v21;  // w11
    st_9d73d8_0 *v22;  // x10
    st_9d73d8_0 *v23;  // x12
    unsigned int v24;  // w9
    st_9d73d8_0 *v25;  // w9
    long long v26;  // x20
    unsigned int v27;  // w8
    unsigned long v0;  // [bp-0xa8]
    st_9d73d8_0 *v1;  // [bp-0xa0]
    st_9d73d8_0 *v2;  // [bp-0x98]
    unsigned int v3;  // [bp-0x90]
    char *v4;  // [bp-0x88]
    st_9d73d8_0 *v5;  // [bp-0x80]
    st_9d73d8_0 *v6;  // [bp-0x78]
    unsigned int v7;  // [bp-0x70]
    st_9d73d8_0 *v8;  // [bp-0x6c]
    st_9d73d8_0 v9;  // [bp-0x68], Other Possible Types: double
    unsigned int v10;  // [bp-0x60]
    st_9d73d8_0 *v11;  // [bp-0x5c], Other Possible Types: uint128_t
    unsigned int v12;  // [bp-0x58]
    st_9d73d8_0 *v13;  // [bp-0x54]
    st_9d73d8_0 *v14;  // [bp-0x4c]
    unsigned long v15;  // [bp-0x28]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v15 = *(long long *)&g_10002b0;
    if (a3)
    {
        v18 = a0->field_40;
        v0 = a1->field_0;
        v1 = a1->field_8;
        if (*(int *)&v18->padding_8c[72])
        {
            v19 = 0;
            v2 = 0;
        }
        else
        {
            v19 = a1->field_10;
            v2 = v19;
            if (v19)
            {
                v20 = v18->field_6d;
                if (v20 == 30)
                    v21 = (st_9d73d8_0 *)28;
                else
                    v21 = (st_9d73d8_0 *)0;
                if (v20 == 2)
                    v19 = 16;
                else
                    v19 = v21;
            }
        }
        v3 = (unsigned int)v19;
        v4 = &v0;
        v5 = (st_9d73d8_0 *)1;
        v22 = a1->field_18;
        v23 = &v9;
        if (!v22)
            v23 = 0;
        v6 = v23;
        v7 = (v22 != 0) * 64;
        v8 = (st_9d73d8_0 *)0;
        if (!v22)
        {
LABEL_9d754c:
            v32 = _sendmsg(a0->field_38, &v2, 0);
            if (v32 >= 0)
            {
                a1->field_8 = v32;
                a1->field_20 = 0;
                *a5 = 1;
                if (*(long long *)&g_10002b0 == v15)
                    return 1;
                ___stack_chk_fail();
            }
            else
            {
                sub_a368c8();
                sub_a36abc(2, *(int *)___error(sub_a369bc("crypto/bio/bss_dgram.c", 1453, "dgram_sendmmsg"), 1453, "dgram_sendmmsg"), 0);
                *a5 = 0;
                if (*(long long *)&g_10002b0 == v15)
                    return 0;
                ___stack_chk_fail();
            }
        }
        if (!v18->padding_e0[20])
        {
            sub_a368c8();
            v29 = 1439;
            goto LABEL_9d75fc;
        }
        switch (v24)
        {
        case 30:
            v9 = 8.70018274454e-313;
            v10 = 46;
            v11 = *(int128_t *)&(&v22->field_4)[1];
            v14 = (st_9d73d8_0 *)0;
            v28 = (st_9d73d8_0 *)v22->field_2;
            if (v28 && v18->field_6e != v28)
            {
                v26 = 1299;
                break;
            }
            else if (!*(int *)((char *)&v22->field_8 + 8) || *(int *)&(v18->padding_70)[1] == *(int *)((char *)&v22->field_8 + 8))
            {
                v27 = 32;
LABEL_9d7548:
                v7 = v27;
                goto LABEL_9d754c;
            }
            else
            {
                v26 = 1305;
                break;
            }
        case 2:
            v9 = 1.2e-322;
            v10 = 26;
            v12 = v22->field_4;
            v13 = (st_9d73d8_0 *)0;
            v11 = (st_9d73d8_0 *)0;
            v25 = (st_9d73d8_0 *)v22->field_2;
            if (!v25 || v18->field_6e == v25)
            {
                v27 = 24;
                goto LABEL_9d7548;
            }
            else
            {
                v26 = 1229;
                break;
            }
        default:
LABEL_9d75e4:
            sub_a368c8();
            v29 = 1445;
LABEL_9d75fc:
            sub_a369bc("crypto/bio/bss_dgram.c", v29, "dgram_sendmmsg");
            sub_a36abc(32, 111, 0);
            *a5 = 0;
            if (*(long long *)&g_10002b0 == v15)
                return 0;
            ___stack_chk_fail();
        }
        sub_a368c8();
        sub_a369bc("crypto/bio/bss_dgram.c", v26, "pack_local");
        sub_a36abc(32, 150, 0);
        goto LABEL_9d75e4;
    }
    else
    {
        *a5 = 0;
        if (*(long long *)&g_10002b0 == v15)
            return 1;
        ___stack_chk_fail();
    }
}
