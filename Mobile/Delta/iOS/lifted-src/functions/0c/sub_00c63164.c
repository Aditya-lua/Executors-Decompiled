/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc63164..0xc633b0 (588 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c63164_0 {
    char padding_0[44];
    unsigned long long field_2c;
    char padding_34[28];
    unsigned long long field_50;
    unsigned long long field_58;
    unsigned long long field_60;
    unsigned long long field_68;
} st_c63164_0;


unsigned long long sub_c63164(st_c63164_0 *a0, long long iter, unsigned long long a2, unsigned long long *a3, unsigned long long *a4, unsigned long long a5)
{
    unsigned long long *v7;  // x19
    unsigned long long *v8;  // x20
    unsigned long long v17;  // x9
    unsigned long long v18;  // x8
    unsigned long long v19;  // x23
    unsigned long long v20;  // x25
    unsigned long long v21;  // x22
    unsigned long long v22;  // x19
    unsigned long long v23;  // x8
    unsigned long long v24;  // x9
    unsigned long long v25;  // x20
    unsigned long long v26;  // x10
    unsigned long long v9;  // x28
    unsigned long long v27;  // x23
    unsigned long long v10;  // x19
    unsigned long long v11;  // x20
    unsigned long long v12;  // x8
    unsigned long long v13;  // x9
    unsigned long long v14;  // x27
    unsigned long long v15;  // x26
    unsigned long long v16;  // x8
    unsigned long long v0;  // [bp-0x84]
    unsigned long long v1;  // [bp-0x80]
    unsigned long long v2;  // [bp-0x78]
    unsigned long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a4;
    v8 = a3;
    v4 = 0;
    v0 = 0;
    if (sub_987f90(sub_986448()))
    {
        v9 = 0;
        do
        {
            v10 = v2;
            v11 = v3 - v10;
            if (v11 > a2)
            {
                v0 = 0;
                v11 = a2;
            }
            if (!v11)
                break;
            if (!v1)
            {
                if (a0->field_58 <= v10 || v10 < a0->field_60 || !(v12 = a0->field_50, v13 = v10 - v12 * v10 / v12, v1 = *(long long *)&a0->padding_34[24] + v13, *(long long *)&a0->padding_34[24]))
                    return 0;
                v14 = v12 - v13;
                v15 = v11 - v14;
                if (v11 <= v14)
                    goto LABEL_c6327c;
                _memcpy(iter);
                v16 = v2 + v14;
                if (a0->field_58 > v16 && v16 >= a0->field_60)
                {
                    v17 = a0->field_50;
                    v18 = v16 - v17 * v16 / v17;
                    v1 = *(long long *)&a0->padding_34[24] + v18;
                    if (!*(long long *)&a0->padding_34[24])
                    {
                        return 0;
                    }
                    else if (v17 - v18 > v15)
                    {
                        a2 -= v14;
                        iter += v14;
                        v9 += v14;
                        goto LABEL_c63280;
                    }
                    else
                    {
                        return 0;
                    }
                }
                return 0;
            }
LABEL_c6327c:
            v15 = v11;
LABEL_c63280:
            v19 = a2;
            _memcpy(iter);
            v9 += v15;
            a2 = v19 - v15;
        } while (v19 != v15 && (iter += v15, sub_986448(), sub_987f90(a0)));
        v20 = 1;
        if (a5 && !(v21 = v11 + v10, !v21))
        {
            v20 = sub_c63580(a0, v21);
            v22 = v21 - 1;
            if (v22 <= 0x3fffffffffffffff)
            {
                if (*(int *)&(a0->padding_0)[1])
                {
                    v23 = a0->field_50;
                    if (v23)
                    {
                        v24 = a0->field_60;
                        if (v22 > v24)
                        {
                            v25 = v24 - v23 * v24 / v23;
                            v26 = a0->field_58;
                            if (v22 < a0->field_58)
                                v26 = v21;
                            v27 = v26 - v24;
                            if (v27 > v23 - v25)
                            {
                                sub_a66ec0(*(long long *)&a0->padding_34[24] + v25);
                                v27 = v27 + v25 - a0->field_50;
                                v25 = 0;
                            }
                            if (v27)
                                sub_a66ec0(*(long long *)&a0->padding_34[24] + v25, v27);
                        }
                    }
                }
                a0->field_60 = v21;
                if (v22 >= a0->field_58)
                    a0->field_58 = v21;
            }
            if (!(unsigned int)v20)
                return v20;
        }
        else
        {
            v8 = v8;
            v7 = v7;
        }
    }
    else
    {
        v9 = 0;
        v20 = 1;
    }
    *v8 = v9;
    *(unsigned int *)v7 = v0;
    return v20;
}
