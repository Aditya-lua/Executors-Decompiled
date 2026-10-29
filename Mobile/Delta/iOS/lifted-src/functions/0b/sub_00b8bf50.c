/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb8bf50..0xb8c08c (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b8bf50_0 {
    char padding_0[8];
    struct st_b8bf50_1 *field_8;
    unsigned long long field_10;
    char padding_18[8];
    struct st_b8bf50_1 *field_20;
    unsigned long long field_28;
} st_b8bf50_0;

typedef struct st_b8bf50_1 {
    unsigned long long field_0;
} st_b8bf50_1;

extern char g_e062e5;

unsigned long long sub_b8bf50(st_b8bf50_0 *a0)
{
    unsigned long long *v2;  // x8
    unsigned long long v3;  // x9
    unsigned long long *v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_28)
    {
        goto *((void *)(sub_b8bf88 + (&g_e062e5)[*(long long *)a0->field_20] * 4));
    }
    else
    {
        v2 = a0->field_8;
        v3 = a0->field_10 * 24;
        while (1)
        {
            v4 = v2;
            if (!v3)
                return 0;
            v2 = v4 + 3;
            v3 -= 24;
            if (*v4 != 0x8000000000000000)
                return 1;
        }
    }
}
