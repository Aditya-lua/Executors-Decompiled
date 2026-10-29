/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13eca4..0x13ed38 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13eca4_0 {
    unsigned long long field_0;
    void* field_8;
    unsigned long long field_10;
    void* field_18;
} st_13eca4_0;


long long sub_13eca4(unsigned long a0, unsigned long a1, void* j, unsigned long a3, void* a4, unsigned long a5, void* iter)
{
    st_13eca4_0 *v0;  // x8
    unsigned long long v1;  // x11
    uint128_t v10;  // q0
    st_13eca4_0 *v11;  // x8
    unsigned long long v2;  // x11
    unsigned long long v3;  // x12
    unsigned long long v4;  // x9
    void* v5;  // x10
    void* v6;  // x9
    uint128_t *iter1;  // x13
    uint128_t *node;  // x14
    unsigned long long i;  // x15

    if (j == a4)
    {
        v0->field_0 = a1;
        v0->field_8 = j;
        v0->field_10 = a5;
        v0->field_18 = iter;
        return a0;
    }
    v1 = j - a4 - 8;
    if (v1 >= 24 && j - iter >= 32)
    {
        v2 = (v1 >> 3) + 1;
        v3 = v2 & 0x3ffffffffffffffc;
        v4 = v3 * 8;
        v5 = j - v4;
        v6 = iter - v4;
        iter1 = iter - 16;
        node = j - 16;
        i = v3;
        do
        {
            v10 = *node;
            *(int128_t *)((char *)iter1 - 16) = *(int128_t *)((char *)node - 16);
            *iter1 = v10;
            iter1 = (char *)iter1 - 32;
            node = (char *)node - 32;
            i -= 4;
        } while (i);
        iter = v6;
        j = v5;
        if (v2 == v3)
        {
            v11->field_0 = a1;
            v11->field_8 = v5;
            v11->field_10 = a5;
            v11->field_18 = v6;
            return a0;
        }
    }
    do
    {
        v5 = j - 8;
        *(long long *)((char *)iter - 8) = *(long long *)((char *)j - 8);
        iter -= 8;
        j = v5;
        v6 = iter;
    } while (j != a4);
    v11->field_0 = a1;
    v11->field_8 = v5;
    v11->field_10 = a5;
    v11->field_18 = v6;
    return a0;
}
