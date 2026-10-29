/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb98708..0xb98884 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_efbad0;
extern uint128_t g_efc958;
extern uint128_t g_efc968;

double sub_b98708(void* a0, uint128_t a1, unsigned long long a2)
{
    unsigned long long v2;  // x21
    unsigned long long v3;  // x8
    unsigned long long ptr;  // x0
    unsigned long long v13;  // x22
    unsigned long long v14;  // x8
    unsigned long v15;  // d0
    char v4;  // x8
    unsigned long long v5;  // x8
    unsigned long long v6;  // 4110
    unsigned long long v7;  // x22
    unsigned long long v8;  // x19
    unsigned long long v9;  // x20
    unsigned long long v10;  // 4116
    void* v11;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
    {
        *(uint128_t *)a0 = g_efc958;
        *(uint128_t *)&a0[16] = g_efc968;
        return (unsigned long long)g_efc958;
    }
    if (15 > a2)
    {
        if (a2 < 4)
            v2 = 4;
        else
            v2 = (a2 & 8) + 8;
    }
    else
    {
        if (a2 > 0x1fffffffffffffff)
            goto LABEL_b987ec;
        v3 = a2 * 8 / 7 - 1;
        if (!v3)
            v4 = 64;
        else
            v4 = Clz(v3);
        v2 = (0xffffffffffffffff >> (v4 & 63)) + 1;
    }
    if (a1 * v2 <= 0xffffffffffffffff && !(v5 = v2 * a1, v6 = arm64g_calculate_condition(130, v5, 8, 0), v6 & 1 || (v7 = v5 + 7 & 0xfffffffffffffff8, v8 = v2 + 8, v9 = v8 + v7, v10 = arm64g_calculate_condition(0x22, v8, v7, 0), v10 & 1 || 0x7ffffffffffffff8 < v9)))
    {
        v11 = a0;
        if (!v9)
            goto LABEL_b98804;
        if (v9 > 7)
        {
            ptr = _malloc(v9);
        }
        else
        {
            ptr = 0;
            if (_posix_memalign(&ptr, 8, v9))
                sub_c6ba70(8, v9);
        }
        if (!ptr)
            sub_c6ba70(8, v9);
    }
    else
    {
LABEL_b987ec:
        sub_c73b38("Hash table capacity overflow", 57, &g_efbad0);
LABEL_b98804:
        ptr = 8;
    }
    v13 = v2 - 1;
    v14 = (v2 >> 3) * 7;
    if (v2 < 9)
        v14 = v13;
    _memset();
    *(unsigned long long *)v11 = ptr + v7;
    *(unsigned long long *)&v11[8] = v13;
    *(unsigned long long *)&v11[16] = v14;
    *(unsigned long long *)&v11[24] = 0;
    return v15;
}
