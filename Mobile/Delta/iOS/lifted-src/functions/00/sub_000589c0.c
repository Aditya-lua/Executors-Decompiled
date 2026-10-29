/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x589c0..0x58ad4 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_589c0_0 {
    char field_0;
} st_589c0_0;


unsigned int sub_589c0(void* a0, void* a1)
{
    unsigned int v4;  // w8
    st_589c0_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_589c0_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = (int)a0[12] & 15;
    if (v4 != (int)a1[12])
        return 0;
    if (2 >= (int)v4)
    {
        if (!v4)
        {
            return 1;
        }
        else if (v4 == 1)
        {
            return *(int *)a0 == *(int *)a1;
        }
        else if (v4 == 2)
        {
            if (*(long long *)a0 != *(long long *)a1)
                return 0;
            return (int)a0[8] == (int)a1[8];
        }
    }
    else
    {
        if (v4 == 5)
        {
            return sub_58ad4();
        }
        else if (v4 != 4 && v4 == 3)
        {
            return *(double *)a0 == *(double *)a1;
        }
    }
    return *(long long *)a0 == *(long long *)a1;
}
