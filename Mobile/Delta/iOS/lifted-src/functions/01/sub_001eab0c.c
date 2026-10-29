/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1eab0c..0x1eac94 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1eab0c_1 {
    struct st_1eab0c_2 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    void* field_18;
    unsigned long long field_20;
} st_1eab0c_1;

typedef struct st_1eab0c_2 {
    unsigned int field_0;
} st_1eab0c_2;

typedef struct st_1eab0c_0 {
    char field_0;
} st_1eab0c_0;

extern char g_10002b0;

void sub_1eab0c(st_1eab0c_1 *a0)
{
    unsigned int v6;  // x20
    unsigned long long v7;  // x21
    void* iter;  // x9
    unsigned long long v17;  // x10
    unsigned long long v18;  // x10
    unsigned long long v19;  // d0
    unsigned long long v20;  // d0
    unsigned int v8;  // w0
    void* v9;  // x8
    unsigned long long v10;  // x9
    char *v11;  // x10
    unsigned long long v12;  // x9
    unsigned long idx;  // x11
    void* v14;  // x9
    unsigned int v15;  // x8
    st_1eab0c_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1eab0c_0 *v1;  // [bp-0x50]
    char v2;  // [bp-0x48]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    _bzero(a0->field_18, a0->field_20 * 8);
    sub_1ed950(a0);
    if (a0->field_8 >= 2)
    {
        v6 = 0;
        v7 = 1;
        do
        {
            v8 = sub_1eaa7c(&v2, *(int *)&a0->field_0[v7]);
            v6 += 1;
            if (v8)
            {
                v9 = a0->field_18;
                v10 = v8;
                v11 = &v2;
                do
                {
                    v12 = v10;
                    idx = *v11;
                    v11 += 4;
                    if (!*(long long *)((char *)v9 + 8 * idx))
                        *(unsigned long long *)((char *)v9 + 8 * idx) = v6;
                } while ((v10 = v12 - 1, v12 != 1));
            }
        } while ((v7 += 1, a0->field_8 > v7));
    }
    else
    {
        v6 = 0;
    }
    v14 = a0->field_18;
    *(unsigned long long *)&v14[0x800] = v6;
    v15 = v6 + 1;
    iter = v14 + 16;
    v17 = 0x100;
    do
    {
        v18 = v17;
        v19 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn64to32x2(_mm_cmpeq_epi64(*(int128_t *)((char *)iter - 16), _mm_setzero_si128())));
        if (!((unsigned int)v19 & 1))
        {
            if (*(unsigned int *)((void*)&v19 + 4) & 1)
                goto LABEL_1eac38;
            goto LABEL_1eac0c;
        }
        else
        {
            *(unsigned long long *)((char *)iter - 16) = v15;
            if (!(*(unsigned int *)((void*)&v19 + 4) & 1))
            {
LABEL_1eac0c:
                v20 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn64to32x2(_mm_cmpeq_epi64(*(int128_t *)iter, _mm_setzero_si128())));
                if ((unsigned int)v20 & 1)
                    goto LABEL_1eac50;
                goto LABEL_1eac20;
            }
            else
            {
LABEL_1eac38:
                *(unsigned long long *)((char *)iter - 8) = v15;
                v20 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn64to32x2(_mm_cmpeq_epi64(*(int128_t *)iter, _mm_setzero_si128())));
                if (!((unsigned int)v20 & 1))
                {
LABEL_1eac20:
                    if (!(*(unsigned int *)((void*)&v20 + 4) & 1))
                        continue;
                    goto LABEL_1eac5c;
                }
                else
                {
LABEL_1eac50:
                    *(unsigned long long *)iter = v15;
                    if (!(*(unsigned int *)((void*)&v20 + 4) & 1))
                        continue;
LABEL_1eac5c:
                    *(unsigned long long *)&iter[8] = v15;
                }
            }
        }
    } while ((iter += 32, v17 = v18 - 4, v18 != 4));
    if (*(long long *)&g_10002b0 == v3)
        return;
    ___stack_chk_fail();
}
