/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c3708..0x9c3834 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c3708_0 {
    struct st_9c3708_0 *field_0;
    char field_1;
    char padding_2[6];
    unsigned long long field_8;
} st_9c3708_0;

extern char g_10002b0;

st_9c3708_0 * sub_9c3708(long long a0, st_9c3708_0 *a1)
{
    st_9c3708_0 *v4;  // w9
    st_9c3708_0 *v5;  // x21
    st_9c3708_0 *v6;  // w2
    unsigned long long v7;  // x22
    char v8;  // x8
    unsigned int v9;  // w8
    unsigned long v10;  // x8
    st_9c3708_0 *v11;  // w0
    char v0;  // [bp-0x98]
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if (a1)
    {
        v4 = (st_9c3708_0 *)(int)a1->field_0;
        if (v4 >= 1)
        {
            v5 = 0;
            v6 = (st_9c3708_0 *)0;
            v7 = *(long long *)&a1->field_1;
            do
            {
                if (*(v7 + (char *)v5) == 127)
                {
                    v8 = 46;
                }
                else
                {
                    v9 = *(v7 + (char *)v5);
                    if (v9 == 10)
                        v8 = v9;
                    else
                        v8 = 46;
                    if (v9 == 13)
                        v8 = v9;
                    if (31 < (int)v9)
                        v8 = v9;
                }
                *(char *)(&v0 + v6) = v8;
                v10 = (char *)&v6->field_0 + 1;
                if (v6 < 79)
                {
                    v6 = (st_9c3708_0 *)(unsigned int)v10;
                    continue;
                }
                else
                {
                    if ((int)sub_9d3fec(a0, &v0, v10) < 1)
                        goto LABEL_9c37fc;
                    v6 = (st_9c3708_0 *)0;
                    v4 = (st_9c3708_0 *)(int)a1->field_0;
                }
            } while ((v5 = (char *)&v5->field_0 + 1, v4 > v5));
            if (v6 >= 1 && (int)sub_9d3fec(a0, &v0) < 1)
                goto LABEL_9c37fc;
        }
        v11 = (st_9c3708_0 *)1;
    }
    else
    {
LABEL_9c37fc:
        v11 = (st_9c3708_0 *)0;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v11;
    ___stack_chk_fail();
}
