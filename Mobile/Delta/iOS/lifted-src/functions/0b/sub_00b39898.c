/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb39898..0xb39a54 (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_b3a220;

char sub_b39898(char idx, unsigned long a1, unsigned long a2)
{
    unsigned int v2;  // w0
    char v3;  // x19
    char v4;  // x20
    unsigned long v5;  // x22
    unsigned long long v6;  // 4118
    unsigned long long v7;  // 4118
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!idx)
    {
        return 0;
    }
    else if (v2)
    {
        v3 = sub_a01fbc(*(long long *)idx);
        if (!v3)
            return v3;
        if (*(int *)(idx + 60) == 2)
        {
            *(unsigned int *)(idx + 60) = 0x800 > (unsigned long long)*(long long *)(idx + 24);
LABEL_b398fc:
            *(unsigned long *)(idx + 88) = a1;
            *(unsigned long *)(idx + 96) = a2;
            v4 = sub_9e5ce8();
            if (v4)
                sub_9e5d24(v4, &g_b3a220, idx);
            v5 = sub_12738(v3);
            if ((!*(long long *)(idx + 8) || sub_a60efc(v5)) && (!*(long long *)(idx + 40) || sub_a60d78(v5)))
            {
                v6 = arm64g_calculate_condition(1, *(int *)(idx + 56), 1, 0);
                if (!(v6 & 1))
                {
                    sub_a60e00(v5);
                    v7 = arm64g_calculate_condition(1, *(int *)(idx + 64), 1, 0);
                    if (!(v7 & 1))
                        sub_a198cc(v5);
                }
                else if (*(int *)(idx + 0x44))
                {
                    sub_a60e08(v5);
                }
                if (*(long long *)(idx + 72))
                    sub_a60e34(v5);
                if ((!((char)(*(char *)(idx + 16)) >> 2 & 1) || (int)sub_a01ba8(v3, *(int *)(idx + 60), *(int *)(idx + 24), *(int *)(idx + 32), v4) >= 1) && !(sub_a60e10(v5, 4, *(int *)(idx + 60) == 1), *(char *)(idx + 16) & 3 && (!*(long long *)v5 || !*(long long *)(v5 + 8) || !*(long long *)(v5 + 16) || 0 >= (int)sub_a01c28(v3))))
                    goto LABEL_b39a28;
            }
        }
        else
        {
            if (3 > (unsigned int)*(int *)(idx + 60))
                goto LABEL_b398fc;
            sub_c6a870(idx + 60);
            v4 = 0;
        }
        sub_a01fd4(v3);
        v3 = 0;
LABEL_b39a28:
        sub_9e5cfc(v4);
        return v3;
    }
    else
    {
        return 0;
    }
}
