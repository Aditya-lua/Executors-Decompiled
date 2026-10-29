/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b8880..0x9b8ba4 (804 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b8880_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
    unsigned int field_20;
    unsigned int field_24;
    unsigned int field_28;
    unsigned int field_2c;
    unsigned int field_30;
    unsigned int field_34;
    unsigned int field_38;
    unsigned int field_3c;
    char field_40;
    char padding_41[3];
    char field_44;
    char padding_45[171];
    unsigned int field_f0;
} st_9b8880_0;

typedef struct st_9b8880_1 {
    char padding_0[2];
    char field_2;
} st_9b8880_1;

extern char g_d28b40;
extern char g_d28f40;
extern char g_d29340;
extern char g_d29740;
extern char g_d29b40;
extern char _NSHomeDirectory;

st_9b8880_0 * sub_9b8880(st_9b8880_0 *a0, unsigned int a1, st_9b8880_0 *a2)
{
    unsigned int v0;  // w8
    unsigned long v1;  // x8
    unsigned int *iter;  // x10
    unsigned long v11;  // x16
    unsigned int v12;  // w0
    unsigned int v13;  // w17
    unsigned int v14;  // w17
    unsigned long v15;  // x12
    unsigned long v16;  // x12
    unsigned int v17;  // w12
    st_9b8880_0 *iter1;  // x13
    unsigned int *node;  // x14
    unsigned int v2;  // w8
    unsigned int v20;  // w2
    st_9b8880_1 *v21;  // x2
    unsigned int v22;  // w2
    unsigned long v23;  // x12
    unsigned long v24;  // x12
    unsigned int v25;  // w12
    st_9b8880_0 *iter2;  // x13
    unsigned int *v27;  // x14
    unsigned int v28;  // w2
    st_9b8880_1 *v29;  // x2
    unsigned long v3;  // x9
    unsigned int v30;  // w2
    unsigned int v31;  // w3
    unsigned int v32;  // w2
    unsigned int v4;  // w9
    unsigned long v5;  // x10
    unsigned int v6;  // w10
    unsigned long v7;  // x11
    unsigned int v8;  // w11
    st_9b8880_0 *i;  // x9

    if (!a0)
    {
        return 0xffffffff;
    }
    else if (a2)
    {
        if (a1 != 128 && a1 != 0x100 && a1 != 192)
            return 0xfffffffe;
        switch (a1)
        {
        case 128:
            v0 = 10;
            break;
        case 192:
            v0 = 12;
            break;
        default:
            v0 = 14;
            break;
        }
        a2->field_f0 = v0;
        v1 = a0->field_0;
        v2 = (((((v1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        a2->field_0 = v2;
        v3 = a0->field_4;
        v4 = (((((v3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v3 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v3 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        a2->field_4 = v4;
        v5 = a0->field_8;
        v6 = (((((v5 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v5 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v5 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v5 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        a2->field_8 = v6;
        v7 = a0->field_c;
        v8 = (((((v7 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v7 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v7 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v7 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        a2->field_c = v8;
        if (a1 == 128)
        {
            i = 0;
            iter = &a2->field_10;
            do
            {
                v11 = *(int *)((char *)iter - 4);
                v2 = v2 ^ (&g_d28b40)[3 + 4 * (v11 >> 16 & 0xff)] * &_NSHomeDirectory ^ (&g_d28f40)[2 + 4 * (v11 >> 8 & 0xff)] * 0x10000 ^ (&g_d29340)[1 + 4 * (v11 & 0xff)] * 0x100 ^ (&g_d29740)[v11 >> 22 & 0x3fc] ^ *(int *)(&g_d29b40 + i);
                v12 = *(int *)((char *)iter - 8);
                v13 = *(int *)((char *)iter - 12) ^ v2;
                *iter = v2;
                iter[1] = v13;
                v14 = v12 ^ v13;
                iter[2] = v14;
                iter[3] = v14 ^ (unsigned int)v11;
                i = &i->field_4;
                iter += 4;
            } while (i != 40);
        }
        else
        {
            v15 = a0->field_10;
            a2->field_10 = (((((v15 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v15 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v15 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v15 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v16 = a0->field_14;
            v17 = (((((v16 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v16 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v16 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v16 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            a2->field_14 = v17;
            if (a1 == 192)
            {
                iter1 = 0;
                node = &a2->field_2c;
                while (1)
                {
                    v20 = (&g_d28b40)[3 + 4 * ((v17 * 0x10000 | v17 >> 16) & 0xffff00ff & 0xff)];
                    v21 = &(&g_d28f40)[4 * ((v17 * &_NSHomeDirectory | v17 >> 8) & 0xff0000ff & 0xff)];
                    v2 = v2 ^ v20 * &_NSHomeDirectory ^ v21->field_2 * 0x10000 ^ (&g_d29340)[1 + 4 * (v17 & 0xff)] * 0x100 ^ (&g_d29740)[((v17 >> 24) * 4 | v17 >> 24 >> 62) & 0x3fffffffc & 0x3ffffffff] ^ *(int *)(&g_d29b40 + iter1);
                    v4 ^= v2;
                    *(unsigned int *)((char *)node - 20) = v2;
                    *(unsigned int *)((char *)node - 16) = v4;
                    v6 ^= v4;
                    v8 ^= v6;
                    *(unsigned int *)((char *)node - 12) = v6;
                    *(unsigned int *)((char *)node - 8) = v8;
                    if (iter1 == 28)
                        break;
                    v22 = *(int *)((char *)node - 28) ^ v8;
                    v17 ^= v22;
                    *(unsigned int *)((char *)node - 4) = v22;
                    *node = v17;
                    node += 6;
                    iter1 = &iter1->field_4;
                }
            }
            else
            {
                v23 = a0->field_18;
                a2->field_18 = (((((v23 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v23 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v23 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v23 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                v24 = a0->field_1c;
                v25 = (((((v24 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v24 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v24 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v24 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                a2->field_1c = v25;
                if (a1 == 0x100)
                {
                    iter2 = 0;
                    v27 = &a2->field_20;
                    while (1)
                    {
                        v28 = (&g_d28b40)[3 + 4 * ((v25 * 0x10000 | v25 >> 16) & 0xffff00ff & 0xff)];
                        v29 = &(&g_d28f40)[4 * ((v25 * &_NSHomeDirectory | v25 >> 8) & 0xff0000ff & 0xff)];
                        v2 = v2 ^ v28 * &_NSHomeDirectory ^ v29->field_2 * 0x10000 ^ (&g_d29340)[1 + 4 * (v25 & 0xff)] * 0x100 ^ (&g_d29740)[((v25 >> 24) * 4 | v25 >> 24 >> 62) & 0x3fffffffc & 0x3ffffffff] ^ *(int *)(&g_d29b40 + iter2);
                        v4 ^= v2;
                        *v27 = v2;
                        v27[1] = v4;
                        v6 ^= v4;
                        v8 ^= v6;
                        v27[2] = v6;
                        v27[3] = v8;
                        if (iter2 == 24)
                            break;
                        v30 = *(int *)((char *)v27 - 16) ^ (&g_d28b40)[3 + 4 * (v8 >> 24)] * &_NSHomeDirectory ^ (&g_d28f40)[2 + 4 * (__ROL__(v8, 16) & 0xffff00ff & 0xff)] * 0x10000 ^ (&g_d29340)[1 + 4 * (__ROL__(v8, 24) & 0xff0000ff & 0xff)] * 0x100 ^ (&g_d29740)[((v8 & 0xff) * 4 | (v8 & 0xff) >> 62) & 0x3fffffffc & 0x3ffffffff];
                        v31 = *(int *)((char *)v27 - 12) ^ v30;
                        v27[4] = v30;
                        v27[5] = v31;
                        v32 = *(int *)((char *)v27 - 8) ^ v31;
                        v25 ^= v32;
                        v27[6] = v32;
                        v27[7] = v25;
                        v27 += 8;
                        iter2 = &iter2->field_4;
                    }
                }
            }
        }
        return 0;
    }
    else
    {
        return 0xffffffff;
    }
}
