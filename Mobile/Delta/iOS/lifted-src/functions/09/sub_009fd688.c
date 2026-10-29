/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd688..0x9fd718 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fd688_0 {
    char padding_0[200];
    unsigned long long field_c8;
} st_9fd688_0;


st_9fd688_0 * sub_9fd688(st_9fd688_0 *a0, st_9fd688_0 **a1)
{
    st_9fd688_0 *v2;  // x0
    st_9fd688_0 *v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    switch (a0)
    {
    case 5:
        v3 = *a1;
        sub_9ffde8(v3, 0xf000);
        sub_9ffe04(v3, 0);
        sub_9feb80(v3);
        v3->field_c8 = v3->field_c8 + 1;
        return 1;
    case 2:
        sub_9ffb3c(*a1);
        *a1 = 0;
        return 2;
    case 0:
        v2 = sub_9ff998();
        *a1 = v2;
        return (v2 != 0) * 2;
    default:
        return 1;
    }
}
