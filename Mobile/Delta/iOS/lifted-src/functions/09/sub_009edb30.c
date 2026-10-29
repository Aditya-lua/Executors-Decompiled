/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9edb30..0x9edf08 (984 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;
extern char g_10002b0;

void sub_9edb30(void* node, char *a1, long long a2, long long a3, void* a4, unsigned int a5)
{
    long long v5;  // x22
    char *v6;  // x21
    unsigned long v15;  // x9
    char *v16;  // x21
    unsigned int v17;  // w8
    void* v18;  // x9
    unsigned int v19;  // w10
    void* v20;  // x9
    void* v21;  // x9
    void* v22;  // x9
    void* v23;  // x9
    void* v24;  // x9
    unsigned long v7;  // x8
    unsigned int v25;  // w25
    char v26;  // x8
    char v27;  // x9
    char v28;  // x10
    char v29;  // x11
    char v30;  // x12
    char v31;  // x13
    unsigned long long v32;  // 4102
    long long j;  // x22
    char *v34;  // x26
    unsigned long v8;  // x9
    long long v35;  // x22
    unsigned long v36;  // x8
    unsigned long v37;  // x9
    unsigned int v38;  // w23
    unsigned int v39;  // w24
    unsigned int v40;  // w8
    unsigned int v41;  // w9
    unsigned long v42;  // x8
    unsigned long v43;  // x9
    unsigned int v44;  // w26
    unsigned int v9;  // w23
    unsigned int v45;  // w9
    char *iter;  // x8
    unsigned int v47;  // w10
    unsigned int v10;  // w24
    unsigned long long v11;  // 4102
    long long i;  // x22
    long long v13;  // x22
    unsigned long v14;  // x8
    unsigned int v0;  // [bp-0x70]
    unsigned int v1;  // [bp-0x6c]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a2;
    v6 = a1;
    v2 = *(long long *)&g_10002b0;
    v7 = *(int *)a4;
    v8 = (int)a4[4];
    v9 = (((((v7 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v7 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v7 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v7 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v10 = (((((v8 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v8 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v8 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v8 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    if (a5)
    {
        v11 = arm64g_calculate_condition(180, a2, 8, 0);
        if (!(v11 & 1))
        {
            do
            {
                i = v5;
                v13 = i - 8;
                v14 = *(int *)node;
                v15 = (int)node[4];
                node += 8;
                v0 = (unsigned int)((((((v14 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v14 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v14 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v14 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ v9;
                v1 = (unsigned int)((((((v15 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v15 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v15 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v15 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ v10;
                sub_9ed2c0(&v0, a3);
                v9 = v0;
                v10 = v1;
                *v6 = v9 >> 24;
                v6[1] = v9 >> 16;
                v6[2] = v9 >> 8;
                v6[3] = v9;
                v6[4] = v10 >> 24;
                v6[5] = v10 >> 16;
                v6[6] = v10 >> 8;
                v16 = v6 + 8;
                v6[7] = v10;
                v5 = v13;
                v6 = v16;
            } while (15 < (unsigned long long)i);
            v5 = v13;
            v6 = v16;
        }
        switch (v5)
        {
        case 0:
            v26 = v9 >> 24;
            v27 = v9 >> 16;
            v28 = v9 >> 8;
            v29 = v10 >> 24;
            v30 = v10 >> 16;
            v25 = v10;
            v31 = v10 >> 8;
            break;
        default:
            v17 = 0;
            v18 = node + v5;
            if (v5 <= 3)
            {
                v19 = 0;
                if (v5 == 1)
                    goto LABEL_9eddb8;
                if (v5 == 2)
                    goto LABEL_9eddb0;
                if (v5 == 3)
                    goto LABEL_9edda8;
            }
            else if (5 >= v5)
            {
                if (v5 == 4)
                    goto LABEL_9edda0;
                v19 = 0;
                if (v5 == 5)
                    goto LABEL_9edd98;
            }
            else if (v5 != 6)
            {
                v19 = 0;
                if (v5 != 7)
                    goto LABEL_9eddc0;
                v20 = v18 - 1;
                v17 = *((char *)v18 - 1) * 0x100;
                v18 = v20;
                goto LABEL_9edd90;
            }
            else
            {
LABEL_9edd90:
                v21 = v18 - 1;
                v17 |= *((char *)v18 - 1) * 0x10000;
                v18 = v21;
LABEL_9edd98:
                v22 = v18 - 1;
                v17 |= *((char *)v18 - 1) * &g_1000000;
                v18 = v22;
LABEL_9edda0:
                v19 = v17;
                v17 = *((char *)v18 - 1);
                v18 -= 1;
LABEL_9edda8:
                v23 = v18 - 1;
                v17 |= *((char *)v18 - 1) * 0x100;
                v18 = v23;
LABEL_9eddb0:
                v24 = v18 - 1;
                v17 |= *((char *)v18 - 1) * 0x10000;
                v18 = v24;
LABEL_9eddb8:
                v17 |= *((char *)v18 - 1) * &g_1000000;
            }
LABEL_9eddc0:
            v0 = v17 ^ v9;
            v1 = v19 ^ v10;
            sub_9ed2c0(&v0, a3);
            v9 = v0;
            v25 = v1;
            v26 = v9 >> 24;
            *v6 = v26;
            v27 = v9 >> 16;
            v6[1] = v27;
            v28 = v9 >> 8;
            v6[2] = v28;
            v6[3] = v9;
            v29 = v25 >> 24;
            v6[4] = v29;
            v30 = v25 >> 16;
            v6[5] = v30;
            v31 = v25 >> 8;
            v6[6] = v31;
            v6[7] = v25;
        }
        *(char *)a4 = v26;
        *(char *)&a4[1] = v27;
        *(char *)&a4[2] = v28;
        *(char *)&a4[3] = v9;
        *(char *)&a4[4] = v29;
        *(char *)&a4[5] = v30;
        *(char *)&a4[6] = v31;
    }
    else
    {
        v32 = arm64g_calculate_condition(180, a2, 8, 0);
        if (!(v32 & 1))
        {
            do
            {
                j = v5;
                v34 = v6;
                v35 = j - 8;
                v36 = *(int *)node;
                v37 = (int)node[4];
                v38 = (((((v36 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v36 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v36 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v36 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                node += 8;
                v39 = (((((v37 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v37 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v37 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v37 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                v0 = v38;
                v1 = v39;
                sub_9ed6fc(&v0, a3);
                v40 = v0 ^ v9;
                v41 = v1 ^ v10;
                *v34 = v40 >> 24;
                v34[1] = v40 >> 16;
                v34[2] = v40 >> 8;
                v34[3] = v40;
                v34[4] = v41 >> 24;
                v34[5] = v41 >> 16;
                v34[6] = v41 >> 8;
                v6 = v34 + 8;
                v34[7] = v41;
                v10 = v39;
                v9 = v38;
                v5 = v35;
            } while (15 < (unsigned long long)j);
            v10 = v39;
            v9 = v38;
            v5 = v35;
        }
        if (v5)
        {
            v42 = *(int *)node;
            v43 = (int)node[4];
            v44 = (((((v42 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v42 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v42 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v42 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v25 = (((((v43 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v43 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v43 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v43 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v0 = v44;
            v1 = v25;
            sub_9ed6fc(&v0, a3);
            v45 = v0 ^ v9;
            iter = &v6[v5];
            if (v5 > 3)
            {
                v47 = v1 ^ v10;
                if (5 >= v5)
                {
                    if (v5 == 4)
                        goto LABEL_9ede78;
                    if (v5 == 5)
                        goto LABEL_9ede70;
                }
                else if (v5 != 6)
                {
                    if (v5 != 7)
                        goto LABEL_9ede94;
                    *(iter - 1) = v47 >> 8;
                    iter -= 1;
                    goto LABEL_9ede68;
                }
                else
                {
LABEL_9ede68:
                    *(iter - 1) = v47 >> 16;
                    iter -= 1;
LABEL_9ede70:
                    *(iter - 1) = v47 >> 24;
                    iter -= 1;
LABEL_9ede78:
                    *(iter - 1) = v45;
                    iter -= 1;
LABEL_9ede7c:
                    *(iter - 1) = v45 >> 8;
                    iter -= 1;
LABEL_9ede84:
                    *(iter - 1) = v45 >> 16;
                    iter -= 1;
LABEL_9ede8c:
                    *(iter - 1) = v45 >> 24;
                }
            }
            else
            {
                if (v5 == 1)
                    goto LABEL_9ede8c;
                if (v5 == 2)
                    goto LABEL_9ede84;
                if (v5 == 3)
                    goto LABEL_9ede7c;
            }
        }
        else
        {
            v44 = v9;
            v25 = v10;
        }
LABEL_9ede94:
        *(char *)a4 = v44 >> 24;
        *(char *)&a4[1] = v44 >> 16;
        *(char *)&a4[2] = v44 >> 8;
        *(char *)&a4[3] = v44;
        *(char *)&a4[4] = v25 >> 24;
        *(char *)&a4[5] = v25 >> 16;
        *(char *)&a4[6] = v25 >> 8;
    }
    *(char *)&a4[7] = v25;
    if (*(long long *)&g_10002b0 == v2)
        return;
    ___stack_chk_fail();
}
