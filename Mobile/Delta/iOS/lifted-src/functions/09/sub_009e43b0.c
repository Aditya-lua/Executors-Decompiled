/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e43b0..0x9e4624 (628 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e43b0_0 {
    struct st_9e43b0_1 *field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned int field_10;
} st_9e43b0_0;

typedef struct st_9e43b0_1 {
    unsigned long long field_0;
} st_9e43b0_1;

typedef struct st_9e43b0_2 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_9e43b0_2;

extern st_9e43b0_2 g_d31118;

unsigned int sub_9e43b0(long long a0, long long a1, long long a2)
{
    st_9e43b0_0 *v2;  // x20
    unsigned int v3;  // x0
    unsigned int v12;  // w22
    unsigned int v13;  // w25
    st_9e43b0_0 *v4;  // x22
    unsigned int v5;  // x20
    unsigned long long v6;  // x21
    unsigned long long v7;  // x23
    unsigned int v8;  // x8
    st_9e43b0_0 *v9;  // x21
    unsigned long long v10;  // x22
    unsigned int v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9de064(a2);
    v2 = sub_9de208(a2);
    v3 = sub_9de208(a2);
    if (!v3 || (v4 = (st_9e43b0_0 *)v3, !sub_9e4c34(v2, a0) || !sub_9e4c34(v4, a1)))
    {
LABEL_9e45fc:
        v5 = 0xfffffffe;
    }
    else if (sub_9e4828(v4))
    {
        v5 = sub_9e5b58(v2, 1);
    }
    else if (sub_9e5c70(v2) || sub_9e5c70(v4))
    {
        v6 = 0xffffffff;
        do
        {
            v6 = (unsigned int)v6 + 1;
        } while (!sub_9e5748(v4, v6));
        if (!sub_9ea8ac(v4, v4, v6))
            goto LABEL_9e45fc;
        if (!(v6 & 1))
        {
            v7 = 1;
        }
        else
        {
            if (v2->field_8)
                v8 = *(long long *)v2->field_0 & 7;
            else
                v8 = 0;
            v7 = (&g_d31118.field_0)[v8];
        }
        if (v4->field_10)
        {
            v4->field_10 = 0;
            if (!v2->field_10)
                v7 &= 0xffffffff;
            else
                v7 = -(unsigned int)v7;
        }
        if (sub_9e4828(v2))
        {
            v9 = v4;
        }
        else
        {
            do
            {
                v9 = v2;
                v2 = v4;
                v10 = 0xffffffff;
                do
                {
                    v10 = (unsigned int)v10 + 1;
                } while (!sub_9e5748(v9, v10));
                if (!sub_9ea8ac(v9, v9, v10))
                    goto LABEL_9e45fc;
                if (v10 & 1)
                {
                    if (v2->field_8)
                        v11 = *(long long *)v2->field_0 & 7;
                    else
                        v11 = 0;
                    v7 *= (&g_d31118.field_0)[v11];
                }
                if (v9->field_10)
                {
                    if (v9->field_8)
                    {
                        v12 = ~*(long long *)v9->field_0;
                        if (!v2->field_8)
                            goto LABEL_9e459c;
                        goto LABEL_9e457c;
                    }
                    else
                    {
                        v12 = 0xffffffff;
                        if (!v2->field_8)
                            goto LABEL_9e459c;
                        goto LABEL_9e457c;
                    }
                }
                if (v9->field_8)
                {
                    v12 = *(long long *)v9->field_0;
                    if (!v2->field_8)
                        goto LABEL_9e459c;
                    goto LABEL_9e457c;
                }
                else
                {
                    v12 = 0;
                    if (v2->field_8)
                    {
LABEL_9e457c:
                        v13 = *(long long *)v2->field_0;
                        goto LABEL_9e45a0;
                    }
                    else
                    {
LABEL_9e459c:
                        v13 = 0;
LABEL_9e45a0:
                        if (!sub_9e5dac(v2, v2, v9, a2))
                            goto LABEL_9e45fc;
                        else
                            goto LABEL_9e45b8;
                    }
                }
LABEL_9e45b8:
                if (!(v12 >> 1 & 1 & v13 >> 1 & 1))
                    v7 &= 0xffffffff;
                else
                    v7 = -(unsigned int)v7;
                v9->field_10 = 0;
                v4 = v9;
            } while (!sub_9e4828());
        }
        if (!sub_9e5b90(v9))
            v5 = 0;
        else
            v5 = v7 & 0xffffffff;
    }
    else
    {
        v5 = 0;
    }
    sub_9de17c(a2);
    return v5;
}
