/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x196b4..0x19748 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_196b4_0 {
    char field_0;
} st_196b4_0;


double sub_196b4(void* a0, void* ptr)
{
    void* v6;  // x0
    uint128_t v7;  // q0
    st_196b4_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_196b4_0 *v1;  // [bp-0x38]
    st_196b4_0 **v2;  // [bp-0x30], Other Possible Types: char
    st_196b4_0 *v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a0 != ptr)
    {
        if (*(long long *)a0)
        {
            v3 = &v2;
            v2 = &v3;
            sub_c044(*(long long *)a0, (long long)a0[8]);
            operatordelete(*(long long *)a0);
            v6 = a0;
            *(unsigned long long *)a0 = 0;
            *(unsigned long long *)&a0[8] = 0;
            a0 = v6;
        }
        *(long long *)a0 = *(long long *)ptr;
        v7 = (int128_t)ptr[8];
        *(uint128_t *)&a0[8] = v7;
        *(long long *)&a0[24] = (long long)ptr[24];
        memset(ptr, 0, 24);
    }
    return *(unsigned long long *)&v7;
}
