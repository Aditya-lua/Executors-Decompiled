/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc660f0..0xc663e0 (752 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c660f0_1 {
    char padding_0[64];
    struct st_c660f0_0 *field_40;
} st_c660f0_1;

typedef struct st_c660f0_0 {
    char padding_0[16];
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[8];
    unsigned long long field_28;
    char padding_30[40];
    char field_58;
} st_c660f0_0;

extern char g_10002b0;

unsigned long long sub_c660f0(st_c660f0_1 *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5)
{
    unsigned long long v7;  // x19
    unsigned long long iter;  // x22
    unsigned long long i;  // x21
    unsigned long long v18;  // x11
    unsigned long long n;  // x26
    unsigned long long v20;  // x10
    unsigned long long v21;  // x24
    unsigned long long v22;  // 4102
    unsigned long long v23;  // x20
    unsigned long long v24;  // x21
    unsigned long long v25;  // x21
    unsigned long long n1;  // x23
    st_c660f0_0 *v9;  // x28
    unsigned long long v27;  // x0
    unsigned long long v28;  // x10
    unsigned long long v29;  // x11
    unsigned long long v30;  // x12
    unsigned long long v31;  // x12
    unsigned long long v32;  // x13
    st_c660f0_0 *v10;  // x27
    unsigned long long v11;  // x20
    unsigned long node;  // x9
    unsigned long v13;  // x8
    unsigned long long v14;  // x10
    unsigned long long iter1;  // x25
    unsigned long long v16;  // x21
    unsigned long long v0;  // [bp-0x170]
    unsigned long v1;  // [bp-0x168]
    char v2;  // [bp-0x150]
    char v3;  // [bp-0x148]
    unsigned long v4;  // [bp-0x70]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a2;
    iter = a1;
    v4 = *(long long *)&g_10002b0;
    v9 = a0->field_40;
    if (!a5)
        sub_9d3d58(a0, 15);
    if (!*(int *)&a0->padding_0[40])
    {
        v7 = 0xffffffffffffff88;
    }
    else if (v9 && !(v10 = v9, *(long long *)&v10->padding_0[0] && !(v10 = *(long long *)(*(long long *)&v9->padding_0[0] + 64), *(long long *)(*(long long *)&v9->padding_0[0] + 64))))
    {
        if (!*(long long *)&v10->padding_0[8])
            goto LABEL_c66394;
        if (!iter && v7)
        {
            v7 = 0xffffffffffffff83;
        }
        else if (a3 && !(v9->field_58 >> 1 & 1))
        {
            v7 = 0xffffffffffffff91;
        }
        else
        {
            v11 = 0;
            node = v10->field_28;
            v13 = v10->field_10;
            v14 = v10->field_18;
            v0 = v14;
            v1 = node;
            iter1 = &v2;
            v16 = 224;
            do
            {
                i = v16;
                sub_9d812c();
                if (!v18)
                    break;
                if (v18 < i)
                    n = v18;
                else
                    n = i;
                if (iter1)
                {
                    _memcpy(iter1, *(long long *)&v10->padding_0[8] + node, n);
                    v13 = v10->field_10;
                    node = v10->field_28;
                    v14 = v13 - node;
                    if (v14 >= n)
                    {
                        v14 = v10->field_18 - n;
                        if (v10->field_18 >= n)
                        {
                            node += n;
                            sub_9d80e4();
                            v10->field_18 = v14;
                        }
                    }
                    iter1 += n;
                }
                else
                {
                    node += n;
                    sub_9d80e4();
                    v14 -= n;
                    v10->field_18 = v14;
                }
                v11 += n;
                v16 = i - n;
            } while (i != n);
            switch (v11)
            {
            case 0:
                if (!a5)
                {
                    sub_9d3d74(a0, 9);
                    goto LABEL_c66284;
                }
                break;
            case 224:
                v20 = v2;
                v21 = v20 - v7;
                if (v7 > v20)
                {
                    v21 = 0;
                    v7 = v20;
                    goto LABEL_c66290;
                }
                v22 = arm64g_calculate_condition(148, v20, v7, 0);
                if (!(v22 & 1))
                {
                    v20 = v9->field_58;
                    if (!(v20 & 1))
                        goto LABEL_c66290;
                    v10->field_28 = v1;
                    v10->field_18 = v0;
LABEL_c66284:
                    v7 = 0xffffffffffffff90;
                    break;
                }
                else
                {
                    v21 = 0;
LABEL_c66290:
                    v23 = 0;
                    if (v7)
                    {
                        v24 = v7;
                        do
                        {
                            v25 = v24;
                            sub_9d812c();
                            if (!v18)
                                break;
                            if (v18 < v25)
                                n1 = v18;
                            else
                                n1 = v25;
                            if (iter)
                            {
                                _memcpy(iter, *(long long *)&v10->padding_0[8] + node, n1);
                                v13 = v10->field_10;
                                node = v10->field_28;
                                v20 = v13 - node;
                                if (v20 >= n1)
                                {
                                    v20 = v10->field_18 - n1;
                                    if (v10->field_18 >= n1)
                                    {
                                        node += n1;
                                        sub_9d80e4();
                                        v10->field_18 = v20;
                                    }
                                }
                                iter += n1;
                            }
                            else
                            {
                                node += n1;
                                sub_9d80e4();
                                v20 -= n1;
                                v10->field_18 = v20;
                            }
                            v23 += n1;
                            v24 = v25 - n1;
                        } while (v25 != n1);
                    }
                    if (v23 != v7)
                        goto LABEL_c66394;
                    v27 = a3;
                    if (v21)
                    {
                        v28 = 0;
                        v29 = v10->field_18;
                        v30 = v21;
                        do
                        {
                            v31 = v30;
                            v32 = v13 - node;
                            if (v32 >= v29)
                                v32 = v29;
                            if (!v32)
                                break;
                            if (v32 >= v31)
                                v32 = v31;
                            node += v32;
                            v27 = sub_9d80e4();
                            v29 -= v32;
                            v10->field_18 = v29;
                            v28 += v32;
                            v30 = v31 - v32;
                        } while (v31 != v32);
                        if (v28 == v21)
                            goto LABEL_c6636c;
                        goto LABEL_c66394;
                    }
                    else
                    {
LABEL_c6636c:
                        if (v27)
                            sub_9d8114();
                        if (a4)
                        {
                            sub_9d8114(a4, &v3);
                            break;
                        }
                    }
                }
                break;
            default:
                v7 = 0xffffffffffffff84;
                break;
            }
        }
    }
    else
    {
LABEL_c66394:
        v7 = 0xffffffffffffff98;
    }
    if (*(long long *)&g_10002b0 == v4)
        return v7;
    ___stack_chk_fail();
}
