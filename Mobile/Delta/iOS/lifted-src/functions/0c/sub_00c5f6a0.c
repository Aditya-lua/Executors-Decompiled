/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5f6a0..0xc5f754 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_efd4e0;

void sub_c5f6a0(void)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long v18;  // x8
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    unsigned long long v13;  // x20
    unsigned long long count;  // x0
    unsigned long long v15;  // 4106
    unsigned long v16;  // x8
    unsigned long long v17;  // x8
    unsigned long v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    v13 = 60;
    while (1)
    {
        count = _write();
        v15 = arm64g_calculate_condition(2, count, 1, 0);
        if (v15 & 1)
        {
            v16 = *(int *)___error();
            if ((unsigned int)v16 == 4)
            {
                if (!v13)
                    break;
                else
                    continue;
            }
            else
            {
                v18 = 2 | v16 * 0x100000000;
                goto LABEL_c5f740;
            }
            goto LABEL_c5f740;
        }
        else if (count)
        {
            v17 = v13 - count;
            if (v13 < count)
            {
                sub_c73bb0();
                __debugbreak();
            }
            v13 = v17;
            if (!v13)
                break;
        }
        else
        {
            v18 = &g_efd4e0;
LABEL_c5f740:
            v0 = v18;
            sub_c40ff0(&v0);
            break;
        }
    }
    sub_c73e00(sub_c769bc());
}
