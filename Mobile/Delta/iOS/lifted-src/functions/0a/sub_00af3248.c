/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf3248..0xaf3410 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af3248_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[136];
    long long field_98;
} st_af3248_0;

extern char g_10002b0;

unsigned long long sub_af3248(st_af3248_0 **a0, long long a1)
{
    long long *v8;  // x22
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long long v11;  // x19
    unsigned long long v12;  // x21
    char v0;  // [bp-0x1dc]
    unsigned int v1;  // [bp-0x1d8]
    char *v2;  // [bp-0x1d0]
    char v3;  // [bp-0x1c8]
    long long v4;  // [bp-0x180]
    unsigned long v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = *a0;
    if (v8)
    {
        if (sub_a7c198(v8[19]))
        {
            sub_ad6ae4(v8[1]);
            v1 = 1;
            v2 = &v3;
            v4 = a1;
            v9 = sub_ad6894(v8[1], &v1, &v0);
            if (!(v9 >> 31 & 1))
            {
LABEL_af32c0:
                v11 = sub_ad61b4();
                if (!(v9 >> 31 & 1) && v11 && v0 >= 1)
                {
                    v12 = 0;
                    do
                    {
                        if (!sub_af1c48(v11, *(long long *)(sub_ad69f8(v8[1], v9 + v12) + 8), 1))
                        {
                            sub_a7c1b4(v8[19]);
                            sub_aded90(v11);
                            goto LABEL_af33d4;
                        }
                    } while ((v12 = (unsigned int)v12 + 1, (int)v12 < v0));
                }
                sub_a7c1b4(v8[19]);
            }
            else
            {
                sub_a7c1b4(v8[19]);
                v10 = sub_af2ca0(a0, 1, a1, 0);
                if ((int)v10 > 0)
                {
                    if (sub_a7c198(v8[19]))
                    {
                        sub_ad6ae4(v8[1]);
                        v1 = 1;
                        v2 = &v3;
                        v4 = a1;
                        v9 = sub_ad6894(v8[1], &v1, &v0);
                        goto LABEL_af32c0;
                    }
                    goto LABEL_af33d4;
                }
                else
                {
                    if (v10 >> 31 & 1)
                        goto LABEL_af33d4;
                    v11 = sub_ad61b4();
                }
            }
        }
        else
        {
LABEL_af33d4:
            v11 = 0;
        }
        if (*(long long *)&g_10002b0 == v5)
            return v11;
    }
    else if (*(long long *)&g_10002b0 == v5)
    {
        return sub_ad61b4();
    }
    ___stack_chk_fail();
}
