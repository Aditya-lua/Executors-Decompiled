/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa801cc..0xa803e8 (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a801cc_0 {
    char padding_0[8];
    struct st_a801cc_1 *field_8;
    long long field_10;
    char padding_18[8];
    char field_20;
    char padding_21[191];
    struct st_a801cc_2 *field_e0;
    char padding_e8[8];
    long long field_f0;
    unsigned long long field_f8;
} st_a801cc_0;

typedef struct st_a801cc_2 {
    unsigned int field_0;
} st_a801cc_2;

typedef struct st_a801cc_1 {
    char padding_0[32];
    unsigned long long field_20;
    unsigned long long field_28;
} st_a801cc_1;


unsigned int * sub_a801cc(st_a801cc_0 *a0, long long a1, unsigned long long *a2, unsigned long long *a3)
{
    unsigned long long v9;  // x23
    unsigned long long v10;  // x26
    unsigned int *v19;  // x23
    unsigned int *j;  // x24
    unsigned int *k;  // x9
    unsigned int *v22;  // x10
    unsigned int *v23;  // x11
    unsigned int *m;  // x13
    unsigned int v25;  // w14
    unsigned int *v26;  // x24
    unsigned int *l;  // x26
    unsigned int *n;  // x27
    unsigned long long v11;  // x25
    long long v29;  // x22
    long long v30;  // x23
    unsigned int *v31;  // x20
    unsigned long v12;  // x8
    unsigned int *v13;  // x0
    unsigned int *v14;  // x19
    unsigned int *v15;  // x8
    unsigned int *v16;  // x26
    unsigned long iter;  // x23
    unsigned int *i;  // x24
    unsigned int *v0;  // [bp-0x98]
    unsigned int *v1;  // [bp-0x90]
    unsigned long v2;  // [bp-0x88]
    unsigned int *v3;  // [bp-0x80]
    unsigned long v4;  // [bp-0x78]
    unsigned int *v5;  // [bp-0x70]
    unsigned int *v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = a0->field_8->field_20;
    v10 = a0->field_8->field_28;
    v11 = v10 + v9;
    v12 = (unsigned int)v11 + (unsigned int)v9 * (unsigned int)v10;
    v13 = sub_a6bf4c((v12 * 0x400 | v12 >> 54) & 0x3fffffffc00 & 0x3ffffffffff, "crypto/ml_dsa/ml_dsa_key.c", 326);
    if (!v13)
        return 0;
    v14 = v13;
    v15 = v9 & 0xffffffff;
    v16 = v10 & 0xffffffff;
    v0 = v13;
    v1 = v15;
    iter = (char *)v13 + 0x400 * v15;
    v2 = iter;
    v3 = v16;
    v5 = v15;
    v6 = v16;
    v4 = iter + v16 * 0x400;
    if (sub_a80ff8(a1, a0->field_10, &a0->field_20, &v4))
    {
        _memcpy(iter, a0->field_f0, a0->field_f8 * 0x400);
        if (v16)
        {
            i = 0;
            do
            {
                sub_a80d70(iter);
                i = (char *)i + 1;
                iter += 0x400;
            } while (i < v16);
        }
        sub_a80bf4(&v4, &v2, &v0);
        if (v1)
        {
            v19 = 0;
            j = 0;
            do
            {
                sub_a80e88(v0 + v19);
                j = (char *)j + 1;
                v19 += 0x100;
            } while (j < v1);
            if (v1)
            {
                k = 0;
                v22 = v0;
                v23 = a0->field_e0;
                do
                {
                    m = 0;
                    do
                    {
                        v25 = *(int *)(v23 + m) + *(int *)(v22 + m);
                        *(unsigned int *)(v22 + m) = ~((int)(v25 + 0xff801fff & ~v25) >> 31) & v25 + 0xff801fff | (int)(v25 + 0xff801fff & ~v25) >> 31 & v25;
                        m += 1;
                    } while (m != 0x400);
                    k = (char *)k + 1;
                    v23 += 0x100;
                    v22 += 0x100;
                } while (k != v1);
                v26 = 0;
                l = 0;
                do
                {
                    n = 0;
                    v29 = *a3 + (char *)v26;
                    v30 = *a2 + (char *)v26;
                    do
                    {
                        sub_a8097c(*(int *)(v0 + v26 + n * 4), v30, v29);
                        n = (char *)n + 1;
                        v29 += 4;
                        v30 += 4;
                    } while (n != 0x100);
                    l = (char *)l + 1;
                    v26 += 0x100;
                } while (l < v1);
            }
        }
        v31 = 1;
    }
    else
    {
        v31 = 0;
    }
    sub_a66ec0(v14, (v11 * 0x400 | v11 >> 54) & 0x3fffffffc00 & 0x3ffffffffff);
    sub_a6c2e4(v14, "crypto/ml_dsa/ml_dsa_key.c", 358);
    return v31;
}
