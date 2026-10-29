/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ad8b4..0x9ad960 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ad8b4_1 {
    char padding_0[1264];
    struct st_9ad8b4_0 *field_4f0;
} st_9ad8b4_1;

typedef struct st_9ad8b4_0 {
    char padding_0[268];
    unsigned short field_10c;
    unsigned short field_10e;
    char padding_110[40];
    long long field_138;
    unsigned long long field_140;
    unsigned short field_148;
    char padding_14a[6];
    unsigned long long field_150;
    unsigned long long field_158;
} st_9ad8b4_0;


unsigned long long sub_9ad8b4(st_9ad8b4_1 *a0, long long a1, unsigned int a2)
{
    st_9ad8b4_0 *v3;  // x8
    unsigned short v4;  // x9
    unsigned long long v5;  // x0
    st_9ad8b4_0 *v6;  // x8
    unsigned short v7;  // x9
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    char v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a2 == 0x101)
    {
        v3 = a0->field_4f0;
        v4 = v3->field_10e;
        v3->field_10c = v4;
        *(char *)&v3->field_138 = 1;
        v3->field_140 = 0;
        v3->field_148 = v4;
        v3->field_150 = 0;
        v3->field_158 = 0;
        v5 = sub_c68d5c(a1, 1, 1);
        if (!(unsigned int)v5)
            return v5;
    }
    else
    {
        v6 = a0->field_4f0;
        v7 = v6->field_10e;
        v6->field_10c = v7;
        v6->field_10e = v7 + 1;
        *(char *)&v6->field_138 = a2;
        v6->field_140 = 0;
        v6->field_148 = v7;
        v6->field_150 = 0;
        v6->field_158 = 0;
        v8 = sub_a6e830(a1, 12, &v0);
        if (!(unsigned int)v8)
            return v8;
        v9 = sub_c68d10(a1);
        if (!(unsigned int)v9)
            return v9;
    }
    return 1;
}
