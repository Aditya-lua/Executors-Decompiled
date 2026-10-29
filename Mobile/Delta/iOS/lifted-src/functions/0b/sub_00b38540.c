/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb38540..0xb387b4 (628 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_b393bc;

char sub_b38540(char idx, unsigned long a1, unsigned long a2)
{
    unsigned int v2;  // w0
    char v3;  // w0
    char v4;  // x20
    unsigned long v5;  // x21
    char v6;  // x22
    char v7;  // w23
    unsigned long long v8;  // 4118
    unsigned long long v9;  // 4118
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
        if (!*(int *)(idx + 20))
        {
            if (4 <= (unsigned int)*(int *)(idx + 60))
            {
                sub_c6a810(idx + 60);
                return 0;
            }
            if (*(int *)(idx + 60) != 3 || *(long long *)(idx + 8))
                goto LABEL_b385cc;
            v3 = sub_9fe7f8(*(int *)(idx + 24));
            *(unsigned int *)(idx + 20) = v3;
            if (!v3)
                return 0;
LABEL_b38588:
            v4 = sub_9fead0(*(long long *)idx);
            if (!v4)
                return v4;
            v5 = sub_12738(v4);
            v6 = 0;
            v7 = 1;
            goto LABEL_b38700;
        }
        *(unsigned int *)(idx + 60) = 3;
        if (!*(long long *)(idx + 8))
            goto LABEL_b38588;
LABEL_b385cc:
        v4 = sub_9ffb30(*(long long *)idx);
        if (!v4)
            return v4;
        v5 = sub_12738(v4);
        if ((!*(long long *)(idx + 8) || sub_a60efc(v5)) && sub_a60d78(v5, *(long long *)(idx + 40), *(long long *)(idx + 48)))
        {
            v8 = arm64g_calculate_condition(1, *(int *)(idx + 56), 1, 0);
            if (!(v8 & 1))
            {
                sub_a60e00(v5);
                v9 = arm64g_calculate_condition(1, *(int *)(idx + 0x44), 1, 0);
                if (!(v9 & 1))
                    sub_a198cc(v5);
            }
            else if (*(int *)(idx + 72))
            {
                sub_a60e08(v5);
            }
            if (*(long long *)(idx + 80))
                sub_a60e34(v5);
            *(unsigned long *)(idx + 96) = a1;
            *(unsigned long *)(idx + 104) = a2;
            v6 = sub_9e5ce8();
            if (v6)
                sub_9e5d24(v6, &g_b393bc, idx);
            if (!((char)(*(char *)(idx + 16)) >> 2 & 1))
            {
                v7 = 1;
                goto LABEL_b38700;
            }
            else if (*(int *)(idx + 60))
            {
                if (1 <= (int)sub_9fe778(v4))
                    goto LABEL_b386fc;
            }
            else
            {
                if ((int)sub_9fe82c(v4, *(int *)(idx + 24), *(int *)(idx + 64), v6) >= 1)
                {
LABEL_b386fc:
                    v7 = 0;
LABEL_b38700:
                    if (!(*(char *)(idx + 16) & 3))
                    {
LABEL_b38758:
                        sub_9ffde8(v4, 0xf000);
                        sub_9ffe04(v4, *(int *)(idx + 112));
                        sub_9e5cfc(v6);
                        return v4;
                    }
                    if (*(long long *)v5 && *(long long *)(v5 + 16))
                    {
                        if (*(int *)(idx + 76) >= 1)
                            sub_9ffd40(v4);
                        sub_a60e10(v5, 4, *(int *)(idx + 60) == 1);
                        if ((int)sub_9ff2fc(v4) >= 1)
                            goto LABEL_b38758;
                    }
                    if (!v7)
                    {
                        sub_9e5cfc(v6);
                        return v4;
                    }
                }
            }
        }
        else
        {
            v6 = 0;
        }
        sub_9ffb3c(v4);
        sub_9e5cfc(v6);
        return 0;
    }
    else
    {
        return 0;
    }
}
