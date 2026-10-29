/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x165a10..0x165aac (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_165a10_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    uint128_t field_10;
} st_165a10_0;


long long sub_165a10(unsigned long a0, void* iter, void* a2, st_165a10_0 *node)
{
    unsigned long v8;  // x9
    unsigned long v0;  // [bp-0x50]
    st_165a10_0 **v1;  // [bp-0x48]
    st_165a10_0 **v2;  // [bp-0x40]
    char v3;  // [bp-0x38]
    st_165a10_0 *v4;  // [bp-0x30]
    st_165a10_0 *v5;  // [bp-0x28]
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
            v8 = *(long long *)iter;
            node->field_8 = (int)iter[8];
            node->field_0 = v8;
            node->field_10 = (int128_t)iter[16];
            *(unsigned long long *)&iter[16] = 0;
            *(unsigned long long *)&iter[24] = 0;
            iter += 32;
            node += 1;
        } while (iter != a2);
        v5 = node;
    }
    v3 = 1;
    sub_165354();
    return sub_167648(&v0);
}
