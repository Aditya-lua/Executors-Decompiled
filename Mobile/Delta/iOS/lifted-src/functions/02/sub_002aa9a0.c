/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aa9a0..0x2aaa2c (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aa9a0_0 {
    uint128_t field_0;
} st_2aa9a0_0;


long long sub_2aa9a0(unsigned long a0, void* iter, void* a2, uint128_t *node)
{
    unsigned long v0;  // [bp-0x50]
    st_2aa9a0_0 **v1;  // [bp-0x48]
    st_2aa9a0_0 **v2;  // [bp-0x40]
    char v3;  // [bp-0x38]
    uint128_t *v4;  // [bp-0x30]
    uint128_t *v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = node;
    v4 = node;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    if (iter != a2)
    {
        do
        {
            *node = *(int128_t *)iter;
            node += 1;
            *(char *)iter = 0;
            *(unsigned long long *)&iter[8] = 0;
            iter += 16;
        } while (iter != a2);
        v5 = node;
    }
    v3 = 1;
    sub_2ada64();
    return sub_2ac4e4(&v0);
}
