/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96c56c..0x96c6cc (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96c56c_1 {
    char padding_0[2176];
    struct st_96c56c_0 *field_880;
} st_96c56c_1;

typedef struct st_96c56c_0 {
    char padding_0[30];
    char field_1e;
} st_96c56c_0;

typedef struct st_96c56c_2 {
    char padding_0[36];
    unsigned int field_24;
} st_96c56c_2;

extern void g_d280f4;
extern char g_10002b0;

unsigned long long sub_96c56c(st_96c56c_1 *a0, long long a1, char a2)
{
    unsigned long long v4;  // x0
    char v5;  // w0
    void* v6;  // x8
    unsigned long long v7;  // x9
    char v8;  // x9
    unsigned long v9;  // x21
    unsigned int v10;  // w8
    unsigned long long v11;  // x9
    st_96c56c_2 **v12;  // x10
    char v13;  // x9
    char v0;  // [bp-0x6a]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = sub_af1e94(a1);
    if (v4)
    {
        if (sub_a5b3bc())
        {
            if ((int)sub_a5b508(v4, &v0, 50, 0) > 0)
            {
                v5 = sub_a99eb4(&v0);
                if (v5)
                {
                    v6 = &g_d280f4;
                    v7 = 45;
                    do
                    {
                        v8 = v7;
                        if (*(int *)((char *)v6 - 4) == v5)
                        {
                            v9 = *(short *)v6;
                            goto LABEL_96c608;
                        }
                    } while ((v6 += 8, v7 = v8 - 1, v8 != 1));
                }
            }
            v9 = 0;
LABEL_96c608:
            v4 = sub_968ec0(a0, v9, !*(int *)&a0->padding_0[120]);
            if ((unsigned int)v4)
            {
                if (!a2 || !(a0->field_880->field_1e & 3))
                    goto LABEL_96c67c;
                if ((unsigned int)v9 != 23)
                {
                    if ((unsigned int)v9 != 24 || (v10 = 795, v11 = *(long long *)&a0[2].padding_0[1152], !*(long long *)&a0[2].padding_0[1152]))
                        goto LABEL_96c6c0;
LABEL_96c654:
                    v12 = *(long long *)&a0[2].padding_0[1144];
                    do
                    {
                        v13 = v11;
                        if (v10 == *v12->field_24)
                            goto LABEL_96c67c;
                    } while ((v4 = 0, v12 += 1, v11 = v13 - 1, v13 != 1));
                }
                else
                {
                    v10 = 794;
                    v11 = *(long long *)&a0[2].padding_0[1152];
                    if (*(long long *)&a0[2].padding_0[1152])
                        goto LABEL_96c654;
LABEL_96c6c0:
                    v4 = 0;
                }
            }
        }
        else
        {
LABEL_96c67c:
            v4 = 1;
        }
    }
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
