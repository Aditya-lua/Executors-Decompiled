/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd0270..0xbd041c (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd0270_0 {
    char padding_0[280];
    long long field_118;
} st_bd0270_0;

extern long long g_efb3f8;
extern long long g_efb410;

unsigned long long sub_bd0270(unsigned long long *a0)
{
    unsigned long long iter;  // x0
    unsigned long l;  // x21
    unsigned long long *v12;  // x8
    unsigned long v13;  // x21
    st_bd0270_0 *v15;  // x8
    unsigned long v16;  // x22
    unsigned long long v18;  // x8
    unsigned long long v19;  // x8
    unsigned long j;  // x22
    unsigned long long v5;  // x9
    unsigned long node;  // x19
    unsigned long v7;  // x22
    unsigned long k;  // x22
    unsigned long long v9;  // x23
    unsigned long long v10;  // x23
    unsigned long v11;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    iter = 0;
    l = *a0;
    j = a0[1];
    v5 = l != 0;
    if (l)
        node = a0[2];
    else
        node = 0;
    while (node)
    {
        if (!(v5 & 1))
        {
            sub_c73c64(&g_efb3f8);
            __debugbreak();
        }
        if (iter)
        {
            if (*(short *)(iter + 538) <= j)
                goto LABEL_bd02ec;
            goto LABEL_bd02bc;
        }
        else
        {
            iter = l;
            v7 = j;
            if (v7)
            {
                do
                {
                    k = j;
                    iter = *(long long *)(iter + 544);
                    v7 = k - 1;
                    j = v7;
                } while (k != 1);
            }
            j = v7;
            l = 0;
            if (j < *(short *)(iter + 538))
            {
LABEL_bd02bc:
                v9 = iter;
                goto LABEL_bd0310;
            }
            else
            {
                do
                {
LABEL_bd02ec:
                    v9 = *(long long *)iter;
                    if (!v9)
                    {
                        _free();
                        sub_c73c64(&g_efb410);
                        __debugbreak();
                    }
                } while ((l += 1, j = *(short *)(iter + 536), _free(), iter = v9, *(short *)(iter + 538) <= j));
LABEL_bd0310:
                v10 = v9;
                v11 = j;
                if (l)
                {
                    v12 = v10 + v11 * 8 + 552;
                    do
                    {
                        v13 = l;
                        iter = *v12;
                        v12 = iter + 544;
                        l = v13 - 1;
                    } while (l);
                    j = 0;
                    l = 0;
                    node -= 1;
                    v15 = v10 + 24 * v11;
                    v5 = 1;
                    if (!*(long long *)&v15->padding_0[272])
                        continue;
                }
                else
                {
                    j = v11 + 1;
                    iter = v10;
                    l = 0;
                    node -= 1;
                    v15 = v10 + 24 * v11;
                    v5 = 1;
                    if (!*(long long *)&v15->padding_0[272])
                        continue;
                }
                _free(v15->field_118);
                l = 0;
                v5 = 1;
            }
        }
    }
    if (!(v5 & 1))
        return iter;
    if (!iter)
    {
        iter = l;
        if (j)
        {
            do
            {
                v16 = j;
                iter = *(long long *)(iter + 544);
                j = v16 - 1;
            } while (j);
        }
    }
    v18 = *(long long *)iter;
    if (!*(long long *)iter)
        return _free();
    do
    {
        v19 = v18;
        _free();
        v18 = *(long long *)v19;
    } while (*(long long *)v19);
    return _free();
}
