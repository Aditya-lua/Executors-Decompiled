/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3d798..0xa3d870 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3d798_1 {
    char padding_0[32];
    long long field_20;
    char padding_28[8];
    struct st_a3d798_0 *field_30;
} st_a3d798_1;

typedef struct st_a3d798_0 {
    char padding_0[8];
    unsigned int field_8;
} st_a3d798_0;

extern char g_10002b0;

long long sub_a3d798(long long a0, long long a1, st_a3d798_1 *a2)
{
    long long v4;  // x0
    unsigned long v5;  // x0
    unsigned long v0;  // [bp-0x88]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if ((sub_a5b018(a2->field_20) == 6 || sub_a5b018(a2->field_20) == 912) && !(v4 = sub_a59af4(a2->field_20), !sub_ab1b08(v4) || !sub_ab1b24(v4, &v0) || !v0 || a2->field_30->field_8 != 2))
    {
        a2->field_20 = v0;
        v5 = sub_a3aef4(a0, a1, a2);
    }
    else
    {
        v5 = 0;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v5;
    ___stack_chk_fail();
}
