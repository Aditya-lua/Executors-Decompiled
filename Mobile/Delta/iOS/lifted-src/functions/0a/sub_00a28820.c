/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa28820..0xa28abc (668 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a28820_2 {
    struct st_a28820_0 *field_0;
    char padding_8[160];
    long long field_a8;
} st_a28820_2;

typedef struct st_a28820_0 {
    char padding_0[248];
    struct st_a28820_1 *field_f8;
    struct st_a28820_1 *field_100;
} st_a28820_0;

typedef struct st_a28820_1 {
    unsigned long long field_0;
} st_a28820_1;


unsigned long long sub_a28820(st_a28820_2 *a0, long long *a1, long long *a2, long long a3)
{
    long long v4;  // x19
    long long v5;  // w0
    long long v6;  // w0
    st_a28820_0 *v8;  // x8
    long long v9;  // x20
    unsigned long long v10;  // x21
    unsigned long long *v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a3;
    v5 = (unsigned int)sub_a1b4f4();
    v6 = (unsigned int)sub_a1b4f4(a0, a2);
    if (v5)
        return !v6;
    if (v6)
        return 1;
    if (!(int)a1[5] || !(int)a2[5])
    {
        v8 = a0->field_0;
        if (v4)
        {
            v9 = 0;
        }
        else
        {
            v4 = sub_9dddcc(a0->field_a8);
            v9 = v4;
            if (!v9)
                return 0xffffffff;
        }
        sub_9de064(v4);
        sub_9de208(v4);
        v1 = sub_9de208(v4);
        sub_9de208(v4);
        if (sub_9de208(v4))
        {
            if ((int)a2[5])
            {
                v0 = v8->field_f8;
                if (!(int)a1[5])
                    v8->field_100();
                if (sub_9e5528(a1[2], a2[2]))
                {
                    v10 = 1;
                }
                else
                {
                    if ((int)a2[5])
                    {
                        if ((int)a1[5])
                            v10 = sub_9e5528(a1[3], a2[3]) != 0;
                        else
                            v0();
                    }
                    else
                    {
                        v0();
                    }
                }
            }
            else
            {
                v8->field_100();
            }
        }
        else
        {
            v10 = 0xffffffff;
        }
        sub_9de17c(v4);
        sub_9dded4(v9);
        return v10;
    }
    else if (!sub_9e5528(a1[2], a2[2]))
    {
        return sub_9e5528(a1[3], a2[3]) != 0;
    }
    return 1;
}
