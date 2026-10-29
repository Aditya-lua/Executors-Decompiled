/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cd090..0x9cd5fc (1388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cd090_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned int field_8;
    char padding_c[20];
    struct st_9cd090_1 *field_20;
} st_9cd090_0;

typedef struct st_9cd090_1 {
    unsigned long long field_0;
} st_9cd090_1;

typedef struct st_9cd090_2 {
    struct st_9cd090_2 *field_0;
} st_9cd090_2;


long long sub_9cd090(st_9cd090_2 **a0, unsigned int a1, st_9cd090_0 *a2, unsigned int a3, unsigned int a4)
{
    unsigned long v8;  // x27
    unsigned long long v9;  // 4112
    unsigned long long v18;  // 4111
    unsigned int v19;  // w8
    long long v20;  // x20
    unsigned long long v21;  // 4116
    long long v22;  // x28
    unsigned long long v23;  // 4112
    unsigned int v10;  // x24
    unsigned long long v11;  // 4121
    unsigned int v12;  // w8
    long long v13;  // x25
    unsigned long long v14;  // 4169
    unsigned int v15;  // w8
    unsigned int v16;  // w9
    unsigned int v17;  // w10
    unsigned int v0;  // [bp-0x90]
    unsigned int v1;  // [bp-0x8c]
    unsigned int v2;  // [bp-0x88]
    unsigned int v3;  // [bp-0x84]
    unsigned long long v4;  // [bp-0x80]
    st_9cd090_2 **v5;  // [bp-0x78]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a2->field_0;
    if (v8 >> 12 & 1)
    {
        v5 = a0;
        a0 = &v5;
    }
    if ((unsigned int)v8 & 24)
    {
        v9 = arm64g_calculate_condition(1, a3, 1, 0);
        if (!(v9 & 1))
            return 0xffffffff;
        a3 = a2->field_8;
        v10 = (unsigned int)v8 & 192;
    }
    else
    {
        v11 = arm64g_calculate_condition(1, a3, 1, 0);
        if (v11 & 1)
            v10 = 0;
        else
            v10 = a4 & 192;
    }
    v12 = a4 & (unsigned int)v8;
    if (!(v12 & 0x800))
        v13 = 1;
    else
        v13 = 2;
    if (!((unsigned int)v8 & 6))
    {
        a2->field_20();
    }
    else if (*a0)
    {
        v1 = v12 & 0x800;
        v2 = a3;
        v14 = arm64g_calculate_condition(1, a3, 1, 0);
        v15 = !(v14 & 1);
        v16 = !((unsigned int)v8 & 16);
        if (!((unsigned int)v8 & 2))
            v17 = 16;
        else
            v17 = 0x11;
        if (!(v16 & v15))
            a3 = v17;
        v3 = a3;
        v18 = arm64g_calculate_condition(25, v16 & v15, 0, 0);
        if (v18 & 1)
            v19 = v10;
        else
            v19 = 0;
        v0 = v19;
        if ((int)sub_ad69e4() >= 1)
        {
            v4 = sub_ad69f8(*a0, 0);
            a2->field_20();
        }
        v20 = sub_9c7680(v13, 0, v3);
        v21 = arm64g_calculate_condition(1, v20 & 0xffffffff, 1, 0);
        if (v21 & 1)
            return v20;
        if (v8 >> 4 & 1)
        {
            v22 = sub_9c7680(v13, v20, v2);
            if (!a1 || !(v23 = arm64g_calculate_condition(1, v22 & 0xffffffff, 1, 0), !(v23 & 1)))
                return v22;
            sub_9c755c(a1, v13, v20, v2, v10);
        }
        else if (!a1)
        {
            return v20;
        }
        sub_9c755c(a1, v13, 0, v3, v0);
        a2->field_20();
    }
    else
    {
        return 0;
    }
}
