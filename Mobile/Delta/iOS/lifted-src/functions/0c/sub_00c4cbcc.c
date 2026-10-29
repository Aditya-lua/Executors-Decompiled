/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4cbcc..0xc4da9c (3792 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4cbcc_0 {
    void* field_0;
    unsigned long long field_8;
} st_c4cbcc_0;

typedef struct st_c4cbcc_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_9;
    char field_a;
    char padding_b[5];
    void* field_10;
    unsigned short field_18;
} st_c4cbcc_2;

typedef struct st_c4cbcc_1 {
    char padding_0[8];
    unsigned short field_8;
    unsigned short field_a;
} st_c4cbcc_1;

extern void g_e06ef0;

st_c4cbcc_2 * sub_c4cbcc(st_c4cbcc_2 *a0, st_c4cbcc_0 *a1, unsigned int a2, st_c4cbcc_1 *a3)
{
    void* v2;  // x8
    unsigned long long v3;  // x10
    unsigned long long v12;  // 4118
    unsigned long long v17;  // w12
    unsigned long v18;  // x13
    unsigned long long v19;  // 4118
    unsigned long long v20;  // x8
    unsigned short v21;  // x8
    void* v4;  // x14
    unsigned int v5;  // w17
    unsigned long long v6;  // x11
    unsigned long long v7;  // w12
    void* v8;  // x9
    unsigned long iter;  // x10
    void* node;  // x8
    unsigned long v11;  // x13
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_0;
    v3 = a1->field_8;
    v5 = a3->field_a;
    if (0x1f00 >= (int)v5 && 43 >= v5 - 1)
        goto *((void *)(sub_c4cc1c + *(short *)(&(&g_e06ef0)[2 * v5] - 2) * 4));
    if (0x1f1f >= (int)v5)
    {
        if (v5 != 7937)
        {
            if (v5 == 7938)
            {
                if (!v3)
                    goto LABEL_c4d5a8;
                v6 = 0;
                v7 = 0;
                v8 = v2 + v3;
                iter = v3 - 1;
                node = v2 + 1;
                do
                {
                    v11 = *((char *)node - 1);
                    if (v7 == 63 && 1 < (unsigned int)v11)
                        goto LABEL_c4d5b4;
                    v4 = (v11 & 127) << ((char)v7 & 63);
                    v6 |= v4;
                    if (!(v11 >> 7 & 1))
                    {
                        a1->field_0 = node;
                        a1->field_8 = iter;
                        v21 = a3->field_8;
                        a0->field_0 = 29;
                        a0->field_8 = v6 & 0xffffffff00000000 | (unsigned int)v6 & 0xff & 0xffff0000 | ((unsigned int)v6 & 0xff & 0xffff00ff | __ROL__((unsigned int)(v6 >> 8), 8) & 0xff00) & 0xffff | (unsigned int)(v6 >> 16) * 0x10000;
                        *(void* *)&a0->field_9 = v4;
                        *(unsigned short *)&a0->field_10 = v21;
                        return a0;
                    }
                    node += 1;
                    v7 += 7;
                    iter -= 1;
                    v12 = arm64g_calculate_condition(18, iter, 1, 0);
                } while (v12 & 1);
                goto LABEL_c4d5a0;
            }
            goto LABEL_c4d664;
        }
        else if (v3)
        {
            v6 = 0;
            v17 = 0;
            v8 = v2 + v3;
            iter = v3 - 1;
            node = v2 + 1;
            while (1)
            {
                v18 = *((char *)node - 1);
                if (v17 != 63 || 1 >= (unsigned int)v18)
                {
                    v4 = (v18 & 127) << ((char)v17 & 63);
                    v6 |= v4;
                    if (!(v18 >> 7 & 1))
                    {
                        a1->field_0 = node;
                        a1->field_8 = iter;
                        v21 = a3->field_8;
                        a0->field_0 = 12;
                        a0->field_8 = v6 & 0xffffffff00000000 | (unsigned int)v6 & 0xff & 0xffff0000 | ((unsigned int)v6 & 0xff & 0xffff00ff | __ROL__((unsigned int)(v6 >> 8), 8) & 0xff00) & 0xffff | (unsigned int)(v6 >> 16) * 0x10000;
                        *(void* *)&a0->field_9 = v4;
                        *(unsigned short *)&a0->field_10 = v21;
                        return a0;
                    }
                    node += 1;
                    v17 += 7;
                    iter -= 1;
                    v19 = arm64g_calculate_condition(18, iter, 1, 0);
                    if (!(v19 & 1))
                        break;
                }
                else
                {
LABEL_c4d5b4:
                    a1->field_0 = node;
                    a1->field_8 = iter;
                    v20 = 6;
                    goto LABEL_c4d5bc;
                }
            }
LABEL_c4d5a0:
            a1->field_0 = v8;
            a1->field_8 = 0;
            goto LABEL_c4d5ac;
        }
        else
        {
LABEL_c4d5a8:
            v8 = v2;
LABEL_c4d5ac:
            v20 = 19;
LABEL_c4d5bc:
            *(char *)&a0->field_8 = v20;
            memset((char *)&a0->field_8 + 1, 0, 7);
            *(void* *)&a0->field_9 = v8;
        }
    }
    else
    {
        if (v5 != 7968)
        {
            if (v5 == 7969)
            {
                if (((char)a2 * 0 | (char)(a2 >> 8)) == 8)
                {
                    if (v3 > 7)
                    {
                        a1->field_0 = v2 + 8;
                        a1->field_8 = v3 - 8;
                        v6 = (char)v2[7] * 0x100000000000000 | (*(int *)v2 * 0x100 | ((short)v2[4] | (char)v2[6] * 0x10000) * 0x10000000000) >> 8;
                        v21 = a3->field_8;
                        a0->field_0 = 27;
                        a0->field_8 = v6 & 0xffffffff00000000 | (unsigned int)v6 & 0xff & 0xffff0000 | ((unsigned int)v6 & 0xff & 0xffff00ff | __ROL__((unsigned int)(v6 >> 8), 8) & 0xff00) & 0xffff | (unsigned int)(v6 >> 16) * 0x10000;
                        *(void **)&a0->field_9 = &g_e06ef0;
                        *(unsigned short *)&a0->field_10 = v21;
                        return a0;
                    }
                }
                else
                {
                    if (v3 > 3)
                    {
                        v6 = *(int *)v2;
                        a1->field_0 = v2 + 4;
                        a1->field_8 = v3 - 4;
                        v21 = a3->field_8;
                        a0->field_0 = 27;
                        a0->field_8 = (unsigned int)v6 & 0xff & 0xffff0000 | ((unsigned int)v6 & 0xff & 0xffff00ff | __ROL__((unsigned int)(v6 >> 8), 8) & 0xff00) & 0xffff | (unsigned int)(v6 >> 16) * 0x10000;
                        *(void **)&a0->field_9 = &g_e06ef0;
                        *(unsigned short *)&a0->field_10 = v21;
                        return a0;
                    }
                }
                goto LABEL_c4d7f8;
            }
LABEL_c4d664:
            *(char *)&a0->field_8 = 12;
            *(unsigned short *)((char *)&a0->field_8 + 2) = v5;
        }
        else
        {
            if (((char)a2 * 0 | (char)(a2 >> 8)) == 8)
            {
                if (v3 > 7)
                {
                    a1->field_0 = v2 + 8;
                    a1->field_8 = v3 - 8;
                    v6 = (char)v2[7] * 0x100000000000000 | (*(int *)v2 * 0x100 | ((short)v2[4] | (char)v2[6] * 0x10000) * 0x10000000000) >> 8;
                    v21 = a3->field_8;
                    a0->field_0 = 15;
                    a0->field_8 = v6 & 0xffffffff00000000 | (unsigned int)v6 & 0xff & 0xffff0000 | ((unsigned int)v6 & 0xff & 0xffff00ff | __ROL__((unsigned int)(v6 >> 8), 8) & 0xff00) & 0xffff | (unsigned int)(v6 >> 16) * 0x10000;
                    *(void **)&a0->field_9 = &g_e06ef0;
                    *(unsigned short *)&a0->field_10 = v21;
                    return a0;
                }
            }
            else
            {
                if (v3 > 3)
                {
                    v6 = *(int *)v2;
                    a1->field_0 = v2 + 4;
                    a1->field_8 = v3 - 4;
                    v21 = a3->field_8;
                    a0->field_0 = 15;
                    a0->field_8 = (unsigned int)v6 & 0xff & 0xffff0000 | ((unsigned int)v6 & 0xff & 0xffff00ff | __ROL__((unsigned int)(v6 >> 8), 8) & 0xff00) & 0xffff | (unsigned int)(v6 >> 16) * 0x10000;
                    *(void **)&a0->field_9 = &g_e06ef0;
                    *(unsigned short *)&a0->field_10 = v21;
                    return a0;
                }
            }
LABEL_c4d7f8:
            *(char *)&a0->field_8 = 19;
            memset((char *)&a0->field_8 + 1, 0, 7);
            *(void* *)&a0->field_9 = v2;
        }
    }
    a0->field_0 = 46;
    return a0;
}
