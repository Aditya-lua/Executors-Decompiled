/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5f9b4..0xb602ac (2296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5f9b4_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_b5f9b4_0;

typedef struct st_b5f9b4_3 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
    char field_4;
    char field_5;
    unsigned long long field_6;
    unsigned long long field_e;
    unsigned long long field_16;
    unsigned long long field_1e;
} st_b5f9b4_3;

typedef struct st_b5f9b4_8 {
    char field_0;
    unsigned long long field_1;
    unsigned long long field_9;
    unsigned long long field_11;
    unsigned long long field_19;
} st_b5f9b4_8;

typedef struct st_b5f9b4_7 {
    char field_0;
    char field_1;
    unsigned long long field_2;
    unsigned long long field_a;
    unsigned long long field_12;
    unsigned long long field_1a;
} st_b5f9b4_7;

typedef struct st_b5f9b4_6 {
    char field_0;
    char field_1;
    char field_2;
    unsigned long long field_3;
    unsigned long long field_b;
    unsigned long long field_13;
    unsigned long long field_1b;
} st_b5f9b4_6;

typedef struct st_b5f9b4_5 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
    unsigned long long field_4;
    unsigned long long field_c;
    unsigned long long field_14;
    unsigned long long field_1c;
} st_b5f9b4_5;

typedef struct st_b5f9b4_4 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
    char field_4;
    unsigned long long field_5;
    unsigned long long field_d;
    unsigned long long field_15;
    unsigned long long field_1d;
} st_b5f9b4_4;

typedef struct st_b5f9b4_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_b5f9b4_2;

