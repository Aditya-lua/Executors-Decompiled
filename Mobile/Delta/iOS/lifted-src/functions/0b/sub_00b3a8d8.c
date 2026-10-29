/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3a8d8..0xb3aa44 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b3a8d8(unsigned long long a0)
{
    unsigned int v2;  // w0
    unsigned long long v3;  // x19
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // w8
    unsigned long long v7;  // w0
    unsigned long long v8;  // 4118
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        v3 = sub_a18b7c(*(long long *)a0, 0);
        if (!v3)
            return v3;
        if (*(long long *)(a0 + 128))
        {
            if (*(long long *)(a0 + 16))
            {
                v4 = sub_a16b98(*(long long *)(a0 + 16));
                if (!(v4 >> 31 & 1))
                {
                    sub_319f0(*(long long *)(a0 + 128), v4);
                    goto LABEL_b3a930;
                }
            }
            else
            {
LABEL_b3a930:
                if (!*(long long *)(a0 + 24))
                    goto LABEL_b3a95c;
                v5 = sub_a16d00(*(long long *)(a0 + 24));
                if (!(v5 >> 31 & 1))
                {
                    sub_986440(*(long long *)(a0 + 128), v5);
LABEL_b3a95c:
                    if (*(long long *)(a0 + 128))
                    {
                        v6 = (int)sub_a19718(v3) > 0;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/keymgmt/ec_kmgmt.c", 1237, "ec_gen_assign_group");
                        sub_a36abc(57, 177, 0);
                        v6 = 0;
                    }
                    if (*(char *)(a0 + 120) & 3)
                    {
                        if (*(long long *)(a0 + 0x88) && *(long long *)(a0 + 144))
                        {
                            if (!v6)
                                goto LABEL_b3a9e8;
                            v7 = (unsigned int)sub_a18dfc(v3);
                            goto LABEL_b3a9e0;
                        }
                        else if (v6)
                        {
                            v7 = (unsigned int)sub_a18d10(v3);
LABEL_b3a9e0:
                            v6 = v7 != 0;
                        }
                    }
LABEL_b3a9e8:
                    v8 = arm64g_calculate_condition(1, *(int *)(a0 + 124), 1, 0);
                    if (v8 & 1)
                    {
LABEL_b3aa08:
                        if (*(long long *)(a0 + 32))
                        {
                            if (v6)
                            {
                                v6 = sub_a16c50(v3) != 0;
                                goto LABEL_b3aa24;
                            }
                        }
                        else
                        {
LABEL_b3aa24:
                            if (v6)
                                return v3;
                        }
                    }
                    else if (v6)
                    {
                        v6 = sub_a172fc(v3) != 0;
                        goto LABEL_b3aa08;
                    }
                }
            }
        }
        else
        {
            if (sub_b3b5a4(a0))
                goto LABEL_b3a95c;
        }
        sub_a18c08(v3);
        return 0;
    }
    else
    {
        return 0;
    }
}
