/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc57afc..0xc57ce4 (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c57afc_0 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_c57afc_0;

typedef struct st_c57afc_1 {
    char padding_0[1];
    char field_1;
} st_c57afc_1;


void* sub_c57afc(void* a0, st_c57afc_0 *a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v0;  // x11
    unsigned long long v1;  // x10
    unsigned long long v10;  // x13
    unsigned long long v12;  // x9
    unsigned long long v13;  // w15
    unsigned long long v14;  // x16
    unsigned long long v15;  // x5
    st_c57afc_1 *v16;  // x4
    unsigned long v17;  // x7
    char *v18;  // x4
    unsigned long long v19;  // x6
    unsigned long long iter;  // x12
    unsigned long long v20;  // x14
    unsigned long long v22;  // x13
    unsigned long long v23;  // w15
    unsigned long long v24;  // x11
    unsigned long long v25;  // x10
    unsigned long v26;  // x12
    unsigned long long v27;  // 4118
    unsigned long long v3;  // x8
    unsigned long long v4;  // w14
    unsigned long long v5;  // x9
    unsigned long long v6;  // x17
    unsigned long long v7;  // x15
    char *v8;  // x13
    unsigned long v9;  // x16

    v0 = a1->field_0;
    v1 = a1->field_8;
    if (!v1)
    {
        *(char *)&a0[8] = 19;
        memset(a0 + 9, 0, 7);
        *(unsigned long long *)&a0[16] = v0;
        *(unsigned long long *)a0 = 46;
        return a0;
    }
    iter = 0;
    v3 = 0;
    v4 = 0;
    v5 = v0 + v1;
    v6 = v1;
    while (1)
    {
        v7 = v6 - 1;
        v8 = v0 + iter;
        v9 = *v8;
        v10 = v8 + 1;
        if (v4 == 63 && 1 < (unsigned int)v9)
        {
            a1->field_0 = v10;
            a1->field_8 = v7;
            *(char *)&a0[8] = 6;
            memset(a0 + 9, 0, 7);
            *(unsigned long long *)&a0[16] = v5;
            *(unsigned long long *)a0 = 46;
            return a0;
        }
        v3 |= (v9 & 127) << ((char)v4 & 63);
        if (!(v9 >> 7 & 1))
            break;
        v4 += 7;
        iter += 1;
        v6 = v7;
        if (v1 == iter)
        {
            a1->field_0 = v5;
            a1->field_8 = 0;
            *(char *)&a0[8] = 19;
            memset(a0 + 9, 0, 7);
            *(unsigned long long *)&a0[16] = v5;
            *(unsigned long long *)a0 = 46;
            return a0;
        }
    }
    a1->field_0 = v10;
    a1->field_8 = v7;
    if (v7)
    {
        v12 = 0;
        v13 = 0;
        v14 = -iter;
        v10 = v0 + iter + v6;
        do
        {
            v15 = v1 + v14;
            v16 = v0 + iter;
            v17 = v16->field_1;
            v18 = &v16->field_1;
            v19 = v15 - 2;
            v20 = v18 + 1;
            if (v13 == 63 && 1 < (unsigned int)v17)
            {
                a1->field_0 = v20;
                a1->field_8 = v19;
                *(char *)&a0[8] = 6;
                memset(a0 + 9, 0, 7);
                *(unsigned long long *)&a0[16] = v10;
                *(unsigned long long *)a0 = 46;
                return a0;
            }
            v12 |= (v17 & 127) << ((char)v13 & 63);
            if (!(v17 >> 7 & 1))
            {
                a1->field_0 = v20;
                a1->field_8 = v19;
                if (v19)
                {
                    v22 = 0;
                    v23 = 0;
                    v24 = v0 + iter + 3;
                    v25 = v1 - iter - 3;
                    v20 = v18 + v15 - 1;
                    do
                    {
                        v26 = *(char *)(v24 - 1);
                        if (v23 == 63 && 1 < (unsigned int)v26)
                        {
                            a1->field_0 = v24;
                            a1->field_8 = v25;
                            *(char *)&a0[8] = 6;
                            memset(a0 + 9, 0, 7);
                            *(unsigned long long *)&a0[16] = v20;
                            *(unsigned long long *)a0 = 46;
                            return a0;
                        }
                        v22 |= (v26 & 127) << ((char)v23 & 63);
                        if (!(v26 >> 7 & 1))
                        {
                            a1->field_0 = v24;
                            a1->field_8 = v25;
                            *(unsigned long long *)&a0[72] = 0;
                            *(unsigned long long *)&a0[80] = 0;
                            *(unsigned long long *)a0 = 31;
                            *(unsigned long *)&a0[8] = a2;
                            *(unsigned long long *)&a0[16] = a3;
                            *(unsigned long long *)&a0[24] = 46;
                            *(unsigned long long *)&a0[48] = v3;
                            *(unsigned long long *)&a0[56] = v12;
                            *(unsigned long long *)&a0[64] = v22;
                            return a0;
                        }
                        v24 += 1;
                        v23 += 7;
                        v25 -= 1;
                        v27 = arm64g_calculate_condition(18, v25, 1, 0);
                    } while (v27 & 1);
                    a1->field_0 = v20;
                    a1->field_8 = 0;
                }
                *(char *)&a0[8] = 19;
                memset(a0 + 9, 0, 7);
                *(unsigned long long *)&a0[16] = v20;
                *(unsigned long long *)a0 = 46;
                return a0;
            }
            v13 += 7;
            iter += 1;
            v14 -= 1;
        } while (v1 - 1 != iter);
        a1->field_0 = v10;
        a1->field_8 = 0;
    }
    *(char *)&a0[8] = 19;
    memset(a0 + 9, 0, 7);
    *(unsigned long long *)&a0[16] = v10;
    *(unsigned long long *)a0 = 46;
    return a0;
}
