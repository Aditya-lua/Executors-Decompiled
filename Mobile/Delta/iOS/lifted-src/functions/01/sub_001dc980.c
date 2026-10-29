/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1dc980..0x1dca0c (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1dc980_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_1dc980_1;

typedef struct st_1dc980_0 {
    char padding_0[1152];
    unsigned long long field_480;
} st_1dc980_0;

extern st_1dc980_0 *g_f0d198;

long long sub_1dc980(unsigned long a0)
{
    unsigned long long v3;  // x0
    st_1dc980_1 *v4;  // x8
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a0;
    v3 = sub_f0b0c(g_f0d198->field_480 + 81352, &v0);
    v4 = *(long long *)(g_f0d198->field_480 + 81360) + v3 * 16;
    if (v4 == *(long long *)(g_f0d198->field_480 + 81368))
        return 0;
    return v4->field_8;
}
