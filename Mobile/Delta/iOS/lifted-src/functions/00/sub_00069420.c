/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x69420..0x694dc (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_69420_0 {
    char field_0;
} st_69420_0;


unsigned long long sub_69420(long long a0)
{
    st_69420_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_69420_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (sub_9fd8() & 1)
    {
        return 80;
    }
    else if (sub_9fd8(a0, "http") & 1)
    {
        return 80;
    }
    else if (sub_9fd8(a0, "wss") & 1)
    {
        return 443;
    }
    else if (sub_9fd8(a0, "https"))
    {
        return 443;
    }
    else
    {
        return 0xffffffff;
    }
}
