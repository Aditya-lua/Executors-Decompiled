/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf3410..0xaf3570 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af3410_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[136];
    long long field_98;
} st_af3410_0;

extern char g_10002b0;

unsigned long long sub_af3410(st_af3410_0 **a0, unsigned long long a1)
{
    long long *v8;  // x22
    unsigned long long v9;  // x0
    unsigned long long v10;  // x19
    unsigned long long v11;  // x0
    unsigned long long v12;  // x23
    unsigned long v13;  // x21
    char v0;  // [bp-0x154]
    unsigned int v1;  // [bp-0x150]
    char *v2;  // [bp-0x148]
    char v3;  // [bp-0x140]
    unsigned long long v4;  // [bp-0x128]
    unsigned long v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = *a0;
    v9 = sub_af2ca0();
    if (!(v9 >> 31 & 1))
    {
        v10 = sub_ad61b4();
        if ((unsigned int)v9)
        {
            if (sub_a7c198(v8[19]))
            {
                sub_ad6ae4(v8[1]);
                v1 = 2;
                v2 = &v3;
                v4 = a1;
                v11 = sub_ad6894(v8[1], &v1, &v0);
                if (!(v11 >> 31 & 1) && v0 >= 1)
                {
                    v12 = 0;
                    do
                    {
                        v13 = *(long long *)(sub_ad69f8(v8[1], v11 + v12) + 8);
                        if (!sub_af8b80(v13))
                        {
                            sub_a7c1b4(v8[19]);
                            goto LABEL_af3524;
                        }
                        else if (!sub_ad68a0(v10, v13))
                        {
                            sub_a7c1b4(v8[19]);
                            sub_af99a8(v13);
LABEL_af3524:
                            sub_ad6958(v10, sub_af99a8);
                            goto LABEL_af3534;
                        }
                    } while ((v12 = (unsigned int)v12 + 1, (int)v12 < v0));
                }
                sub_a7c1b4(v8[19]);
            }
            else
            {
                sub_ad6020(v10);
                goto LABEL_af3534;
            }
        }
    }
    else
    {
LABEL_af3534:
        v10 = 0;
    }
    if (*(long long *)&g_10002b0 == v5)
        return v10;
    ___stack_chk_fail();
}
