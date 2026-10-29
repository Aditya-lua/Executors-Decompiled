/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1efb98..0x1efdf4 (604 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1efb98_3 {
    struct st_1efb98_2 *field_0;
    char padding_8[120];
    unsigned long long field_80;
    unsigned int field_88;
    unsigned int field_8c;
    unsigned int field_90;
    char field_94[4];
    char field_95;
} st_1efb98_3;

typedef struct st_1efb98_5 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_1efb98_5;

typedef struct st_1efb98_2 {
    char padding_0[4];
    unsigned short field_4;
    char padding_6[18];
    unsigned long long field_18;
    unsigned long long field_20;
} st_1efb98_2;

typedef struct st_1efb98_1 {
    struct st_1efb98_0 *field_0;
} st_1efb98_1;

typedef struct st_1efb98_4 {
    struct st_1efb98_5 *field_0;
    char padding_8[16];
    unsigned long long field_18;
    unsigned long long field_20;
    char field_28;
    char padding_29[7];
    unsigned long long field_30;
    unsigned long long field_38;
    char field_40;
    char padding_41[31];
    unsigned long long field_60;
} st_1efb98_4;

typedef struct st_1efb98_0 {
    char field_0;
} st_1efb98_0;

extern long long g_e730e8;

unsigned int sub_1efb98(st_1efb98_3 *a0, unsigned long a1, unsigned long a2, unsigned long a3, void* a4, unsigned int a5)
{
    unsigned long long *v6;  // x1
    st_1efb98_4 *v7;  // x21
    unsigned long v16;  // x8
    unsigned long v17;  // x9
    unsigned long long v18;  // x10
    long long v20;  // x0
    long long v21;  // x19
    long long v22;  // x0
    unsigned long long v8;  // x8
    unsigned long long *v9;  // x8
    unsigned long v10;  // x10
    unsigned long long v11;  // x9
    unsigned long v12;  // x9
    unsigned long v13;  // x8
    st_1efb98_2 *v14;  // x8
    unsigned long long v15;  // x0
    st_1efb98_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_1efb98_0 *v1;  // [bp-0x68]
    st_1efb98_0 **v2;  // [bp-0x60], Other Possible Types: st_1efb98_1 **, char
    st_1efb98_0 *v3;  // [bp-0x58], Other Possible Types: st_1efb98_1 **
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    v6 = (long long)a4[200];
    v7 = a4 + 200;
    *(unsigned int *)((char *)v7 - 8) = 0;
    sub_c84c(v7, v6);
    *(unsigned long long *)&v7[1].padding_8[0] = 0;
    v7[1].field_20 = 0;
    if (*(long long *)&a0->padding_8[0])
    {
        v8 = (unsigned long long)(a0->field_94 & 32 | a5);
        *(unsigned long *)&a4[0x88] = a1;
        *(unsigned long *)&a4[144] = a3;
        *(unsigned long *)&a4[128] = a3;
        *(unsigned long *)&a4[160] = a1;
        *(unsigned long *)&a4[168] = a2;
        *(unsigned int *)&a4[184] = v8;
        if (!*(long long *)&a0[1].padding_8[39] || v8 >> 5 & 1)
        {
            sub_1fb6dc(a4, a0->field_88, a0->field_8c, a0->field_90);
            v14 = a0->field_0;
            if (!((char)((char)a4[184]) >> 5 & 1))
            {
                *(unsigned long long *)&a4[176] = v14->field_18;
                if (v14->field_4 & 0x1ff)
                {
                    v15 = sub_1eef2c(a0, a4);
                    if ((unsigned int)v15)
                        goto LABEL_1efd54;
                }
                else
                {
                    v15 = sub_1ef3a4(a0, a4);
                    if ((unsigned int)v15)
                        goto LABEL_1efd54;
                }
            }
            else
            {
                v16 = v14->field_20;
                *(unsigned long *)&a4[176] = v16;
                v17 = (long long)a4[160];
                *(unsigned long *)&a4[40] = v17;
                v18 = a0->field_80;
                *(unsigned long *)&a4[32] = v16;
                *(unsigned long *)&a4[152] = v17;
                *(unsigned long long *)&a4[120] = v18;
                v15 = sub_1eda40(a0, a4);
                if ((unsigned int)v15)
                {
LABEL_1efd54:
                    if ((unsigned int)v15 == 1)
                        return sub_1f35c4(a4, a0->field_88, &a0->field_95);
                    if (a0->field_94[1] & 1)
                    {
                        *(unsigned int *)&a4[192] = (unsigned int)v15 * 2;
                        return 0;
                    }
                    v20 = ___cxa_allocate_exception(24);
                    v21 = v20;
                    sub_1f0654(v20, v15);
                    v22 = ___cxa_throw(v21, &g_e730e8, 0x1ee8d0);
                    ___cxa_free_exception(v21);
                    __Unwind_Resume(v22);
                }
            }
        }
        else if (*(int *)&a0->field_0->padding_6[14])
        {
            if (sub_1ed704())
            {
                v3 = &v2;
                v2 = &v3;
                sub_1f4274(v7, 1);
                v9 = (long long)a4[200];
                *(char *)&v9[2] = 1;
                v10 = (long long)a4[0x88];
                *(long long *)&a4[296] = (long long)a4[144];
                *(unsigned long *)&a4[224] = v10;
                v11 = (long long)a4[40];
                *v9 = v11;
                *(unsigned long long *)&a4[232] = v11;
                v12 = (long long)a4[160];
                v9[1] = v12;
                v13 = (long long)a4[168];
                *(unsigned long *)&a4[248] = v12;
                *(unsigned long *)&a4[0x100] = v13;
                *(char *)&a4[240] = (long long)a4[224] != (long long)a4[232];
                *(char *)&a4[264] = v12 != v13;
                *(unsigned int *)&a4[192] = 1;
                return 1;
            }
        }
        else
        {
            if (sub_1f99d8() & 1)
            {
                v3 = &v2;
                v2 = &v3;
                sub_1f4274(v7, 1);
                v9 = (long long)a4[200];
                *(char *)&v9[2] = 1;
                v10 = (long long)a4[0x88];
                *(long long *)&a4[296] = (long long)a4[144];
                *(unsigned long *)&a4[224] = v10;
                v11 = (long long)a4[40];
                *v9 = v11;
                *(unsigned long long *)&a4[232] = v11;
                v12 = (long long)a4[160];
                v9[1] = v12;
                v13 = (long long)a4[168];
                *(unsigned long *)&a4[248] = v12;
                *(unsigned long *)&a4[0x100] = v13;
                *(char *)&a4[240] = (long long)a4[224] != (long long)a4[232];
                *(char *)&a4[264] = v12 != v13;
                *(unsigned int *)&a4[192] = 1;
                return 1;
            }
        }
    }
    *(unsigned int *)&a4[192] = 1;
    return 0;
}
