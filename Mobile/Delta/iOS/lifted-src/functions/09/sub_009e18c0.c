/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e18c0..0x9e1bdc (796 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e18c0_1 {
    void* field_0;
    int field_8;
    int field_c;
} st_9e18c0_1;

typedef struct st_9e18c0_0 {
    void* field_0;
    int field_8;
    unsigned int field_c;
    unsigned int field_10;
} st_9e18c0_0;


unsigned long long sub_9e18c0(st_9e18c0_0 *a0, long long a1, long long a2, long long a3)
{
    long long v2;  // x23
    st_9e18c0_0 *v3;  // x20
    unsigned long long v12;  // x9
    unsigned long long v13;  // x11
    unsigned long long v14;  // x13
    unsigned long long v15;  // x14
    unsigned long long v16;  // x13
    unsigned long long v17;  // x9
    unsigned long long v18;  // x23
    unsigned long long j;  // w8
    unsigned long long v20;  // x10
    unsigned long long v21;  // w8
    st_9e18c0_0 *v4;  // x0
    unsigned int v23;  // w8
    unsigned int v25;  // w24
    unsigned int v26;  // w0
    unsigned long long v27;  // 4112
    unsigned long long k;  // w26
    unsigned long long v29;  // w27
    unsigned long long v30;  // w26
    unsigned long long v31;  // w28
    unsigned long long v5;  // x0
    unsigned long long v32;  // x24
    unsigned long long v33;  // w8
    unsigned long long v34;  // x20
    long long v6;  // x21
    unsigned long long v7;  // x0
    st_9e18c0_1 *v8;  // x22
    unsigned long v9;  // x12
    unsigned long long i;  // x10
    unsigned long long v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    v3 = a0;
    if (sub_9e4828(a2))
    {
        a2 = v2;
        v4 = v3;
    }
    else if (sub_9e4828(v2))
    {
        v4 = v3;
    }
    else
    {
        sub_9de064(a3);
        v6 = sub_9de208(a3);
        v7 = sub_9de208(a3);
        if (v7 && (v8 = v7, sub_9ea45c() && sub_9ea45c(v3, v2)))
        {
            v9 = v3->field_c;
            if ((int)v9 >= 1)
            {
                i = 0;
                v11 = 0;
                v12 = 0;
                v13 = v8->field_c & ~(v8->field_c >> 31);
                v14 = 1;
                do
                {
                    if (((v13 * 8 | v13 >> 61) & 0x7fffffff8) == i)
                        break;
                    v15 = *(long long *)((char *)v8->field_0 + i) | *(long long *)((char *)v3->field_0 + i);
                    if (!v15)
                        v16 = v14;
                    else
                        v16 = 0;
                    v11 += v16;
                    v12 = ~((long long)(v14 - 1 & ~v14) >> 63) & v15 | (long long)(v14 - 1 & ~v14) >> 63 & v12;
                    i += 8;
                    v14 = v16;
                } while (v9 * 8 != i);
                v17 = ~v12;
                v18 = (unsigned int)v11 * 64;
            }
            else
            {
                v18 = 0;
                v17 = 0xffffffffffffffff;
            }
            j = 64;
            v20 = 1;
            do
            {
                v21 = j;
                v20 &= v17;
                v18 += v20;
                v17 >>= 1;
                j = v21 - 1;
            } while (j);
            if (sub_9ea8ac(v3, v3, v18) && sub_9ea8ac(v8, v8, v18))
            {
                v23 = v3->field_8;
                if (v8->field_8 >= v3->field_8)
                    v23 = v8->field_8;
                if (sub_9e4cdc() && sub_9e4cdc(v8, v23 + 1) && sub_9e4cdc(v6, v23 + 1))
                {
                    sub_9e5980(~*(int *)v3->field_0 & 1, v3, v8, v23 + 1);
                    v25 = sub_9e46a8(v3);
                    v26 = sub_9e46a8(v8);
                    if ((int)v26 >= (int)v25)
                        v25 = v26;
                    v27 = arm64g_calculate_condition(177, v25, 1, 0);
                    if (!(v27 & 1))
                    {
                        k = (v25 * 3 + 3 & ~((int)(v25 * 3 + 3) >> 31)) + 1;
                        v29 = 1;
                        do
                        {
                            v30 = k;
                            v31 = -v29;
                            v32 = *(int *)v8->field_0 & v31 >> 31 & ~((unsigned int)(v8->field_8 - 1) >> 31);
                            v3->field_10 = (unsigned int)v32 ^ v3->field_10;
                            sub_9e5980(v32, v3, v8, v23 + 1);
                            if (!(sub_9db29c(v6, v8, v3)) || !(sub_9e5980(*(int *)v8->field_0 & ~((unsigned int)(v8->field_8 - 1) >> 31) & 1, v8, v6, v23 + 1), sub_9ea50c(v8, v8)))
                                goto LABEL_9e1bc8;
                            if (!(unsigned int)v32)
                                v33 = v29;
                            else
                                v33 = 0;
                            v29 = (v33 | -(unsigned int)v32 & v31) + 1;
                            k = v30 - 1;
                        } while (k);
                        goto LABEL_9e1b98;
                    }
                    else
                    {
LABEL_9e1b98:
                        v3->field_10 = 0;
                        if (sub_9ea668(v3, v3, v18))
                        {
                            v34 = sub_9ea50c(v3, v3) != 0;
                            sub_9de17c(a3);
                            return v34;
                        }
                    }
                }
            }
        }
LABEL_9e1bc8:
        sub_9de17c(a3);
        return 0;
    }
    v5 = sub_9e4c34(v4, a2) != 0;
    v3->field_10 = 0;
    return v5;
}
