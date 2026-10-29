/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x47230..0x47584 (852 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_47230_1 {
    long long field_0;
    char padding_8[4];
    int field_c;
    char padding_10[208];
    char field_e0;
    char padding_e1[1671];
    unsigned int field_768;
} st_47230_1;

typedef struct st_47230_4 {
    char padding_0[32];
    struct st_47230_3 *field_20;
} st_47230_4;

typedef struct st_47230_3 {
    char padding_0[49];
    char field_31;
} st_47230_3;

typedef struct st_47230_2 {
    long long field_0;
    char field_8;
    char padding_9[40];
    char field_31;
} st_47230_2;

typedef struct st_47230_0 {
    char field_0;
} st_47230_0;

extern unsigned long long g_e66048;
extern unsigned long long g_e660e8;
extern char g_f0ca10;
extern char g_f0ce38;

unsigned long long sub_47230(st_47230_1 *a0, void* a1)
{
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v16;  // 4118
    unsigned long long v17;  // x0
    long long len;  // x0
    unsigned long long v19;  // x0
    long long len1;  // x0
    char v21;  // x0
    unsigned long long v22;  // x0
    st_47230_4 *v8;  // x21
    unsigned long long v9;  // x23
    unsigned long long v10;  // x22
    unsigned long long v11;  // x26
    unsigned long long v12;  // x0
    unsigned long long iter;  // x27
    unsigned long long v14;  // x0
    unsigned long long v15;  // x8
    unsigned int v0;  // [bp-0x7c]
    st_47230_0 **v1;  // [bp-0x78], Other Possible Types: char
    st_47230_0 *v2;  // [bp-0x70]
    st_47230_2 *v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v2 = &v1;
    v1 = &v2;
    if (a0->padding_8 >= 1)
    {
        if (1 >= a0->field_c)
        {
            v6 = sub_3bf74(a0, a1);
            if (v6 & 1)
                return v6;
            if (a0->padding_8 >= 1)
                goto LABEL_4729c;
        }
        else
        {
LABEL_4729c:
            if ((long long)a1[40] == 1 && (long long)a1[56] == 1)
            {
                v7 = sub_47588(*(long long *)(long long)a1[48]);
                if (v7)
                {
                    v8 = v7;
                    v9 = sub_34930(&a0->field_e0, (long long)a1[32]);
                    v10 = sub_34930(&a0->field_e0, &v8->field_20);
                    if (!(sub_42480(a0, v8) >> 31 & 1))
                    {
                        if (v9 && *(char *)(v9 + 16) & 1)
                            goto *((void *)(g_e660e8));
                        if (v10 && *(char *)(v10 + 16) & 1)
                            goto *((void *)(g_e660e8));
                        if (*(char *)(*(long long *)(long long)a1[32] + 49) & 1)
                        {
                            goto *((void *)(g_e660e8));
                        }
                        else if (v8->field_20->field_31 & 1)
                        {
                            goto *((void *)(g_e660e8));
                        }
                        else
                        {
                            sub_3f5c4(a0);
                            goto *((void *)(g_e66048));
                        }
                    }
                    else
                    {
                        goto *((void *)(g_e660e8));
                    }
                }
                else
                {
                    goto *((void *)(g_e660e8));
                }
            }
        }
    }
    v11 = sub_3b87c(a0, a1, (int)a1[40]);
    sub_2b4f8(a0->field_0);
    v12 = sub_44fd8(a0, a1 + 48, v11, (char)a1[40], 1);
    if (!(long long)a1[40])
        return v12;
    iter = 0;
    while (1)
    {
        v3 = *(long long *)((long long)a1[32] + iter * 8);
        v14 = sub_34930(&a0->field_e0, &v3);
        v15 = v14 + 8;
        if (!v14)
            v15 = 0;
        if (g_f0ca10 != 1 || v3->field_31 != 1 || g_f0ce38 == 1 && *(char *)(v15 + 9) == 1 && !(v16 = arm64g_calculate_condition(1, a0->field_768, 1, 0), v16 & 1))
        {
            v17 = sub_3f5c4(a0);
            iter += 1;
            if ((unsigned long long)(long long)a1[40] <= iter)
                return v17;
        }
        else
        {
            sub_45d78(a0, a1);
            len = _strlen(v3->field_0);
            v19 = sub_2df40(a0->field_0, v3->field_0, len);
            if (v19 >> 31 & 1)
                sub_45808(&v3->field_8, "Exceeded constant limit; simplify the code to compile");
            v0 = sub_3baf4(a0, a1);
            len1 = _strlen(v3->field_0);
            v21 = sub_2ffe8(v3->field_0, len1);
            sub_2ad10(a0->field_0, 16, (unsigned int)v11 + (unsigned int)iter & 0xff, v0, v21);
            v22 = sub_31514(a0->field_0, v19);
            iter += 1;
            if (iter >= (unsigned long long)(long long)a1[40])
                return v22;
        }
    }
}
