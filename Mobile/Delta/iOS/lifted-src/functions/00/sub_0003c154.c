/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c154..0x3c230 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_3c154(unsigned long a0, void* a1, void* a2, void* a3)
{
    void* v8;  // x19
    void* node;  // x19
    unsigned long long v18;  // x14
    uint128_t v19;  // q1
    void* v21;  // x8
    unsigned long long v10;  // x8
    unsigned long long v11;  // x10
    unsigned long long v12;  // x11
    unsigned long long v13;  // x9
    void* j;  // x8
    uint128_t *iter;  // x12
    uint128_t *iter1;  // x13
    unsigned long long i;  // x14
    unsigned long v0;  // [bp-0x50]
    void* *v1;  // [bp-0x48]
    void* *v2;  // [bp-0x40]
    char v3;  // [bp-0x38]
    void* v4;  // [bp-0x30]
    void* v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a3;
    v5 = a3;
    v4 = a3;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    node = v8;
    if (a1 != a2)
    {
        v10 = a2 - a1 - 8;
        if (v10 >= 24 && v8 - a1 >= 32)
        {
            v11 = (v10 >> 3) + 1;
            v12 = v11 & 0x3ffffffffffffffc;
            v13 = v12 * 8;
            j = a1 + v13;
            node = v8 + v13;
            iter = v8 + 16;
            iter1 = a1 + 16;
            i = v12;
            do
            {
                v18 = i;
                v19 = *iter1;
                *(int128_t *)((char *)iter - 16) = *(int128_t *)((char *)iter1 - 16);
                *iter = v19;
                iter += 2;
                iter1 += 2;
                i = v18 - 4;
            } while (i);
            if (v11 == v12)
                goto LABEL_3c204;
        }
        else
        {
            j = a1;
            node = v8;
        }
        do
        {
            v21 = j + 8;
            *(long long *)node = *(long long *)j;
            node += 8;
            j = v21;
        } while (j != a2);
LABEL_3c204:
        v5 = node;
    }
    v3 = 1;
    sub_42034(&v0);
    return node;
}
