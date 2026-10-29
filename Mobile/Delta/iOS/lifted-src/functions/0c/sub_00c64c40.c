/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc64c40..0xc64e7c (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c64c40_1 {
    char padding_0[24];
    unsigned long long field_18;
} st_c64c40_1;

typedef struct st_c64c40_0 {
    char padding_0[16];
    unsigned int field_10;
    unsigned short field_14;
    char padding_16[26];
    unsigned short field_30;
} st_c64c40_0;

extern char g_10002b0;

unsigned long long sub_c64c40(st_c64c40_0 *a0, void* a1, long long a2, unsigned long long a3)
{
    unsigned long long v15;  // x22
    unsigned long long v16;  // x0
    unsigned long long v25;  // x20
    unsigned long long v17;  // x19
    unsigned long v18;  // x25
    unsigned long v19;  // x8
    unsigned long v20;  // x8
    unsigned long v21;  // x8
    unsigned long v22;  // x8
    st_c64c40_1 *v23;  // x1
    uint128_t v0;  // [bp-0xe8]
    uint128_t v1;  // [bp-0xd8]
    unsigned long long v2;  // [bp-0xc8]
    unsigned long v3;  // [bp-0xc0]
    char v4;  // [bp-0xb8]
    uint128_t v5;  // [bp-0x90]
    uint128_t v6;  // [bp-0x80]
    unsigned long long v7;  // [bp-0x70]
    unsigned long v8;  // [bp-0x68]
    char v9;  // [bp-0x60]
    unsigned short v10;  // [bp-0x5f]
    unsigned short v11;  // [bp-0x5d]
    unsigned long v12;  // [bp-0x58]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    v15 = *(long long *)&a0[83].padding_0[2];
    v16 = sub_a50c70(v15);
    if (!(v16 >> 31 & 1))
    {
        v3 = v16 & 0xffffffff;
        if (*(int *)&a0[0x55].padding_16[4])
        {
            v17 = 0;
            goto LABEL_c64ca0;
        }
        v17 = sub_a3f728();
        if (v17 && sub_a40a34(v17, v15))
        {
            v15 = v17;
LABEL_c64ca0:
            if (a0->field_10)
            {
LABEL_c64ca8:
                v19 = a0->field_30;
                v20 = *(int *)&a0[81].field_30 * 0x10000 | *(short *)&a0[82].padding_0[2] * 0x1000000000000 | (((((v19 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v19 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v19 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v19 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48 & 0xffffffff;
LABEL_c64d28:
                v8 = v20;
                v9 = (int)a1[4];
                v21 = a0->field_14;
                v10 = (((((v21 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v21 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v21 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v21 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                v22 = (short)a1[8];
                v11 = (((((v22 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v22 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v22 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v22 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                if (!a3 && !*(int *)&a0[0x55].padding_16[0] && sub_a4fdf4(sub_a2d030(*(long long *)&a0[82].padding_16[6])) == 2 && sub_997000(v15))
                {
                    v23 = a1 + 16;
                    sub_a71bbc(sub_a70ed8("tls-data-size", v23), v23);
                    v5 = v0;
                    v6 = v1;
                    v7 = v2;
                    if (sub_a5db1c(sub_962b90(v15), &v4))
                        goto LABEL_c64dc8;
                }
                else
                {
LABEL_c64dc8:
                    if ((int)sub_a56f14(v15, &v8, 13) >= 1 && (int)sub_a56f14(v15, (long long)a1[40], (long long)a1[8]) >= 1 && (int)sub_a5727c(v15, a2, &v3) >= 1 && (a0->field_10 || sub_999d2c(a0)))
                    {
                        v25 = 1;
                        goto LABEL_c64e30;
                    }
                }
            }
            else
            {
                v18 = &a0[81].padding_16[24];
                if (!*(int *)&a0[0x55].padding_16[8])
                {
LABEL_c64d24:
                    v20 = *(long long *)v18;
                    goto LABEL_c64d28;
                }
                if ((int)sub_a40e40(v15, 4, 0, v18) >= 1)
                {
                    if (!a0->field_10)
                        goto LABEL_c64d24;
                    goto LABEL_c64ca8;
                }
            }
        }
        v25 = 0;
LABEL_c64e30:
        sub_a3f73c(v17);
    }
    else
    {
        v25 = 0;
    }
    if (*(long long *)&g_10002b0 == v12)
        return v25;
    ___stack_chk_fail();
}
