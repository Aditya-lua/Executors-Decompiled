/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f57b4..0x9f5910 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f57b4_0 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned int field_20;
} st_9f57b4_0;

extern long long g_9f5a4c;
extern long long g_f127c0;
extern long long g_f127c8;

unsigned long long sub_9f57b4(unsigned int a0)
{
    unsigned long long v3;  // x0
    long long v4;  // x0
    long long v5;  // x22
    long long v6;  // x20
    unsigned int v7;  // w0
    unsigned int v8;  // w26
    unsigned long v9;  // x23
    st_9f57b4_0 *v10;  // x24
    unsigned long v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9f5910();
    if (!(unsigned int)v3)
        return v3;
    sub_a7bd78(g_f127c0);
    v4 = sub_a7bf24(&g_f127c8);
    v0 = sub_ad5f4c(v4);
    if (!v0)
        return sub_a7bd80();
    v5 = v0;
    v6 = sub_ad61b4();
    v7 = sub_ad69e4(v5);
    if ((int)v7 >= 1)
    {
        v8 = v7 + 1;
        do
        {
            v9 = v8 - 2;
            v10 = sub_ad69f8(v5, v9);
            if ((int)v10->field_20 > 0)
            {
                if (!a0)
                    continue;
            }
            else
            {
                if (!a0 && !v10->field_0)
                    continue;
            }
            sub_ad664c(v5, v9);
            sub_ad68a0(v6, v10);
        } while ((v8 -= 1, v8 > 1));
    }
    if (!sub_ad69e4(v5))
    {
        sub_ad6020(v5);
        v0 = 0;
    }
    sub_a7bf2c(&g_f127c8, &v0);
    sub_a7bd80(g_f127c0);
    sub_a7bd88(g_f127c0);
    sub_ad6020(v4);
    return sub_ad6958(v6, &g_9f5a4c);
}
