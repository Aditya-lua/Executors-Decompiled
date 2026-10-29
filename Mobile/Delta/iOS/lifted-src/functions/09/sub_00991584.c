/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991584..0x991618 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_991584_0 {
    char padding_0[72];
    long long field_48;
    unsigned long long field_50;
} st_991584_0;

extern char g_10002b0;

st_991584_0 * sub_991584(unsigned long a0, unsigned long a1, st_991584_0 *a2)
{
    st_991584_0 *v4;  // x0
    char v0;  // [bp-0x38]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if (!a2 || 16 > (unsigned long long)a2->field_48)
    {
        v4 = 0;
    }
    else
    {
        v4 = sub_991618();
        if ((unsigned int)v4)
            v4 = !sub_a66f20(&v0, a2->field_50 + a2->field_48 - 16, 16);
    }
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
