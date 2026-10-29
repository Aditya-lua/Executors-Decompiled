/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x979cec..0x979d30 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_979cec_0 {
    char padding_0[1568];
    unsigned long long field_620;
    char field_624;
} st_979cec_0;


void sub_979cec(unsigned long a0, unsigned int a1, st_979cec_0 *a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a1 != 2)
    {
        return;
    }
    else if ((char)(*((char *)&a2->field_620 + 4)) >> 2 & 1)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        if (!sub_98e38c())
            return;
        a2->field_620 = a2->field_620 | 0x800000000;
        return;
    }
    else
    {
        return;
    }
}
