/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x968d10..0x968ec0 (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_96e110;

unsigned long long sub_968d10(unsigned long a0, long long a1, unsigned long long idx)
{
    unsigned long v2;  // x9
    unsigned long long v3;  // x0
    unsigned long v12;  // x21
    unsigned long index;  // x8
    unsigned long v5;  // x22
    unsigned long long v6;  // x0
    unsigned long long v7;  // x22
    unsigned long long v8;  // x20
    unsigned long v9;  // x9
    unsigned long long v10;  // x0
    unsigned long idx1;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 < 1 || !a0 || !idx)
    {
        sub_a368c8();
        sub_a369bc("ssl/t1_lib.c", 1590, "tuple_cb");
        sub_a36abc(20, 414, 0);
    }
    else if (!*(int *)(idx + 80) || *(int *)(idx + 84) || (v2 = *(long long *)(idx + 40), v3 = *(long long *)(idx + 48), !*(long long *)(v3 + v2 * 8)))
    {
LABEL_968d4c:
        *(unsigned int *)(idx + 84) = 0;
        v6 = sub_a6bf4c(a1 + 1, "ssl/t1_lib.c", 1599);
        if (!v6)
            return v6;
        v7 = v6;
        _memcpy();
        *(char *)(v7 + a1) = 0;
        v8 = sub_9f5c88(v7, 58, 1, &g_96e110, idx);
        sub_a6c2e4(v7, "ssl/t1_lib.c", 1609);
        if (*(int *)(idx + 80) || !(v9 = *(long long *)(idx + 40), v10 = *(long long *)(idx + 48), *(long long *)(*(long long *)(idx + 48) + v9 * 8)))
            return v8;
        idx1 = v9 + 1;
        if (idx1 != *(long long *)(idx + 32))
        {
            *(unsigned long *)(idx + 40) = idx1;
            *(unsigned long long *)(*(long long *)(idx + 48) + idx1 * 8) = 0;
            return v8;
        }
        v12 = v9 + 33;
        if (!((v12 & 7) * 0) && !(v12 & 0x1c00000000000000))
        {
            v10 = sub_a6c1b4();
            if (v10)
            {
                *(unsigned long *)(idx + 32) = v12;
                *(unsigned long long *)(idx + 48) = v10;
                idx1 = *(long long *)(idx + 40) + 1;
                *(unsigned long *)(idx + 40) = idx1;
                *(unsigned long long *)(v10 + idx1 * 8) = 0;
                return v8;
            }
            return v10;
        }
    }
    else
    {
        index = v2 + 1;
        if (index == *(long long *)(idx + 32))
        {
            v5 = v2 + 33;
            if (!((v5 & 7) * 0) && !(v5 & 0x1c00000000000000))
            {
                v3 = sub_a6c1b4();
                if (!v3)
                    return v3;
                *(unsigned long *)(idx + 32) = v5;
                *(unsigned long long *)(idx + 48) = v3;
                index = *(long long *)(idx + 40) + 1;
                goto LABEL_968e54;
                goto LABEL_968e54;
            }
        }
        else
        {
LABEL_968e54:
            *(unsigned long *)(idx + 40) = index;
            *(unsigned long long *)(v3 + index * 8) = 0;
            goto LABEL_968d4c;
        }
    }
    return 0;
}
