/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x42648..0x42684 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_42648_0 {
    char field_0;
} st_42648_0;


void sub_42648(unsigned long a0, unsigned long long a1, long long a2)
{
    st_42648_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_42648_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!(a1 >> 31 & 1))
        return;
    sub_45808(a2, "Exceeded constant limit; simplify the code to compile");
}
