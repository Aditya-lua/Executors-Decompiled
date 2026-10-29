/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc48c1c..0xc48d94 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c48c1c_2 {
    char padding_0[8];
    char field_8;
    char padding_9[7];
    unsigned long long field_10;
} st_c48c1c_2;

typedef struct st_c48c1c_0 {
    char padding_0[40];
    long long field_28;
} st_c48c1c_0;

typedef struct st_c48c1c_1 {
    struct st_c48c1c_0 *field_0;
    char field_8;
} st_c48c1c_1;


st_c48c1c_2 * sub_c48c1c(st_c48c1c_2 *a0, st_c48c1c_1 *a1)
{
    st_c48c1c_2 *v10;  // x0
    char v11;  // w8
    st_c48c1c_0 *v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // 4102
    st_c48c1c_2 *dst;  // x0
    char v0;  // [bp-0x890]
    char v1;  // [bp-0x888]
    st_c48c1c_0 *v2;  // [bp-0x478]
    char v3;  // [bp-0x470]
    char v4;  // [bp-0x468]
    unsigned short v5;  // [bp-0x45e]
    unsigned short v6;  // [bp-0x45b]
    char v7;  // [bp-0x58]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v0 = 0;
    v10 = a0;
    if (a1->field_8 & 1)
    {
LABEL_c48d70:
        *(unsigned long long *)a0->padding_0 = 0;
        return v10;
    }
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    if ((long long)/* unsupported instruction */ < 0)
        __debugbreak();
    v2 = a1->field_0;
    _bzero(&v3, 1048);
    v7 = 0;
LABEL_c48c90:
    v10 = _readdir_r(a1->field_0->field_28, &v3, &v7);
    if ((unsigned int)v10)
    {
        if (!v7)
            a1->field_8 = 1;
        v13 = 2 | v10 * 0x100000000;
    }
    else if (v7)
    {
        v11 = v5;
        if (v11 == 1 && (char)v6 == 46)
            continue;
    }
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v14 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (!(v14 & 1))
    {
        /* unsupported instruction */;
        sub_c48d94(v2);
    }
    if (!(unsigned int)v10)
        goto LABEL_c48d70;
    v12 = 0;
LABEL_c48d50:
    *(st_c48c1c_0 **)&a0->field_8 = v12;
    a0->field_10 = v13;
    dst = _memcpy(a0 + 1, &v2, 1040);
    *(unsigned long long *)a0->padding_0 = 1;
    return dst;
    if (v11 != 2 || v6 != 0x2e2e)
    {
        v12 = v2;
        _memcpy(&v1, &v4, 1040);
        if (v12)
        {
            _memcpy(&v2, &v1, 1040);
            goto LABEL_c48d50;
        }
    }
    goto LABEL_c48c90;
}
