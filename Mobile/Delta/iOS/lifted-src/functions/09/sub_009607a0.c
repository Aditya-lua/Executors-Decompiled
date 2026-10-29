/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9607a0..0x9608e0 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9607a0_0 {
    char padding_0[2489];
    char field_9b9;
} st_9607a0_0;

typedef struct st_9607a0_2 {
    unsigned int field_0;
    char padding_4[20];
    struct st_9607a0_1 *field_18;
} st_9607a0_2;

typedef struct st_9607a0_1 {
    char padding_0[104];
    unsigned long long field_68;
} st_9607a0_1;

extern long long g_960220;

unsigned long long sub_9607a0(st_9607a0_2 *a0)
{
    unsigned long v7;  // x8
    char v8;  // x19
    st_9607a0_0 *v9;  // x19
    st_9607a0_2 *v10;  // x20
    long long v11;  // x1
    st_9607a0_2 *v0;  // [bp-0x48]
    char v1;  // [bp-0x40]
    char v2;  // [bp-0x38]
    char v3;  // [bp-0x30], Other Possible Types: unsigned int
    unsigned long v4;  // [bp-0x28]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    if (!a0)
        return 0xffffffff;
    v7 = a0->field_0;
    v8 = (char)a0;
    if ((unsigned int)v7)
    {
        if (!(v7 >> 7 & 1))
            v8 = 0;
        else
            v8 = sub_980dc8();
        if (v8)
            goto LABEL_960804;
    }
    else
    {
LABEL_960804:
        v9 = (st_9607a0_0 *)v8;
        if (*(long long *)&v9->padding_0[112])
        {
            v10 = a0;
            if (sub_9a5694())
            {
                sub_a368c8();
                sub_a369bc("ssl/ssl_lib.c", 2797, "SSL_shutdown");
                v11 = 407;
            }
            else
            {
                if (v9->field_9b9 & 1 && !sub_9d0b98())
                {
                    v2 = 0;
                    v3 = 0;
                    v0 = v10;
                    v1 = 0;
                    v3 = 2;
                    v4 = v10->field_18->field_68;
                    return sub_9600a4(v10, &v0, &g_960220);
                }
                goto *((void *)(v10->field_18->field_68));
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_lib.c", 2779, "SSL_shutdown");
            v11 = 276;
        }
        sub_a36abc(20, v11, 0);
    }
    return 0xffffffff;
}
