/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc53520..0xc53720 (512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c53520_0 {
    char padding_0[16];
    long long field_10;
} st_c53520_0;

typedef struct st_c53520_1 {
    unsigned long long field_0;
    struct st_c53520_0 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_c53520_1;

extern long long g_efced8;
extern long long g_efd078;

unsigned long long sub_c53520(st_c53520_1 *a0)
{
    unsigned long v2;  // x21
    unsigned long long *v3;  // x22
    unsigned long long v12;  // x23
    unsigned long long v13;  // x23
    unsigned long v14;  // x24
    unsigned long long *v15;  // x8
    unsigned long v16;  // x21
    st_c53520_0 *v18;  // x9
    unsigned long v19;  // x22
    unsigned long long v21;  // x8
    unsigned long v4;  // x21
    unsigned long long v22;  // x8
    unsigned long long iter;  // x0
    unsigned long l;  // x21
    unsigned long j;  // x22
    unsigned long long v8;  // x8
    unsigned long node;  // x19
    unsigned long v10;  // x22
    unsigned long k;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_10;
    if (a0->field_10)
    {
        v3 = &a0->field_8->field_10;
        do
        {
            v4 = v2;
            if (*(long long *)((char *)v3 - 16) && *(long long *)((char *)v3 - 8))
                _free(*v3);
        } while ((v3 += 14, v2 = v4 - 1, v4 != 1));
    }
    if (a0->field_0)
        _free(a0->field_8);
    iter = 0;
    l = a0->field_18;
    j = a0->field_20;
    v8 = l != 0;
    if (l)
        node = a0->field_28;
    else
        node = 0;
    while (node)
    {
        if (!(v8 & 1))
        {
            sub_c73c64(&g_efced8);
            __debugbreak();
        }
        if (iter)
        {
            if (*(short *)(iter + 1330) <= j)
                goto LABEL_c535e4;
            goto LABEL_c535b4;
        }
        else
        {
            iter = l;
            v10 = j;
            if (v10)
            {
                do
                {
                    k = j;
                    iter = *(long long *)(iter + 1336);
                    v10 = k - 1;
                    j = v10;
                } while (k != 1);
            }
            j = v10;
            l = 0;
            if (j < *(short *)(iter + 1330))
            {
LABEL_c535b4:
                v12 = iter;
                goto LABEL_c53608;
            }
            else
            {
                do
                {
LABEL_c535e4:
                    v12 = *(long long *)(iter + 1232);
                    if (!v12)
                    {
                        _free();
                        sub_c73c64(&g_efd078);
                        __debugbreak();
                    }
                } while ((l += 1, j = *(short *)(iter + 1328), _free(), iter = v12, *(short *)(iter + 1330) <= j));
LABEL_c53608:
                v13 = v12;
                v14 = j;
                if (l)
                {
                    v15 = v13 + v14 * 8 + 1344;
                    do
                    {
                        v16 = l;
                        iter = *v15;
                        v15 = iter + 1336;
                        l = v16 - 1;
                    } while (l);
                    j = 0;
                    l = 0;
                    node -= 1;
                    v18 = v13 + 112 * v14;
                    v8 = 1;
                    if (!*(long long *)&v18->padding_0[0])
                        continue;
                }
                else
                {
                    j = v14 + 1;
                    iter = v13;
                    l = 0;
                    node -= 1;
                    v18 = v13 + 112 * v14;
                    v8 = 1;
                    if (!*(long long *)&v18->padding_0[0])
                        continue;
                }
                v8 = 1;
                l = 0;
                if (*(long long *)&v18->padding_0[8])
                {
                    _free(v18->field_10);
                    l = 0;
                    v8 = 1;
                }
            }
        }
    }
    if (!(v8 & 1))
        return iter;
    if (!iter)
    {
        iter = l;
        if (j)
        {
            do
            {
                v19 = j;
                iter = *(long long *)(iter + 1336);
                j = v19 - 1;
            } while (j);
        }
    }
    v21 = *(long long *)(iter + 1232);
    if (!*(long long *)(iter + 1232))
        return _free();
    do
    {
        v22 = v21;
        _free();
        v21 = *(long long *)(v22 + 1232);
    } while (*(long long *)(v22 + 1232));
    return _free();
}
