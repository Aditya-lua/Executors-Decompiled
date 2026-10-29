/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf0640..0xf06b4 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f0640_0 {
    char field_0;
} st_f0640_0;

typedef struct st_f0640_1 {
    char padding_0[1152];
    unsigned long long field_480;
} st_f0640_1;

extern st_f0640_1 *g_f0d198;

unsigned long long sub_f0640(unsigned long a0)
{
    unsigned long long v5;  // x0
    unsigned long v6;  // x0
    unsigned long v7;  // x0
    st_f0640_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_f0640_0 *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = a0;
    v0 = &v1;
    v5 = sub_f13ec(g_f0d198->field_480 + 81352, &v2);
    if (!v5)
        return v5;
    v6 = *(long long *)sub_f06b4(g_f0d198->field_480 + 81352, &v2);
    v7 = *(long long *)sub_f06b4(g_f0d198->field_480 + 81352, &v2);
    return *(long long *)sub_f06b4(g_f0d198->field_480 + 81352, &v2);
}
