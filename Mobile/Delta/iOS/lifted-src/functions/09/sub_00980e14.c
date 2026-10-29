/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x980e14..0x980ea4 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_980e14_0 {
    char padding_0[64];
    struct st_980e14_0 *field_40;
    char padding_48[16];
    long long field_58;
    char padding_60[8];
    char field_68;
    char padding_69[7];
    char field_70;
} st_980e14_0;


char sub_980e14(st_980e14_0 *a0)
{
    st_980e14_0 *v2;  // x8
    st_980e14_0 *v3;  // x8
    char v4;  // w9
    long long v5;  // x0
    char v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
LABEL_980e24:
    v3 = v2;
    v4 = __ROL__(v3->field_70, 29) & 3758096387 & 3;
    if (v4 && v4 == 1)
        return 0;
    v2 = v3->field_40;
    if (!v3->field_40)
    {
        sub_97b8f0(a0->field_58, 0);
        v5 = sub_97b868(a0->field_58);
        if (!(a0->field_68 & 24))
        {
            return 0;
        }
        else if (sub_982d30())
        {
            return 1;
        }
        else
        {
            v6 = sub_982d3c(v5) != 0;
            return v6;
        }
    }
    goto LABEL_980e24;
}
