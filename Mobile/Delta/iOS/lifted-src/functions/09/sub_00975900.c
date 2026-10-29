/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x975900..0x97595c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_975900_0 {
    char padding_0[240];
    struct st_975900_1 *field_f0;
    char padding_f8[2080];
    unsigned long long field_918;
} st_975900_0;

typedef struct st_975900_1 {
    unsigned long long field_0;
} st_975900_1;


int sub_975900(st_975900_0 *a0, int a1)
{
    unsigned long v2;  // x19
    unsigned long long v3;  // 4115
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    if (a0->padding_f8[214 + v2])
        return 1;
    v3 = arm64g_calculate_condition(2, (&a0->field_918)[v2], 1, 0);
    if (v3 & 1)
        return 0;
    a0->field_f0();
}
