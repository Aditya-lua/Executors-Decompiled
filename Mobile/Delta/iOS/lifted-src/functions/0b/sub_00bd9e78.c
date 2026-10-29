/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd9e78..0xbda060 (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd9e78_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[16];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
} st_bd9e78_0;


st_bd9e78_0 * sub_bd9e78(st_bd9e78_0 *a0, void* a1, unsigned long long a2)
{
    unsigned long long v0;  // x9
    unsigned long long i;  // x8
    unsigned long v10;  // x9
    unsigned long long v11;  // x13
    unsigned long long v12;  // x12
    unsigned long long v13;  // x10
    unsigned long long v14;  // x9
    unsigned long long v15;  // x10
    unsigned long long v16;  // x10
    unsigned long long v17;  // x11
    unsigned long long v18;  // x13
    unsigned long long v19;  // x14
    unsigned long long v2;  // x11
    unsigned long long v20;  // x12
    unsigned long v21;  // x13
    unsigned long long v22;  // x14
    unsigned long v23;  // x11
    unsigned long long v24;  // x12
    unsigned long v25;  // x13
    unsigned long long v26;  // x12
    unsigned long long v27;  // x14
    unsigned long v28;  // x10
    unsigned long long v29;  // x11
    unsigned long v3;  // x10
    unsigned long long v4;  // x12
    unsigned long long v5;  // x10
    unsigned long v6;  // x9
    unsigned long long v7;  // x12
    unsigned long long v8;  // x13
    unsigned long v9;  // x11

    a0->field_30 = a0->field_30 + a2;
    v0 = a0->field_40;
    if (v0)
    {
        i = 8 - v0;
        if (i < a2)
            v2 = i;
        else
            v2 = a2;
        if (i >= 4)
        {
            v3 = *(int *)a1;
            v4 = 4;
            if (5 < v2)
                goto LABEL_bd9f08;
        }
        else
        {
            v4 = 0;
            v3 = 0;
            if (v2 > 1)
            {
LABEL_bd9f08:
                v3 |= *(short *)((char *)a1 + v4) << ((char)v4 * 8 & 63);
                v4 |= 2;
            }
        }
        if (v2 > v4)
            v3 |= *((char *)a1 + v4) << ((char)v4 * 8 & 63);
        v5 = a0->field_38 | v3 << (((char)v0 * 8 | (char)(v0 >> 61)) & 56 & 63);
        a0->field_38 = v5;
        if (i > a2)
        {
            a0->field_40 = v0 + a2;
            return a0;
        }
        v6 = a0->field_18 ^ v5;
        v7 = a0->field_10 + a0->field_0;
        v8 = a0->field_8 + v6;
        v9 = v7 ^ __ROL__(a0->field_10, 13);
        v10 = v8 ^ __ROL__(v6, 16);
        v11 = v8 + v9;
        v12 = v10 + __ROL__(v7, 32);
        a0->field_10 = v11 ^ __ROL__(v9, 0x11);
        a0->field_18 = v12 ^ __ROL__(v10, 21);
        a0->field_0 = v12 ^ v5;
        a0->field_8 = __ROL__(v11, 32);
        v13 = a2 - i;
        v14 = v13 & 7;
        v15 = v13 & 0xfffffffffffffff8;
        if (v15 > i)
            goto LABEL_bd9fb0;
LABEL_bd9ed4:
        if (v14 < 4)
            goto LABEL_bda008;
LABEL_bd9edc:
        v28 = *(int *)((char *)a1 + i);
        v29 = 4;
        if (5 < v14)
            goto LABEL_bda01c;
    }
    else
    {
        i = 0;
        v16 = a2 - 0;
        v14 = v16 & 7;
        v15 = v16 & 0xfffffffffffffff8;
        if (0 >= v15)
            goto LABEL_bd9ed4;
LABEL_bd9fb0:
        v17 = a0->field_10;
        v18 = a0->field_18;
        v19 = a0->field_0;
        v20 = a0->field_8;
        do
        {
            v21 = *(long long *)((char *)a1 + i) ^ v18;
            v22 = v19 + v17;
            v23 = v22 ^ __ROL__(v17, 13);
            v24 = v21 + v20;
            v25 = v24 ^ __ROL__(v21, 16);
            v26 = v24 + v23;
            v27 = v25 + __ROL__(v22, 32);
            v17 = v26 ^ __ROL__(v23, 0x11);
            v18 = v27 ^ __ROL__(v25, 21);
            v20 = __ROL__(v26, 32);
            v19 = v27 ^ *(long long *)((char *)a1 + i);
            i += 8;
        } while (i < v15);
        a0->field_10 = v17;
        a0->field_18 = v18;
        a0->field_0 = v19;
        a0->field_8 = v20;
        if (4 <= v14)
            goto LABEL_bd9edc;
LABEL_bda008:
        v29 = 0;
        v28 = 0;
        if (v14 > 1)
        {
LABEL_bda01c:
            v28 |= *(short *)((char *)a1 + i + v29) << ((char)v29 * 8 & 63);
            v29 |= 2;
        }
    }
    if (v29 < v14)
    {
        a0->field_38 = *((char *)a1 + v29 + i) << ((char)v29 * 8 & 63) | v28;
        a0->field_40 = v14;
        return a0;
    }
    a0->field_38 = v28;
    a0->field_40 = v14;
    return a0;
}
