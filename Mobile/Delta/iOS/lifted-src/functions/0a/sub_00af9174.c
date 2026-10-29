/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf9174..0xaf9264 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af9174_1 {
    long long field_0;
    struct st_af9174_0 *field_8;
} st_af9174_1;

typedef struct st_af9174_0 {
    char padding_0[4];
    unsigned long long field_4;
} st_af9174_0;


st_af9174_1 * sub_af9174(st_af9174_1 *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v17;  // 4112
    unsigned long long v18;  // 4112
    unsigned int v19;  // w0
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long len;  // x19
    unsigned long long v13;  // x0
    unsigned long long v14;  // w22
    unsigned long long v15;  // x20
    st_af9174_1 *v16;  // x21
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    len = a3;
    if (!a2 && (unsigned int)len)
    {
        v13 = 0;
    }
    else if ((int)a1 >= 1 && a1 >> 12 & 1)
    {
        v13 = sub_9c44a0(&a0->field_8, a2, len, a1, sub_a99eac(a0->field_0)) != 0;
    }
    else
    {
        v14 = (unsigned int)a1;
        v15 = a2;
        if (len >> 31 & 1)
        {
            len = _strlen(a2);
            a2 = v15;
        }
        v16 = a0;
        v13 = sub_9c7770(a0->field_8, a2, len);
        if ((unsigned int)v13)
        {
            v17 = arm64g_calculate_condition(1, v14, 1, 0);
            if (!(v17 & 1))
            {
                v18 = arm64g_calculate_condition(0x11, v14, 2, 0);
                if (!(v18 & 1))
                {
                    v19 = sub_9c3658(v15, len);
                    *(unsigned int *)(v16->field_8->padding_0)[1] = v19;
                }
                else
                {
                    *(unsigned int *)(v16->field_8->padding_0)[1] = v14;
                }
            }
            v13 = 1;
        }
    }
    return v13;
}
