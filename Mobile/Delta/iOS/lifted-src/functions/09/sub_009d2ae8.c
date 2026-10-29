/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d2ae8..0x9d2ce0 (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

char * sub_9d2ae8(long long a0, char *a1, char *a2, char **a3)
{
    char *v5;  // x20
    char *v6;  // x21
    char *v15;  // x8
    char *v16;  // x9
    char *v17;  // x8
    unsigned long long v18;  // 4133
    char *v19;  // x26
    char *v20;  // x8
    char *v7;  // x0
    char *v8;  // x23
    long long v9;  // x0
    long long len;  // x0
    long long v11;  // x0
    char *v12;  // x27
    char *v13;  // x26
    unsigned long long v14;  // 4111
    unsigned long v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x78]
    char *v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a2;
    v6 = a1;
    v7 = sub_975ffc();
    if (!v7)
        return 0;
    v8 = v7;
    if ((!*(long long *)v7 || !*(char *)*(long long *)v7) && !*(int *)&v8[8])
    {
        if (v5)
            *(unsigned int *)&v8[12] = *(char *)(v6 + v5 - 1) == 10;
        sub_9d500c(a0);
        return sub_9d4248();
    }
    *a3 = 0;
    if (!v5)
        return 1;
    while (1)
    {
        if (*(int *)&v8[12])
        {
            if (*(long long *)v8)
            {
                v9 = sub_9d500c(a0);
                len = _strlen(*(long long *)v8);
                if (!sub_9d4248(v9, *(long long *)v8, len, &v2))
                    return 0;
            }
            v11 = sub_9d500c(a0);
            v0 = *(int *)&v8[8];
            v1 = &g_c7c2eb;
            sub_9d524c(v11, "%*s");
            *(unsigned int *)&v8[12] = 0;
        }
        if (*v6 == 10)
        {
            v12 = 1;
            v13 = 1;
            v14 = arm64g_calculate_condition(18, 0, 1, 0);
            if (!(v14 & 1))
                goto LABEL_9d2c58;
        }
        else
        {
            v15 = 1;
            do
            {
                v16 = v15;
                if (v5 == v15)
                {
                    v17 = v5;
                    goto LABEL_9d2c08;
                }
            } while ((v15 = v16 + 1, *(char *)(v6 + v16) != 10));
            v17 = v15 - 1;
LABEL_9d2c08:
            v12 = v5 > v16;
            v13 = &v17[v12 & 1];
            v18 = arm64g_calculate_condition(2, v17, v12 & 1, 0);
            if (v18 & 1)
                goto LABEL_9d2c58;
        }
        do
        {
            v19 = v13;
            v2 = 0;
            if (!sub_9d4248(sub_9d500c(a0), v6, v19, &v2))
                return 0;
        } while ((v20 = v2, v6 += v20, v5 -= v20, *a3 = *a3 + v20, v13 = v19 - v20, v19 != v20));
LABEL_9d2c58:
        if ((unsigned int)v12)
            *(unsigned int *)&v8[12] = 1;
        if (!v5)
            return 1;
    }
}
