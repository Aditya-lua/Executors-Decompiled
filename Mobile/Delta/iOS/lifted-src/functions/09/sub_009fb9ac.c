/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fb9ac..0x9fbda0 (1012 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;
extern char g_10002b0;

void sub_9fb9ac(void* a0, char *a1, long long a2, long long a3, long long a4, long long a5, void* a6, unsigned int a7)
{
    void* v5;  // x19
    long long v6;  // x20
    long long v15;  // x3
    void* v16;  // x25
    unsigned int v17;  // x22
    char *v18;  // x21
    long long v19;  // x3
    long long i;  // x22
    unsigned long v21;  // d0
    unsigned int v22;  // w8
    char *v23;  // x9
    unsigned int v24;  // w10
    long long v7;  // x23
    char *v25;  // x9
    char *v26;  // x9
    char *v27;  // x9
    char *v28;  // x9
    char *v29;  // x9
    char *v30;  // x9
    char v31;  // x8
    char v32;  // x9
    char v33;  // x10
    char v34;  // x11
    long long v8;  // x22
    char v35;  // x13
    char v36;  // x12
    unsigned long long v37;  // 4102
    long long v38;  // x3
    long long j;  // x22
    unsigned int v40;  // w27
    unsigned int v41;  // w26
    long long v42;  // x22
    unsigned int v43;  // w8
    unsigned int v44;  // w9
    char *v9;  // x21
    char *v45;  // x21
    unsigned int v46;  // w28
    unsigned int v47;  // w25
    unsigned int v48;  // w8
    char *iter;  // x9
    unsigned int v50;  // w10
    void* node;  // x25
    uint128_t v11;  // q0
    unsigned int v12;  // w27
    unsigned int v13;  // w26
    unsigned long long v14;  // 4102
    unsigned long v0;  // [bp-0x70], Other Possible Types: unsigned int
    unsigned int v1;  // [bp-0x6c]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a6;
    v6 = a5;
    v7 = a4;
    v8 = a2;
    v9 = a1;
    node = a0;
    v2 = *(long long *)&g_10002b0;
    v11 = *(unsigned long long *)&*(double *)a6;
    v12 = *(unsigned int *)&*(unsigned int *)(void*)&v11;
    v13 = *(unsigned int *)((void*)&v11 + 4);
    if (a7)
    {
        v14 = arm64g_calculate_condition(180, a2, 8, 0);
        v15 = a3;
        v16 = node;
        v17 = v8;
        v18 = v9;
        v19 = a3;
        if (!(v14 & 1))
        {
            do
            {
                i = v8;
                v17 = i - 8;
                v16 = node + 8;
                v21 = __dirty_unsupported_Iop_ZeroHI64ofV128(v11 ^ *(unsigned long long *)&*(double *)node);
                v0 = v21;
                sub_9fb3ec(&v0, v15, v7, v6);
                v15 = a3;
                v11 = v0;
                v12 = *(unsigned int *)&*(unsigned int *)(void*)&v11;
                *v9 = v12;
                v9[1] = v12 >> 8;
                v9[2] = v12 >> 16;
                v9[3] = v12 >> 24;
                v13 = *(unsigned int *)((void*)&v11 + 4);
                v9[4] = v13;
                v9[5] = v13 >> 8;
                v9[6] = v13 >> 16;
                v18 = v9 + 8;
                v9[7] = v13 >> 24;
                node = v16;
                v8 = v17;
                v9 = v18;
                v19 = v15;
            } while (15 < (unsigned long long)i);
        }
        switch (v17)
        {
        case 0:
            v31 = v12 >> 8;
            v32 = v12 >> 16;
            v33 = v12 >> 24;
            v34 = v13 >> 8;
            v35 = v13 >> 16;
            v36 = v13 >> 24;
            break;
        default:
            v22 = 0;
            v23 = v16 + v17;
            if (v17 <= 3)
            {
                v24 = 0;
                if (v17 == 1)
                    goto LABEL_9fbc4c;
                if (v17 == 2)
                    goto LABEL_9fbc44;
                if (v17 == 3)
                    goto LABEL_9fbc3c;
            }
            else if (5 >= v17)
            {
                if (v17 == 4)
                    goto LABEL_9fbc30;
                v24 = 0;
                if (v17 == 5)
                    goto LABEL_9fbc28;
            }
            else if (v17 != 6)
            {
                v24 = 0;
                if (v17 != 7)
                    goto LABEL_9fbc54;
                v25 = v23 - 1;
                v22 = *(v23 - 1) * 0x10000;
                v23 = v25;
                goto LABEL_9fbc20;
            }
            else
            {
LABEL_9fbc20:
                v26 = v23 - 1;
                v22 |= *(v23 - 1) * 0x100;
                v23 = v26;
LABEL_9fbc28:
                v27 = v23 - 1;
                v22 |= *(v23 - 1);
                v23 = v27;
LABEL_9fbc30:
                v24 = v22;
                v28 = v23 - 1;
                v22 = *(v23 - 1) * &_NSHomeDirectory;
                v23 = v28;
LABEL_9fbc3c:
                v29 = v23 - 1;
                v22 |= *(v23 - 1) * 0x10000;
                v23 = v29;
LABEL_9fbc44:
                v30 = v23 - 1;
                v22 |= *(v23 - 1) * 0x100;
                v23 = v30;
LABEL_9fbc4c:
                v22 |= *(v23 - 1);
            }
LABEL_9fbc54:
            v0 = v22 ^ v12;
            v1 = v24 ^ v13;
            sub_9fb3ec(&v0, v19, v7, v6);
            v12 = v0;
            v13 = v1;
            *v18 = v12;
            v31 = v12 >> 8;
            v18[1] = v31;
            v32 = v12 >> 16;
            v18[2] = v32;
            v33 = v12 >> 24;
            v18[3] = v33;
            v18[4] = v13;
            v34 = v13 >> 8;
            v18[5] = v34;
            v35 = v13 >> 16;
            v18[6] = v35;
            v36 = v13 >> 24;
            v18[7] = v36;
        }
        *(char *)v5 = v12;
        *(char *)&v5[1] = v31;
        *(char *)&v5[2] = v32;
        *(char *)&v5[3] = v33;
        *(char *)&v5[4] = v13;
        *(char *)&v5[5] = v34;
        *(char *)&v5[6] = v35;
    }
    else
    {
        v37 = arm64g_calculate_condition(180, a2, 8, 0);
        if (!(v37 & 1))
        {
            v38 = a3;
            do
            {
                j = v8;
                v40 = *(int *)node;
                v41 = (int)node[4];
                v42 = j - 8;
                node += 8;
                v0 = v40;
                v1 = v41;
                sub_9fb4f0(&v0, v38, v7, v6);
                v38 = a3;
                v43 = v0 ^ v12;
                v44 = v1 ^ v13;
                *v9 = v43;
                v9[1] = v43 >> 8;
                v9[2] = v43 >> 16;
                v9[3] = v43 >> 24;
                v9[4] = v44;
                v9[5] = v44 >> 8;
                v9[6] = v44 >> 16;
                v45 = v9 + 8;
                v9[7] = v44 >> 24;
                v12 = v40;
                v13 = v41;
                v8 = v42;
                v9 = v45;
            } while (15 < (unsigned long long)j);
            v12 = v40;
            v13 = v41;
            v8 = v42;
            v9 = v45;
            a3 = v38;
        }
        switch (v8)
        {
        case 0:
            v46 = v12;
            v47 = v13;
            break;
        default:
            v46 = *(int *)node;
            v47 = (int)node[4];
            v0 = v46;
            v1 = v47;
            sub_9fb4f0(&v0, a3, v7, v6);
            v48 = v0 ^ v12;
            iter = &v9[v8];
            if (v8 > 3)
            {
                v50 = v1 ^ v13;
                if (5 >= v8)
                {
                    if (v8 == 4)
                        goto LABEL_9fbd10;
                    if (v8 == 5)
                        goto LABEL_9fbd0c;
                }
                else if (v8 != 6)
                {
                    if (v8 != 7)
                        goto LABEL_9fbd2c;
                    *(iter - 1) = v50 >> 16;
                    iter -= 1;
                    goto LABEL_9fbd04;
                }
                else
                {
LABEL_9fbd04:
                    *(iter - 1) = v50 >> 8;
                    iter -= 1;
LABEL_9fbd0c:
                    *(iter - 1) = v50;
                    iter -= 1;
LABEL_9fbd10:
                    *(iter - 1) = v48 >> 24;
                    iter -= 1;
LABEL_9fbd18:
                    *(iter - 1) = v48 >> 16;
                    iter -= 1;
LABEL_9fbd20:
                    *(iter - 1) = v48 >> 8;
                    iter -= 1;
LABEL_9fbd28:
                    *(iter - 1) = v48;
                }
            }
            else
            {
                if (v8 == 1)
                    goto LABEL_9fbd28;
                if (v8 == 2)
                    goto LABEL_9fbd20;
                if (v8 == 3)
                    goto LABEL_9fbd18;
            }
        }
LABEL_9fbd2c:
        *(char *)v5 = v46;
        *(char *)&v5[1] = v46 >> 8;
        *(char *)&v5[2] = v46 >> 16;
        *(char *)&v5[3] = v46 >> 24;
        *(char *)&v5[4] = v47;
        *(char *)&v5[5] = v47 >> 8;
        v36 = v47 >> 24;
        *(char *)&v5[6] = v47 >> 16;
    }
    *(char *)&v5[7] = v36;
    if (*(long long *)&g_10002b0 == v2)
        return;
    ___stack_chk_fail();
}
