/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9805a8..0x98060c (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9805a8_0 {
    char padding_0[8];
    long long field_8;
} st_9805a8_0;

typedef struct st_9805a8_1 {
    char padding_0[32];
    long long field_20;
} st_9805a8_1;

extern long long g_980d4c;

void sub_9805a8(st_9805a8_0 *a0, st_9805a8_1 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_a19710(a0->field_8, 0);
    sub_a66ccc(a0->field_8, &g_980d4c, a1);
    sub_a66994(a1->field_20, a0);
    sub_a66664(a0->field_8);
}
