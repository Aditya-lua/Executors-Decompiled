/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15990..0x15a5c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_15990_0 {
    char padding_0[32];
    char field_20;
} st_15990_0;

typedef struct st_15990_1 {
    char field_0;
} st_15990_1;

extern char g_10002b0;

st_15990_0 * sub_15990(st_15990_0 *a0, st_15990_0 *a1)
{
    unsigned int v5;  // w8
    st_15990_1 **v0;  // [bp-0x50], Other Possible Types: char
    st_15990_1 *v1;  // [bp-0x48], Other Possible Types: char
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v5 = a0->field_20;
    if (v5 != a1->field_20)
    {
        if (!v5)
        {
            v1 = &v0;
            v0 = &v1;
            a0 = sub_1e524();
            a0->field_20 = 1;
LABEL_15a30:
            if (*(long long *)&g_10002b0 == v2)
                return a0;
        }
        ___stack_chk_fail();
    }
    else if (v5)
    {
        sub_1e524(&v1);
        sub_1eaa4(&v1, a0);
        a0 = sub_181a8(&v1);
        goto LABEL_15a30;
    }
}
