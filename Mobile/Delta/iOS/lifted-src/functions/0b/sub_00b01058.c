/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb01058..0xb010d4 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b01058_0 {
    char padding_0[84];
    char field_54;
    char padding_55[163];
    char field_f8;
    char padding_f9[447];
    unsigned long long field_2b8;
} st_b01058_0;

extern long long g_9b96e0;
extern unsigned long long g_9ba8c0;
extern unsigned long long g_9bb300;
extern unsigned int g_f0d568;

int sub_b01058(st_b01058_0 *a0, long long a1, unsigned int a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_9b9440(a1, a2 * 8, a0 + 1);
    sub_a94ad4(&a0->field_f8, a0 + 1, &g_9b96e0);
    v8 = &g_9ba8c0;
    if (!(g_f0d568 & 0x10000))
        v8 = &g_9bb300;
    a0->field_2b8 = v8;
    a0->field_54 = a0->field_54 | 4;
    return 1;
}
