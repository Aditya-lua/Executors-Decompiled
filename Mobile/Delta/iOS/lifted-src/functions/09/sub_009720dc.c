/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9720dc..0x9721c8 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9720dc_0 {
    char field_0;
    char padding_1[4];
    char field_5;
    char field_6;
    char padding_7[1];
    struct st_9720dc_1 *field_8;
    char padding_10[56];
    unsigned long long field_48;
} st_9720dc_0;

typedef struct st_9720dc_1 {
    char field_0;
} st_9720dc_1;


st_9720dc_0 * sub_9720dc(st_9720dc_0 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long v8;  // x8
    unsigned int v9;  // w9
    char v10;  // x9
    st_9720dc_0 *v11;  // x19
    st_9720dc_0 *v12;  // x0
    st_9720dc_0 *v13;  // x0
    st_9720dc_0 *v14;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->padding_1[3])
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0->field_48;
    v9 = a0->field_5;
    if (v9)
    {
        v10 = v9 - 1;
    }
    else if (v8)
    {
        v8 -= 1;
        v10 = 7;
    }
    else
    {
        a0->padding_1[3] = 1;
        return a0;
    }
    if ((char)(*(char *)&a0->field_8[v8]) >> (v10 & 31) & 1)
    {
        a0->padding_1[3] = 1;
        return a0;
    }
    v11 = a0;
    if (a0->field_6 == 2)
    {
        sub_9721c8(v11, 44);
        v11->field_6 = 0;
    }
    v12 = sub_97228c(v11);
    if (v11->field_6)
    {
        v11->padding_1[3] = 1;
        return v12;
    }
    v13 = sub_972ad8(v11, a1, 0, 1);
    if (v11->padding_1[3])
        return v13;
    v14 = sub_9721c8(v11, 58);
    if (v11->field_0 >> 1 & 1)
    {
        v14 = sub_9721c8(v11, 32);
        v11 = v11;
    }
    v11->field_6 = 1;
    return v14;
}
