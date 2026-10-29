/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4f300..0xa4f404 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4f300_0 {
    long long field_0;
    unsigned int field_8;
} st_a4f300_0;

extern long long g_7fffff;

long long sub_a4f300(long long a0, unsigned long a1, unsigned long a2, long long a3, unsigned long a4, st_a4f300_0 *a5)
{
    long long v2;  // w0
    unsigned long long v3;  // 4124
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3 && !_strchr(a3, 58))
        _strlen(a3);
    if (!sub_a68f38(a5->field_0))
        return 0;
    v2 = (unsigned int)sub_a69060();
    if (!v2)
    {
        return 0;
    }
    else if (v2 <= &g_7fffff)
    {
        v3 = arm64g_calculate_condition(49, a5->field_8 - 0x100, 0xff, 0);
        if (v3 & 1)
        {
            return 0;
        }
        else if (!a0 && !sub_a6820c(a5->field_0, 0))
        {
            return 0;
        }
    }
    else
    {
        return 0;
    }
}
