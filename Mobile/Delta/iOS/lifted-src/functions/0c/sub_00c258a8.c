/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc258a8..0xc259a4 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c258a8_0 {
    unsigned long long field_0;
    struct st_c258a8_1 *field_8;
    unsigned long long field_10;
} st_c258a8_0;

typedef struct st_c258a8_1 {
    unsigned long long field_0;
} st_c258a8_1;


void sub_c258a8(st_c258a8_0 *a0)
{
    unsigned long long *v2;  // x19
    unsigned long v3;  // x23
    unsigned long long v4;  // 4115
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    if (a0->field_10)
    {
        v3 = a0->field_10 - 1;
        do
        {
            if (*v2 != 0x8000000000000000)
                sub_c2a8d0(v2);
        } while ((v3 -= 1, v2 += 6, v4 = arm64g_calculate_condition(2, v3, 1, 0), !(v4 & 1)));
    }
    if (!a0->field_0)
        return;
    _free();
    return;
}
