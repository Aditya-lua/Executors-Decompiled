/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab19f0..0xab1ac4 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab19f0_0 {
    char padding_0[80];
    long long field_50;
    long long field_58;
    long long field_60;
    char padding_68[112];
    unsigned int field_d8;
} st_ab19f0_0;


long long sub_ab19f0(st_ab19f0_0 *a0, long long a1, long long a2, long long a3)
{
    long long v2;  // x20
    long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1 && !a0->field_50 || !a2 && !a0->field_58 || !a3 && !a0->field_60)
        return 0;
    if (a1)
    {
        sub_9e4838();
        a0->field_50 = a1;
        sub_9e5d14(a1, 4);
    }
    if (a2)
    {
        v2 = a2;
        sub_9e4838(a0->field_58);
        a0->field_58 = v2;
        sub_9e5d14(v2, 4);
    }
    if (a3)
    {
        v3 = a3;
        sub_9e4838(a0->field_60);
        a0->field_60 = v3;
        sub_9e5d14(v3, 4);
    }
    a0->field_d8 = a0->field_d8 + 1;
    return 1;
    return 0;
}
