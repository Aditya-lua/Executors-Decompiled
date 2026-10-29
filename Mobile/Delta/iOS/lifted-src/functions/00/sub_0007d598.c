/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7d598..0x7d5d8 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7d598_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[16];
    char field_38;
    char padding_39[7];
    unsigned long long field_40;
} st_7d598_0;


unsigned long long sub_7d598(st_7d598_0 *a0, unsigned long a1)
{
    unsigned long long v0;  // x0
    unsigned long long v1;  // x9

    if (!(int)a0->field_40)
    {
        v0 = a0->field_10;
        v1 = v0 + (a1 + 7 & 0xfffffffffffffff8);
        if (v1 <= a0->field_8)
        {
            a0->field_10 = v1;
            a0->field_18 = v1;
            a0->field_20 = v1;
            return v0;
        }
    }
    a0->field_38 = 1;
    return 0;
}
