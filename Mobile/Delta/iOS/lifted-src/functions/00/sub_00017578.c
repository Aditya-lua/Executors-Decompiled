/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x17578..0x17664 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_17578_1 {
    char padding_0[216];
    long long field_d8;
    char padding_e0[112];
    void* field_150;
} st_17578_1;

typedef struct st_17578_0 {
    char field_0;
} st_17578_0;

extern char g_10002b0;

unsigned long long sub_17578(st_17578_1 *a0, long long a1)
{
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    st_17578_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_17578_0 *v1;  // [bp-0x58]
    unsigned long v2;  // [bp-0x50]
    char *v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long v6;  // [bp-0x30]
    unsigned long v7;  // [bp-0x28]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (*(int *)((char *)a0->field_150 - 4))
    {
        v10 = sub_54b4(sub_404c(a0->field_d8, 32), a1);
        if (*(long long *)&g_10002b0 == v7)
            return v10;
    }
    else
    {
        v4 = 0;
        v5 = 0;
        v6 = sub_54b4(sub_404c(a0->field_d8, 32), a1);
        v2 = sub_19088(a0, &v6, 1);
        v3 = &v6;
        v11 = sub_ebbc(a0, a1, &v4, &v2, "continue statement must be inside a loop");
        if (*(long long *)&g_10002b0 == v7)
            return v11;
    }
    ___stack_chk_fail();
}
