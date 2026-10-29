/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa695b0..0xa69890 (736 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a695b0_0 {
    struct st_a695b0_0 *field_0;
    char padding_8[8];
    long long field_10;
} st_a695b0_0;

extern char g_10002b0;

st_a695b0_0 * sub_a695b0(st_a695b0_0 *a0, unsigned long long a1, st_a695b0_0 *a2, st_a695b0_0 *a3)
{
    st_a695b0_0 *v4;  // x20
    st_a695b0_0 *v5;  // x22
    st_a695b0_0 *v14;  // x24
    st_a695b0_0 *v15;  // x25
    st_a695b0_0 *v16;  // x22
    st_a695b0_0 *v17;  // x21
    st_a695b0_0 *v6;  // x24
    st_a695b0_0 *v7;  // x25
    st_a695b0_0 *v8;  // x23
    st_a695b0_0 *v9;  // x24
    st_a695b0_0 *v10;  // x25
    st_a695b0_0 *v11;  // x24
    st_a695b0_0 *v12;  // x25
    st_a695b0_0 *v13;  // x23
    st_a695b0_0 *v0;  // [bp-0x8a]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a3;
    v5 = a0;
    v1 = *(long long *)&g_10002b0;
    if ((unsigned int)a0)
    {
        v6 = sub_a9976c(v5);
        v7 = v4;
        if (!v7)
            v7 = sub_a68f38(0);
        v8 = 0;
        if (v6 && (char)v6->field_0 && v7)
        {
            if (!sub_a7c198(v7->field_10))
            {
                v8 = 0;
            }
            else
            {
                v8 = sub_c6811c(v7, 0, v6);
                sub_a7c1b4(v7->field_10);
            }
        }
        a0 = sub_a99788(v5);
        v9 = a0;
        v10 = v4;
        if (!v10)
        {
            a0 = sub_a68f38(0);
            v10 = a0;
        }
        v5 = 0;
        if (!v9 || !(char)v9->field_0 || !v10)
            goto LABEL_a69678;
        a0 = sub_a7c198(v10->field_10);
        if (!(unsigned int)a0)
        {
            v5 = 0;
            goto LABEL_a69678;
        }
        else
        {
            v5 = sub_c6811c(v10, v8, v9);
            a0 = sub_a7c1b4(v10->field_10);
            if ((unsigned int)a1)
            {
LABEL_a6967c:
                v11 = sub_a9976c(a1);
                v12 = v4;
                if (!v12)
                    v12 = sub_a68f38(0);
                v13 = 0;
                if (v11 && (char)v11->field_0 && v12)
                {
                    if (!sub_a7c198(v12->field_10))
                    {
                        v13 = 0;
                    }
                    else
                    {
                        v13 = sub_c6811c(v12, v5, v11);
                        sub_a7c1b4(v12->field_10);
                    }
                }
                v14 = sub_a99788(a1);
                v15 = v4;
                if (!v15)
                    v15 = sub_a68f38(0);
                v16 = 0;
                if (v14 && (char)v14->field_0 && v15)
                {
                    if (!sub_a7c198(v15->field_10))
                    {
                        v16 = 0;
                    }
                    else
                    {
                        v16 = sub_c6811c(v15, v13, v14);
                        sub_a7c1b4(v15->field_10);
                    }
                }
                a0 = sub_a99624(a1);
                v5 = v16;
                if (a0)
                {
                    a0 = sub_a99b48(&v0, 50, a0, 1);
                    if ((int)(unsigned int)a0 >= 1)
                    {
                        v17 = v4;
                        if (!v17)
                        {
                            a0 = sub_a68f38(0);
                            v17 = a0;
                        }
                        v5 = 0;
                        if (v0 && v17)
                        {
                            a0 = sub_a7c198(v17->field_10);
                            if (!(unsigned int)a0)
                            {
                                v5 = 0;
                            }
                            else
                            {
                                v5 = sub_c6811c(v17, v16, &v0);
                                a0 = sub_a7c1b4(v17->field_10);
                            }
                        }
                    }
                    else
                    {
                        v5 = v16;
                    }
                }
            }
        }
    }
    else
    {
LABEL_a69678:
        if ((unsigned int)a1)
            goto LABEL_a6967c;
    }
    if (a2)
    {
        if (!v4)
        {
            a0 = sub_a68f38(0);
            v4 = a0;
        }
        if ((char)a2->field_0 && v4)
        {
            a0 = sub_a7c198(v4->field_10);
            if ((unsigned int)a0)
            {
                sub_c6811c(v4, v5, a2);
                a0 = sub_a7c1b4(v4->field_10);
            }
        }
    }
    if (*(long long *)&g_10002b0 == v1)
        return a0;
    ___stack_chk_fail();
}
