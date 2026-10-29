/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fc404..0x9fc824 (1056 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fc404_0 {
    unsigned int field_0;
    unsigned int field_4;
} st_9fc404_0;

extern char _NSHomeDirectory;
extern char g_10002b0;

void sub_9fc404(void* a0, void* a1, long long a2, long long a3, void* a4, st_9fc404_0 *a5, unsigned int *a6, unsigned int a7)
{
    void* v6;  // x27
    long long v7;  // x20
    unsigned long v16;  // x19
    long long v17;  // x3
    long long i;  // x20
    void* v19;  // x27
    long long v20;  // x20
    void* v21;  // x23
    unsigned int v22;  // w8
    void* v23;  // x9
    unsigned int v24;  // w10
    void* v25;  // x9
    void* iter;  // x21
    void* v26;  // x9
    void* v27;  // x9
    void* v28;  // x9
    void* v29;  // x9
    void* v30;  // x9
    char v31;  // x8
    char v32;  // x9
    char v33;  // x10
    char v34;  // x12
    char v35;  // x13
    void* node;  // x23
    char v36;  // x11
    long long v37;  // x3
    long long j;  // x20
    void* v39;  // x22
    long long v40;  // x20
    unsigned int v41;  // w24
    unsigned int v42;  // w28
    unsigned int v43;  // w8
    unsigned int v44;  // w9
    unsigned int v45;  // w24
    unsigned long v10;  // x12
    unsigned int v46;  // w23
    unsigned int v47;  // w8
    void* iter1;  // x9
    unsigned int v49;  // w10
    unsigned int v11;  // w25
    unsigned int v12;  // w8
    unsigned int v13;  // w26
    unsigned int v14;  // w24
    unsigned int v15;  // w28
    unsigned int v0;  // [bp-0x74]
    unsigned int v1;  // [bp-0x70]
    unsigned int v2;  // [bp-0x6c]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a4;
    v7 = a2;
    iter = a1;
    node = a0;
    v3 = *(long long *)&g_10002b0;
    v10 = a5->field_0;
    v11 = a5->field_4;
    v12 = *a6;
    v13 = a6[1];
    v14 = *(int *)a4;
    v15 = (int)a4[4];
    v0 = v12;
    v16 = v10;
    if (a7)
    {
        if (v7 >= 8)
        {
            v17 = a3;
            do
            {
                i = v7;
                v19 = iter;
                v20 = i - 8;
                v21 = node + 8;
                v1 = v14 ^ (unsigned int)v10 ^ *(int *)node;
                v2 = v15 ^ v11 ^ (int)node[4];
                sub_9f96d4(&v1, v17, 1);
                v10 = v16;
                v17 = a3;
                v14 = v1 ^ v0;
                v15 = v2 ^ v13;
                iter += 8;
                *(unsigned int *)v19 = v14;
                *(unsigned int *)&v19[4] = v15;
                node = v21;
                v7 = v20;
            } while (15 < (unsigned long long)i);
            node = v21;
            v7 = v20;
            a3 = v17;
        }
        switch (v7)
        {
        case 0:
            v31 = v14 >> 8;
            v32 = v14 >> 16;
            v33 = v14 >> 24;
            v34 = v15 >> 8;
            v35 = v15 >> 16;
            v36 = v15 >> 24;
            break;
        default:
            v22 = 0;
            v23 = node + v7;
            if (v7 <= 3)
            {
                v24 = 0;
                if (v7 == 1)
                    goto LABEL_9fc6d8;
                if (v7 == 2)
                    goto LABEL_9fc6d0;
                if (v7 == 3)
                    goto LABEL_9fc6c8;
            }
            else if (5 >= v7)
            {
                if (v7 == 4)
                    goto LABEL_9fc6bc;
                v24 = 0;
                if (v7 == 5)
                    goto LABEL_9fc6b4;
            }
            else if (v7 != 6)
            {
                v24 = 0;
                if (v7 != 7)
                    goto LABEL_9fc6e0;
                v25 = v23 - 1;
                v22 = *((char *)v23 - 1) * 0x10000;
                v23 = v25;
                goto LABEL_9fc6ac;
            }
            else
            {
LABEL_9fc6ac:
                v26 = v23 - 1;
                v22 |= *((char *)v23 - 1) * 0x100;
                v23 = v26;
LABEL_9fc6b4:
                v27 = v23 - 1;
                v22 |= *((char *)v23 - 1);
                v23 = v27;
LABEL_9fc6bc:
                v24 = v22;
                v28 = v23 - 1;
                v22 = *((char *)v23 - 1) * &_NSHomeDirectory;
                v23 = v28;
LABEL_9fc6c8:
                v29 = v23 - 1;
                v22 |= *((char *)v23 - 1) * 0x10000;
                v23 = v29;
LABEL_9fc6d0:
                v30 = v23 - 1;
                v22 |= *((char *)v23 - 1) * 0x100;
                v23 = v30;
LABEL_9fc6d8:
                v22 |= *((char *)v23 - 1);
            }
LABEL_9fc6e0:
            v1 = (unsigned int)v10 ^ v14 ^ v22;
            v2 = v11 ^ v24 ^ v15;
            sub_9f96d4(&v1, a3, 1);
            v14 = v1 ^ v0;
            v31 = v14 >> 8;
            v32 = v14 >> 16;
            v33 = v14 >> 24;
            v15 = v2 ^ v13;
            v34 = v15 >> 8;
            v35 = v15 >> 16;
            v36 = v15 >> 24;
            *(unsigned int *)iter = v14;
            *(unsigned int *)&iter[4] = v15;
        }
        *(char *)v6 = v14;
        *(char *)&v6[1] = v31;
        *(char *)&v6[2] = v32;
        *(char *)&v6[3] = v33;
        *(char *)&v6[4] = v15;
        *(char *)&v6[5] = v34;
        *(char *)&v6[6] = v35;
    }
    else
    {
        if (v7 >= 9)
        {
            v37 = a3;
            do
            {
                j = v7;
                v39 = iter;
                v40 = j - 8;
                v41 = *(int *)node;
                v42 = (int)node[4];
                node += 8;
                v1 = v41 ^ v0;
                v2 = v42 ^ v13;
                sub_9f96d4(&v1, v37, 0);
                v37 = a3;
                v43 = v14 ^ (unsigned int)v16 ^ v1;
                v44 = v15 ^ v11 ^ v2;
                *(char *)v39 = v43;
                *(char *)&v39[1] = v43 >> 8;
                *(char *)&v39[2] = v43 >> 16;
                *(char *)&v39[3] = v43 >> 24;
                *(char *)&v39[4] = v44;
                *(char *)&v39[5] = v44 >> 8;
                *(char *)&v39[6] = v44 >> 16;
                iter = v39 + 8;
                *(char *)&v39[7] = v44 >> 24;
                v15 = v42;
                v14 = v41;
                v7 = v40;
            } while (16 < (unsigned long long)j);
            v15 = v42;
            v14 = v41;
            v7 = v40;
            v12 = v0;
            v10 = v16;
            a3 = v37;
        }
        else if (!v7)
        {
            goto LABEL_9fc7b0;
        }
        v45 = *(int *)node;
        v46 = (int)node[4];
        v1 = v45 ^ v12;
        v2 = v46 ^ v13;
        sub_9f96d4(&v1, a3, 0);
        v47 = v1 ^ v14 ^ (unsigned int)v10;
        iter1 = iter + v7;
        if (4 < v7)
        {
            v49 = v2 ^ v15 ^ v11;
            if (6 >= v7)
            {
                if (v7 == 5)
                    goto LABEL_9fc78c;
                if (v7 == 6)
                    goto LABEL_9fc784;
            }
            else
            {
                if (v7 != 7)
                {
                    if (v7 != 8)
                        goto LABEL_9fc7ac;
                    *((char *)iter1 - 1) = v49 >> 24;
                    iter1 -= 1;
                    goto LABEL_9fc77c;
                }
                else
                {
LABEL_9fc77c:
                    *((char *)iter1 - 1) = v49 >> 16;
                    iter1 -= 1;
LABEL_9fc784:
                    *((char *)iter1 - 1) = v49 >> 8;
                    iter1 -= 1;
LABEL_9fc78c:
                    *((char *)iter1 - 1) = v49;
                    iter1 -= 1;
LABEL_9fc790:
                    *((char *)iter1 - 1) = v47 >> 24;
                    iter1 -= 1;
LABEL_9fc798:
                    *((char *)iter1 - 1) = v47 >> 16;
                    iter1 -= 1;
LABEL_9fc7a0:
                    *((char *)iter1 - 1) = v47 >> 8;
                    iter1 -= 1;
LABEL_9fc7a8:
                    *((char *)iter1 - 1) = v47;
                }
            }
        }
        else if (2 >= v7)
        {
            if (v7 == 1)
                goto LABEL_9fc7a8;
            if (v7 == 2)
                goto LABEL_9fc7a0;
        }
        else
        {
            if (v7 == 3)
                goto LABEL_9fc798;
            if (v7 == 4)
                goto LABEL_9fc790;
        }
LABEL_9fc7ac:
        v15 = v46;
        v14 = v45;
LABEL_9fc7b0:
        *(char *)v6 = v14;
        *(char *)&v6[1] = v14 >> 8;
        *(char *)&v6[2] = v14 >> 16;
        *(char *)&v6[3] = v14 >> 24;
        *(char *)&v6[4] = v15;
        *(char *)&v6[5] = v15 >> 8;
        v36 = v15 >> 24;
        *(char *)&v6[6] = v15 >> 16;
    }
    *(char *)&v6[7] = v36;
    if (*(long long *)&g_10002b0 == v3)
        return;
    ___stack_chk_fail();
}
