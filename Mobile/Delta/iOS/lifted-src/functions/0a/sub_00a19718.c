/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa19718..0xa197a8 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a19718_0 {
    char padding_0[40];
    struct st_a19718_1 *field_28;
} st_a19718_0;

typedef struct st_a19718_1 {
    unsigned long long field_0;
} st_a19718_1;

typedef struct st_a19718_2 {
    struct st_a19718_0 *field_0;
    char padding_8[16];
    struct st_a19718_1 *field_18;
    char padding_20[28];
    unsigned int field_3c;
    char padding_40[32];
    unsigned long long field_60;
} st_a19718_2;


long long sub_a19718(st_a19718_2 *a0, long long a1)
{
    unsigned long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0->field_28)
        a0->field_0->field_28();
    sub_a1a174(a0->field_18);
    v2 = sub_a1a70c(a1);
    a0->field_18 = v2;
    if (v2 && sub_a1abcc() == 1172)
    {
        a0->field_3c = a0->field_3c | 4;
        a0->field_60 = a0->field_60 + 1;
    }
    a0->field_60 = a0->field_60 + 1;
    return a0->field_18 != 0;
}
