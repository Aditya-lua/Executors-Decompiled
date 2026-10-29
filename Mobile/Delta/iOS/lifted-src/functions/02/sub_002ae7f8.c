/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ae7f8..0x2ae83c (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ae7f8_0 {
    char padding_0[16];
    char *field_10;
} st_2ae7f8_0;


st_2ae7f8_0 * sub_2ae7f8(st_2ae7f8_0 *a0, char *a1)
{
    st_2ae7f8_0 *v2;  // x0
    char *v3;  // x8
    unsigned long v4;  // x1
    char *v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    while (1)
    {
        v3 = a0->field_10;
        if (v3 == a1)
            break;
        v4 = *(v3 - 16);
        v5 = v3 - 16;
        a0->field_10 = v5;
        v2 = sub_2a6e94(v5 + 8, v4);
    }
    return v2;
}
