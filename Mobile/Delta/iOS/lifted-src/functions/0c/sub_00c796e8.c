/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc796e8..0xc79750 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c796e8_0 {
    char field_0;
    char field_1[7];
    char field_4;
    char padding_5[3];
    unsigned long long field_8;
} st_c796e8_0;

extern long long g_efce78;

void sub_c796e8(st_c796e8_0 *a0, st_c796e8_0 *a1)
{
    unsigned long v3;  // x8
    unsigned long long v4;  // x1
    unsigned long long v5;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v3 = a1->field_0;
    v4 = *(long long *)&a1->field_4;
    if (a0->field_0 == 83)
    {
        a0->field_0 = v3;
        *(int *)&a0->field_1[0] = *(int *)&a1->field_1[0];
        *(int *)&a0->field_1[3] = *(int *)&a1->field_1[3];
        *(unsigned long long *)&a0->field_4 = v4;
        return;
    }
    if ((unsigned int)v3 == 83)
        return;
    v0 = &v2;
    v1 = v5;
    sub_c53268(v3);
    sub_c73b38("reentrant initInvalid archive member sizeInvalid archive extended name offsetInvalid archive extended name lengthInvalid archive terminatorInvalid archive member headera formatting trait implementation returned an error when the underlying stream did notinternal error: entered unreachable codefile name contained an unexpected NUL byte<unnamed>__rust_end_short_backtrace__rust_begin_short_backtraces", 29, &g_efce78);
}
