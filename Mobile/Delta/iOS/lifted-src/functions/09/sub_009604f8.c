/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9604f8..0x960734 (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9604f8_0 {
    char padding_0[2489];
    char field_9b9;
} st_9604f8_0;

typedef struct st_9604f8_2 {
    unsigned int field_0;
    char padding_4[20];
    struct st_9604f8_1 *field_18;
} st_9604f8_2;

typedef struct st_9604f8_1 {
    char padding_0[96];
    unsigned long long field_60;
} st_9604f8_1;

extern long long g_960220;

st_9604f8_2 * sub_9604f8(st_9604f8_2 *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3, unsigned long long *a4)
{
    unsigned long v7;  // x9
    unsigned long long v8;  // x8
    long long v10;  // x1
    st_9604f8_2 *v11;  // x23
    st_9604f8_0 *v12;  // x22
    st_9604f8_2 *v13;  // x0
    st_9604f8_2 *v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x60]
    unsigned long long v2;  // [bp-0x58]
    unsigned int v3;  // [bp-0x50]
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    if (!a0)
        return a0;
    v7 = a0->field_0;
    v8 = a0;
    if ((unsigned int)v7)
    {
        if (!(v7 >> 7 & 1))
            v8 = 0;
        else
            v8 = sub_980dc8();
        if (!v8)
            return 0;
    }
    if (!*(long long *)(v8 + 112))
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 2537, "ssl_write_internal");
        v10 = 276;
    }
    else if (*(char *)(v8 + 132) & 1)
    {
        *(unsigned int *)(v8 + 104) = 1;
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 2543, "ssl_write_internal");
        v10 = 207;
    }
    else if (a3)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 2548, "ssl_write_internal");
        v10 = 412;
    }
    else
    {
        if (10 >= (unsigned int)*(int *)(v8 + 240) && 1 << ((char)*(int *)(v8 + 240) & 31) & 1282)
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_lib.c", 2555, "ssl_write_internal");
            sub_a36abc(20, 0xc0101, 0);
            return 0;
        }
        v11 = a0;
        v12 = v8;
        if (!sub_9a59b8(v8, 1))
            return 0xffffffff;
        if (v12->field_9b9 & 1 && !sub_9d0b98())
        {
            v0 = v11;
            v1 = a1;
            v2 = a2;
            v3 = 1;
            v4 = v11->field_18->field_60;
            v13 = sub_9600a4(v11, &v0, &g_960220);
            *a4 = *(long long *)&v12[2].padding_0[452];
            return v13;
        }
        goto *((void *)(v11->field_18->field_60));
    }
    sub_a36abc(20, v10, 0);
    return 0xffffffff;
}
