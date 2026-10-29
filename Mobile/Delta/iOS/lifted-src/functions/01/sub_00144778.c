/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x144778..0x1449b4 (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_144778_1 {
    char padding_0[84];
    int field_54;
} st_144778_1;

typedef struct st_144778_0 {
    char field_0;
} st_144778_0;

extern unsigned long long g_e6f1e0;
extern unsigned long long g_e6f1e8;

void sub_144778(st_144778_1 **a0, st_144778_1 **a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7)
{
    long long idx;  // x22
    st_144778_1 **node;  // x26
    st_144778_1 **iter;  // x20
    st_144778_1 *v12;  // x10
    long long v13;  // x9
    long long v14;  // x28
    st_144778_1 **v15;  // x19
    void* v16;  // x0
    unsigned long long v17;  // x19
    unsigned long v18;  // x21
    long long v0;  // [bp-0xa8]
    void* v1;  // [bp-0xa0]
    long long v2;  // [bp-0x98]
    long long v3;  // [bp-0x90]
    long long v4;  // [bp-0x78]
    st_144778_0 **v5;  // [bp-0x70], Other Possible Types: char
    st_144778_0 *v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = &v5;
    v5 = &v6;
    if (!a5)
        return;
    if (a4 > a7 && a5 > a7)
    {
        if (a4)
        {
            idx = 0;
            node = a0;
            iter = a0;
            while (1)
            {
                v12 = a0[idx];
                if (*a1->field_54 < v12->field_54)
                    break;
                iter += 1;
                idx += 1;
                node += 1;
                if (a4 == idx)
                    return;
            }
            v13 = a4 - idx;
            if (a5 > v13)
            {
                v2 = a2;
                v3 = a7;
                v14 = a5 / 2;
                v15 = &a1[v14];
                v16 = sub_13d10c(node, a1, v15);
                v4 = (long long)(v16 - node) >> 3;
            }
            else if (a4 - 1 == idx)
            {
                *iter = *a1;
                *a1 = v12;
                goto *((void *)(g_e6f1e8));
            }
            else
            {
                v2 = a2;
                v3 = a7;
                v4 = v13 / 2;
                v17 = v4 * 8;
                v15 = sub_1404c4(a1, (char *)iter + v17, a2 - (char *)a1 >> 3);
                v14 = (long long)(v15 - a1) >> 3;
                v16 = v17 + (char *)node;
            }
            v0 = a5 - v14;
            v1 = v16;
            v18 = sub_13f148();
            if (a5 + a4 - (v14 + v4) - idx > v14 + v4)
                sub_144778(node, v1, v18, a3, v4, v14, a6, v3);
            else
                sub_144778(v18, v15, v2, a3, a4 - v4 - idx, v0, a6, v3);
            goto *((void *)(g_e6f1e0));
        }
        else
        {
            return;
        }
    }
    sub_13fb3c();
    return;
}
