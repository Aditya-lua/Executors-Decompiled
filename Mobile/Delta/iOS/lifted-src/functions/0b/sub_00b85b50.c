/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb85b50..0xb85d6c (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b85b50_0 {
    char padding_0[8];
    struct st_b85b50_1 *field_8;
    unsigned long long field_10;
} st_b85b50_0;

typedef struct st_b85b50_1 {
    unsigned long long field_0;
} st_b85b50_1;

extern char g_b85bf0;
extern char g_e0621a;

unsigned long long sub_b85b50(st_b85b50_0 *a0)
{
    unsigned long long *v12;  // x8
    unsigned long i;  // x20
    unsigned long long *v14;  // x9
    unsigned long long v15;  // x10
    unsigned long long v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    unsigned long long v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x58]
    unsigned long long v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x48]
    unsigned long long *v8;  // [bp-0x40]
    unsigned long long v9;  // [bp-0x38]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = a0->field_8;
    v4 = 2;
    v8 = v12;
    v9 = &v12[16 * a0->field_10];
    while (i)
    {
        v14 = v12;
        if (*v14 == 12)
            v15 = 0;
        else
            v15 = v12;
        v0 = 1;
        v1 = v15;
        v12 += 16;
        v2 = 1;
        v3 = v14 + 8;
        i -= 128;
        if (sub_b8a3c0() & 1)
            return 1;
    }
    if (v4 != 2)
    {
        if (v4 == 1 && v5)
            goto *((void *)(&(&g_b85bf0)[4 * (&g_e0621a)[*(long long *)v5]]));
        if (v6 == 1 && v7)
            goto *((void *)(sub_b85c24 + *(char *)(*(long long *)v7 + 14705190) * 4));
    }
    return 0;
}