typedef struct st_b5f9b4_1 {
    unsigned long long field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_b5f9b4_1;

extern st_b5f9b4_0 g_dfea70;
extern st_b5f9b4_1 g_dfee70;
extern st_b5f9b4_2 g_e00e70;

unsigned long long sub_b5f9b4(unsigned long long a0, void* a1, unsigned long long a2)
{
    void* v33;  // x10
    void* v34;  // x9
    void* v35;  // x11
    st_b5f9b4_3 *v36;  // x11
    st_b5f9b4_4 *v37;  // x11
    st_b5f9b4_5 *v38;  // x11
    st_b5f9b4_6 *v39;  // x11
    st_b5f9b4_7 *v40;  // x11
    st_b5f9b4_8 *v41;  // x11
    void* v42;  // x10
    st_b5f9b4_0 *v0;  // [bp-0x110]
    unsigned long long v1;  // [bp-0x104]
    unsigned long long v2;  // [bp-0x100]
    unsigned long long v3;  // [bp-0xf8]
    unsigned long long v4;  // [bp-0xf0]
    unsigned long long v5;  // [bp-0xe8]
    unsigned long long v6;  // [bp-0xe0]
    unsigned long long v7;  // [bp-0xd8]
    unsigned long long v8;  // [bp-0xd0]
    unsigned long long v9;  // [bp-0xc8]
    long long v10;  // [bp-0xc0], Other Possible Types: unsigned long long
    unsigned long long v11;  // [bp-0xb8]
    unsigned long long v12;  // [bp-0xb0]
    unsigned long long v13;  // [bp-0xa8]
    unsigned long long v14;  // [bp-0x9c]
    unsigned long long v15;  // [bp-0x98]
    unsigned long long v16;  // [bp-0x8c]
    unsigned long long v17;  // [bp-0x88]
    unsigned long long v18;  // [bp-0x7c]
    unsigned long long v19;  // [bp-0x78]
    unsigned long long v20;  // [bp-0x6c]
    unsigned long long v21;  // [bp-0x68]
    unsigned int v22;  // [bp-0x5c]
    unsigned long long iter;  // [bp-0x58]
    unsigned long long v24;  // [bp-0x54]
    void* iter1;  // [bp-0x50]
    unsigned long long iter2;  // [bp-0x48]
    unsigned long long node;  // [bp-0x40]
    st_b5f9b4_3 *v28;  // [bp-0x38], Other Possible Types: st_b5f9b4_4 *, st_b5f9b4_5 *, st_b5f9b4_6 *, st_b5f9b4_7 *, st_b5f9b4_8 *, void*
    unsigned long long i;  // [bp-0x30]
    unsigned long long v30;  // [bp-0x28]
    char *v31;  // [bp-0x10]
    char v32;  // [bp+0x0]

    v31 = &v32;
    i = a0;
    v28 = a1;
    node = a2;
    if (!v28)
    {
        v30 = 0;
        return v30;
    }
    i = 0xffffffff & ~i;
    if (47 <= node)
    {
        while (1)
        {
            v1 = 0;
            if (node)
                v1 = (v28 & 7) != 0;
            if (!(v1 & 1))
                break;
            node -= 1;
            v33 = v28;
            v28 = v33 + 1;
            i = (&g_dfea70.field_0)[(i & 0xff ^ *(char *)v33) & 0xff] ^ i >> 8;
        }
        iter2 = node / 40;
        node -= iter2 * 40;
        iter1 = v28;
        v24 = 1;
        if ((char)v24)
        {
            v22 = i;
            v20 = 0;
            v18 = 0;
            v16 = 0;
            v14 = 0;
            while (1)
            {
                iter2 -= 1;
                if (!iter2)
                    break;
                v21 = v22 ^ *(long long *)iter1;
                v19 = v20 ^ (long long)iter1[8];
                v17 = v18 ^ (long long)iter1[16];
                v15 = v16 ^ (long long)iter1[24];
                v13 = v14 ^ (long long)iter1[32];
                iter1 += 40;
                v22 = *(int *)((char *)&g_dfee70.field_0 + 4 * v21);
                v20 = *(int *)((char *)&g_dfee70.field_0 + 4 * v19);
                v18 = *(int *)((char *)&g_dfee70.field_0 + 4 * v17);
                v16 = *(int *)((char *)&g_dfee70.field_0 + 4 * v15);
                v14 = *(int *)((char *)&g_dfee70.field_0 + 4 * v13);
                for (iter = 1; iter < 8; iter += 1)
                {
                    v22 ^= *(int *)((char *)&(&g_dfee70.field_0)[128 * iter] + 4 * (v21 >> ((char)iter * 8 & 63) & 0xff));
                    v20 ^= *(int *)((char *)&(&g_dfee70.field_0)[128 * iter] + 4 * (v19 >> ((char)iter * 8 & 63) & 0xff));
                    v18 ^= *(int *)((char *)&(&g_dfee70.field_0)[128 * iter] + 4 * (v17 >> ((char)iter * 8 & 63) & 0xff));
                    v16 ^= *(int *)((char *)&(&g_dfee70.field_0)[128 * iter] + 4 * (v15 >> ((char)iter * 8 & 63) & 0xff));
                    v14 ^= *(int *)((char *)&(&g_dfee70.field_0)[128 * iter] + 4 * (v13 >> ((char)iter * 8 & 63) & 0xff));
                }
            }
            i = sub_b602ac(v22 ^ *(long long *)iter1) & 0xffffffff;
            i = sub_b602ac(v20 ^ (long long)iter1[8] ^ i) & 0xffffffff;
            i = sub_b602ac(v18 ^ (long long)iter1[16] ^ i) & 0xffffffff;
            i = sub_b602ac(v16 ^ (long long)iter1[24] ^ i) & 0xffffffff;
            i = sub_b602ac(v14 ^ (long long)iter1[32] ^ i) & 0xffffffff;
            iter1 += 40;
        }
        else
        {
            v12 = sub_b60314(i);
            v9 = 0;
            v7 = 0;
            v5 = 0;
            v3 = 0;
            while (1)
            {
                iter2 -= 1;
                if (!iter2)
                    break;
                v11 = v12 ^ *(long long *)iter1;
                v8 = v9 ^ (long long)iter1[8];
                v6 = v7 ^ (long long)iter1[16];
                v4 = v5 ^ (long long)iter1[24];
                v2 = v3 ^ (long long)iter1[32];
                iter1 += 40;
                v12 = (&g_e00e70.field_0)[(char)v11];
                v9 = (&g_e00e70.field_0)[(char)v8];
                v7 = (&g_e00e70.field_0)[(char)v6];
                v5 = (&g_e00e70.field_0)[(char)v4];
                v3 = (&g_e00e70.field_0)[(char)v2];
                for (iter = 1; iter < 8; iter += 1)
                {
                    v12 ^= (&g_e00e70.field_0)[0x100 * iter + (v11 >> ((char)iter * 8 & 63) & 0xff)];
                    v9 ^= (&g_e00e70.field_0)[0x100 * iter + (v8 >> ((char)iter * 8 & 63) & 0xff)];
                    v7 ^= (&g_e00e70.field_0)[0x100 * iter + (v6 >> ((char)iter * 8 & 63) & 0xff)];
                    v5 ^= (&g_e00e70.field_0)[0x100 * iter + (v4 >> ((char)iter * 8 & 63) & 0xff)];
                    v3 ^= (&g_e00e70.field_0)[0x100 * iter + (v2 >> ((char)iter * 8 & 63) & 0xff)];
                }
            }
            v10 = sub_b60380(v12 ^ *(long long *)iter1);
            v10 = sub_b60380(v9 ^ (long long)iter1[8] ^ v10);
            v10 = sub_b60380(v7 ^ (long long)iter1[16] ^ v10);
            v10 = sub_b60380(v5 ^ (long long)iter1[24] ^ v10);
            v10 = sub_b60380(v3 ^ (long long)iter1[32] ^ v10);
            iter1 += 40;
            i = sub_b60314(v10);
        }
        v28 = iter1;
    }
    for (; 8 <= node; i = (&g_dfea70.field_0)[(i & 0xff ^ v41->field_0) & 0xff] ^ i >> 8)
    {
        node -= 8;
        v34 = v28;
        v28 = v34 + 1;
        v0 = &g_dfea70.field_0;
        i = (&g_dfea70.field_0)[(char)i ^ *(char *)v34] ^ i >> 8;
        v35 = v28;
        v28 = v35 + 1;
        i = (&g_dfea70.field_0)[(i & 0xff ^ *(char *)v35) & 0xff] ^ i >> 8;
        v36 = v28;
        v28 = &v36->field_1;
        i = (&g_dfea70.field_0)[(i & 0xff ^ v36->field_0) & 0xff] ^ i >> 8;
        v37 = v28;
        v28 = &v37->field_1;
        i = (&g_dfea70.field_0)[(i & 0xff ^ v37->field_0) & 0xff] ^ i >> 8;
        v38 = v28;
        v28 = &v38->field_1;
        i = (&g_dfea70.field_0)[(i & 0xff ^ v38->field_0) & 0xff] ^ i >> 8;
        v39 = v28;
        v28 = &v39->field_1;
        i = (&g_dfea70.field_0)[(i & 0xff ^ v39->field_0) & 0xff] ^ i >> 8;
        v40 = v28;
        v28 = &v40->field_1;
        i = (&g_dfea70.field_0)[(i & 0xff ^ v40->field_0) & 0xff] ^ i >> 8;
        v41 = v28;
        v28 = &(&v41->field_0)[1];
    }
    for (; node; i = (&g_dfea70.field_0)[(i & 0xff ^ *(char *)v42) & 0xff] ^ i >> 8)
    {
        node -= 1;
        v42 = v28;
        v28 = v42 + 1;
    }
    v30 = i ^ 0xffffffff;
    return v30;
}
