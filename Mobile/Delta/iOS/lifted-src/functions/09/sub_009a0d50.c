/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a0d50..0x9a0e00 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a0d50_0 {
    char padding_0[1];
    char field_1;
    char padding_2[14];
    unsigned long long field_10;
    char padding_18[8];
    long long field_20;
    char padding_28[8];
    long long field_30;
} st_9a0d50_0;

extern char g_9a0e00;

unsigned long long sub_9a0d50(st_9a0d50_0 **a0)
{
    st_9a0d50_0 *v2;  // x0
    st_9a0d50_0 *v3;  // x8
    st_9a0d50_0 *v4;  // x21
    unsigned long long *v5;  // x22
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    v3 = a0[1];
    if (a0[1])
    {
        v4 = 0;
        v5 = &*a0->field_30;
        do
        {
            if (*(long long *)((char *)v5 - 32) == &g_9a0e00)
            {
                sub_a6c2e4(*(long long *)((char *)v5 - 16), "ssl/statem/extensions_cust.c", 382);
                sub_a6c2e4(*v5, "ssl/statem/extensions_cust.c", 383);
                v3 = a0[1];
            }
        } while ((v4 = &v4->field_1, v5 += 7, v3 > v4));
        v2 = *a0;
    }
    v6 = sub_a6c2e4(v2, "ssl/statem/extensions_cust.c", 385);
    *a0 = 0;
    a0[1] = 0;
    return v6;
}
