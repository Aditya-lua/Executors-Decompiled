/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ef30..0x1efbc (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ef30_0 {
    char field_0;
} st_1ef30_0;


long long sub_1ef30(unsigned long a0, unsigned long long a1, unsigned long a2, unsigned long a3)
{
    st_1ef30_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1ef30_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (*(int *)(a0 + 128) != ((unsigned int)a1 & 0xff))
    {
        sub_ed8c();
        return sub_1f080(a0, a1);
    }
    sub_f8d0();
    return 1;
}
