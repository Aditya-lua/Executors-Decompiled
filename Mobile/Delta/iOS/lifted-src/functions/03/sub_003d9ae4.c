/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d9ae4..0x3d9b64 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d9ae4_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    unsigned int field_30;
    unsigned int field_34;
} st_3d9ae4_0;


st_3d9ae4_0 * sub_3d9ae4(st_3d9ae4_0 *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x8

    a0->field_0 = a1;
    a0->field_8 = a2;
    v0 = a2 >> 5;
    if (!(a2 & 31))
        v1 = v0;
    else
        v1 = v0 + 1;
    v2 = a2 / v1;
    a0->field_10 = v2;
    a0->field_18 = v1;
    a0->field_20 = v1 + -a2 + v1 * v2;
    *(unsigned long long *)a0->padding_28 = 0;
    if (30 < v2)
    {
        a0->field_30 = 0xffffffff >> ((char)-(unsigned int)v2 & 31);
        a0->field_34 = 0xffffffff;
        return a0;
    }
    else if (v1 > a2)
    {
        a0->field_30 = 0;
        a0->field_34 = 0xffffffff >> ((char)~(unsigned int)v2 & 31);
        return a0;
    }
    else
    {
        a0->field_30 = 0xffffffff >> ((char)-(unsigned int)v2 & 31);
        a0->field_34 = 0xffffffff >> ((char)~(unsigned int)v2 & 31);
        return a0;
    }
}
