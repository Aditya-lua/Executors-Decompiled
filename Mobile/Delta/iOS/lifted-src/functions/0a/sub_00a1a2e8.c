/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1a2e8..0xa1a56c (644 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1a2e8_4 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[80];
    unsigned long long field_60;
    unsigned int field_68;
    char padding_6c[4];
    unsigned long long field_70;
    unsigned long long field_78;
} st_a1a2e8_4;

typedef struct st_a1a2e8_2 {
    struct st_a1a2e8_1 *field_0;
    struct st_a1a2e8_3 *field_8;
    long long field_10;
    long long field_18;
    unsigned int field_20;
    double field_24;
    unsigned int field_2c;
    long long field_30;
    char field_38;
    char padding_39[87];
    unsigned long long field_90;
    unsigned int field_98;
    char padding_9c[4];
    long long field_a0;
    unsigned long long field_a8;
} st_a1a2e8_2;

typedef struct st_a1a2e8_3 {
    struct st_a1a2e8_0 *field_0;
} st_a1a2e8_3;

typedef struct st_a1a2e8_0 {
    char padding_0[88];
    char field_58;
    char padding_59[7];
    struct st_a1a2e8_1 *field_60;
} st_a1a2e8_0;

typedef struct st_a1a2e8_1 {
    char field_0;
} st_a1a2e8_1;


unsigned long long sub_a1a2e8(st_a1a2e8_2 *a0, st_a1a2e8_2 *a1)
{
    long long v2;  // x1
    unsigned int v3;  // w8
    char v12;  // x0
    char v13;  // x0
    long long v14;  // x0
    st_a1a2e8_4 *v15;  // x22
    char v16;  // x0
    char v4;  // x0
    char v5;  // x0
    char v6;  // x0
    st_a1a2e8_0 **v7;  // x0
    char v8;  // x0
    unsigned long long v9;  // x0
    st_a1a2e8_0 *v10;  // x9
    char *v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*(long long *)&a0->field_0[32])
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 165, "EC_GROUP_copy");
        v2 = 786689;
    }
    else if (a0->field_0 != a1->field_0)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 169, "EC_GROUP_copy");
        v2 = 101;
    }
    else if (a0 != a1)
    {
        a0->field_a0 = a1->field_a0;
        a0->field_20 = a1->field_20;
        if ((int)a0->field_90 == 6)
        {
            sub_a1c668(*(long long *)&a0->field_98);
        }
        else if ((int)a0->field_90 == 5)
        {
            sub_a224e4(*(long long *)&a0->field_98);
        }
        *(unsigned long long *)&a0->field_98 = 0;
        v3 = a1->field_90;
        *(unsigned int *)&a0->field_90 = v3;
        switch (v3)
        {
        case 0:
            v4 = 0;
            break;
        case 6:
            v4 = sub_a1c64c(*(long long *)&a1->field_98);
            break;
        case 5:
            v4 = sub_a224c8(*(long long *)&a1->field_98);
            break;
        default:
            goto LABEL_a1a40c;
        }
        *(unsigned long long *)&a0->field_98 = v4;
LABEL_a1a40c:
        if (*(long long *)&a1->padding_39[79])
        {
            if (!*(long long *)&a0->padding_39[79])
            {
                v5 = sub_9e6c04();
                *(unsigned long long *)&a0->padding_39[79] = v5;
                if (!v5)
                    return v5;
            }
            v6 = sub_9e6f30();
            if (!v6)
                return v6;
        }
        else
        {
            sub_9e6c64(*(long long *)&a0->padding_39[79], 0);
            *(unsigned long long *)&a0->padding_39[79] = 0;
        }
        v7 = a0->field_8;
        if (a1->field_8)
        {
            if (!v7)
            {
                v8 = sub_a1a56c(a0);
                a0->field_8 = v8;
                if (!v8)
                    return v8;
            }
            v9 = sub_a1a654();
            if (!(unsigned int)v9)
                return v9;
        }
        else
        {
            if (v7)
            {
                v10 = *v7;
                v11 = v10->field_60;
                if (v10->field_60 || !(v11 = *(long long *)&v10->field_58, !v11))
                    v11();
                sub_a6c4e8();
            }
            a0->field_8 = 0;
        }
        if (!((char)(*(char *)a1->field_0) >> 1 & 1))
        {
            v12 = sub_9e4c34(a0->field_10, a1->field_10);
            if (!v12)
                return v12;
            v13 = sub_9e4c34(a0->field_18, a1->field_18);
            if (!v13)
                return v13;
        }
        v14 = *(long long *)&a0->field_2c;
        v15 = &a0->field_2c;
        *(int *)((char *)v15 - 4) = *(int *)((char *)&a1->field_24 + 4);
        *(double *)((char *)v15 - 12) = *(double *)&(&a1->field_20)[1];
        if (*(long long *)&a1->field_2c)
        {
            sub_a6c2e4(v14, "crypto/ec/ec_lib.c", 0x100);
            v16 = sub_a6bf4c(a1->field_30, "crypto/ec/ec_lib.c", 0x101);
            v15->field_0 = v16;
            if (!v16)
                return v16;
            _memcpy();
            a0->field_30 = a1->field_30;
        }
        else
        {
            sub_a6c2e4(v14, "crypto/ec/ec_lib.c", 263);
            v15->field_0 = 0;
            v15->field_8 = 0;
        }
        goto *((void *)(*(long long *)&a0->field_0[32]));
    }
    else
    {
        return 1;
    }
    sub_a36abc(16, v2, 0);
    return 0;
}
