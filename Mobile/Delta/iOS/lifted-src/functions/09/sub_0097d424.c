/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97d424..0x97d470 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97d424_0 {
    char padding_0[64];
    struct st_97d424_0 *field_40;
    char padding_48[16];
    long long field_58;
    char padding_60[16];
    char field_70;
} st_97d424_0;


void sub_97d424(st_97d424_0 **a0)
{
    st_97d424_0 *v2;  // x8
    st_97d424_0 *v3;  // x9
    st_97d424_0 *v4;  // w10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    while (1)
    {
        v3 = v2;
        switch (v4)
        {
        case 0:
            v2 = v3->field_40;
            if (!v3->field_40)
                goto LABEL_97d45c;
            continue;
            continue;
        case 2:
            return;
        default:
LABEL_97d45c:
            sub_97b868(*a0->field_58);
        }
    }
    sub_97b868(*a0->field_58);
}
