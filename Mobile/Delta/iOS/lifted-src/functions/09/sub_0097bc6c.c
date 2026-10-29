/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97bc6c..0x97bcf0 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97bc6c_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[16];
    long long field_28;
    char padding_30[32];
    long long field_50;
    char padding_58[3];
    long long field_5b;
} st_97bc6c_0;


long long sub_97bc6c(st_97bc6c_0 *a0, long long a1, long long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_50 && !(a0->padding_58)[1])
        return 0;
    if (a1)
    {
        if (a0->field_10 + a1 > a0->field_8)
            return 0;
        sub_97bcf0();
        if (!(a0->padding_58)[1])
            sub_97bcf0(a0->field_50, a1, a0->field_28, a2);
    }
    return 1;
}
