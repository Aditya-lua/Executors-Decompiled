/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadfae0..0xadfbdc (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adfae0_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_adfae0_0;

typedef struct st_adfae0_1 {
    char padding_0[8];
    struct st_adfae0_0 *field_8;
} st_adfae0_1;

extern long long g_eb5038;

int sub_adfae0(st_adfae0_1 **a0, long long a1, unsigned long long a2, unsigned int a3)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // 4165
    unsigned int v4;  // w21
    unsigned long long v5;  // 4131
    unsigned long long v6;  // x22
    st_adfae0_1 *v7;  // x19
    unsigned long long v8;  // x0
    long long v9;  // x21
    char *v10;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    v3 = arm64g_calculate_condition(177, a2 & 0xffffffff, 7, 0);
    if (v3 & 1)
        v4 = (unsigned int)a2 + 14;
    else
        v4 = (unsigned int)a2 + 7;
    v5 = arm64g_calculate_condition(67, 0, a2 & 0xffffffff, 0);
    if (v5 & 1)
        v6 = (unsigned int)a2 & 7;
    else
        v6 = -(-(unsigned int)a2 & 7);
    if (!(a2 >> 31 & 1) && (int)(a3 * 8) >= (int)a2)
    {
        v2 = sub_9cde20(&g_eb5038);
        if (v2)
        {
            v7 = v2;
            *(unsigned int *)v2 = 0;
            v8 = *(long long *)(v2 + 8);
            if (v8 || (v8 = sub_9cf14c(0), v7->field_8 = v8, v8))
            {
                v9 = (int)(v4) >> 3;
                if (!sub_9c026c(v8, a1, v9))
                    goto LABEL_adfbb4;
                if ((int)v6 >= 1)
                {
                    v10 = v7->field_8->field_8 + (v9 & 0xffffffff);
                    *(v10 - 1) = *(v10 - 1) & (char)(-0x100 >> ((char)v6 & 31));
                }
                sub_9c76f4(v7->field_8, 8 - v6);
                *a0 = v7;
                v2 = 1;
            }
            else
            {
LABEL_adfbb4:
                sub_9cd960(v7, &g_eb5038);
                v2 = 0;
            }
        }
    }
    return v2;
}
