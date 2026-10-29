/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f7918..0x9f7a8c (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f7918_1 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
    long long field_18;
    long long field_20;
    long long field_28;
} st_9f7918_1;

typedef struct st_9f7918_0 {
    unsigned int field_0;
    char padding_4[20];
    long long field_18;
    long long field_20;
    char padding_28[48];
    unsigned int field_58;
    char padding_5c[4];
    unsigned int field_60;
} st_9f7918_0;


long long sub_9f7918(st_9f7918_0 *a0, st_9f7918_1 *a1)
{
    unsigned long v4;  // x0
    unsigned long v5;  // x19
    unsigned long v6;  // x21
    unsigned int v7;  // w0
    unsigned int v8;  // w8
    unsigned long v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    if (a0->field_0)
    {
        a0->field_60 = 5;
        return 0;
    }
    v4 = sub_9f6548(a1->field_10, a0->field_18, a0->field_20);
    if (!v4)
    {
        a0->field_60 = 1;
        return v4;
    }
    v5 = sub_9f7b1c(a1->field_20, a1->field_28);
    if (!v5 || sub_afb1e4(&v0, sub_975fec(v4)) != 1 || sub_9f8088(v5, v0) != 1)
    {
LABEL_9f7a2c:
        v6 = 0xffffffff;
    }
    else if (a0->field_58 != 1)
    {
LABEL_9f79e8:
        sub_9f80f8(v5, a1->field_18);
        if (sub_9f7c2c(v5, a1->field_0, 0) == 1)
        {
            v7 = sub_9f8100(v5, a0);
            v6 = v7 == 1;
            if (v7 == 1)
                v8 = 2;
            else
                v8 = 3;
        }
        else
        {
            v6 = 0;
            v8 = 4;
        }
        a0->field_60 = v8;
    }
    else if (a1->field_8)
    {
        if (sub_afb1e4(&v1, sub_af1e94(a1->field_8)) != 1 || sub_9f7f3c(v5, v1) != 1)
            goto LABEL_9f7a2c;
        goto LABEL_9f79e8;
    }
    else
    {
        v6 = 0;
        a0->field_60 = 4;
    }
    sub_afb050(v1);
    sub_afb050(v0);
    sub_9f7b98(v5);
    return v6;
}
