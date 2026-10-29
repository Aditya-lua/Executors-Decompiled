/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6d614..0x6d6b8 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6d614_0 {
    char field_0;
} st_6d614_0;


long long sub_6d614(unsigned long a0, unsigned long a1, unsigned int *a2)
{
    unsigned long v5;  // x0
    unsigned int i;  // w19
    char v7;  // x8
    unsigned long long v8;  // x0
    st_6d614_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_6d614_0 *v1;  // [bp-0x60]
    char v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = a2[1];
    if ((unsigned int)v5 == *a2)
        return v5;
    i = (unsigned int)(v5 - *a2) + 1;
    if (!i)
    {
        sub_6e978(&v2);
        return sub_6d6b8(&v2);
    }
    if (!(i * 0x100000000))
        v7 = 32;
    else
        v7 = Clz(i * 0x100000000);
    sub_6e978();
    do
    {
        v8 = sub_6d6b8(&v2);
    } while (i <= (unsigned int)v8);
    return *a2 + v8;
}
