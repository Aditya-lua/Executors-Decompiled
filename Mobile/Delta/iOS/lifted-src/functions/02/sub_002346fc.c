/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2346fc..0x234764 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2346fc_0 {
    char padding_0[8];
    char *field_8;
    struct st_2346fc_1 *field_10;
} st_2346fc_0;

typedef struct st_2346fc_1 {
    char field_0;
    char padding_1[23];
    unsigned int field_18;
} st_2346fc_1;


char * sub_2346fc(st_2346fc_0 *a0)
{
    char *v2;  // x20
    char *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    if (a0->field_10 <= v2)
    {
        v3 = sub_2339b0(a0);
        a0->field_8 = v3;
        return v3 - 32;
    }
    *v2 = 0;
    *(unsigned int *)&v2[24] = 0xffffffff;
    sub_234a74(v2);
    a0->field_8 = v2 + 32;
    return v2;
}
