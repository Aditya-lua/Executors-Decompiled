/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c904..0x3c980 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c904_0 {
    char field_0;
} st_3c904_0;


long long sub_3c904(long long *a0, long long a1, unsigned long long a2)
{
    st_3c904_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3c904_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (0x8000 <= (int)a2)
    {
        sub_2fdb0(*a0, 66, a1, 0);
        return sub_31514(*a0, a2);
    }
    return sub_2fdb0(*a0, 5, a1, (short)a2);
}
