/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95fee0..0x9600a4 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95fee0_1 {
    unsigned int field_0;
    char padding_4[20];
    struct st_95fee0_0 *field_18;
    char padding_20[72];
    unsigned int field_68;
    char padding_6c[24];
    char field_84;
    char padding_85[107];
    unsigned int field_f0;
    char padding_f4[2245];
    char field_9b9;
} st_95fee0_1;

typedef struct st_95fee0_0 {
    char padding_0[80];
    unsigned long long field_50;
} st_95fee0_0;

extern long long g_960220;

unsigned long long sub_95fee0(st_95fee0_1 *a0, unsigned long long a1, unsigned long long a2, unsigned long long *a3)
{
    unsigned long v7;  // x9
    st_95fee0_1 *v8;  // x0
    char v9;  // x8
    st_95fee0_1 *v10;  // x0
    st_95fee0_1 *v12;  // x23
    st_95fee0_1 *v13;  // x22
    unsigned long long v14;  // x0
    st_95fee0_1 *v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x60]
    unsigned long long v2;  // [bp-0x58]
    char v3;  // [bp-0x50]
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    if (!a0)
        return 0xffffffff;
    v7 = a0->field_0;
    v8 = a0;
    if ((unsigned int)v7)
    {
        if (!(v7 >> 7 & 1))
        {
            v9 = 0;
            v10 = a0;
            v8 = a0;
        }
        else
        {
            v9 = sub_980dc8();
            v10 = a0;
            v8 = v10;
            if (a0->field_0 >> 7 & 1)
            {
                goto *((void *)(v10->field_18->field_50));
            }
        }
        a0 = (st_95fee0_1 *)v9;
        if (a0)
            goto LABEL_95ff68;
    }
    else
    {
LABEL_95ff68:
        if (!*(long long *)&a0->padding_6c[4])
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_lib.c", 2318, "ssl_read_internal");
            sub_a36abc(20, 276, 0);
        }
        else if (a0->field_84 >> 1 & 1)
        {
            a0->field_68 = 1;
            return 0;
        }
        else if (a0->field_f0 == 8 || a0->field_f0 == 1)
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_lib.c", 2329, "ssl_read_internal");
            sub_a36abc(20, 0xc0101, 0);
            return 0;
        }
        else
        {
            v12 = v8;
            v13 = a0;
            if (sub_9a59b8(a0, 0))
            {
                if (v13->field_9b9 & 1 && !sub_9d0b98())
                {
                    v0 = v12;
                    v1 = a1;
                    v2 = a2;
                    v3 = 0;
                    v4 = v12->field_18->field_50;
                    v14 = sub_9600a4(v12, &v0, &g_960220);
                    *a3 = *(long long *)&v13[2].padding_f4[208];
                    return v14;
                }
                goto *((void *)(v12->field_18->field_50));
            }
        }
    }
    return 0xffffffff;
}
