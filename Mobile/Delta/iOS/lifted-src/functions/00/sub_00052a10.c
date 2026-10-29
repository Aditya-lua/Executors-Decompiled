/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52a10..0x52acc (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52a10_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    long long field_20;
} st_52a10_1;

typedef struct st_52a10_0 {
    char field_0;
} st_52a10_0;

extern unsigned long long g_e68f68;
extern unsigned long long g_e68f78;
extern unsigned int g_f00b50;

void sub_52a10(long long a0, st_52a10_1 *a1, long long a2)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned long long *v10;  // x9
    st_52a10_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_52a10_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    v10 = &g_e68f68;
    if (a1)
    {
        if (a1->field_8 == g_f00b50)
        {
            if (!sub_37060(a0, a1->field_20))
                sub_1935c(&a1->field_20, a2);
            v10 = &g_e68f78;
        }
        goto *((void *)(*v10));
    }
    else
    {
        goto *((void *)(g_e68f68));
    }
}
