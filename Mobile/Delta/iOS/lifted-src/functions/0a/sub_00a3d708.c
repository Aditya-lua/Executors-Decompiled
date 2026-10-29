/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3d708..0xa3d798 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3d708_1 {
    char padding_0[32];
    long long field_20;
    char padding_28[8];
    struct st_a3d708_0 *field_30;
} st_a3d708_1;

typedef struct st_a3d708_0 {
    char padding_0[8];
    unsigned int field_8;
} st_a3d708_0;


unsigned long long sub_a3d708(unsigned long a0, unsigned long a1, st_a3d708_1 *a2)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a5b018(a2->field_20) != 6 && sub_a5b018(a2->field_20) != 912)
        return 0;
    v2 = sub_ab1c50(sub_a59af4(a2->field_20));
    if (!v2)
    {
        return 0;
    }
    else if (a2->field_30->field_8 == 2)
    {
        a2->field_20 = v2;
    }
    else
    {
        return 0;
    }
}
