/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3e5b0..0xa3e690 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3e5b0_1 {
    char padding_0[32];
    long long field_20;
    char padding_28[8];
    struct st_a3e5b0_0 *field_30;
} st_a3e5b0_1;

typedef struct st_a3e5b0_0 {
    char padding_0[8];
    unsigned int field_8;
} st_a3e5b0_0;

extern char g_10002b0;

long long sub_a3e5b0(long long a0, long long a1, st_a3e5b0_1 *a2)
{
    long long v6;  // x0
    unsigned long v7;  // x0
    char v0;  // [bp-0xd8]
    char v1;  // [bp-0x88]
    unsigned long v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if ((sub_a5b018(a2->field_20) == 6 || sub_a5b018(a2->field_20) == 912) && !(v6 = sub_a59af4(a2->field_20), sub_ab1b08(v6) < 8 || !sub_ab1bb8(v6, &v1, &v0) || !v2 || a2->field_30->field_8 != 2))
    {
        a2->field_20 = v2;
        v7 = sub_a3aef4(a0, a1, a2);
    }
    else
    {
        v7 = 0;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v7;
    ___stack_chk_fail();
}
