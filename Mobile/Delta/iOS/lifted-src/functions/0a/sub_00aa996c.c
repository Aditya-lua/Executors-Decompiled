/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa996c..0xaa9aa0 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa996c_0 {
    long long field_0;
    long long field_8;
    long long field_10;
    long long field_14;
    char padding_1c[4];
    unsigned long long field_20;
    unsigned long long field_28;
} st_aa996c_0;


long long sub_aa996c(st_aa996c_0 *a0, unsigned long long i)
{
    unsigned long long v2;  // x20
    long long v3;  // x8
    long long v12;  // x0
    unsigned long long v4;  // x9
    unsigned long v5;  // cc_dep1
    unsigned long long v6;  // x9
    unsigned long long v7;  // x11
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_20;
    v3 = a0->field_8;
    v4 = a0->field_20 - v3;
    v5 = v4;
    if (i <= v4)
        return 1;
    v6 = *(long long *)a0->padding_1c;
    v7 = v6 - v3;
    if (!(int)a0->field_10)
    {
        v8 = arm64g_calculate_condition(4, v5, i, 0);
        v9 = arm64g_calculate_condition(36, (v8 & 1 ? v7 : 0), (v8 & 1 ? i : 0), 0);
        if (v9 & 1)
            goto LABEL_aa99e4;
LABEL_aa99ac:
        sub_a368c8();
        sub_a369bc("crypto/rand/rand_pool.c", 205, "rand_pool_grow");
        sub_a36abc(36, 0xc0103, 0);
        return 0;
    }
    v10 = arm64g_calculate_condition(4, v5, i, 0);
    v11 = arm64g_calculate_condition(32, (v10 & 1 ? v7 : 0), (v10 & 1 ? i : 0), 0);
    if (!(v11 & 1))
        goto LABEL_aa99ac;
LABEL_aa99e4:
    do
    {
        if (v2 < v6 >> 1)
            v2 *= 2;
        else
            v2 = v6;
    } while (v2 - v3 < i);
    if (*(int *)((char *)&a0->field_10 + 4))
    {
        v12 = sub_a6ce80(v2, "crypto/rand/rand_pool.c", 214);
        if (!v12)
            return 0;
    }
    else
    {
        v12 = sub_a6bffc(v2, "crypto/rand/rand_pool.c", 216);
        if (!v12)
            return 0;
    }
    _memcpy(v12, a0->field_0, a0->field_8);
    if (*(int *)((char *)&a0->field_10 + 4))
        sub_a6d4c0(a0->field_0, a0->field_20, "crypto/rand/rand_pool.c", 0xdd);
    else
        sub_a6c4e8(a0->field_0, a0->field_20, "crypto/rand/rand_pool.c", 223);
    a0->field_0 = v12;
    a0->field_20 = v2;
    return 1;
}
