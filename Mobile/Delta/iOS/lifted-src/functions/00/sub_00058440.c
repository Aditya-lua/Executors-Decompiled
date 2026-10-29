/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x58440..0x584a0 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_58440_0 {
    char field_0;
} st_58440_0;

extern char g_1000280;

long long sub_58440(unsigned int a0, unsigned long a1)
{
    st_58440_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_58440_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0 <= 127)
        return (*(int *)&(&g_1000280)[60 + 4 * a0] & a1) != 0;
    return ___maskrune() != 0;
}
