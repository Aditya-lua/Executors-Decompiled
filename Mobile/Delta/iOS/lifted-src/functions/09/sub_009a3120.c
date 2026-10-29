/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a3120..0x9a31a8 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a3120_0 {
    char *field_0;
    unsigned long long field_8;
} st_9a3120_0;

extern char g_1000000;

int sub_9a3120(st_9a3120_0 *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x8
    char *v1;  // x9
    unsigned long long v2;  // x10
    unsigned long long v3;  // x10
    unsigned long long v4;  // x10
    unsigned long long v5;  // x10
    unsigned long long v6;  // x10
    unsigned long long v7;  // x10
    unsigned long long v8;  // x10

    v0 = a0->field_8;
    if (8 <= a0->field_8)
    {
        v1 = a0->field_0;
        v2 = *v1 * 0x100000000000000;
        *a1 = v2;
        v3 = v2 | v1[1] * 0x1000000000000;
        *a1 = v3;
        v4 = v3 | v1[2] * 0x10000000000;
        *a1 = v4;
        v5 = v4 | v1[3] * 0x100000000;
        *a1 = v5;
        v6 = v5 | v1[4] * &g_1000000;
        *a1 = v6;
        v7 = v6 | v1[5] * 0x10000;
        *a1 = v7;
        v8 = v7 | v1[6] * 0x100;
        *a1 = v8;
        *a1 = v8 | v1[7];
        a0->field_0 = v1 + 8;
        a0->field_8 = v0 - 8;
        return 1;
    }
    return 0;
}
