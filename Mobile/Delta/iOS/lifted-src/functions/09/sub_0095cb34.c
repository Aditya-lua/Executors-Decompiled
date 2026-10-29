/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95cb34..0x95cbe0 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95cb34_0 {
    long long field_0;
    char field_1;
    char padding_2[6];
    long long field_8;
    char padding_10[32];
    struct st_95cb34_0 *field_30;
    struct st_95cb34_0 *field_38;
    char padding_40[48];
    long long field_70;
} st_95cb34_0;

extern long long g_afa390;

void sub_95cb34(st_95cb34_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_95cb34_0 *i;  // x21
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (a0->field_30)
    {
        i = 0;
        do
        {
            sub_a6c2e4(*(long long *)(*(long long *)&a0->padding_10[24] + i * 8), "ssl/ssl_conf.c", 1104);
            i = (char *)&i->field_0 + 1;
        } while (i < a0->field_30);
    }
    sub_a6c2e4(*(long long *)&a0->padding_10[24], "ssl/ssl_conf.c", 1105);
    *(unsigned long long *)&a0->padding_10[24] = 0;
    a0->field_30 = 0;
    sub_a6c2e4(*(long long *)&a0->field_1, "ssl/ssl_conf.c", 1114);
    sub_ad6958(*(long long *)&a0->padding_40[40], &g_afa390);
    sub_a6c2e4();
    return;
}
