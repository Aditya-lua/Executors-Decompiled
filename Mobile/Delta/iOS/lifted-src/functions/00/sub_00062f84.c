/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x62f84..0x62fd8 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_62f84_0 {
    char padding_0[8];
    char field_8;
} st_62f84_0;


st_62f84_0 * sub_62f84(st_62f84_0 *a0, st_62f84_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_8 == 1)
        a0 = &a1[3].padding_0[5];
    if (!a1)
        return a0;
}
