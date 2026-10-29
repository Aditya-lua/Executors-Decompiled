/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98a710..0x98a750 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98a710_0 {
    unsigned int field_0;
    char padding_4[756];
    unsigned int field_2f8;
} st_98a710_0;


unsigned int * sub_98a710(st_98a710_0 **a0)
{
    st_98a710_0 *v3;  // x0
    unsigned long long v4;  // x30
    unsigned long v5;  // x8
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v3 = *a0;
    if (!v3)
        return v3;
    v0 = &v2;
    v1 = v4;
    v5 = v3->field_0;
    if (!(unsigned int)v5)
    {
LABEL_98a73c:
        v3 = v3->field_2f8 == 13;
    }
    else if (!(v5 >> 7 & 1))
    {
        v3 = 0;
    }
    else
    {
        v3 = sub_980dc8();
        if (v3)
            goto LABEL_98a73c;
    }
    return v3;
}
