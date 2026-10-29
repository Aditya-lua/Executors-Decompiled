/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cef6c..0x9cf018 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;
extern char g_10002b0;

long long sub_9cef6c(long long a0, long long a1)
{
    unsigned long long v6;  // x0
    unsigned long long v7;  // w0
    unsigned long long v0;  // [bp-0xa0]
    char *v1;  // [bp-0x98]
    char v2;  // [bp-0x88]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v6 = sub_a99788(sub_a99eac(a1));
    if (!v6)
        v6 = &g_c7c2eb;
    sub_a99b48();
    v0 = v6;
    v1 = &v2;
    v7 = (unsigned int)sub_9d524c(a0, "%s (%s)");
    if (*(long long *)&g_10002b0 == v3)
        return v7 > 0;
    ___stack_chk_fail(v7 > 0);
}
