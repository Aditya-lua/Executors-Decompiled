/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc505c..0xc5164 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c505c_0 {
    char field_0;
} st_c505c_0;


double sub_c505c(void* a0)
{
    unsigned long v6;  // d0
    unsigned int idx;  // x0
    unsigned int index;  // x9
    uint128_t v9;  // q1
    unsigned int v10;  // x10
    st_c505c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_c505c_0 *v1;  // [bp-0x48]
    uint128_t v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x30]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (!(!*(long long *)a0 ^ !(long long)a0[8]))
    {
        v6 = *(int128_t *)a0;
        v2 = *(int128_t *)a0;
        v3 = (long long)a0[16];
        idx = sub_82350(0x176e0, &v2);
        if (idx)
        {
            index = idx + 30104;
            v9 = *(int128_t *)a0;
            *(long long *)(idx + 30144) = (long long)a0[16];
            *(uint128_t *)(idx + 30128) = v9;
            *(unsigned long long *)(idx + 30168) = 0;
            *(unsigned long long *)(idx + 29912) = 0;
            *(unsigned int *)(index + 100) = 0;
            *(unsigned int *)(index + 104) = 0;
            *(unsigned long long *)(idx + 30280) = 0;
            v10 = idx + 30236;
            *(unsigned long long *)(index + 212) = 0;
            *(unsigned long long *)(idx + 95960) = 0;
            *(uint128_t *)(idx + 30184) = 0;
            *(uint128_t *)v10 = 0;
            *(unsigned int *)(v10 + 16) = 0;
            *(unsigned int *)(index + 72) = 1;
            *(uint128_t *)(idx + 30216) = __double_as_longlong(0) * 0x10000000000000000;
            *(unsigned long long *)index = 0;
            *(unsigned long long *)(idx + 30264) = 134217729;
            *(unsigned int *)(index + 128) = 0;
            return (unsigned long long)(__double_as_longlong(0) * 0x10000000000000000);
        }
    }
    return v6;
}
