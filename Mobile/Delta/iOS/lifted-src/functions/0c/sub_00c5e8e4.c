/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5e8e4..0xc5e9e4 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_efd4e0;
extern long long g_efd8b8;

int sub_c5e8e4(unsigned long long *a0, unsigned long a1, unsigned long i)
{
    unsigned long v4;  // x22
    unsigned long count;  // x0
    unsigned long long v6;  // 4106
    unsigned long v7;  // x8
    unsigned long v8;  // x9
    unsigned long v9;  // x8
    unsigned long long *v10;  // x19
    long long v11;  // x0
    unsigned long v0;  // [bp-0x60]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!i)
        return 0;
    v4 = &g_efd4e0;
    do
    {
        count = _write();
        v6 = arm64g_calculate_condition(2, count, 1, 0);
        if (!(v6 & 1))
        {
            if (count)
            {
                v7 = i - count;
                if (i < count)
                {
                    v11 = sub_c73bb0();
                    *a0 = &g_efd4e0;
                    __Unwind_Resume(v11, i, i, &g_efd8b8);
                }
                i = v7;
                goto LABEL_c5e92c;
            }
            goto LABEL_c5e994;
        }
        else
        {
            v8 = *(int *)___error();
            v9 = 2 | v8 * 0x100000000;
            v0 = 1;
            v1 = v9;
            if ((unsigned int)v8 == 4)
            {
                sub_c40ff0(&v1);
            }
            else
            {
                v4 = v9;
LABEL_c5e994:
                v10 = a0 + 1;
                if (a0[1])
                    sub_c40ff0(v10);
                *v10 = v4;
                return 1;
            }
        }
LABEL_c5e92c:
    } while (i);
    return 0;
}
