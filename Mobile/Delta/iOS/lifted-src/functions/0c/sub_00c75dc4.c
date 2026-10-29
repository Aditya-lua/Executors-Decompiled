/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc75dc4..0xc75edc (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c75dc4_0 {
    char padding_0[120];
    unsigned long long field_78;
} st_c75dc4_0;

typedef struct st_c75dc4_1 {
    char padding_0[120];
    unsigned long long field_78;
    struct st_c75dc4_1 *field_80;
    struct st_c75dc4_1 *field_88;
} st_c75dc4_1;


void sub_c75dc4(unsigned long long *a0)
{
    unsigned long long i;  // x9
    unsigned long long v3;  // x8
    st_c75dc4_0 *v4;  // x9
    unsigned long long idx;  // x19
    st_c75dc4_1 *v6;  // x10
    st_c75dc4_1 *v7;  // x10
    unsigned long long v8;  // x9
    unsigned long long v9;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = *a0;
    while (i >= 4)
    {
        v3 = i;
        if (v3 >> 1 & 1)
            return;
        /* unsupported instruction */;
        i = /* unsupported instruction */;
        /* unsupported instruction */;
        if (i == v3)
        {
            /* unsupported instruction */;
            if (!(/* unsupported instruction */ ^ 1))
            {
                while (1)
                {
                    v4 = v3 & 0xfffffffffffffffc;
                    idx = v4->field_78;
                    if (!idx)
                    {
                        v6 = v3 & 0xfffffffffffffffc;
                        do
                        {
                            v7 = v6->field_88;
                            v7->field_80 = v6;
                            idx = v7->field_78;
                            v6 = v7;
                        } while (!v6->field_78);
                    }
                    v4->field_78 = idx;
                    if (v3 & 1)
                    {
                        /* unsupported instruction */;
                        v9 = /* unsupported instruction */;
                        if (v9 == v3)
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                            v8 = v9;
                            if (!(/* unsupported instruction */ ^ 1))
                                return;
                        }
                        else
                        {
                            /* unsupported instruction */;
                            v8 = v9;
                        }
                    }
                    else if (!*(long long *)(idx + 128))
                    {
                        do
                        {
                            /* unsupported instruction */;
                            v8 = /* unsupported instruction */;
                            if (v8 == v3)
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                                if (/* unsupported instruction */ ^ 1)
                                    continue;
                            }
                            else
                            {
                                /* unsupported instruction */;
                            }
                        } while ((v3 = v8, v8 < 4));
                    }
                    else
                    {
                        v4->field_78 = *(long long *)(idx + 128);
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                    }
                    v3 = v8;
                    /* unsupported instruction */;
                }
                _pthread_mutex_lock(idx);
                *(char *)(idx + 112) = 0;
                _pthread_cond_signal(idx + 64);
            }
        }
        else
        {
            /* unsupported instruction */;
        }
    }
    return;
}
