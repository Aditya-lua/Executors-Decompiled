/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989d40..0x989d88 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989d40_0 {
    char padding_0[8];
    struct st_989d40_0 *field_8;
} st_989d40_0;

typedef struct st_989d40_1 {
    char padding_0[48];
    struct st_989d40_0 *field_30;
} st_989d40_1;


void sub_989d40(st_989d40_1 *a0)
{
    st_989d40_0 *v2;  // x20
    st_989d40_0 *iter;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &a0->padding_0[40];
    while (1)
    {
        iter = a0->field_30;
        if (iter == v2)
            iter = iter->field_8;
        if (iter == v2)
            break;
        sub_989488(a0, (char *)iter - 32);
    }
    return;
}
