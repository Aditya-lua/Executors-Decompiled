/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x262d4c..0x262da8 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_262d4c_0 {
    char field_0;
} st_262d4c_0;

typedef struct st_262d4c_1 {
    char padding_0[391];
    char field_187;
} st_262d4c_1;

typedef struct st_262d4c_2 {
    char padding_0[96];
    struct st_262d4c_1 *field_60;
} st_262d4c_2;

extern st_262d4c_2 *g_f0d198;

int sub_262d4c(void)
{
    st_262d4c_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_262d4c_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (g_f0d198->field_60->field_187 >> 3 & 1)
        return 1;
    return sub_2a3e68();
}
