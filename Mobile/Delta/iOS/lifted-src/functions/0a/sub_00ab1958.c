/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab1958..0xab19f0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab1958_0 {
    char padding_0[64];
    long long field_40;
    long long field_48;
    char padding_50[136];
    unsigned int field_d8;
} st_ab1958_0;


long long sub_ab1958(st_ab1958_0 *a0, long long a1, long long a2)
{
    long long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1 && !a0->field_40 || !a2 && !a0->field_48)
        return 0;
    if (a1)
    {
        sub_9e4838();
        a0->field_40 = a1;
        sub_9e5d14(a1, 4);
    }
    if (a2)
    {
        v2 = a2;
        sub_9e4838(a0->field_48);
        a0->field_48 = v2;
        sub_9e5d14(v2, 4);
    }
    a0->field_d8 = a0->field_d8 + 1;
    return 1;
    return 0;
}
