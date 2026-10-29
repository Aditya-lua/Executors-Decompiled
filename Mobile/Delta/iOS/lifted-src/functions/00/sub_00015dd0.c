/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15dd0..0x15f00 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_15dd0_0 {
    char padding_0[12];
    unsigned long long field_c;
    unsigned int field_14;
} st_15dd0_0;

extern char g_10002b0;

unsigned long long sub_15dd0(void* a0, st_15dd0_0 *a1, unsigned int a2)
{
    unsigned long long v11;  // x0
    unsigned long long v12;  // x0
    unsigned long long v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x68]
    st_15dd0_0 **v2;  // [bp-0x60]
    unsigned long v3;  // [bp-0x50]
    st_15dd0_0 **v4;  // [bp-0x48]
    st_15dd0_0 *v5;  // [bp-0x40]
    st_15dd0_0 *v6;  // [bp-0x38], Other Possible Types: unsigned long
    unsigned long v7;  // [bp-0x30]
    unsigned long v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    if (!a2 || (int)a0[132] == *(int *)((char *)&a1->field_c + 4))
    {
        v6 = *(long long *)&(a1->padding_0)[1];
        v7 = (long long)a0[132];
        v5 = a1;
        v3 = sub_19088(a0, &v5, 1);
        v4 = &v5;
        sub_b814(a0 + 128);
        v0 = sub_a0c8(&v1);
        v12 = sub_11094(a0, &v6, &v3, "Expected '(', '{' or <string> when parsing function call, got %s");
        if (*(long long *)&g_10002b0 == v8)
            return v12;
    }
    else
    {
        v6 = a1;
        v1 = sub_19088(a0, &v6, 1);
        v2 = &v6;
        v11 = sub_11094(a0, (a1->padding_0)[1], &v1, "Expected function call arguments after '('");
        if (*(long long *)&g_10002b0 == v8)
            return v11;
    }
    __Unwind_Resume(__Unwind_Resume(___stack_chk_fail()));
}
