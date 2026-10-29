/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2bc00..0xb2bdc8 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2bc00_0 {
    unsigned long long field_0;
    char field_1;
    char padding_2[6];
    unsigned int field_8;
    char padding_c[72];
    unsigned int field_54;
    char padding_58[12];
    struct st_b2bc00_0 *field_64;
    long long field_68;
    char padding_70[4];
    unsigned int field_74;
    char padding_78[4];
    unsigned int field_7c;
    char padding_80[8];
    long long field_88;
} st_b2bc00_0;

extern char g_10002b0;

st_b2bc00_0 * sub_b2bc00(st_b2bc00_0 *a0, long long a1)
{
    long long v6;  // x22
    unsigned long v7;  // x23
    unsigned long v16;  // x16
    unsigned long long v17;  // x0
    unsigned long v18;  // x17
    unsigned long long v19;  // x17
    unsigned long long v20;  // x17
    unsigned long long v21;  // 4110
    unsigned long long v22;  // 4102
    unsigned long long v23;  // 4110
    unsigned long long v24;  // 4102
    uint128_t *node;  // x17
    unsigned long v8;  // x8
    unsigned long long k;  // x0
    uint128_t *iter;  // x1
    unsigned long long v28;  // x0
    uint128_t v29;  // q1
    uint128_t v30;  // q3
    st_b2bc00_0 *l;  // x17
    st_b2bc00_0 *j;  // x8
    unsigned long long v34;  // x1
    unsigned long v9;  // cc_op
    unsigned long i;  // cc_dep1
    unsigned long v11;  // cc_dep2
    st_b2bc00_0 *v12;  // w9
    uint128_t *v13;  // x14
    unsigned long long v14;  // x15
    unsigned long v15;  // x16
    uint128_t v0;  // [bp-0x848]
    uint128_t v2;  // [bp-0x448]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (a0)
    {
        v6 = *(long long *)&a0->padding_58[8];
        v7 = *(int *)((char *)&a0->field_68 + 4);
        _memcpy(&v0, v6 + v7 * 0x400 - 0x400, 0x400);
        v8 = *(int *)&a0->padding_c[64];
        v9 = 3;
        i = v8 & 0xffffffff;
        v11 = 2;
        if ((unsigned int)v8 >= 2)
        {
            v12 = (st_b2bc00_0 *)0;
            v13 = &v0 + 1;
            v14 = 1;
            v15 = (unsigned int)v7 * 2 - 1;
            v16 = v15;
            do
            {
                v17 = (v16 * 0x400 | v16 >> 54) & 0x3fffffffc00 & 0x3ffffffffff;
                v18 = (unsigned int)v15 + v12 * (unsigned int)v7;
                v19 = (v18 * 0x400 | v18 >> 54) & 0x3fffffffc00 & 0x3ffffffffff;
                v20 = v6 + v19;
                if (&v0 < v6 + v19 + 0x400)
                {
                    v21 = arm64g_calculate_condition(v9 | 48, i, v11, 0);
                    v22 = arm64g_calculate_condition(52, (v21 & 1 ? v20 : 0x20000000), (v21 & 1 ? &v2 : 0), 0);
                    if (v22 & 1)
                        goto LABEL_b2bcf0;
                    goto LABEL_b2bcbc;
                }
                else
                {
                    v23 = arm64g_calculate_condition(v9 | 48, i, v11, 0);
                    v24 = arm64g_calculate_condition(48, (v23 & 1 ? v20 : 0x20000000), (v23 & 1 ? &v2 : 0), 0);
                    if (!(v24 & 1))
                    {
LABEL_b2bcbc:
                        node = v6 + 16 + v17;
                        k = 128;
                        iter = v13;
                        do
                        {
                            v28 = k;
                            v29 = *node;
                            v30 = *iter;
                            *(int128_t *)((char *)iter - 16) = *(int128_t *)((char *)node - 16) ^ *(int128_t *)((char *)iter - 16);
                            *iter = v29 ^ v30;
                            node += 2;
                            iter += 2;
                            k = v28 - 4;
                        } while (k);
                    }
                    else
                    {
LABEL_b2bcf0:
                        l = 0;
                        do
                        {
                            *(long long *)(&v0 + l) = *(long long *)(&v0 + l) ^ *(long long *)(v6 + v17 + (char *)l);
                            l = &l->field_1;
                        } while (l != 0x400);
                    }
                }
                v14 += 1;
                v12 = (char *)&v12->field_0 + 1;
                v16 += v7;
                v9 = 4;
                i = v14;
                v11 = v8;
            } while (i != v11);
        }
        j = 0;
        do
        {
            *(long long *)(&v2 + j) = *(long long *)(&v0 + j);
            j = &j->field_1;
        } while (j != 0x400);
        sub_b2bdc8(*(long long *)a0->padding_78, a1, *(int *)&a0->field_1, &v2, 0x400);
        sub_a66ec0(&v0, 0x400);
        sub_a66ec0(&v2, 0x400);
        v34 = *(int *)((char *)&a0->field_64 + 4) * 0x400;
        if (*(int *)&a0->padding_58[4])
            a0 = sub_a6d4c0(*(long long *)&a0->padding_58[8], v34, "providers/implementations/kdfs/argon2.c", 777);
        else
            a0 = sub_a6c4e8(*(long long *)&a0->padding_58[8], v34, "providers/implementations/kdfs/argon2.c", 780);
    }
    if (*(long long *)&g_10002b0 == v3)
        return a0;
    ___stack_chk_fail();
}
