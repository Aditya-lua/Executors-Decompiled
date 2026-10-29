/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf9fc..0x9cfb54 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e8ac98;

long long sub_9cf9fc(unsigned long a0, unsigned long long a1)
{
    unsigned long long idx;  // x20
    unsigned long long v4;  // x21
    unsigned long long v5;  // x0
    unsigned long long v6;  // x2
    unsigned long long v7;  // x0
    unsigned long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    *(unsigned long long *)a0 = 0;
    if (!a1 || sub_a509f4(a1, "SHA1"))
        return 1;
    if (sub_a509f4(a1, "SHA1"))
    {
        idx = 0;
        goto LABEL_9cfa58;
    }
    else
    {
        idx = sub_9cde20(&g_e8ac98);
        if (idx)
        {
            v4 = sub_a99624(sub_9c7b68(a1));
            if ((unsigned long long)(*(long long *)(a1 + 16)) >> 3 & 1)
            {
                sub_9c3580(*(long long *)idx);
                *(unsigned long long *)idx = v4;
                sub_9cf1fc(*(long long *)(idx + 8));
                *(unsigned long long *)(idx + 8) = 0;
            }
            else if (*(long long *)(idx + 8) || (v5 = sub_9cf1f0(), *(unsigned long long *)(idx + 8) = v5, v5))
            {
                sub_9c3580(*(long long *)idx);
                *(unsigned long long *)idx = v4;
                sub_9c536c(*(long long *)(idx + 8), 5, 0);
            }
LABEL_9cfa58:
            v6 = v0;
            if (sub_9c8d24(idx, &g_e8ac98, &v0))
            {
                v7 = sub_9cf764(911, 16);
                *(unsigned long long *)a0 = v7;
                if (v7)
                {
                    v6 = 0;
                    v0 = 0;
                }
                else
                {
                    v6 = v0;
                }
            }
        }
        else
        {
            v6 = 0;
        }
    }
    sub_9c7940(v6);
    sub_9cd960(idx, &g_e8ac98);
    return *(long long *)a0 != 0;
    return 1;
}
