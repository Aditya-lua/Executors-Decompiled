/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa19698..0xa19700 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a19698_0 {
    char padding_0[56];
    struct st_a19698_1 *field_38;
} st_a19698_0;

typedef struct st_a19698_1 {
    unsigned long long field_0;
} st_a19698_1;

typedef struct st_a19698_2 {
    struct st_a19698_0 *field_0;
    char padding_8[16];
    long long field_18;
    long long field_20;
    char padding_28[56];
    unsigned long long field_60;
} st_a19698_2;


long long sub_a19698(st_a19698_2 *a0, long long a1)
{
    unsigned long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_0->field_38)
    {
        sub_a1a254(a0->field_20);
        v2 = sub_a1b0a8(a1, a0->field_18);
        a0->field_20 = v2;
        a0->field_60 = a0->field_60 + 1;
        return v2 != 0;
    }
    a0->field_0->field_38();
}
