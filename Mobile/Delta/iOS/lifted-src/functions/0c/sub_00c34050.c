/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc34050..0xc3411c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c34050_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[15];
    char field_18;
    char padding_19[15];
    char field_28;
} st_c34050_0;

extern unsigned long long g_c36e50;
extern unsigned long long g_c37018;
extern long long g_cb9fbe;
extern long long g_cb9ff9;
extern long long g_cba029;

long long sub_c34050(st_c34050_0 *a0, unsigned long long *a1)
{
    unsigned long v10;  // x0
    unsigned long v11;  // x1
    long long v12;  // x2
    unsigned long v0;  // [bp-0x50]
    char *v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    char *v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    char *v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    if (!a0->field_0)
    {
        v7 = &a0->field_18;
        v0 = &a0->field_8;
        v1 = &v0;
        v2 = &g_c36e50;
        v3 = &v7;
        v4 = &g_c36e50;
        v5 = &a0->field_28;
        v6 = &g_c37018;
        v10 = *a1;
        v11 = a1[1];
        v12 = &g_cb9fbe;
    }
    else if (a0->field_0 == 2)
    {
        v1 = &a0->field_28;
        v2 = &g_c37018;
        v10 = *a1;
        v11 = a1[1];
        v12 = &g_cba029;
    }
    else
    {
        v7 = &a0->field_8;
        v1 = &v7;
        v2 = &g_c36e50;
        v3 = &a0->field_28;
        v4 = &g_c37018;
        v10 = *a1;
        v11 = a1[1];
        v12 = &g_cb9ff9;
    }
    return sub_be769c(v10, v11, v12, &v1);
}
