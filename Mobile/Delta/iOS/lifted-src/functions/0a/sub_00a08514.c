/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa08514..0xa085fc (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void sub_a08514(char *a0, uint128_t *a1)
{
    unsigned long long i;  // x8
    unsigned long long v8;  // x9
    unsigned long long v17;  // 4104
    unsigned long long v9;  // x10
    unsigned long long v10;  // w11
    unsigned long long idx;  // x12
    unsigned long v12;  // x15
    unsigned long long v13;  // x13
    unsigned long v14;  // cc_dep1
    unsigned long long v15;  // x14
    unsigned long long v16;  // 4104
    uint128_t v0;  // [bp-0x70]
    uint128_t v1;  // [bp-0x60]
    uint128_t v2;  // [bp-0x50]
    uint128_t v3;  // [bp-0x40]
    unsigned long v4;  // [bp-0x28]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v0 = *a1;
    v1 = a1[1];
    v2 = a1[2];
    v3 = a1[3];
    sub_a085fc(&v0);
    i = 0;
    v8 = 0;
    v9 = 0;
    v10 = 0;
    idx = 0;
    do
    {
        if (7 < v10 || 7 < idx)
            continue;
        v12 = v10;
        v13 = *(long long *)((char *)&v0 + 8 * idx) << ((char)v12 & 63);
        v14 = v12 & 64;
        if (v12 & 64)
        {
            v15 = v13;
            v16 = arm64g_calculate_condition(26, v14, 0, 0);
            if (!(v16 & 1))
                goto LABEL_a085ba;
            goto LABEL_a085b9;
        }
        else
        {
            v15 = (unsigned long long)((unsigned long long)(*(long long *)((char *)&v0 + 8 * idx)) >> 1) >> ((char)~v10 & 63);
            v17 = arm64g_calculate_condition(26, v14, 0, 0);
            if (v17 & 1)
            {
LABEL_a085b9:
                v13 = 0;
                goto LABEL_a085bc;
            }
            else
            {
LABEL_a085ba:
LABEL_a085bc:
                v9 |= v15;
                v8 |= v13;
                v10 |= 56;
                idx += 1;
            }
        }
        a0[i] = v8;
        v10 -= 8;
        v8 = v9 * 0x100000000000000 | v8 >> 8;
        v9 >>= 8;
        i += 1;
    } while (i != 56);
    if (*(long long *)&g_10002b0 == v4)
        return;
    ___stack_chk_fail();
}
