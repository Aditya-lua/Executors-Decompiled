/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac290c..0xac2a74 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac290c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned int field_28;
    char padding_2c[4];
    unsigned int field_30;
    char padding_34[4];
    unsigned long long field_38;
} st_ac290c_0;


st_ac290c_0 * sub_ac290c(st_ac290c_0 *a0, unsigned long long *iter, unsigned long long a2)
{
    unsigned long v2;  // x24
    unsigned long v3;  // x25
    unsigned int v12;  // w9
    unsigned long long v13;  // x10
    unsigned long v14;  // x11
    unsigned long long v15;  // x12
    unsigned long v16;  // x13
    unsigned long long v17;  // x10
    unsigned int v19;  // w20
    unsigned long long *v20;  // x8
    unsigned int v21;  // w9
    unsigned long v4;  // x22
    unsigned int k;  // w11
    unsigned int v23;  // w11
    unsigned long long v24;  // x12
    unsigned long v25;  // x13
    unsigned long long v26;  // x14
    unsigned long v27;  // x15
    unsigned long long v28;  // x12
    unsigned long v5;  // x23
    unsigned long v6;  // x8
    st_ac290c_0 *dst;  // x0
    unsigned long long v8;  // x20
    long long ptr;  // x0
    st_ac290c_0 *dst1;  // x0
    unsigned int i;  // w9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_10;
    v3 = a0->field_18;
    v4 = a0->field_20;
    v5 = a0->field_8;
    a0->field_0 = a0->field_0 + a2;
    v6 = a0->field_28;
    dst = a0;
    if ((unsigned int)v6)
    {
        v8 = 8 - (unsigned int)v6;
        ptr = (char *)a0 + v6 + 56;
        if (v8 > a2)
        {
            dst1 = _memcpy(ptr);
            a0->field_28 = a0->field_28 + (unsigned int)a2;
            return dst1;
        }
        dst = _memcpy(ptr);
        iter = (char *)iter + v8;
        v4 ^= a0->field_38;
        i = a0->field_30;
        if (a0->field_30)
        {
            do
            {
                v12 = i;
                v13 = v2 + v5;
                v14 = v13 ^ __ROL__(v2, 13);
                v15 = v4 + v3;
                v16 = v15 ^ __ROL__(v4, 16);
                v5 = v16 + __ROL__(v13, 32);
                v4 = v5 ^ __ROL__(v16, 21);
                v17 = v15 + v14;
                v2 = v17 ^ __ROL__(v14, 0x11);
                v3 = __ROL__(v17, 32);
                i = v12 - 1;
            } while (i);
        }
        v5 ^= a0->field_38;
        a2 -= v8;
    }
    v19 = (unsigned int)a2 & 7;
    v20 = (char *)iter + a2 - (a2 & 7);
    if (iter != v20)
    {
        v21 = a0->field_30;
        do
        {
            v4 ^= *iter;
            if (a0->field_30)
            {
                k = v21;
                do
                {
                    v23 = k;
                    v24 = v2 + v5;
                    v25 = v24 ^ __ROL__(v2, 13);
                    v26 = v4 + v3;
                    v27 = v26 ^ __ROL__(v4, 16);
                    v5 = v27 + __ROL__(v24, 32);
                    v4 = v5 ^ __ROL__(v27, 21);
                    v28 = v26 + v25;
                    v2 = v28 ^ __ROL__(v25, 0x11);
                    v3 = __ROL__(v28, 32);
                    k = v23 - 1;
                } while (k);
            }
            v5 ^= *iter;
            iter += 1;
        } while (iter != v20);
    }
    if (v19)
        dst = _memcpy(&a0->field_38, v20);
    a0->field_28 = v19;
    a0->field_8 = v5;
    a0->field_10 = v2;
    a0->field_18 = v3;
    a0->field_20 = v4;
    return dst;
}
