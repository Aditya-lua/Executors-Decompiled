/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa35ce0..0xa35fc8 (744 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a35ce0_1 {
    char padding_0[128];
    unsigned int field_80;
    char padding_84[60];
    unsigned long long field_c0;
    char padding_c8[120];
    unsigned int field_140;
    char padding_144[60];
    unsigned long long field_180;
    char padding_188[120];
    unsigned int field_200;
    unsigned int field_204;
} st_a35ce0_1;

typedef struct st_a35ce0_2 {
    char padding_0[64];
    struct st_a35ce0_0 *field_40;
    char padding_48[120];
    unsigned long long field_c0;
    char padding_c8[248];
    unsigned int field_1c0;
    char padding_1c4[60];
    unsigned long long field_200;
    char padding_208[120];
    unsigned int field_280;
    char padding_284[60];
    unsigned long long field_2c0;
    char padding_2c8[120];
    unsigned int field_340;
    unsigned int field_344;
} st_a35ce0_2;

typedef struct st_a35ce0_0 {
    unsigned int field_0;
    char padding_4[60];
    char field_40;
    char padding_41[63];
    struct st_a35ce0_0 *field_80;
    char padding_88[120];
    unsigned long long field_100;
    char padding_108[120];
    char field_180;
    char padding_181[127];
    unsigned int field_200;
    char padding_204[60];
    unsigned long long field_240;
    char padding_248[120];
    unsigned int field_2c0;
    char padding_2c4[60];
    unsigned long long field_300;
    char padding_308[120];
    unsigned int field_380;
    unsigned int field_384;
} st_a35ce0_0;

extern char g_c7c2eb;

int sub_a35ce0(unsigned int a0, unsigned int a1, unsigned int a2, unsigned int a3, unsigned int a4, unsigned int a5)
{
    void* v4;  // x0
    void* v5;  // x25
    unsigned long idx;  // x28
    unsigned int v15;  // w8
    unsigned long long v16;  // 4137
    unsigned int v17;  // w8
    unsigned long index;  // x19
    unsigned int v19;  // w8
    unsigned int v20;  // w8
    unsigned int v21;  // w8
    unsigned long v22;  // x10
    unsigned long v23;  // x10
    unsigned int v6;  // w9
    unsigned int v24;  // x8
    unsigned int i;  // w8
    unsigned int *v8;  // x27
    st_a35ce0_2 *v9;  // x24
    st_a35ce0_0 **v10;  // x23
    unsigned int *v11;  // x21
    unsigned long long *v12;  // x22
    unsigned long long *v13;  // x20
    st_a35ce0_1 *v0;  // [bp-0x70]
    unsigned long long *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a35bc0();
    if (!v4)
        return (unsigned int)v4;
    v5 = v4;
    v6 = (int)v4[900];
    i = (int)v4[896];
    if (v6 == i)
        return 0;
    v8 = v5 + 0x200;
    v1 = v5 + 0x100;
    v0 = v5 + 384;
    v9 = v5 + 64;
    v10 = v5 + 128;
    v11 = v5 + 704;
    v12 = v5 + 576;
    v13 = v5 + 0x300;
    do
    {
        idx = i;
        if ((unsigned int)(*(int *)((char *)v5 + 4 * i)) >> 1 & 1)
        {
            if (!(v8[idx] & 1))
            {
                v20 = 0;
                v1[idx] = 0;
                *(unsigned long long *)&v0->padding_0[8 * idx] = 0;
            }
            else if (!v1[idx])
            {
LABEL_a35dac:
                *(unsigned int *)&v9->padding_0[4 * idx] = 0;
                *(unsigned int *)((char *)v5 + 4 * idx) = 0;
                v10[idx] = 0;
                v11[idx] = 0xffffffff;
                sub_a6c2e4(v12[idx], "crypto/err/err_local.h", 92);
                v12[idx] = 0;
                sub_a6c2e4(v13[idx], "crypto/err/err_local.h", 94);
                v13[idx] = 0;
                if (0 < (int)v5[896])
                    i = (int)v5[896] - 1;
                else
                    i = 15;
                *(unsigned int *)&v5[896] = i;
                goto LABEL_a35e00;
            }
            else
            {
                *(char *)v1[idx] = 0;
                v20 = 1;
            }
            v8[idx] = v20;
            goto LABEL_a35dac;
        }
        v15 = v6 + 1;
        v16 = arm64g_calculate_condition(67, 0, v15, 0);
        if (v16 & 1)
            v17 = v15 & 15;
        else
            v17 = -(-v15 & 15);
        index = v17;
        if (!((unsigned int)(*(int *)((char *)v5 + 4 * v17)) >> 1 & 1))
        {
            switch (a0)
            {
            case 2:
                v21 = 0;
                v4 = v10[idx];
                goto LABEL_a35f0c;
            case 0:
                v4 = v10[index];
                *(unsigned int *)&v5[900] = v17;
                v10[index] = 0;
                v21 = 1;
                break;
            default:
                v4 = v10[index];
                v21 = 0;
                break;
            }
            idx = index;
LABEL_a35f0c:
            if (a1)
            {
                v22 = v12[idx];
                if (!v12[idx])
                    v22 = &g_c7c2eb;
                *(unsigned long *)a1 = v22;
            }
            if (a2)
                *(unsigned int *)a2 = v11[idx];
            if (a3)
            {
                v23 = v13[idx];
                if (!v13[idx])
                    v23 = &g_c7c2eb;
                *(unsigned long *)a3 = v23;
            }
            if (a5)
                *(unsigned int *)a5 = v8[idx];
            if (a4)
            {
                v24 = v1[idx];
                *(unsigned long long *)a4 = v24;
                if (v24)
                    return (unsigned int)v4;
                *(char **)a4 = &g_c7c2eb;
                if (a5)
                    *(unsigned int *)a5 = 0;
                return (unsigned int)v4;
            }
            else if (!v21)
            {
                return (unsigned int)v4;
            }
            else if (!(v8[idx] & 1))
            {
                v1[idx] = 0;
                *(unsigned long long *)&v0->padding_0[8 * idx] = 0;
                v8[idx] = 0;
                return (unsigned int)v4;
            }
            else
            {
                if (!v1[idx])
                    return (unsigned int)v4;
                *(char *)v1[idx] = 0;
                v8[idx] = 1;
                return (unsigned int)v4;
            }
        }
        *(unsigned int *)&v5[900] = v17;
        if (!(v8[index] & 1))
        {
            v19 = 0;
            v1[index] = 0;
            *(unsigned long long *)&v0->padding_0[8 * index] = 0;
        }
        else
        {
            if (!v1[index])
                continue;
            *(char *)v1[index] = 0;
            v19 = 1;
        }
        v8[index] = v19;
        *(unsigned int *)&v9->padding_0[4 * index] = 0;
        *(unsigned int *)((char *)v5 + 4 * index) = 0;
        v10[index] = 0;
        v11[index] = 0xffffffff;
        sub_a6c2e4(v12[index], "crypto/err/err_local.h", 92);
        v12[index] = 0;
        sub_a6c2e4(v13[index], "crypto/err/err_local.h", 94);
        v13[index] = 0;
        i = (int)v5[896];
LABEL_a35e00:
        v6 = (int)v5[900];
    } while ((int)v5[900] != i);
    return 0;
}
