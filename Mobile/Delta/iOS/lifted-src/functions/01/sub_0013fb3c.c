/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13fb3c..0x13fd08 (460 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13fb3c_0 {
    char field_0;
} st_13fb3c_0;


long long sub_13fb3c(void* a0, void* a1, void* a2, unsigned long a3, long long a4, long long a5, void* a6)
{
    void* iter;  // x0
    unsigned long long v10;  // x11
    uint128_t v19;  // q1
    void* v21;  // x10
    unsigned long long v22;  // x11
    void* iter1;  // x1
    void* l;  // x10
    unsigned long long v25;  // x11
    unsigned long long v26;  // x12
    unsigned long long v27;  // x10
    uint128_t *iter2;  // x13
    void* k;  // x10
    uint128_t *v29;  // x14
    unsigned long long j;  // x15
    unsigned long long v31;  // x15
    uint128_t v32;  // q1
    void* v34;  // x10
    unsigned long long v12;  // x11
    unsigned long long v13;  // x12
    unsigned long long v14;  // x10
    uint128_t *v15;  // x13
    uint128_t *node;  // x14
    unsigned long long i;  // x15
    unsigned long long v18;  // x15
    void* v0;  // [bp-0x60]
    void* v1;  // [bp-0x58]
    st_13fb3c_0 **v2;  // [bp-0x48], Other Possible Types: char
    st_13fb3c_0 *v3;  // [bp-0x40]
    void* v4;  // [bp-0x38]
    char *v5;  // [bp-0x30]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v3 = &v2;
    v4 = a6;
    v2 = &v3;
    v6 = 0;
    v5 = &v6;
    if (a4 > a5)
    {
        iter = a6;
        if (a1 != a2)
        {
            v10 = a2 - a1 - 8;
            if (v10 >= 24)
            {
                iter = a6;
                k = a1;
                if (a6 - a1 > 31)
                {
                    v12 = (v10 >> 3) + 1;
                    v13 = v12 & 0x3ffffffffffffffc;
                    v14 = v13 * 8;
                    iter = a6 + v14;
                    k = a1 + v14;
                    v15 = a1 + 16;
                    node = a6 + 16;
                    i = v13;
                    do
                    {
                        v18 = i;
                        v19 = *v15;
                        *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)v15 - 16);
                        *node = v19;
                        v15 += 2;
                        node += 2;
                        i = v18 - 4;
                    } while (i);
                    if (v12 == v13)
                        goto LABEL_13fc88;
                }
            }
            else
            {
                iter = a6;
                k = a1;
            }
            do
            {
                v21 = k + 8;
                *(long long *)iter = *(long long *)k;
                iter += 8;
                k = v21;
            } while (k != a2);
        }
LABEL_13fc88:
        v0 = a2;
        v1 = a2;
        sub_13c3bc(iter, iter, a6);
    }
    else
    {
        if (a0 != a1)
        {
            v22 = a1 - a0 - 8;
            if (v22 >= 24)
            {
                iter1 = a6;
                l = a0;
                if (a6 - a0 > 31)
                {
                    v25 = (v22 >> 3) + 1;
                    v26 = v25 & 0x3ffffffffffffffc;
                    v27 = v26 * 8;
                    iter1 = a6 + v27;
                    l = a0 + v27;
                    iter2 = a0 + 16;
                    v29 = a6 + 16;
                    j = v26;
                    do
                    {
                        v31 = j;
                        v32 = *iter2;
                        *(int128_t *)((char *)v29 - 16) = *(int128_t *)((char *)iter2 - 16);
                        *v29 = v32;
                        iter2 += 2;
                        v29 += 2;
                        j = v31 - 4;
                    } while (j);
                    if (v25 == v26)
                        goto LABEL_13fcc0;
                }
            }
            else
            {
                iter1 = a6;
                l = a0;
            }
            do
            {
                v34 = l + 8;
                *(long long *)iter1 = *(long long *)l;
                iter1 += 8;
                l = v34;
            } while (l != a1);
        }
LABEL_13fcc0:
        sub_13ed38(a6);
    }
    return sub_13e9e8(&v4, 0);
}
