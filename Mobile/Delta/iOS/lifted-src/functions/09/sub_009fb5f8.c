/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fb5f8..0x9fb9ac (948 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;
extern char g_10002b0;

void sub_9fb5f8(void* a0, void* a1, long long a2, long long a3, void* a4, unsigned int a5)
{
    void* v5;  // x22
    long long v6;  // x19
    unsigned int v15;  // x19
    long long i;  // x19
    unsigned long v17;  // d0
    unsigned int v18;  // w9
    char *v19;  // x8
    unsigned int v20;  // w10
    char *v21;  // x8
    char *v22;  // x8
    char *v23;  // x8
    char *v24;  // x8
    void* v7;  // x21
    char *v25;  // x8
    char *v26;  // x8
    char v27;  // x8
    char v28;  // x9
    char v29;  // x10
    char v30;  // x12
    char v31;  // x13
    char v32;  // x11
    unsigned long long v33;  // 4102
    long long j;  // x19
    void* node;  // x23
    void* v35;  // x27
    unsigned int v36;  // w24
    unsigned int v37;  // w25
    long long v38;  // x19
    unsigned int v39;  // w8
    unsigned int v40;  // w9
    unsigned int v41;  // w26
    unsigned int v42;  // w23
    unsigned int v43;  // w8
    void* iter;  // x9
    uint128_t v9;  // q0
    unsigned int v45;  // w10
    unsigned int v10;  // w24
    unsigned int v11;  // w25
    unsigned long long v12;  // 4102
    void* v13;  // x23
    void* v14;  // x21
    unsigned long v0;  // [bp-0x70], Other Possible Types: unsigned int
    unsigned int v1;  // [bp-0x6c]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a4;
    v6 = a2;
    v7 = a1;
    node = a0;
    v2 = *(long long *)&g_10002b0;
    v9 = *(unsigned long long *)&*(double *)a4;
    v10 = *(unsigned int *)&*(unsigned int *)(void*)&v9;
    v11 = *(unsigned int *)((void*)&v9 + 4);
    if (a5)
    {
        v12 = arm64g_calculate_condition(180, a2, 8, 0);
        v13 = node;
        v14 = v7;
        v15 = v6;
        if (!(v12 & 1))
        {
            do
            {
                i = v6;
                v15 = i - 8;
                v13 = node + 8;
                v17 = __dirty_unsupported_Iop_ZeroHI64ofV128(v9 ^ *(unsigned long long *)&*(double *)node);
                v0 = v17;
                sub_9f96d4(&v0, a3, 1);
                v9 = v0;
                v10 = *(unsigned int *)&*(unsigned int *)(void*)&v9;
                *(char *)v7 = v10;
                *(char *)&v7[1] = v10 >> 8;
                *(char *)&v7[2] = v10 >> 16;
                *(char *)&v7[3] = v10 >> 24;
                v11 = *(unsigned int *)((void*)&v9 + 4);
                *(char *)&v7[4] = v11;
                *(char *)&v7[5] = v11 >> 8;
                *(char *)&v7[6] = v11 >> 16;
                v14 = v7 + 8;
                *(char *)&v7[7] = v11 >> 24;
                node = v13;
                v7 = v14;
                v6 = v15;
            } while (15 < (unsigned long long)i);
        }
        switch (v15)
        {
        case 0:
            v27 = v10 >> 8;
            v28 = v10 >> 16;
            v29 = v10 >> 24;
            v30 = v11 >> 8;
            v31 = v11 >> 16;
            v32 = v11 >> 24;
            break;
        default:
            v18 = 0;
            v19 = v13 + v15;
            if (v15 <= 3)
            {
                v20 = 0;
                if (v15 == 1)
                    goto LABEL_9fb878;
                if (v15 == 2)
                    goto LABEL_9fb870;
                if (v15 == 3)
                    goto LABEL_9fb868;
            }
            else if (5 >= v15)
            {
                if (v15 == 4)
                    goto LABEL_9fb85c;
                v20 = 0;
                if (v15 == 5)
                    goto LABEL_9fb854;
            }
            else if (v15 != 6)
            {
                v20 = 0;
                if (v15 != 7)
                    goto LABEL_9fb880;
                v21 = v19 - 1;
                v18 = *(v19 - 1) * 0x10000;
                v19 = v21;
                goto LABEL_9fb84c;
            }
            else
            {
LABEL_9fb84c:
                v22 = v19 - 1;
                v18 |= *(v19 - 1) * 0x100;
                v19 = v22;
LABEL_9fb854:
                v23 = v19 - 1;
                v18 |= *(v19 - 1);
                v19 = v23;
LABEL_9fb85c:
                v20 = v18;
                v24 = v19 - 1;
                v18 = *(v19 - 1) * &_NSHomeDirectory;
                v19 = v24;
LABEL_9fb868:
                v25 = v19 - 1;
                v18 |= *(v19 - 1) * 0x10000;
                v19 = v25;
LABEL_9fb870:
                v26 = v19 - 1;
                v18 |= *(v19 - 1) * 0x100;
                v19 = v26;
LABEL_9fb878:
                v18 |= *(v19 - 1);
            }
LABEL_9fb880:
            v0 = v18 ^ v10;
            v1 = v20 ^ v11;
            sub_9f96d4(&v0, a3, 1);
            v10 = v0;
            v11 = v1;
            v27 = v10 >> 8;
            v28 = v10 >> 16;
            v29 = v10 >> 24;
            v30 = v11 >> 8;
            v31 = v11 >> 16;
            v32 = v11 >> 24;
            *(unsigned int *)v14 = v10;
            *(unsigned int *)&v14[4] = v11;
        }
        *(char *)v5 = v10;
        *(char *)&v5[1] = v27;
        *(char *)&v5[2] = v28;
        *(char *)&v5[3] = v29;
        *(char *)&v5[4] = v11;
        *(char *)&v5[5] = v30;
        *(char *)&v5[6] = v31;
    }
    else
    {
        v33 = arm64g_calculate_condition(180, a2, 8, 0);
        if (!(v33 & 1))
        {
            v5 = v5;
            do
            {
                j = v6;
                v35 = v7;
                v36 = *(int *)node;
                v37 = (int)node[4];
                v38 = j - 8;
                node += 8;
                v0 = v36;
                v1 = v37;
                sub_9f96d4(&v0, a3, 0);
                v39 = v0 ^ v10;
                v40 = v1 ^ v11;
                *(char *)v35 = v39;
                *(char *)&v35[1] = v39 >> 8;
                *(char *)&v35[2] = v39 >> 16;
                *(char *)&v35[3] = v39 >> 24;
                *(char *)&v35[4] = v40;
                *(char *)&v35[5] = v40 >> 8;
                *(char *)&v35[6] = v40 >> 16;
                v7 = v35 + 8;
                *(char *)&v35[7] = v40 >> 24;
                v11 = v37;
                v10 = v36;
                v6 = v38;
            } while (15 < (unsigned long long)j);
            v11 = v37;
            v10 = v36;
            v6 = v38;
        }
        switch (v6)
        {
        case 0:
            v41 = v10;
            v42 = v11;
            break;
        default:
            v41 = *(int *)node;
            v42 = (int)node[4];
            v0 = v41;
            v1 = v42;
            sub_9f96d4(&v0, a3, 0);
            v43 = v0 ^ v10;
            iter = v7 + v6;
            if (v6 > 3)
            {
                v45 = v1 ^ v11;
                if (5 >= v6)
                {
                    if (v6 == 4)
                        goto LABEL_9fb91c;
                    if (v6 == 5)
                        goto LABEL_9fb918;
                }
                else if (v6 != 6)
                {
                    if (v6 != 7)
                        goto LABEL_9fb938;
                    *((char *)iter - 1) = v45 >> 16;
                    iter -= 1;
                    goto LABEL_9fb910;
                }
                else
                {
LABEL_9fb910:
                    *((char *)iter - 1) = v45 >> 8;
                    iter -= 1;
LABEL_9fb918:
                    *((char *)iter - 1) = v45;
                    iter -= 1;
LABEL_9fb91c:
                    *((char *)iter - 1) = v43 >> 24;
                    iter -= 1;
LABEL_9fb924:
                    *((char *)iter - 1) = v43 >> 16;
                    iter -= 1;
LABEL_9fb92c:
                    *((char *)iter - 1) = v43 >> 8;
                    iter -= 1;
LABEL_9fb934:
                    *((char *)iter - 1) = v43;
                }
            }
            else
            {
                if (v6 == 1)
                    goto LABEL_9fb934;
                if (v6 == 2)
                    goto LABEL_9fb92c;
                if (v6 == 3)
                    goto LABEL_9fb924;
            }
        }
LABEL_9fb938:
        *(char *)v5 = v41;
        *(char *)&v5[1] = v41 >> 8;
        *(char *)&v5[2] = v41 >> 16;
        *(char *)&v5[3] = v41 >> 24;
        *(char *)&v5[4] = v42;
        *(char *)&v5[5] = v42 >> 8;
        v32 = v42 >> 24;
        *(char *)&v5[6] = v42 >> 16;
    }
    *(char *)&v5[7] = v32;
    if (*(long long *)&g_10002b0 == v2)
        return;
    ___stack_chk_fail();
}
