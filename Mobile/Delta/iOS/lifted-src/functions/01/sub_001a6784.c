/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a6784..0x1a67e4 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a6784_0 {
    char field_0;
} st_1a6784_0;

unsigned long long sub_1a6784(long long a0, unsigned long long i, unsigned long a2)
{
    unsigned long long v4;  // x1
    unsigned long long v5;  // x0
    st_1a6784_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1a6784_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    do
    {
        v4 = i;
        v5 = sub_1b2fa0(a0);
        i = v5;
    } while (i != v4);
    return v5;
}
