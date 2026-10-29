/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c4474..0x1c460c (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c4474_0 {
    char padding_0[24];
    struct st_1c4474_1 *field_18;
} st_1c4474_0;

typedef struct st_1c4474_2 {
    struct st_1c4474_0 *field_0;
    char padding_8[16];
    struct st_1c4474_2 *field_18;
} st_1c4474_2;

typedef struct st_1c4474_1 {
    unsigned long long field_0;
} st_1c4474_1;

extern char g_10002b0;

st_1c4474_2 * sub_1c4474(st_1c4474_2 *a0, st_1c4474_2 *a1)
{
    st_1c4474_2 *v3;  // x19
    st_1c4474_2 *v4;  // x0
    st_1c4474_2 *v5;  // x8
    st_1c4474_2 *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *(long long *)&g_10002b0;
    if (a1 != a0)
    {
        v3 = a1;
        v4 = a0->field_18;
        v5 = a1->field_18;
        if (v4 == a0)
        {
            v4 = v4;
            if (v5 == v3)
                v4->field_0->field_18();
            v4->field_0->field_18();
        }
        else if (v5 != v3)
        {
            a0->field_18 = v5;
            v3->field_18 = v4;
            v5 = v0;
            if (*(long long *)&g_10002b0 == v5)
                return v4;
        }
        else
        {
            v5->field_0->field_18();
        }
    }
    else
    {
        v5 = v0;
        if (*(long long *)&g_10002b0 == v5)
            return a0;
    }
    v4 = ___stack_chk_fail();
    if (v5 == v3)
        v4->field_0->field_18();
    v4->field_0->field_18();
}
