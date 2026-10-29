/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a5b50..0x2a5be8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a5b50_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
} st_2a5b50_0;


void* sub_2a5b50(unsigned long a0, void* iter, void* a2, st_2a5b50_0 *node)
{
    unsigned long v4;  // x1
    unsigned long v5;  // x8
    uint128_t v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (iter == a2)
        return iter;
    do
    {
        v0 = *(int128_t *)iter;
        *(char *)iter = 0;
        *(unsigned long long *)&iter[8] = 0;
        v4 = node->field_0;
        node->field_0 = *(char *)&v0;
        *(char *)&v0 = v4;
        v5 = node->field_8;
        node->field_8 = *(unsigned long long *)((void*)&v0 + 8);
        v1 = v5;
        sub_2a6e94(&v1, v4);
        node += 1;
        iter += 16;
    } while (iter != a2);
    return a2;
}
