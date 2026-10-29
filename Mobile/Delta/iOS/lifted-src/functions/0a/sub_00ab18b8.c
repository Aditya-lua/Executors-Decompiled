/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab18b8..0xab1958 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab18b8_0 {
    char padding_0[40];
    long long field_28;
    long long field_30;
    long long field_38;
    char padding_40[152];
    unsigned int field_d8;
} st_ab18b8_0;


long long sub_ab18b8(st_ab18b8_0 *a0, long long a1, long long a2, long long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1 && !a0->field_28 || !a2 && !a0->field_30)
        return 0;
    if (a1)
    {
        sub_9e48d4();
        a0->field_28 = a1;
    }
    if (a2)
    {
        sub_9e48d4(a0->field_30);
        a0->field_30 = a2;
    }
    if (a3)
    {
        sub_9e4838(a0->field_38);
        a0->field_38 = a3;
        sub_9e5d14(a3, 4);
    }
    a0->field_d8 = a0->field_d8 + 1;
    return 1;
    return 0;
}
