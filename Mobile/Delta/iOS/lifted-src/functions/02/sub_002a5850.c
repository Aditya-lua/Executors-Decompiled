/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a5850..0x2a589c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a5850_0 {
    char padding_0[8];
    char *field_8;
} st_2a5850_0;


st_2a5850_0 * sub_2a5850(st_2a5850_0 *a0, char *a1)
{
    char *i;  // x21
    st_2a5850_0 *v3;  // x0
    char *v4;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a0->field_8;
    for (v3 = a0; i != a1; i = v4)
    {
        v4 = i - 16;
        v3 = sub_2a6e94(v4 + 8, *(i - 16));
    }
    a0->field_8 = a1;
    return v3;
}
