/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fbcf0..0x1fbd9c (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fbcf0_0 {
    char field_0;
} st_1fbcf0_0;


void sub_1fbcf0(unsigned long long *a0, unsigned long a1, unsigned int *a2)
{
    unsigned long long v4;  // x21
    unsigned long long v5;  // x9
    unsigned long long v14;  // x15
    unsigned int *node;  // x10
    unsigned long long j;  // x9
    unsigned long long v18;  // x9
    unsigned long long v6;  // x11
    unsigned long long v7;  // x10
    unsigned int v8;  // w8
    unsigned long long v9;  // x12
    unsigned long long v10;  // x13
    uint128_t v11;  // q0
    uint128_t *iter;  // x14
    unsigned long long i;  // x15
    st_1fbcf0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1fbcf0_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0[1];
    sub_1fb614();
    v5 = a0[1];
    v6 = v5 - v4;
    if (v5 <= v4)
        return;
    v7 = *a0;
    v8 = *a2;
    v9 = v4;
    if (v6 >= 8)
    {
        v10 = v6 & 0xfffffffffffffff8;
        v9 = v4 + v10;
        v11 = CONCAT(v8 | v8 * 0x100000000, v8 | v8 * 0x100000000);
        iter = v7 + v4 * 4 + 16;
        i = v10;
        do
        {
            v14 = i;
            *(uint128_t *)((char *)iter - 16) = v11;
            *iter = v11;
            iter += 2;
            i = v14 - 8;
        } while (i);
        if (v6 == v10)
            return;
    }
    node = v7 + v9 * 4;
    j = v5 - v9;
    do
    {
        v18 = j;
        *node = v8;
        node += 1;
        j = v18 - 1;
    } while (j);
    return;
}
