/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf2284..0xaf2388 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af2284_0 {
    unsigned long long field_0;
    char field_2;
} st_af2284_0;

extern char g_10002b0;

unsigned long long sub_af2284(long long a0, unsigned int a1, st_af2284_0 *a2)
{
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4112
    unsigned long long v8;  // w0
    char v0;  // [bp-0x90]
    char v1;  // [bp-0x88]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (!a0 || !sub_a5b3bc())
    {
        v8 = 57;
    }
    else if (sub_a5b508(a0, &v1, 80, &v0))
    {
        switch ((unsigned int)sub_a99eb4(&v1))
        {
        case 415:
            if (a1 == 794 || !(v7 = arm64g_calculate_condition(0x11, a1, 1, 0), v7 & 1))
            {
                if (*((char *)&a2->field_0 + 2) & 1)
                    goto LABEL_af2374;
LABEL_af236c:
                v8 = 60;
                break;
            }
            else
            {
LABEL_af237c:
                v8 = 59;
                break;
            }
        case 715:
            if (a1 != 795 && (v6 = arm64g_calculate_condition(0x11, a1, 1, 0), v6 & 1))
                goto LABEL_af237c;
            if (!(a2->field_0 >> 0x11 & 1))
                goto LABEL_af236c;
            a2->field_0 = a2->field_0 & 0xfffffffffffeffff;
LABEL_af2374:
            v8 = 0;
            break;
        default:
            goto LABEL_af2324;
        }
    }
    else
    {
LABEL_af2324:
        v8 = 58;
    }
    if (*(long long *)&g_10002b0 == v2)
        return v8;
    ___stack_chk_fail();
}
