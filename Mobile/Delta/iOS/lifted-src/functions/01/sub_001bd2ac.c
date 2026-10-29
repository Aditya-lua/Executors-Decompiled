/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bd2ac..0x1bd340 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bd2ac_0 {
    char field_0;
} st_1bd2ac_0;


long long sub_1bd2ac(long long a0)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    st_1bd2ac_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1bd2ac_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_1a7f50();
    v5 = sub_1af75c(a0);
    if (sub_1af75c(a0) < 2)
    {
        return 0;
    }
    else if (*(char *)(v4 + v5 - 2) == 13)
    {
        return *(char *)(v4 + v5 - 1) == 10;
    }
    else
    {
        return 0;
    }
}
