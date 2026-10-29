/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9b42c..0xa9b584 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

int sub_a9b42c(unsigned long a0, void* a1, long long a2, unsigned long long a3)
{
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if ((!*(long long *)a1 || (v0 = a3, v1 = &g_c7c2eb, (int)sub_9d524c(a2, "%*scrlUrl: ") >= 1 && sub_9c3708(a2, *(long long *)a1) && (int)sub_9d3fec(a2, "\n", 1) >= 1)) && (!(long long)a1[8] || (v0 = a3, v1 = &g_c7c2eb, (int)sub_9d524c(a2, "%*scrlNum: ") >= 1 && (int)sub_9c994c(a2, (long long)a1[8]) >= 1 && (int)sub_9d3fec(a2, "\n", 1) >= 1)))
    {
        if ((long long)a1[16])
        {
            v0 = a3;
            v1 = &g_c7c2eb;
            if ((int)sub_9d524c(a2, "%*scrlTime: ") >= 1 && sub_9c0ef0(a2, (long long)a1[16]) && 0 < (int)sub_9d3fec(a2, "\n", 1))
                return 1;
        }
        else
        {
            return 1;
        }
    }
    return 0;
}
