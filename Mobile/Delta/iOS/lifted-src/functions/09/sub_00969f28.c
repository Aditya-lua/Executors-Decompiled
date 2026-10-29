/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x969f28..0x96a01c (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_969f28_1 {
    char padding_0[1672];
    unsigned long long field_688;
    unsigned int field_690;
} st_969f28_1;

typedef struct st_969f28_0 {
    char padding_0[16];
    unsigned short field_10;
    char padding_12[2];
    struct st_969f28_0 *field_14;
    char padding_1c[4];
    int field_20;
} st_969f28_0;


st_969f28_0 * sub_969f28(st_969f28_1 *a0, st_969f28_0 *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned int v17;  // w8
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_969f28_0 *v12;  // x0
    st_969f28_0 *v13;  // x19
    unsigned int v14;  // w0
    st_969f28_0 *v15;  // x0
    unsigned int v16;  // w8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a1)
        return 0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (*(int *)(a1->padding_12)[1])
    {
        v12 = sub_95a688();
        if (!v12)
            return v12;
        v13 = sub_9c7b68();
        v14 = sub_a50ac8(v12);
        if ((int)v14 < 1)
        {
            return 0;
        }
        else if ((unsigned int)v13 == 4)
        {
            return 39;
        }
        else if ((unsigned int)v13 != 64)
        {
            if ((unsigned int)v13 == 114)
                return 67;
            v15 = v14 * 4;
        }
        else
        {
            return v13;
        }
    }
    else
    {
        v16 = a1->field_10;
        if (v16 == 0x808)
            v15 = 224;
        else
            v15 = 0;
        if (v16 == 2055)
            return 128;
    }
    if ((unsigned int)v15)
        return v15;
    v17 = (unsigned int)(a1->padding_1c - 9);
    if (a1->padding_1c < 9)
    {
        return 0;
    }
    else if ((int)a0->field_690 > (int)v17)
    {
        return *(int *)(a0->field_688 + v17 * 104 + 80);
    }
    else
    {
        return 0;
    }
}
