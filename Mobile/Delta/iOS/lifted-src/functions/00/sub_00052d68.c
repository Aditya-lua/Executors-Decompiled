/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52d68..0x52ef4 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52d68_0 {
    char field_0;
} st_52d68_0;


unsigned long long sub_52d68(unsigned long a0)
{
    st_52d68_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_52d68_0 *v1;  // [bp-0x20]
    unsigned long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = a0;
    if (sub_1935c(&v2, "nil") & 1)
    {
        return 0;
    }
    else if (sub_1935c(&v2, "boolean") & 1)
    {
        return 1;
    }
    else if (sub_1935c(&v2, "number") & 1)
    {
        return 2;
    }
    else if (sub_1935c(&v2, "integer") & 1)
    {
        return 10;
    }
    else if (sub_1935c(&v2, "string") & 1)
    {
        return 3;
    }
    else if (sub_1935c(&v2, "thread") & 1)
    {
        return 6;
    }
    else if (sub_1935c(&v2, "buffer") & 1)
    {
        return 9;
    }
    else if (sub_1935c(&v2, "vector") & 1)
    {
        return 8;
    }
    else if (sub_1935c(&v2, "any") & 1)
    {
        return 15;
    }
    else if (sub_1935c(&v2, "unknown"))
    {
        return 15;
    }
    else
    {
        return 0x100;
    }
}
