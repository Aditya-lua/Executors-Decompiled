/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9808c8..0x9809f4 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9808c8_1 {
    char field_0[21];
    char field_d;
} st_9808c8_1;

typedef struct st_9808c8_0 {
    long long field_0;
    char field_8;
    char padding_9[15];
    long long field_18;
    char padding_20[8];
    long long field_28;
} st_9808c8_0;

extern char g_10002b0;

char * sub_9808c8(st_9808c8_0 *a0, unsigned long a1, char *a2, st_9808c8_1 *a3, char *a4)
{
    char *v6;  // x0
    char *v7;  // x20
    char *i;  // x25
    char *v10;  // x8
    uint128_t v0;  // [bp-0x90]
    unsigned long v1;  // [bp-0x83]
    unsigned long long *v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v6 = sub_9806fc();
    if (v6)
    {
        v7 = v6;
        if (a2 == 1)
        {
            if (!*(long long *)&v6[32])
                goto LABEL_980964;
        }
        else
        {
            if ((unsigned long long)*(long long *)&v6[32] <= 0x3fffffffffffffff)
            {
LABEL_980964:
                i = 9;
                while (i != 1)
                {
                    v6 = sub_98e30c(a0->field_0, a0->field_28, a3);
                    if (!(unsigned int)v6)
                    {
                        if (*(long long *)&g_10002b0 == v3)
                            return v6;
                        ___stack_chk_fail();
                    }
                    else
                    {
                        v0 = *(int128_t *)&a3->field_0[0];
                        v1 = *(long long *)&a3->field_0[13];
                        v2 = &a0->field_8;
                        i -= 1;
                        if (!sub_a66b6c(a0->field_18, &v0))
                        {
                            v6 = sub_9807e4(a0, v7, a3);
                            if (!v6)
                            {
                                if (*(long long *)&g_10002b0 == v3)
                                    return v6;
                                ___stack_chk_fail();
                            }
                            else
                            {
                                v10 = *(long long *)&v7[32];
                                *(char **)&v6[24] = v10;
                                v6[48] = v6[48] & 252 | (v6[48] & 252 | (char)a2 & 3) & 3;
                                if (a4)
                                    *(char **)a4 = v10;
                                *(long long *)&v7[32] = *(long long *)&v7[32] + 1;
                                if (*(long long *)&g_10002b0 == v3)
                                    return 1;
                                ___stack_chk_fail();
                            }
                        }
                    }
                }
            }
        }
        if (*(long long *)&g_10002b0 == v3)
            return 0;
        ___stack_chk_fail();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v3)
            return v6;
        ___stack_chk_fail();
    }
}
