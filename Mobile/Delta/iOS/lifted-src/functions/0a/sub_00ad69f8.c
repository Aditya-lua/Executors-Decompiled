/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad69f8..0xad6a28 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad69f8_0 {
    int field_0;
    char padding_4[4];
    struct st_ad69f8_1 *field_8;
} st_ad69f8_0;

typedef struct st_ad69f8_1 {
    unsigned long long field_0;
} st_ad69f8_1;


unsigned long long sub_ad69f8(st_ad69f8_0 *a0, unsigned long long a1)
{
    if (!a0)
    {
        return 0;
    }
    else if (a1 >> 31 & 1)
    {
        return 0;
    }
    else if (a0->field_0 > (int)a1)
    {
        return *(long long *)&a0->field_8[a1 & 0xffffffff];
    }
    else
    {
        return 0;
    }
}
