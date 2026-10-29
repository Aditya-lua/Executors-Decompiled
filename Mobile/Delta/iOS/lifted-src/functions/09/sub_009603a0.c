/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9603a0..0x9604f8 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9603a0_1 {
    unsigned int field_0;
    char padding_4[20];
    struct st_9603a0_0 *field_18;
} st_9603a0_1;

typedef struct st_9603a0_0 {
    char padding_0[88];
    unsigned long long field_58;
} st_9603a0_0;

extern long long g_960220;

st_9603a0_1 * sub_9603a0(st_9603a0_1 *a0, unsigned long long a1, unsigned long long a2, unsigned long long *a3)
{
    unsigned long v7;  // x8
    unsigned int v8;  // x19
    unsigned int v9;  // x0
    st_9603a0_1 *v10;  // x0
    unsigned long long *v11;  // x3
    st_9603a0_1 *v12;  // x0
    st_9603a0_1 *v0;  // [bp-0x68]
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
    v8 = (unsigned int)a0;
    if ((unsigned int)v7)
    {
        if (!(v7 >> 7 & 1))
        {
            v8 = 0;
            v9 = (unsigned int)a0;
            v10 = a0;
        }
        else
        {
            v8 = sub_980dc8();
            v9 = (unsigned int)a0;
            v10 = (st_9603a0_1 *)v9;
            if (a0->field_0 >> 7 & 1)
                goto *((void *)(v10->field_18->field_58));
        }
        a0 = (st_9603a0_1 *)v9;
        if (!v8)
            return 0;
    }
    if (!*(long long *)(v8 + 112))
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 2467, "ssl_peek_internal");
        sub_a36abc(20, 276, 0);
        return 0xffffffff;
    }
    else if (!((char)(*(char *)(v8 + 132)) >> 1 & 1))
    {
        v10 = a0;
        if (*(char *)(v8 + 2489) & 1)
        {
            v11 = a3;
            v10 = a0;
            if (!sub_9d0b98())
            {
                v0 = v10;
                v1 = a1;
                v2 = a2;
                v3 = 0;
                v4 = v10->field_18->field_58;
                v12 = sub_9600a4(v10, &v0, &g_960220, v11);
                *v11 = *(long long *)(v8 + 5432);
                return v12;
            }
            goto *((void *)(v10->field_18->field_58));
        }
        else
        {
            goto *((void *)(v10->field_18->field_58));
        }
    }
    else
    {
        return 0;
    }
}
