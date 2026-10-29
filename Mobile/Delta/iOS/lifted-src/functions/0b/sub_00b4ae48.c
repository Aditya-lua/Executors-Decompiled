/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4ae48..0xb4aee0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4ae48_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned int field_10;
    char padding_14[12];
    unsigned long long field_20;
    char padding_28[8];
    unsigned long long field_30;
    unsigned long long field_38;
    char padding_40[16];
    unsigned int field_50;
} st_b4ae48_0;


unsigned long long sub_b4ae48(st_b4ae48_0 *a0, char *iter, unsigned long long i, unsigned int a3)
{
    unsigned long long v2;  // x2
    unsigned int v3;  // w8
    unsigned int v4;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3 > a0->field_10)
        return 0;
    if (!(int)a0->field_8)
    {
        if (a0->field_30 - a0->field_38 < i)
            return 0;
        _memcpy(iter, a0->field_20 + a0->field_38);
        a0->field_38 = a0->field_38 + i;
    }
    else if (i)
    {
        do
        {
            v2 = i;
            v3 = a0->field_50 ^ a0->field_50 * 0x2000;
            v4 = v3 ^ v3 >> 0x11 ^ (v3 ^ v3 >> 0x11) * 32;
            a0->field_50 = v4;
            *iter = v4;
            iter += 1;
            i = v2 - 1;
        } while (i);
    }
    return 1;
}
