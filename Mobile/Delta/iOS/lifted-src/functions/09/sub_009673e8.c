/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9673e8..0x9674f0 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9673e8_1 {
    char padding_0[8];
    long long field_8;
} st_9673e8_1;

typedef struct st_9673e8_2 {
    char padding_0[768];
    struct st_9673e8_0 *field_300;
    char padding_308[1528];
    struct st_9673e8_1 *field_900;
} st_9673e8_2;

typedef struct st_9673e8_0 {
    char padding_0[28];
    unsigned int field_1c;
} st_9673e8_0;

extern char g_10002b0;

unsigned int sub_9673e8(st_9673e8_2 *a0, long long a1, long long a2, long long a3)
{
    unsigned int v6;  // x19
    long long v0;  // [bp-0x98]
    long long v1;  // [bp-0x90]
    char v2;  // [bp-0x88]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (!(a0->field_300->field_1c & 0x200))
        v6 = 12;
    else
        v6 = 32;
    if (sub_9545a8() && sub_962d78(a0, &v2, 64, &v1) && !(*(unsigned int *)&v0 = 1, !sub_9674f0(a0, a1, a2, &v2, v1, 0, 0, 0, 0, a0->field_900 + 5, a0->field_900->field_8, a3, v6, v0)))
        sub_a66ec0(&v2, v1);
    else
        v6 = 0;
    if (*(long long *)&g_10002b0 == v3)
        return v6;
    ___stack_chk_fail();
}
