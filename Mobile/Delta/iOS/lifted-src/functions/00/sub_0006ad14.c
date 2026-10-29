/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6ad14..0x6ae30 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6ad14_0 {
    char padding_0[936];
    unsigned long long field_3a8;
} st_6ad14_0;

extern char g_10002b0;

st_6ad14_0 * sub_6ad14(st_6ad14_0 *a0)
{
    char v0;  // [bp-0x48], Other Possible Types: unsigned long
    unsigned long long v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    sub_6b6d0();
    v1 = 0;
    sub_758ec(a0, &v0);
    sub_181a8(&v0);
    v0 = &a0[1].padding_0[504];
    sub_271a8(&v0);
    sub_181a8(&a0[1].padding_0[216]);
    sub_62aa0(&a0->padding_0[928], a0->field_3a8);
    sub_74ccc(a0);
    if (*(long long *)&g_10002b0 == v2)
        return a0;
    ___stack_chk_fail();
    if (!(unsigned int)a0->field_3a8)
        __Unwind_Resume();
    sub_6138();
}
