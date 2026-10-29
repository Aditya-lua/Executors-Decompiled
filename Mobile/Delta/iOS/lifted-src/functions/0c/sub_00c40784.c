/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc40784..0xc409b8 (564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c40784_2 {
    char padding_0[16];
    struct st_c40784_1 *field_10;
} st_c40784_2;

typedef struct st_c40784_3 {
    struct st_c40784_3 *field_0;
    struct st_c40784_3 *field_8;
    struct st_c40784_1 *field_10;
} st_c40784_3;

typedef struct st_c40784_1 {
    char padding_0[24];
    struct st_c40784_0 *field_18;
} st_c40784_1;

typedef struct st_c40784_0 {
    char padding_0[40];
    long long field_28;
} st_c40784_0;

extern long long g_efd460;

unsigned long long sub_c40784(unsigned long long a0, unsigned long long a1)
{
    st_c40784_2 *v2;  // x10
    st_c40784_1 *i;  // x9
    unsigned long long v12;  // 4102
    st_c40784_0 *v13;  // x19
    unsigned long long v14;  // 4102
    st_c40784_3 *v4;  // x11
    st_c40784_3 *v5;  // x11
    unsigned long long v6;  // x9
    unsigned long long v7;  // x11
    unsigned long long v8;  // x12
    unsigned long long v9;  // x10
    unsigned long long v10;  // x21
    st_c40784_0 *v11;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    while (1)
    {
        while (1)
        {
            v2 = a1 & 0xfffffffffffffff0;
            i = v2->field_10;
            if (!i)
            {
                v4 = a1 & 0xfffffffffffffff0;
                do
                {
                    v5 = v4->field_0;
                    v5->field_8 = v4;
                    i = v5->field_10;
                    v4 = v5;
                } while (!i);
            }
            v2->field_10 = i;
            if ((a1 & 9) != 1)
                break;
            /* unsupported instruction */;
            v6 = /* unsupported instruction */;
            /* unsupported instruction */;
            if (v6 == a1)
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                if (!(/* unsupported instruction */ ^ 1))
                    return a0;
            }
            else
            {
                /* unsupported instruction */;
            }
            a1 = v6;
        }
        if (a1 >> 3 & 1)
        {
LABEL_c4083c:
            /* unsupported instruction */;
            v9 = /* unsupported instruction */;
            /* unsupported instruction */;
            if (v9 != a1)
                goto LABEL_c40874;
            goto LABEL_c4084c;
        }
        else if (i[1].padding_0[1] == 1)
        {
            if (*(long long *)&i->padding_0[8])
            {
                v2->field_10 = *(long long *)&i->padding_0[8];
                /* unsupported instruction */;
                v7 = /* unsupported instruction */;
                /* unsupported instruction */;
                if (v7 == a1)
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    if (!(/* unsupported instruction */ ^ 1))
                        v8 = 1;
                    else
                        v8 = 0;
                }
                else
                {
                    v8 = 0;
                    /* unsupported instruction */;
                }
                if (!(v8 & 1))
                {
                    v2->field_10 = i;
                    a1 = v7;
                    continue;
                }
                else
                {
                    v13 = i->field_18;
                    if (!v13)
                    {
                        sub_c73c64(&g_efd460);
                        __debugbreak();
                    }
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    if ((long long)/* unsupported instruction */ < 0)
                        __debugbreak();
                    /* unsupported instruction */;
                    i[1].padding_0[0] = 1;
                    break;
                }
            }
            goto LABEL_c4083c;
        }
        else
        {
            /* unsupported instruction */;
            v9 = /* unsupported instruction */;
            /* unsupported instruction */;
            if (v9 == a1)
            {
LABEL_c4084c:
                /* unsupported instruction */;
                /* unsupported instruction */;
                if (!(/* unsupported instruction */ ^ 1))
                    goto LABEL_c408a8;
                goto LABEL_c4085c;
            }
            else
            {
LABEL_c40874:
                /* unsupported instruction */;
                if (0)
                {
LABEL_c408a8:
                    while (1)
                    {
                        v10 = *(long long *)&i->padding_0[8];
                        v11 = i->field_18;
                        if (!v11)
                        {
                            sub_c73c64(&g_efd460);
                            __debugbreak();
                        }
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        if ((long long)/* unsupported instruction */ < 0)
                            __debugbreak();
                        /* unsupported instruction */;
                        i[1].padding_0[0] = 1;
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        if (/* unsupported instruction */ == 0xff)
                            a0 = _dispatch_semaphore_signal(v11->field_28);
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v12 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                        if (!(v12 & 1))
                        {
                            /* unsupported instruction */;
                            a0 = sub_c40714(v11);
                        }
                        i = v10;
                        if (!v10)
                            return a0;
                    }
                }
LABEL_c4085c:
                a1 = v9;
            }
        }
    }
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    if (/* unsupported instruction */ == 0xff)
        a0 = _dispatch_semaphore_signal(v13->field_28);
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v14 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (v14 & 1)
        return a0;
    /* unsupported instruction */;
    return sub_c40714();
}
