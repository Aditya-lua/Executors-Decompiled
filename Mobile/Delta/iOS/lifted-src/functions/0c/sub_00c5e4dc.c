/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5e4dc..0xc5e690 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e0d5ba;
extern long long g_efd328;
extern long long g_efd340;
extern long long g_efd358;
extern unsigned long long g_efd4e0;

unsigned long long sub_c5e4dc(unsigned long a0, unsigned long long *a1, unsigned long long a2)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x8
    unsigned long long v14;  // 4106
    unsigned long long v15;  // x8
    unsigned long long v16;  // x9
    unsigned long long *v17;  // x11
    unsigned long long v18;  // x9
    unsigned long long v19;  // x9
    unsigned long long v22;  // 4102
    unsigned long long v23;  // x8
    unsigned long v24;  // x8
    unsigned long long *v7;  // x10
    unsigned long long v8;  // x8
    unsigned long long v10;  // x20
    unsigned long long v11;  // 4102
    unsigned long long *iter;  // x19
    unsigned long long v13;  // x0
    unsigned long long v0;  // [bp-0x60]
    unsigned long v1;  // [bp-0x58], Other Possible Types: unsigned long long
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = 0;
    if (!a2)
        return 0;
    v5 = a2 * 16;
    v7 = a1 + 1;
    while (1)
    {
        v8 = v5;
        if (*v7)
            break;
        v4 += 1;
        v5 = v8 - 16;
        v7 += 2;
        if (v8 == 16)
        {
            v4 = (v5 - 16 >> 4) + 1;
            break;
        }
    }
    v10 = a2 - v4;
    if (a2 >= v4)
    {
        v11 = arm64g_calculate_condition(20, a2, v4, 0);
        if (!(v11 & 1))
            return 0;
        iter = &a1[2 * v4];
        while (1)
        {
            while (1)
            {
                v13 = _writev();
                v14 = arm64g_calculate_condition(2, v13, 1, 0);
                if (!(v14 & 1))
                    break;
                v24 = *(int *)___error();
                v0 = 1;
                v1 = 2 | v24 * 0x100000000;
                if ((unsigned int)v24 != 4)
                    return 2 | v24 * 0x100000000;
                sub_c40ff0(&v1);
            }
            v0 = 0;
            v1 = v13;
            if (!v13)
                return &g_efd4e0;
            v15 = 0;
            v16 = v10 * 16;
            v17 = iter + 1;
            v18 = v16;
            while (1)
            {
                v19 = v18;
                if (v13 < *v17)
                    break;
                v15 += 1;
                v13 -= *v17;
                v18 = v19 - 16;
                v17 += 2;
                if (v19 == 16)
                {
                    v15 = (v16 - 16 >> 4) + 1;
                    break;
                }
            }
            if (v10 >= v15)
            {
                v22 = arm64g_calculate_condition(4, v10, v15, 0);
                if (v22 & 1)
                {
                    if (!v13)
                        return v13;
                    sub_c73b38("advancing io slices beyond their length", 79, &g_efd328);
                }
                iter = &iter[2 * v15];
                v23 = iter[1] - v13;
                if (iter[1] < v13)
                    goto LABEL_c5e650;
                *iter = *iter + v13;
                iter[1] = v23;
                v10 -= v15;
            }
            else
            {
                sub_c73bb0(v15, v10, v10, &g_efd358);
LABEL_c5e650:
                sub_c73b38(&g_e0d5ba, 71, &g_efd340);
                break;
            }
        }
    }
    sub_c73bb0();
    sub_c73b38("advancing io slices beyond their length", 79, &g_efd328);
}
