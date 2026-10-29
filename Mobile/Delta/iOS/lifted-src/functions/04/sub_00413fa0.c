/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x413fa0..0x414044 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_413fa0_0 {
    char field_0;
} st_413fa0_0;


void* sub_413fa0(void* iter, double a1)
{
    st_413fa0_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_413fa0_0 *v1;  // [bp-0x30]
    unsigned int v2;  // [bp-0x28]
    unsigned int v3;  // [bp-0x24]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if ((long long)__double_as_longlong(a1) < 0)
    {
        *(char *)iter = 45;
        iter += 1;
        if (-__double_as_longlong(a1) != 0.0)
        {
            v3 = 0;
            v2 = 0;
            sub_3f8e84(iter, &v3, &v2);
            return sub_419838(iter, v3, v2, 0xfffffffc, 15);
        }
    }
    else if (a1 != 0.0)
    {
        v3 = 0;
        v2 = 0;
        sub_3f8e84(iter, &v3, &v2);
        return sub_419838(iter, v3, v2, 0xfffffffc, 15);
    }
    *(unsigned short *)iter = 11824;
    *(char *)&iter[2] = 48;
    return iter + 3;
}
