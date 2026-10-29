/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2a74..0xac2c30 (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2a74_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned int field_2c;
    unsigned long long field_30;
    unsigned long long field_34;
    char field_38;
    char field_39;
    char field_3a;
    char field_3b;
    char field_3c;
    char field_3d;
    char field_3e;
} st_ac2a74_0;

extern char g_1000000;

unsigned long long sub_ac2a74(st_ac2a74_0 *a0, unsigned long long *a1, unsigned long long a2)
{
    unsigned long long i;  // w10
    unsigned long long v1;  // x11
    unsigned long v10;  // x8
    unsigned long long v11;  // x13
    unsigned long v12;  // x9
    unsigned long long v13;  // x13
    unsigned long long v15;  // x10
    unsigned long long v16;  // x11
    unsigned long long v17;  // x12
    unsigned long long v18;  // x11
    unsigned long long j;  // w12
    unsigned long long v2;  // x14
    unsigned long long v20;  // w12
    unsigned long long v21;  // x10
    unsigned long v22;  // x8
    unsigned long long v23;  // x11
    unsigned long v24;  // x9
    unsigned long long v25;  // x11
    unsigned long long v27;  // x8
    unsigned long long k;  // w12
    unsigned long long v29;  // w12
    unsigned long long v3;  // x12
    unsigned long long v30;  // x10
    unsigned long v31;  // x8
    unsigned long long v32;  // x11
    unsigned long v33;  // x9
    unsigned long long v34;  // x11
    unsigned long long v4;  // x8
    unsigned long long v5;  // x13
    unsigned long long v6;  // w15
    unsigned long long v7;  // x9
    unsigned long long v8;  // w10
    unsigned long long v9;  // x14

    if (!a2)
        return 0;
    i = a0->field_2c;
    if (!a0->field_2c)
        return 0;
    v1 = *(int *)((char *)&a0->field_28 + 4);
    if (v1 != a2)
        return 0;
    v2 = a0->field_8;
    v3 = a0->field_0 * 0x100000000000000;
    v4 = a0->field_10;
    v5 = a0->field_18;
    v6 = (int)a0->field_28;
    if (v6 <= 3)
    {
        if (v6 == 1)
            goto LABEL_ac2b2c;
        if (v6 == 2)
            goto LABEL_ac2b24;
        if (v6 == 3)
            goto LABEL_ac2b1c;
    }
    else if (5 >= v6)
    {
        if (v6 == 4)
            goto LABEL_ac2b14;
        if (v6 == 5)
            goto LABEL_ac2b0c;
    }
    else if (v6 != 6)
    {
        if (v6 != 7)
            goto LABEL_ac2b34;
        v3 |= *((char *)&a0->field_30 + 6) * 0x1000000000000;
        goto LABEL_ac2b04;
    }
    else
    {
LABEL_ac2b04:
        v3 |= *((char *)&a0->field_30 + 5) * 0x10000000000;
LABEL_ac2b0c:
        v3 |= *((char *)&a0->field_30 + 4) * 0x100000000;
LABEL_ac2b14:
        v3 |= *((char *)&a0->field_30 + 3) * &g_1000000;
LABEL_ac2b1c:
        v3 |= *((char *)&a0->field_30 + 2) * 0x10000;
LABEL_ac2b24:
        v3 |= *((char *)&a0->field_30 + 1) * 0x100;
LABEL_ac2b2c:
        v3 |= (char)a0->field_30;
    }
LABEL_ac2b34:
    v7 = v3 ^ a0->field_20;
    do
    {
        v8 = i;
        v9 = v4 + v2;
        v10 = v9 ^ __ROL__(v4, 13);
        v11 = v7 + v5;
        v12 = v11 ^ __ROL__(v7, 16);
        v2 = v12 + __ROL__(v9, 32);
        v7 = v2 ^ __ROL__(v12, 21);
        v13 = v11 + v10;
        v4 = v13 ^ __ROL__(v10, 0x11);
        v5 = __ROL__(v13, 32);
        i = v8 - 1;
    } while (i);
    v15 = v2 ^ v3;
    v16 = 0xff;
    v17 = 0xee;
    if ((unsigned int)v1 == 16)
        v16 = v17;
    v18 = v5 ^ v16;
    j = (&a0->field_2c)[1];
    if ((&a0->field_2c)[1])
    {
        do
        {
            v20 = j;
            v21 = v4 + v15;
            v22 = v21 ^ __ROL__(v4, 13);
            v23 = v7 + v18;
            v24 = v23 ^ __ROL__(v7, 16);
            v15 = v24 + __ROL__(v21, 32);
            v7 = v15 ^ __ROL__(v24, 21);
            v25 = v23 + v22;
            v4 = v25 ^ __ROL__(v22, 0x11);
            v18 = __ROL__(v25, 32);
            j = v20 - 1;
        } while (j);
    }
    *a1 = v4 ^ v15 ^ v18 ^ v7;
    if (*(int *)((char *)&a0->field_28 + 4) == 8)
        return 1;
    v27 = v4 ^ 0xdd;
    k = (&a0->field_2c)[1];
    if ((&a0->field_2c)[1])
    {
        do
        {
            v29 = k;
            v30 = v27 + v15;
            v31 = v30 ^ __ROL__(v27, 13);
            v32 = v7 + v18;
            v33 = v32 ^ __ROL__(v7, 16);
            v15 = v33 + __ROL__(v30, 32);
            v7 = v15 ^ __ROL__(v33, 21);
            v34 = v32 + v31;
            v27 = v34 ^ __ROL__(v31, 0x11);
            v18 = __ROL__(v34, 32);
            k = v29 - 1;
        } while (k);
    }
    a1[1] = v27 ^ v15 ^ v18 ^ v7;
    return 1;
}
