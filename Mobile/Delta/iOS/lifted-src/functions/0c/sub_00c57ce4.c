/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc57ce4..0xc58480 (1948 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c57ce4_0 {
    void* field_0;
    unsigned long long field_8;
} st_c57ce4_0;

typedef struct st_c57ce4_1 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_c57ce4_1;

extern st_c57ce4_1 g_e0729c;

void* sub_c57ce4(void* a0, st_c57ce4_0 *a1, unsigned int a2, unsigned short a3)
{
    unsigned int v2;  // w9
    void* v3;  // x8
    unsigned long v12;  // x9
    unsigned long long v13;  // w12
    void* v14;  // x10
    unsigned long v15;  // x13
    unsigned long long v16;  // 4118
    unsigned long v4;  // x9
    void* v5;  // x9
    unsigned long long v6;  // x11
    void* v11;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (37 >= a3 - 3)
    {
        goto *((void *)(sub_c57d20 + *(short *)((char *)&(&g_e0729c.field_0)[a3] - 6) * 4));
    }
    else
    {
        switch (v2)
        {
        case 7938:
            v11 = a1->field_0;
            v12 = a1->field_8;
            if (!v12)
            {
                *(char *)&a0[8] = 19;
                memset(a0 + 9, 0, 7);
                *(void* *)&a0[16] = v11;
                *(unsigned long long *)a0 = 46;
                return a0;
            }
            v6 = 0;
            v13 = 0;
            v3 = v11 + v12;
            v5 = v12 - 1;
            v14 = v11 + 1;
            while (1)
            {
                v15 = *((char *)v14 - 1);
                if (v13 == 63 && 1 < (unsigned int)v15)
                {
                    a1->field_0 = v14;
                    a1->field_8 = v5;
                    *(char *)&a0[8] = 6;
                    memset(a0 + 9, 0, 7);
                    *(void* *)&a0[16] = v3;
                    *(unsigned long long *)a0 = 46;
                    return a0;
                }
                v6 |= (v15 & 127) << ((char)v13 & 63);
                if (!(v15 >> 7 & 1))
                {
                    a1->field_0 = v14;
                    a1->field_8 = v5;
                    *(unsigned long long *)a0 = 29;
                    *(unsigned long long *)&a0[8] = v6 & 0xffffffff00000000 | (unsigned int)v6 & 0xff & 0xffff0000 | ((unsigned int)v6 & 0xff & 0xffff00ff | __ROL__((unsigned int)(v6 >> 8), 8) & 0xff00) & 0xffff | (unsigned int)(v6 >> 16) * 0x10000;
                    *(void* *)&a0[16] = v5;
                    return a0;
                }
                v14 += 1;
                v13 += 7;
                v5 -= 1;
                v16 = arm64g_calculate_condition(18, v5, 1, 0);
                if (!(v16 & 1))
                {
                    a1->field_0 = v3;
                    a1->field_8 = 0;
                    *(char *)&a0[8] = 19;
                    memset(a0 + 9, 0, 7);
                    *(void* *)&a0[16] = v3;
                    *(unsigned long long *)a0 = 46;
                    return a0;
                }
            }
        case 7969:
            if (((char)a2 * 0 | (char)(a2 >> 8)) == 8)
            {
                v3 = a1->field_0;
                v4 = a1->field_8;
                if (a1->field_8 <= 7)
                {
                    *(char *)&a0[8] = 19;
                    memset(a0 + 9, 0, 7);
                    *(void* *)&a0[16] = v3;
                    *(unsigned long long *)a0 = 46;
                    return a0;
                }
                a1->field_0 = v3 + 8;
                a1->field_8 = v4 - 8;
                v5 = (char)v3[7];
                v6 = v5 * 0x100000000000000 | (*(int *)v3 * 0x100 | ((short)v3[4] | (char)v3[6] * 0x10000) * 0x10000000000) >> 8;
            }
            else
            {
                v3 = a1->field_0;
                if (a1->field_8 <= 3)
                {
                    *(char *)&a0[8] = 19;
                    memset(a0 + 9, 0, 7);
                    *(void* *)&a0[16] = v3;
                    *(unsigned long long *)a0 = 46;
                    return a0;
                }
                v6 = *(int *)v3;
                v5 = a1->field_8 - 4;
                a1->field_0 = v3 + 4;
                a1->field_8 = v5;
            }
            *(unsigned long long *)a0 = 27;
            *(unsigned long long *)&a0[8] = v6 & 0xffffffff00000000 | (unsigned int)v6 & 0xff & 0xffff0000 | ((unsigned int)v6 & 0xff & 0xffff00ff | __ROL__((unsigned int)(v6 >> 8), 8) & 0xff00) & 0xffff | (unsigned int)(v6 >> 16) * 0x10000;
            *(void* *)&a0[16] = v5;
            return a0;
        default:
            *(char *)&a0[8] = 12;
            *(unsigned short *)&a0[10] = a3;
            *(unsigned long long *)a0 = 46;
            return a0;
        }
    }
}
