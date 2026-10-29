/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9eac58..0x9eae1c (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9eac58_0 {
    struct st_9eac58_1 *field_0;
    struct st_9eac58_0 *field_8;
    struct st_9eac58_0 *field_10;
} st_9eac58_0;

typedef struct st_9eac58_1 {
    char field_0;
} st_9eac58_1;

extern char g_10002b0;

st_9eac58_0 * sub_9eac58(st_9eac58_0 *a0, st_9eac58_0 *a1, long long a2)
{
    st_9eac58_0 *v4;  // x20
    unsigned long v5;  // x22
    char v14;  // x8
    st_9eac58_0 *v6;  // x21
    st_9eac58_0 *v7;  // x0
    st_9eac58_0 *v8;  // x23
    st_9eac58_0 *v9;  // x25
    unsigned long long v10;  // x23
    char *v11;  // x0
    char *v12;  // x1
    char *v13;  // x3
    char v0;  // [bp-0x158]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0;
    v1 = *(long long *)&g_10002b0;
    v5 = (int)a1->field_8;
    if ((int)v5 > 0)
    {
        sub_9de064(a2);
        v6 = v4;
        if (a1 == v6)
            v6 = sub_9de208(a2);
        v7 = sub_9de208(a2);
        v8 = 0;
        if (v6 && v7)
        {
            v9 = v7;
            v10 = (unsigned int)v5 * 2;
            if (sub_9e4cdc(v6, v10))
            {
                if ((unsigned int)v5 == 8)
                {
                    sub_9dc5ec(v6->field_0, a1->field_0);
                }
                else if ((unsigned int)v5 == 4)
                {
                    sub_9dcbd0(v6->field_0, a1->field_0);
                }
                else
                {
                    if (15 >= (unsigned int)v5)
                    {
                        v11 = v6->field_0;
                        v12 = a1->field_0;
                        v13 = &v0;
                        goto LABEL_9eada4;
                    }
                    v14 = sub_9e4630(v5) - 1;
                    if ((unsigned int)v5 == 1 << (v14 & 31))
                    {
                        if (!sub_9e4cdc(v9, 4 << (v14 & 31)))
                            goto LABEL_9eadd4;
                        sub_9eaf10(v6->field_0, a1->field_0, v5, v9->field_0);
                    }
                    else
                    {
                        if (!sub_9e4cdc(v9, v10))
                            goto LABEL_9eadd4;
                        v11 = v6->field_0;
                        v12 = a1->field_0;
                        v13 = v9->field_0;
LABEL_9eada4:
                        sub_9eae1c(v11, v12, v5, v13);
                    }
                }
                *(unsigned int *)&v6->field_10 = 0;
                *(unsigned int *)&v6->field_8 = v10;
                if (v6 == v4 || sub_9e4c34(v4, v6))
                {
                    v8 = 1;
                    goto LABEL_9eadd8;
                }
            }
LABEL_9eadd4:
            v8 = 0;
        }
LABEL_9eadd8:
        sub_9de17c(a2);
    }
    else
    {
        *(unsigned int *)&v4->field_8 = 0;
        *(unsigned int *)&v4->field_10 = 0;
        v8 = 1;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v8;
    ___stack_chk_fail();
}
