/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ce6d0..0x3ce834 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3ce6d0_0 {
    char field_0;
} st_3ce6d0_0;

typedef struct st_3ce6d0_1 {
    unsigned long long field_0;
} st_3ce6d0_1;

extern st_3ce6d0_1 *g_f0b120;

unsigned long long sub_3ce6d0(long long *a0, unsigned long long a1)
{
    unsigned long idx;  // x21
    unsigned int v5;  // w1
    unsigned long long v6;  // x0
    unsigned int i;  // w0
    st_3ce6d0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3ce6d0_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    idx = a0 + 0x800;
    v1 = &v0;
    v0 = &v1;
    a0[0x909] = 0xffffffff00000000;
    *(char *)(idx + 2088) = 0xff;
    if (sub_3d45d0() == 216)
    {
        if ((unsigned int)a1 == 1)
            return 1;
        v5 = sub_3d45d0(a0);
        if (v5 != 194)
        {
            do
            {
                if ((v5 & 254) == 192)
                    break;
                v6 = sub_3d15e4(a0);
                if (!(unsigned int)v6)
                    return v6;
                while (1)
                {
                    i = sub_3d45d0(a0);
                    if (i != 0xff)
                        break;
                    if (sub_3d2248(*a0))
                        g_f0b120();
                }
                v5 = i;
            } while (i != 194);
        }
        *(unsigned int *)(idx + 2096) = v5 == 194;
        return sub_3d60c0(a0, a1) != 0;
    }
    g_f0b120();
}
