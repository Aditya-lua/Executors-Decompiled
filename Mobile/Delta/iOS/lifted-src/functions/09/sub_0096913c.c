/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96913c..0x969454 (792 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_d28260;
extern char g_e878d0;

void* sub_96913c(void* a0)
{
    long long v5;  // x19
    unsigned int v6;  // w22
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4102
    void* k;  // x24
    void* v18;  // x0
    void* v19;  // x22
    void* v20;  // x8
    void* v21;  // x9
    uint128_t v22;  // q1
    uint128_t v23;  // q0
    void* v24;  // x27
    void* i;  // x28
    unsigned int *iter;  // x25
    void* v27;  // x8
    unsigned short v28;  // x10
    unsigned long v29;  // x23
    void* v30;  // x0
    void* iter1;  // x10
    void* iter2;  // x8
    void* *v33;  // x9
    void* v34;  // x17
    unsigned short *v35;  // x13
    unsigned int v36;  // w13
    void* v9;  // x21
    void* *node;  // x14
    void* v38;  // x15
    void* v39;  // x15
    void* *v40;  // x9
    void* v41;  // x17
    void* v42;  // x22
    unsigned long long v10;  // 4110
    void* v0;  // [bp-0x80]
    void* v1;  // [bp-0x78]
    uint128_t v2;  // [bp-0x70]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_a5ba1c();
    if (a0)
    {
        v6 = *(int *)(*(long long *)((long long)a0[8] + 216) + 80);
        k = (long long)a0[1680] + 31;
        v9 = sub_a6bffc(k * 72, "ssl/t1_lib.c", 2175);
        if (v9)
        {
            v10 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
            v11 = arm64g_calculate_condition(4, (v10 & 1 ? v5 : 0x40000000), 0, 0);
LABEL_969260:
            v42 = 0;
        }
        else
        {
            v16 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
            v17 = arm64g_calculate_condition(0, (v16 & 1 ? v5 : 0x40000000), 0, 0);
            if (v17 & 1 || (v18 = sub_a6bffc(k * 2, "ssl/t1_lib.c", 2179), !v18))
                goto LABEL_969260;
            v0 = (long long)a0[1680];
            v1 = v18;
            sub_a36c8c();
            v19 = 0;
            do
            {
                v20 = &g_e878d0 + v19;
                v21 = v9 + v19;
                v22 = (int128_t)v20[48];
                *(int128_t *)&v21[32] = (int128_t)v20[32];
                *(uint128_t *)&v21[48] = v22;
                *(long long *)&v21[64] = (long long)v20[64];
                v23 = (int128_t)v20[16];
                *(int128_t *)v21 = *(int128_t *)v20;
                *(uint128_t *)&v21[16] = v23;
                if ((int)v20[20] && !*(long long *)((char *)a0 + 8 * v20[24] + 1392) || !sub_a5a05c(v5, (int)v20[28]))
                {
                    *(unsigned int *)(v9 + v19 + 44) = 0;
                }
                else
                {
                    if (!sub_a5d5a8(*(long long *)a0, v5, (long long)a0[1136]))
                        *(unsigned int *)(v9 + v19 + 44) = 0;
                    sub_a5d6b0();
                }
            } while ((v19 += 72, v19 != 2232));
            if ((long long)a0[1680])
            {
                v24 = 0;
                i = 0;
                iter = v9 + 2296;
                v2 = 0xffffffff000003040000030400000000;
                do
                {
                    v27 = (long long)a0[1672] + v24;
                    v28 = (short)v27[8];
                    v29 = (long long)v27[16];
                    v30 = (long long)v27[48];
                    *(long long *)((char *)iter - 64) = *(long long *)v27;
                    *(unsigned long *)((char *)iter - 56) = v29;
                    *(unsigned short *)((char *)iter - 48) = v28;
                    *(unsigned short *)((char *)v1 + 0x2 * i + 62) = v28;
                    if (v30)
                        v30 = sub_a99eb4(v30);
                    *(unsigned int *)((char *)iter - 44) = (unsigned int)v30;
                    *(unsigned int *)((char *)iter - 40) = sub_95c2ec(v30);
                    *(unsigned int *)((char *)iter - 36) = sub_a99eb4(v29);
                    *(unsigned int *)((char *)iter - 32) = (unsigned int)i + 9;
                    *(unsigned int *)((char *)iter - 28) = sub_a99eb4(v29);
                    *(unsigned int *)((char *)iter - 24) = 0;
                    *iter = 0xffffffff;
                    *(unsigned int *)((char *)iter - 20) = 1 & ~(v6 >> 3);
                    *(uint128_t *)((char *)iter - 16) = v2;
                    i += 1;
                    v24 += 104;
                    iter += 18;
                } while ((unsigned long long)(long long)a0[1680] > i);
            }
            sub_a36cd4();
            iter1 = 0;
            iter2 = 0;
            v33 = v9 + 48;
            v34 = v0;
            do
            {
                v35 = &g_d28260 + 0x2 * iter1;
                iter1 += 1;
                while (!k)
                {
                    v35 += 1;
                    if (iter1 == 0x22)
                        goto LABEL_9693e8;
                }
                v36 = *v35;
                node = v33;
                v38 = k;
                do
                {
                    v39 = v38;
                    if (*(short *)((char *)node - 32) == v36 && *(int *)((char *)node - 4) && !*(int *)node)
                    {
                        *(unsigned int *)node = 1;
                        *(unsigned short *)((char *)v1 + 0x2 * iter2) = v36;
                        iter2 += 1;
                        break;
                    }
                } while ((node += 9, v38 = v39 - 1, v39 != 1));
            } while (iter1 != 0x22);
            if (k >= 32)
            {
                v40 = v9 + 2280;
                do
                {
                    v41 = v34;
                    if (*(int *)((char *)v40 - 4) && !*(int *)v40)
                    {
                        *(short *)((char *)v1 + 0x2 * iter2) = *(short *)((char *)v40 - 32);
                        iter2 += 1;
                    }
                } while ((v40 += 9, v34 = v41 - 1, v41 != 1));
            }
LABEL_9693e8:
            *(void* *)&a0[1632] = v9;
            *(void* *)&a0[1616] = k;
            *(void* *)&a0[1640] = v1;
            v42 = 1;
            *(void* *)&a0[1624] = iter2;
LABEL_9693fc:
            v9 = 0;
        }
    }
    else
    {
        v42 = 0;
        goto LABEL_9693fc;
    }
    sub_a6c2e4(v9, "ssl/t1_lib.c", 2275);
    sub_a6c2e4(0, "ssl/t1_lib.c", 2276);
    sub_a5a4c8(v5);
    return v42;
}
