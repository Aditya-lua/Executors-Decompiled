/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa61e58..0xa62034 (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a61e58_0 {
    unsigned int field_0;
} st_a61e58_0;

extern char g_10002b0;

int sub_a61e58(long long a0, long long a1, long long a2, unsigned long long a3, long long a4, long long a5, unsigned int a6, unsigned int *a7, unsigned int *a8, long long a9)
{
    unsigned int *v6;  // x19
    unsigned long v7;  // x27
    unsigned int v8;  // w28
    unsigned long v9;  // x9
    char *v10;  // x10
    unsigned int v11;  // w21
    unsigned long v12;  // x0
    unsigned int v13;  // w0
    unsigned long v0;  // [bp-0xd8]
    char *v1;  // [bp-0xd0]
    long long v2;  // [bp-0xc8]
    char v3;  // [bp-0xa8]
    unsigned long v4;  // [bp-0x68]
    st_a61e58_0 **v5;  // [bp-0x10]

    v5 = &a8;
    v6 = a7;
    v4 = *(long long *)&g_10002b0;
    v7 = *a7;
    v8 = sub_a50ac8(a2);
    v2 = sub_9de514(a0);
    if ((int)v8 >= 1)
    {
        v9 = (int)a3;
        v1 = &(&v3)[v8];
        v10 = &v1[-1 * v9];
        if ((int)a3 >= (int)v8)
            v10 = &v3;
        v0 = (int)(a3 - v8);
        while (1)
        {
            v11 = v7;
            v12 = sub_9e804c(a9, 0, v7);
            if (!(unsigned int)v12)
                break;
            if (!a6 || (int)sub_aa8658(v2, a4, a5, 0) >= 1)
            {
                v12 = sub_a40abc(a4, a5, &v3, 0, a2, 0);
                if (!(unsigned int)v12)
                    break;
                if ((int)a3 > (int)v8)
                    _bzero(v1, v0);
                *v10 = *v10 | 128;
                *(&v10[v9] - 1) = *(&v10[v9] - 1) | 1;
                v12 = sub_9e4db0(v10, a3, a1);
                if (!v12)
                    break;
                v13 = sub_9e892c(a1, a0, a9);
                if (0 < (int)v13)
                {
                    v12 = 1;
                    break;
                }
                if (!a6)
                {
                    v12 = 0;
                    *a8 = *a8 | 16;
                    break;
                }
                v7 = v11 + 1;
                if (v13)
                    goto LABEL_a61fc0;
            }
            else
            {
LABEL_a61fc0:
                v12 = 0;
                break;
            }
        }
        v7 = v11 + 1;
    }
    else
    {
        v12 = 0;
    }
    *v6 = v7;
    if (*(long long *)&g_10002b0 == v4)
        return v12;
    ___stack_chk_fail();
}
