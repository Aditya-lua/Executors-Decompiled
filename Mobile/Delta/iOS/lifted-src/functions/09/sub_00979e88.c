/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x979e88..0x979f24 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_979e88_0 {
    char padding_0[1568];
    unsigned int field_620;
} st_979e88_0;

extern unsigned long long g_d28490[4];

unsigned long long sub_979e88(long long a0, st_979e88_0 *a1)
{
    unsigned int v3;  // w8
    unsigned long long v4;  // x21
    unsigned long long v5;  // x0
    char v0;  // [bp-0x50]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = (a1->field_620 * 0x8000 | a1->field_620 >> 0x11) & 0xffff8007 & 7;
    if (3 >= v3)
        v4 = g_d28490[v3];
    else
        v4 = 2;
    if (!*(long long *)&a1->padding_0[1120 + 8 * v4])
        return 0;
    sub_989228(&a1->padding_0[992], &v0);
    v5 = sub_97bc6c(&a1->padding_0[96 * v4 + 368], a0, v0);
    if (!(unsigned int)v5)
        return v5;
    return sub_9862fc(*(long long *)&a1->padding_0[1120 + 8 * v4], a0);
}
