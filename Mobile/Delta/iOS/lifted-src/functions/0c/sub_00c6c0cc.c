/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6c0cc..0xc6c158 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6c0cc_0 {
    unsigned long long field_0;
    long long field_8;
} st_c6c0cc_0;


unsigned long long sub_c6c0cc(st_c6c0cc_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    unsigned long long v5;  // x8
    unsigned long long v6;  // 4129
    unsigned long long v7;  // x9
    unsigned long long v8;  // x9
    unsigned long long v9;  // x0
    unsigned long v0;  // [bp-0x38]
    long long v1;  // [bp-0x30]
    long long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a2 + a1;
    v6 = arm64g_calculate_condition(0x22, a2, a1, 0);
    if (!(v6 & 1))
    {
        v7 = a0->field_0 * 2;
        if (v7 >= v5)
            v5 = v7;
        v8 = 4;
        if (a4 == 1)
            v8 = 8;
        if (v8 >= v5)
            v5 = v8;
        v9 = sub_c6c158();
        if (v0 != 1)
        {
            a0->field_0 = v5;
            a0->field_8 = v1;
            return v9;
        }
    }
    else
    {
        sub_c6b970(0);
    }
    sub_c6b970(v1, v2);
}
