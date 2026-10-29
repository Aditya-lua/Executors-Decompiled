/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa82e24..0xa82fdc (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a82e24_0 {
    struct st_a82e24_1 *field_0;
    char padding_8[168];
    unsigned long long field_b0;
} st_a82e24_0;

typedef struct st_a82e24_1 {
    char padding_0[16];
    long long field_10;
    char padding_18[8];
    long long field_20;
} st_a82e24_1;


long long * sub_a82e24(st_a82e24_0 *a0, unsigned int a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v15;  // x10
    unsigned long long v16;  // x11
    unsigned long long v17;  // x9
    unsigned int v18;  // x8
    unsigned long v19;  // x9
    long long *v20;  // x19
    unsigned long long v7;  // x30
    unsigned int v8;  // w20
    unsigned int idx;  // x0
    unsigned int v10;  // x8
    unsigned int v11;  // w10
    unsigned int v12;  // w9
    unsigned int v13;  // x8
    unsigned long v14;  // x9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_b0)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (!*(long long *)&a0->padding_8[72] && *(long long *)&a0->padding_8[88])
        return 0;
    v8 = a1;
    idx = sub_a6dac4(a0, 184, "crypto/ml_kem/ml_kem.c", 2014);
    if (!idx)
        return idx;
    memset(idx + 48, 0, 56);
    v10 = *(long long *)&a0->padding_8[56];
    if (v10)
    {
        if (!(v8 & 1))
            v11 = v8;
        else
            v11 = v8 & 0xfffffffd;
        if (!*(long long *)&a0->padding_8[72])
            v11 = v8 & 0xfffffffe;
        v12 = v11 & 3;
        if (1 >= (int)v12)
        {
            if (v12)
            {
                v13 = sub_a6dac4(v10, a0->field_0->field_10, "crypto/ml_kem/ml_kem.c", 2035);
                if (v13)
                {
                    v14 = *(int *)(*(long long *)idx + 72);
                    *(long long *)(idx + 48) = idx + 108;
                    *(long long *)(idx + 56) = idx + 140;
                    v15 = v14 * 0x200;
                    v16 = v13 + v15;
                    *(unsigned long long *)(idx + 64) = v13;
                    *(unsigned long long *)(idx + 72) = v16;
                    v17 = v16 + v14 * v14 * 0x200;
                    *(unsigned long long *)(idx + 80) = v17;
                    *(unsigned long long *)(idx + 88) = v17 + v15;
                    *(unsigned long long *)(idx + 96) = 0;
                }
                if (*(long long *)&a0->padding_8[88])
                    *(long long *)(idx + 96) = *(long long *)(idx + 88) + 32;
                if (!v13)
                {
                    sub_a6c2e4();
                    return 0;
                }
            }
        }
        else
        {
            if (v12 != 3)
            {
                v18 = sub_a6dac4(v10, a0->field_0->field_20, "crypto/ml_kem/ml_kem.c", 2032);
                if (!v18)
                {
                    sub_a6c2e4();
                    return 0;
                }
                v19 = *(int *)(*(long long *)idx + 72);
                *(long long *)(idx + 48) = idx + 108;
                *(long long *)(idx + 56) = idx + 140;
                *(unsigned long long *)(idx + 88) = 0;
                *(unsigned long long *)(idx + 96) = 0;
                *(unsigned long long *)(idx + 64) = v18;
                *(unsigned long long *)(idx + 72) = v18 + v19 * 0x200;
            }
            else
            {
                sub_a6c2e4();
                return 0;
            }
        }
    }
    v20 = (long long *)idx;
    sub_a40a98(*(long long *)(idx + 16));
    sub_a40a98(v20[3]);
    sub_a40a98(v20[4]);
    sub_a40a98(v20[5]);
    return v20;
}
