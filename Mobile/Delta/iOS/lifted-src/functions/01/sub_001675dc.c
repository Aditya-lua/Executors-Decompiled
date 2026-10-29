/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1675dc..0x167648 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_1675dc(unsigned long a0, void* iter, void* a2, uint128_t *node)
{
    uint128_t v3;  // q0
    uint128_t v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (iter == a2)
        return iter;
    do
    {
        v3 = *(int128_t *)iter;
        *(unsigned long long *)iter = 0;
        *(unsigned long long *)&iter[8] = 0;
        iter += 16;
        v0 = *node;
        *node = v3;
        node += 1;
        sub_60b78(&v0);
    } while (iter != a2);
    return a2;
}
