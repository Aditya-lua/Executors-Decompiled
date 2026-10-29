/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4714..0xc4b20 (1036 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4714_0 {
    char field_0;
} st_c4714_0;

extern unsigned long long g_e6c8c0;

unsigned long long sub_c4714(void* a0, long long a1, long long a2, void* a3, unsigned long a4, unsigned int a5)
{
    void* v6;  // x19
    void* v7;  // x20
    void* v16;  // x11
    unsigned long long i;  // x10
    void* iter;  // x15
    unsigned long long v19;  // x14
    unsigned long v20;  // x16
    unsigned int j;  // x13
    unsigned int l;  // x15
    unsigned long idx;  // x17
    unsigned long v25;  // x1
    unsigned long long v8;  // x0
    unsigned long long v26;  // x13
    unsigned long index;  // x14
    unsigned long v28;  // x15
    unsigned long long v29;  // x7
    unsigned long long v9;  // 4106
    unsigned int v10;  // w24
    unsigned int v11;  // w25
    unsigned long long k;  // x21
    unsigned int v13;  // w0
    unsigned int v14;  // w8
    unsigned int v15;  // x13
    long long v0;  // [bp-0x88]
    st_c4714_0 **v1;  // [bp-0x78], Other Possible Types: char
    st_c4714_0 *v2;  // [bp-0x70]
    unsigned int v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v2 = &v1;
    v3 = 0;
    v1 = &v2;
    if (1492 > a4)
        return 0xffffffffffffffd4;
    v6 = a3;
    v7 = a3 + 1236;
    *(unsigned int *)&v0 = a5;
    v8 = sub_76818(v7, 0x100, v6, &v3, &v3 + 1, a1, a2, v6 + 104, 876, v0);
    v9 = arm64g_calculate_condition(130, v8, 120, 0);
    if (v9 & 1)
        return v8;
    v10 = *(int *)a0;
    v11 = (v10 & 0xff) + 1;
    k = v3;
    v13 = sub_bf928();
    if (v11 >= v13)
    {
        v14 = v13;
        *(char *)a0 = v10;
        *(char *)&a0[1] = 0;
        *(char *)&a0[2] = v13;
        *(char *)&a0[3] = v10 >> 24;
        v15 = 0;
        v16 = v6 + 52;
        i = v14 + 1;
        iter = v6;
        do
        {
            v19 = i;
            v20 = *(int *)iter;
            *(unsigned int *)&iter[52] = v15;
            v15 += v20;
            iter += 4;
            i = v19 - 1;
        } while (i);
        if ((int)k >= 4)
        {
            j = 0;
            do
            {
                l = 0;
                do
                {
                    idx = *((char *)v7 + j + l);
                    v25 = *(int *)((char *)v16 + 4 * idx);
                    *(unsigned int *)((char *)v16 + 4 * idx) = (unsigned int)v25 + 1;
                    *((char *)v6 + v25 + 980) = (char)j + (char)l;
                    l += 1;
                } while (l != 4);
                j += 4;
            } while (j < (unsigned int)k - 3);
            if ((int)j < (int)k)
                goto LABEL_c4884;
        }
        else
        {
            j = 0;
            if ((int)k > 0)
            {
LABEL_c4884:
                v26 = j & 0xffffffff;
                do
                {
                    index = *((char *)v7 + v26);
                    v28 = *(int *)((char *)v16 + 4 * index);
                    *(unsigned int *)((char *)v16 + 4 * index) = (unsigned int)v28 + 1;
                    *((char *)v6 + v28 + 980) = v26;
                    v26 += 1;
                } while (k != v26);
            }
        }
        if (!v14)
            return v8;
        v29 = 312;
        goto *((void *)(*(long long *)((char *)&g_e6c8c0 + v29)));
    }
    return 0xffffffffffffffd4;
}
