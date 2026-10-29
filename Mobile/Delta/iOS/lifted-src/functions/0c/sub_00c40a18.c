/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc40a18..0xc40ab4 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_efcf68;
extern long long g_efcf80;

long long sub_c40a18(unsigned long a0, long long a1, long long a2)
{
    unsigned long v0;  // [bp-0x30]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = a0;
    v1 = 0;
    if (sub_be769c(&v0, &g_efcf80, a1, a2))
    {
        if (!v1)
        {
            sub_c73b38("a formatting trait implementation returned an error when the underlying stream did notinternal error: entered unreachable codefile name contained an unexpected NUL byte<unnamed>__rust_end_short_backtrace__rust_begin_short_backtraces", 173, &g_efcf68);
            __debugbreak();
        }
        return v1;
    }
    else
    {
        if (v1)
        {
            sub_c40ff0(&v1);
            return 0;
        }
        return v1;
    }
}
