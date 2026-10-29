/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xabcfe0..0xabd100 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_abcfe0(unsigned long long *a0, void* iter, unsigned long long a2, unsigned long long a3)
{
    unsigned long long v3;  // x30
    unsigned long long *node;  // x9
    unsigned long long v13;  // x4
    unsigned long long v14;  // x2
    char *v15;  // x1
    unsigned long long v16;  // x4
    unsigned long long v17;  // x2
    char *v18;  // x1
    unsigned long long v19;  // x4
    unsigned long long v20;  // x2
    char *v21;  // x1
    unsigned long long v22;  // x4
    unsigned long long v5;  // x10
    unsigned long long v6;  // x10
    unsigned long v7;  // x4
    unsigned long long v8;  // 4107
    char *v9;  // x1
    unsigned long long v10;  // x4
    unsigned long long v11;  // x2
    char *v12;  // x1
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    node = a0;
    v5 = a3;
    while (1)
    {
        v6 = v5;
        v7 = *node;
        node += 1;
        if (a2 < 8)
            break;
        *(unsigned long *)iter = v7;
        iter += 8;
        v8 = arm64g_calculate_condition(4, a2, 8, 0);
        if (v8 & 1)
            return;
        a2 -= 8;
        v5 = v6 - 8;
        if (8 >= v6)
        {
            node = sub_abcd20();
            v5 = a3;
        }
    }
    *(char *)iter = v7;
    v9 = iter + 1;
    v10 = v7 >> 8;
    v11 = a2 - 1;
    if (a2 == 1)
        return;
    *v9 = v10;
    v12 = v9 + 1;
    v13 = v10 >> 8;
    v14 = v11 - 1;
    if (v11 != 1)
    {
        *v12 = v13;
        v15 = v12 + 1;
        v16 = v13 >> 8;
        v17 = v14 - 1;
        if (v14 != 1)
        {
            *v15 = v16;
            v18 = v15 + 1;
            v19 = v16 >> 8;
            v20 = v17 - 1;
            if (v17 != 1)
            {
                *v18 = v19;
                v21 = v18 + 1;
                v22 = v19 >> 8;
                if (v20 != 1)
                {
                    *v21 = v22;
                    if (v20 != 2)
                        v21[1] = v22 >> 8;
                }
            }
        }
    }
    return;
}
