/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc537dc..0xc53964 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c537dc_2 {
    char *field_0;
    struct st_c537dc_1 *field_8;
    struct st_c537dc_1 *field_10;
} st_c537dc_2;

typedef struct st_c537dc_1 {
    char padding_0[176];
    struct st_c537dc_1 *field_b0;
    char padding_b8[88];
    unsigned short field_110;
    unsigned short field_112;
    char padding_114[4];
    struct st_c537dc_1 *field_118;
} st_c537dc_1;

typedef struct st_c537dc_0 {
    char *field_0;
    struct st_c537dc_1 *field_8;
    struct st_c537dc_1 *field_10;
    struct st_c537dc_1 *field_18;
    char padding_20[32];
    struct st_c537dc_1 *field_40;
} st_c537dc_0;

extern long long g_efced8;
extern long long g_efd078;

char * sub_c537dc(st_c537dc_2 *a0, st_c537dc_0 *a1)
{
    char *iter;  // x0
    char *v3;  // x20
    char *v12;  // x8
    char *v14;  // x9
    char *v15;  // x10
    char *node;  // x0
    char *v17;  // x9
    char *j;  // x8
    char *v19;  // x8
    char *k;  // x8
    char *v4;  // x21
    char *ptr;  // x20
    char *l;  // x8
    char *v6;  // x8
    char *v8;  // x22
    unsigned long v9;  // x9
    char *i;  // x10
    char *v11;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1->field_40)
    {
        a1->field_40 = (char *)a1->field_40 - 1;
        if (a1->field_0 == 1)
        {
            iter = &a1->field_8->padding_0[0];
            if (iter)
            {
                v3 = &a1->field_10->padding_0[0];
                v4 = &a1->field_18->padding_0[0];
                if (*(short *)&iter[274] <= v4)
                    goto LABEL_c538d0;
LABEL_c53828:
                v8 = iter;
                if (!v3)
                    goto LABEL_c53900;
LABEL_c53830:
                v9 = v8 + 0x8 * v4 + 288;
                i = v3;
                do
                {
                    v11 = i;
                    v12 = *(long long *)v9;
                    v9 = v12 + 280;
                    i = v11 - 1;
                } while (i);
                v14 = 0;
            }
            else
            {
                iter = &a1->field_10->padding_0[0];
                l = &a1->field_18->padding_0[0];
                if (a1->field_18)
                {
                    do
                    {
                        v6 = l;
                        iter = *(long long *)&iter[280];
                        l = v6 - 1;
                    } while (l);
                }
                v4 = 0;
                v3 = 0;
                a1->field_0 = 1;
                if (0 < *(short *)&iter[274])
                    goto LABEL_c53828;
LABEL_c538d0:
                do
                {
                    v8 = *(long long *)&iter[176];
                    if (!v8)
                    {
                        _free();
                        sub_c73c64(&g_efd078);
                        __debugbreak();
                    }
                } while ((v3 += 1, v4 = *(short *)&iter[272], _free(), iter = v8, *(short *)&v8[274] <= (unsigned int)v4));
                a1 = a1;
                if (v3)
                    goto LABEL_c53830;
LABEL_c53900:
                v14 = v4 + 1;
                v12 = v8;
            }
            a1->field_8 = v12;
            a1->field_10 = 0;
            a1->field_18 = v14;
            a0->field_0 = v8;
            a0->field_8 = v3;
            a0->field_10 = v4;
            return iter;
        }
        sub_c73c64(&g_efced8);
        __debugbreak();
    }
    else
    {
        v15 = a1->field_0;
        node = &a1->field_8->padding_0[0];
        v17 = &a1->field_10->padding_0[0];
        j = &a1->field_18->padding_0[0];
        a1->field_0 = 0;
        if (v15 == 1)
        {
            if (!node)
            {
                node = v17;
                if (j)
                {
                    do
                    {
                        v19 = j;
                        node = *(long long *)&node[280];
                        j = v19 - 1;
                    } while (j);
                }
            }
            k = *(long long *)&node[176];
            if (*(long long *)&node[176])
            {
                do
                {
                    ptr = k;
                    _free();
                    k = *(long long *)&ptr[176];
                } while (k);
            }
            else
            {
                ptr = node;
            }
            node = _free(ptr);
        }
        a0->field_0 = 0;
        return node;
    }
}
