/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa12610..0xa12650 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a12610_0 {
    char padding_0[64];
    long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned long long field_58;
    long long field_60;
    long long field_68;
} st_a12610_0;


unsigned long long sub_a12610(st_a12610_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9e4838(a0->field_40);
    sub_9e4838(a0->field_60);
    v2 = sub_9e4838(a0->field_68);
    a0->field_48 = 0;
    a0->field_50 = 0;
    a0->field_58 = 0xffffffff00000000;
    return v2;
}
