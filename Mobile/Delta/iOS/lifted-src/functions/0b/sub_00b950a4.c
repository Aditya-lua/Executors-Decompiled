/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb950a4..0xb955b4 (1296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e0633d;

void* sub_b950a4(void* a0)
{
    unsigned long long v2;  // x22
    unsigned long v3;  // x8
    unsigned long long v4;  // 4117
    void* v5;  // x20
    unsigned long v6;  // x23
    unsigned long v7;  // x23
    void* v8;  // x20
    unsigned long v9;  // x23
    unsigned long v10;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (10 >= (unsigned long long)*(long long *)a0)
    {
        goto *((void *)(sub_b950e0 + (&g_e0633d)[*(long long *)a0] * 4));
    }
    else
    {
        v2 = (long long)a0[8];
        v3 = v2 ^ 0x8000000000000000;
        v4 = arm64g_calculate_condition(0x44, v2, 0, 0);
        if (!(v4 & 1))
            v3 = 2;
        if (!v3)
            return a0;
        if (v3 == 1)
        {
            sub_b950a4((long long)a0[40]);
            _free((long long)a0[40]);
            v5 = (long long)a0[24];
            v6 = (long long)a0[32] + 1;
            while (1)
            {
                v7 = v6 - 1;
                if (v6 == 1)
                    break;
                v5 += 64;
                sub_b728e8();
                v6 = v7;
            }
            if (!(long long)a0[16])
                return v5;
        }
        else
        {
            sub_b950a4((long long)a0[56]);
            _free((long long)a0[56]);
            if (v2)
                _free((long long)a0[16]);
            v8 = (long long)a0[40];
            v9 = (long long)a0[48] + 1;
            while (1)
            {
                v10 = v9 - 1;
                if (v9 == 1)
                    break;
                v8 += 64;
                sub_b728e8();
                v9 = v10;
            }
            if (!(long long)a0[32])
                return v8;
        }
        return _free();
    }
}
