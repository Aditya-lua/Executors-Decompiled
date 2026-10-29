/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xba948..0xbac9c (852 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ba948_1 {
    long long field_0;
    char padding_8[8];
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
} st_ba948_1;

typedef struct st_ba948_2 {
    char padding_0[2056];
    unsigned int field_808;
    char padding_80c[4];
    unsigned short field_810;
    char padding_812[770];
    unsigned short field_b14;
} st_ba948_2;

typedef struct st_ba948_4 {
    long long field_0;
} st_ba948_4;

typedef struct st_ba948_0 {
    char field_0;
} st_ba948_0;

typedef struct st_ba948_3 {
    struct st_ba948_4 *field_0;
    void* field_8;
    struct st_ba948_4 *field_10;
    struct st_ba948_1 *field_18;
    char padding_20[16];
    long long field_30;
    long long field_34;
    long long field_38;
    long long field_3c;
    char padding_44[12];
    long long field_50;
    struct st_ba948_2 *field_58;
    unsigned int field_60;
} st_ba948_3;

extern long long g_cc0b48;
extern long long g_cc0bd8;
extern long long g_cc0d80;

long long sub_ba948(st_ba948_3 *a0, unsigned long a1, long long a2, long long a3)
{
    unsigned int v5;  // w9
    long long v6;  // w0
    unsigned long long v15;  // x12
    unsigned int v16;  // w15
    long long v17;  // w15
    long long v18;  // x9
    long long v19;  // w11
    long long v20;  // x12
    unsigned int *v21;  // x12
    unsigned int *v22;  // x12
    unsigned int v23;  // w15
    long long v24;  // w15
    st_ba948_2 *v7;  // x8
    long long v25;  // x9
    long long v26;  // w11
    long long v27;  // x12
    unsigned int *v28;  // x8
    unsigned int *v29;  // x8
    unsigned int v30;  // w14
    long long v31;  // w14
    void* v32;  // x8
    st_ba948_1 *v33;  // x8
    long long idx;  // x21
    long long v9;  // w0
    long long v10;  // w8
    long long v11;  // x9
    long long v12;  // w11
    long long v13;  // x12
    unsigned long long v14;  // x12
    st_ba948_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_ba948_0 *v1;  // [bp-0x50]
    unsigned int v2;  // [bp-0x44]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = a0->field_50;
    *(unsigned int *)&a0->padding_44[0] = 0;
    if (*(int *)((char *)&a0->field_30 + 4))
    {
        if (v5 != 2)
            *(unsigned int *)&a0->field_30 = sub_b6a4c(a0->field_0, 0xff, 12);
        *(unsigned int *)((char *)&a0->field_30 + 4) = sub_b6a4c(a0->field_8, 35, 11);
        *(unsigned int *)&a0->field_34 = sub_b6a4c(a0->field_10, 52, 11);
        v6 = (unsigned int)sub_b6a4c(a0->field_18, 31, 11);
        goto LABEL_bac74;
    }
    else
    {
        if (8 >= (unsigned long long)a2)
            *(unsigned int *)&a0->padding_44[0] = 1;
        v7 = *(long long *)&a0->padding_44[8];
        if (v7->field_808 == 2)
        {
            *(unsigned int *)&a0->padding_44[0] = 0;
            if (v5 != 2)
            {
                idx = 0;
                *(unsigned int *)&a0->field_30 = 0;
                do
                {
                    v9 = (unsigned int)sub_79570(*(long long *)&a0->padding_44[8], idx);
                    if (v9)
                        v10 = 1 << ((char)(11 - v9) & 31);
                    else
                        v10 = 1;
                } while ((*(int *)((char *)a0->field_0 + 4 * idx) = v10, *(int *)&a0->field_30 = (int)a0->field_30 + v10, idx += 1, idx != 0x100));
                v7 = *(long long *)&a0->padding_44[8];
            }
            v11 = 0;
            v12 = *(short *)&v7[1].padding_0[1450];
            v13 = 1 << ((char)(v12 - 1) & 31);
            if (!v12)
                v13 = 1;
            *(unsigned int *)((char *)&a0->field_30 + 4) = 0;
            v14 = &v7->padding_0[4 * v13 + 4296];
            do
            {
                v15 = v14 + 8;
                v16 = *(int *)v14 + 0xffff;
                if (0x10000 <= v16)
                    v17 = 1 << ((char)(10 - (v16 >> 16)) & 31);
                else
                    v17 = 1;
            } while ((*(int *)((char *)a0->field_8 + v11) = v17, *(int *)((char *)&a0->field_30 + 4) = v17 + *(int *)((char *)&a0->field_30 + 4), v11 += 4, v14 = v15, v11 != 144));
            v18 = 0;
            v19 = v7->field_b14;
            v20 = 1 << ((char)(v19 - 1) & 31);
            if (!v19)
                v20 = 1;
            *(unsigned int *)&a0->field_34 = 0;
            v21 = &v7->padding_0[4 * v20 + 2844];
            do
            {
                v22 = v21 + 2;
                v23 = *v21 + 0xffff;
                if (0x10000 <= v23)
                    v24 = 1 << ((char)(10 - (v23 >> 16)) & 31);
                else
                    v24 = 1;
            } while ((*(int *)((char *)a0->field_10 + v18) = v24, *(int *)&a0->field_34 = v24 + (int)a0->field_34, v18 += 4, v21 = v22, v18 != 212));
            v25 = 0;
            v26 = v7->field_810;
            v27 = 1 << ((char)(v26 - 1) & 31);
            if (!v26)
                v27 = 1;
            *(unsigned int *)((char *)&a0->field_34 + 4) = 0;
            v28 = &v7->padding_0[4 * v27 + 2072];
            do
            {
                v29 = v28 + 2;
                v30 = *v28 + 0xffff;
                if (0x10000 <= v30)
                    v31 = 1 << ((char)(10 - (v30 >> 16)) & 31);
                else
                    v31 = 1;
            } while ((*(int *)((char *)a0->field_18 + v25) = v31, *(int *)((char *)&a0->field_34 + 4) = v31 + *(int *)((char *)&a0->field_34 + 4), v25 += 4, v28 = v29, v25 != 128));
        }
        else
        {
            if (v5 != 2)
            {
                v2 = 0xff;
                sub_79064(a0->field_0, &v2);
                *(unsigned int *)&a0->field_30 = sub_bea48(a0->field_0, 0xff, 8, 0);
            }
            v32 = a0->field_8;
            *(uint128_t *)&v32[96] = 0x1000000010000000100000001;
            *(uint128_t *)&v32[112] = 0x1000000010000000100000001;
            *(uint128_t *)&v32[128] = 0x1000000010000000100000001;
            *(uint128_t *)&v32[32] = 0x1000000010000000100000001;
            *(uint128_t *)&v32[48] = 0x1000000010000000100000001;
            *(uint128_t *)&v32[64] = 0x1000000010000000100000001;
            *(uint128_t *)&v32[80] = 0x1000000010000000100000001;
            *(uint128_t *)v32 = 0x1000000010000000200000004;
            *(uint128_t *)&v32[16] = 0x1000000010000000100000001;
            *(unsigned int *)((char *)&a0->field_30 + 4) = sub_bed64(&g_cc0b48, 36);
            _memset_pattern16(a0->field_10, &g_cc0d80, 212);
            *(unsigned int *)&a0->field_34 = 53;
            v33 = a0->field_18;
            v33->field_40 = 0x1000000010000000100000001;
            v33->field_50 = 0x1000000010000000100000001;
            v33->field_60 = 0x1000000010000000100000001;
            v33->field_70 = 0x1000000010000000100000001;
            *(uint128_t *)&v33->field_0 = 0x1000000010000000200000006;
            v33->field_10 = 0x4000000040000000300000002;
            v33->field_20 = 0x1000000020000000300000004;
            v33->field_30 = 0x1000000010000000100000001;
            v6 = (unsigned int)sub_bed64(&g_cc0bd8, 32);
LABEL_bac74:
            *(int *)((char *)&a0->field_34 + 4) = v6;
        }
    }
    return sub_bc5fc(a0, a3);
}
