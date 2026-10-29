/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x64d80..0x64e1c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_64d80_0 {
    char field_0;
} st_64d80_0;


void* sub_64d80(void* a0, void* a1, void* a2)
{
    void* v2;  // x10
    void* v3;  // x11
    void* v12;  // x0
    void* v13;  // x9
    void* v4;  // x0
    void* j;  // x9
    uint128_t *node;  // x8
    uint128_t *iter;  // x12
    void* i;  // x13
    void* v9;  // x13
    uint128_t v10;  // q1
    st_64d80_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_64d80_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a1 - a0;
    if (a1 == a0)
        return a2;
    if (v2 >= 32 && a2 - a0 >= 32)
    {
        v3 = v2 & 0xffffffffffffffe0;
        v4 = a2 + v3;
        j = a0 + v3;
        node = a0 + 16;
        iter = a2 + 16;
        i = v3;
        do
        {
            v9 = i;
            v10 = *node;
            *(int128_t *)((char *)iter - 16) = *(int128_t *)((char *)node - 16);
            *iter = v10;
            node += 2;
            iter += 2;
            i = v9 - 32;
        } while (i);
        if (v2 == v3)
            return a2 + v3;
    }
    else
    {
        v4 = a2;
        j = a0;
    }
    do
    {
        v12 = v4;
        v13 = j + 1;
        *(char *)v12 = *(char *)j;
        j = v13;
        v4 = v12 + 1;
    } while (j != a1);
    return v12 + 1;
}
