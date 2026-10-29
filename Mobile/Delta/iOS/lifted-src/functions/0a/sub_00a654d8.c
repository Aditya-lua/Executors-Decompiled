/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa654d8..0xa6587c (932 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;
extern char g_10002b0;

void sub_a654d8(void* iter, void* a1, long long a2, long long a3, void* a4, unsigned long long a5)
{
    long long v5;  // x22
    void* node;  // x21
    unsigned long v15;  // x8
    unsigned long v16;  // x9
    unsigned long long v17;  // x8
    void* v18;  // x9
    unsigned long long v19;  // x10
    void* v20;  // x9
    void* v21;  // x9
    void* v22;  // x9
    void* v23;  // x9
    void* v24;  // x9
    unsigned long v7;  // x8
    unsigned long v25;  // x8
    unsigned long long v26;  // x25
    char v27;  // x14
    char v28;  // x13
    char v29;  // x12
    char v30;  // x10
    char v31;  // x11
    char v32;  // x9
    unsigned long long v33;  // 4102
    long long j;  // x22
    unsigned long v8;  // x9
    void* v35;  // x26
    long long v36;  // x22
    unsigned long v37;  // x8
    unsigned long v38;  // x9
    unsigned long v39;  // x23
    unsigned long long v40;  // x24
    unsigned long long v41;  // x8
    unsigned long long v42;  // x9
    unsigned long v43;  // x8
    unsigned long long v44;  // x26
    unsigned long long v9;  // x23
    unsigned long v45;  // x8
    unsigned long long v46;  // x9
    void* iter1;  // x8
    unsigned long long v48;  // x10
    unsigned long long v10;  // x24
    unsigned long long v11;  // 4102
    long long i;  // x22
    void* v13;  // x26
    long long v14;  // x22
    unsigned long v0;  // [bp-0x78]
    unsigned long long v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a2;
    node = a1;
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
                v13 = node;
                v14 = i - 8;
                v15 = *(int *)iter;
                v16 = (int)iter[4];
                iter += 8;
                v0 = (((((v15 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v15 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v15 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v15 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 ^ v9;
                v1 = (((((v16 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v16 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v16 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v16 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 ^ v10;
                sub_a6587c(&v0, a3);
                v9 = v0;
                v10 = v1;
                node += 8;
                *(unsigned int *)v13 = (((((v9 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v9 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v9 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v9 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                *(unsigned int *)&v13[4] = (((((v10 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v10 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v10 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v10 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                v5 = v14;
            } while (15 < (unsigned long long)i);
            v5 = v14;
        }
        switch (v5)
        {
        case 0:
            v27 = v9 >> 24;
            v30 = v10 >> 24;
            v31 = v10 >> 16;
            v32 = v10 >> 8;
            v26 = v10;
            v28 = v9 >> 16;
            v25 = v9;
            v29 = v9 >> 8;
            break;
        default:
            v17 = 0;
            v18 = iter + v5;
            if (v5 <= 3)
            {
                v19 = 0;
                if (v5 == 1)
                    goto LABEL_a65740;
                if (v5 == 2)
                    goto LABEL_a65738;
                if (v5 == 3)
                    goto LABEL_a65730;
            }
            else if (5 >= v5)
            {
                if (v5 == 4)
                    goto LABEL_a65728;
                v19 = 0;
                if (v5 == 5)
                    goto LABEL_a65720;
            }
            else if (v5 != 6)
            {
                v19 = 0;
                if (v5 != 7)
                    goto LABEL_a65748;
                v20 = v18 - 1;
                v17 = *((char *)v18 - 1) * 0x100;
                v18 = v20;
                goto LABEL_a65718;
            }
            else
            {
LABEL_a65718:
                v21 = v18 - 1;
                v17 |= *((char *)v18 - 1) * 0x10000;
                v18 = v21;
LABEL_a65720:
                v22 = v18 - 1;
                v17 |= *((char *)v18 - 1) * &_NSHomeDirectory;
                v18 = v22;
LABEL_a65728:
                v19 = v17;
                v17 = *((char *)v18 - 1);
                v18 -= 1;
LABEL_a65730:
                v23 = v18 - 1;
                v17 |= *((char *)v18 - 1) * 0x100;
                v18 = v23;
LABEL_a65738:
                v24 = v18 - 1;
                v17 |= *((char *)v18 - 1) * 0x10000;
                v18 = v24;
LABEL_a65740:
                v17 |= *((char *)v18 - 1) * &_NSHomeDirectory;
            }
LABEL_a65748:
            v0 = v17 ^ v9;
            v1 = v19 ^ v10;
            sub_a6587c(&v0, a3);
            v25 = v0;
            v26 = v1;
            v27 = v25 >> 24;
            v28 = v25 >> 16;
            v29 = v25 >> 8;
            v30 = v26 >> 24;
            v31 = v26 >> 16;
            v32 = v26 >> 8;
            *(unsigned int *)node = (((((v25 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v25 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v25 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v25 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            *(unsigned int *)&node[4] = (((((v26 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v26 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v26 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v26 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        }
        *(char *)a4 = v27;
        *(char *)&a4[1] = v28;
        *(char *)&a4[2] = v29;
        *(char *)&a4[3] = v25;
        *(char *)&a4[4] = v30;
        *(char *)&a4[5] = v31;
        *(char *)&a4[6] = v32;
    }
    else
    {
        v33 = arm64g_calculate_condition(180, a2, 8, 0);
        if (!(v33 & 1))
        {
            do
            {
                j = v5;
                v35 = node;
                v36 = j - 8;
                v37 = *(int *)iter;
                v38 = (int)iter[4];
                v39 = (((((v37 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v37 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v37 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v37 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                iter += 8;
                v40 = (((((v38 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v38 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v38 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v38 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                v0 = v39;
                v1 = v40;
                sub_a6587c(&v0, a3);
                v41 = v0 ^ v9;
                v42 = v1 ^ v10;
                *(char *)v35 = v41 >> 24;
                *(char *)&v35[1] = v41 >> 16;
                *(char *)&v35[2] = v41 >> 8;
                *(char *)&v35[3] = v41;
                *(char *)&v35[4] = v42 >> 24;
                *(char *)&v35[5] = v42 >> 16;
                *(char *)&v35[6] = v42 >> 8;
                node = v35 + 8;
                *(char *)&v35[7] = v42;
                v10 = v40;
                v9 = v39;
                v5 = v36;
            } while (15 < (unsigned long long)j);
            v10 = v40;
            v9 = v39;
            v5 = v36;
        }
        if (v5)
        {
            v43 = *(int *)iter;
            v44 = (((((v43 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v43 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v43 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v43 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v0 = v44;
            v45 = (int)iter[4];
            v26 = (((((v45 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v45 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v45 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v45 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v1 = v26;
            sub_a6587c(&v0, a3);
            v46 = v0 ^ v9;
            iter1 = node + v5;
            if (v5 > 3)
            {
                v48 = v1 ^ v10;
                if (5 >= v5)
                {
                    if (v5 == 4)
                        goto LABEL_a657ec;
                    if (v5 == 5)
                        goto LABEL_a657e4;
                }
                else if (v5 != 6)
                {
                    if (v5 != 7)
                        goto LABEL_a65808;
                    *((char *)iter1 - 1) = v48 >> 8;
                    iter1 -= 1;
                    goto LABEL_a657dc;
                }
                else
                {
LABEL_a657dc:
                    *((char *)iter1 - 1) = v48 >> 16;
                    iter1 -= 1;
LABEL_a657e4:
                    *((char *)iter1 - 1) = v48 >> 24;
                    iter1 -= 1;
LABEL_a657ec:
                    *((char *)iter1 - 1) = v46;
                    iter1 -= 1;
LABEL_a657f0:
                    *((char *)iter1 - 1) = v46 >> 8;
                    iter1 -= 1;
LABEL_a657f8:
                    *((char *)iter1 - 1) = v46 >> 16;
                    iter1 -= 1;
LABEL_a65800:
                    *((char *)iter1 - 1) = v46 >> 24;
                }
            }
            else
            {
                if (v5 == 1)
                    goto LABEL_a65800;
                if (v5 == 2)
                    goto LABEL_a657f8;
                if (v5 == 3)
                    goto LABEL_a657f0;
            }
        }
        else
        {
            v44 = v9;
            v26 = v10;
        }
LABEL_a65808:
        *(char *)a4 = v44 >> 24;
        *(char *)&a4[1] = v44 >> 16;
        *(char *)&a4[2] = v44 >> 8;
        *(char *)&a4[3] = v44;
        *(char *)&a4[4] = v26 >> 24;
        *(char *)&a4[5] = v26 >> 16;
        *(char *)&a4[6] = v26 >> 8;
    }
    *(char *)&a4[7] = v26;
    if (*(long long *)&g_10002b0 == v2)
        return;
    ___stack_chk_fail();
}
