/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f32ac..0x1f3348 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f32ac_0 {
    char field_0;
} st_1f32ac_0;


long long sub_1f32ac(long long a0, long long a1, unsigned long long *a2, unsigned long long a3, unsigned long long *a4, unsigned int a5)
{
    unsigned int v4;  // w0
    st_1f32ac_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1f32ac_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if ((unsigned int)a3 <= a5)
        return a1;
    v4 = sub_1f32ac(a0, a1, a2, a3, a4, 1 | __ROL__(a5, 1) & 0xfffffffe);
    a4[a5] = a2[v4];
    return sub_1f32ac(a0, v4 + 1, a2, a3, a4, a5 * 2 + 2);
}
