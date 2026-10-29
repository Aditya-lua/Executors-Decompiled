/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95fa14..0x95fa60 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95fa14_0 {
    unsigned int field_0;
    char padding_4[2380];
    unsigned int field_950;
    char padding_954[4];
    unsigned long long field_958;
} st_95fa14_0;


void sub_95fa14(st_95fa14_0 *a0, unsigned int a1, unsigned long long a2)
{
    unsigned long v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return;
    v2 = a0->field_0;
    if ((unsigned int)v2)
    {
        if (v2 >> 7 & 1)
        {
            a0 = sub_980dc8();
            if (!a0)
                return;
        }
        else
        {
            return;
        }
    }
    a0->field_950 = a1;
    if (!a2)
        return;
    a0->field_958 = a2;
    return;
}
