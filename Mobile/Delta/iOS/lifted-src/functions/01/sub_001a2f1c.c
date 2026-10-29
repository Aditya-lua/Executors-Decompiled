/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a2f1c..0x1a2f68 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a2f1c_0 {
    char field_0;
} st_1a2f1c_0;

typedef struct st_1a2f1c_1 {
    char padding_0[1152];
    unsigned long long field_480;
} st_1a2f1c_1;

extern st_1a2f1c_1 *g_f0d198;

int sub_1a2f1c(void)
{
    st_1a2f1c_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1a2f1c_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    sub_27250(g_f0d198->field_480 + 43840, *(long long *)(g_f0d198->field_480 + 43840));
    return 0;
}
