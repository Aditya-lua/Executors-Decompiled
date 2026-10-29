/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4e7e0..0xb4eaa0 (704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4e7e0_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[268];
    char field_11c;
} st_b4e7e0_0;

extern char g_10002b0;

int sub_b4e7e0(st_b4e7e0_0 *a0, char a1)
{
    st_b4e7e0_0 *v11;  // x8
    char v12;  // x9
    char v13;  // x9
    char v14;  // x9
    char v15;  // x9
    char v16;  // x9
    char v17;  // x9
    st_b4e7e0_0 *v18;  // x0
    char v0;  // [bp-0x70], Other Possible Types: unsigned long long
    char v1;  // [bp-0x68]
    char v2;  // [bp-0x60], Other Possible Types: unsigned long
    char v3;  // [bp-0x50]
    char v4;  // [bp-0x40]
    char v5;  // [bp-0x30]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    if (a0)
    {
        if (!a1 || !*(long long *)a1)
        {
LABEL_b4ea68:
            if (*(long long *)&g_10002b0 == v6)
                return 1;
            ___stack_chk_fail();
        }
        if (sub_a6fbc4(a1, "instance"))
        {
            v5 = 0;
            v3 = 0;
            v4 = 0;
            v2 = 0;
            v1 = (char)&v2;
            if (a0->field_11c & 1)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/eddsa_sig.c", 842, "eddsa_set_ctx_params");
                v0 = 0;
                sub_a36abc(57, 242, "the EdDSA instance is preset, you may not try to specify it");
                if (*(long long *)&g_10002b0 == v6)
                    return 0;
                ___stack_chk_fail();
            }
            if (!sub_a71220())
            {
                if (*(long long *)&g_10002b0 == v6)
                    return 0;
                ___stack_chk_fail();
            }
            if (sub_a6e200(v1, "Ed25519"))
            {
                if (sub_a6e200(v1, "Ed25519ctx"))
                {
                    if (sub_a6e200(v1, "Ed25519ph"))
                    {
                        if (sub_a6e200(v1, "Ed448"))
                        {
                            if (sub_a6e200(v1, "Ed448ph"))
                            {
                                sub_a368c8();
                                sub_a369bc("providers/implementations/signature/eddsa_sig.c", 876, "eddsa_set_ctx_params");
                                if (!v1)
                                    v1 = (char)"<null>";
                                v0 = v1;
                                sub_a36abc(57, 243, "unknown INSTANCE name: %s");
                                if (*(long long *)&g_10002b0 == v6)
                                    return 0;
                                ___stack_chk_fail();
                            }
                            if (*(int *)(a0->field_8 + 96) == 3)
                            {
                                v11 = a0;
                                v12 = a0->field_11c;
                                *(unsigned int *)&a0->padding_10[264] = 5;
                                v13 = v12 & 230 | 8;
LABEL_b4ea30:
                                v11->field_11c = v13;
                            }
                        }
                        else if (*(int *)(a0->field_8 + 96) == 3)
                        {
                            v11 = a0;
                            v14 = a0->field_11c;
                            *(unsigned int *)&a0->padding_10[264] = 4;
                            v13 = v14 & 230;
                            goto LABEL_b4ea30;
                        }
                    }
                    else
                    {
                        if (*(int *)(a0->field_8 + 96) == 2)
                        {
                            v11 = a0;
                            v15 = a0->field_11c;
                            *(unsigned int *)&a0->padding_10[264] = 3;
                            v13 = v15 & 226 | 12;
                            goto LABEL_b4ea30;
                        }
                    }
                }
                else
                {
                    if (*(int *)(a0->field_8 + 96) == 2)
                    {
                        v11 = a0;
                        v16 = a0->field_11c;
                        *(unsigned int *)&a0->padding_10[264] = 2;
                        v13 = v16 & 226 | 20;
                        goto LABEL_b4ea30;
                    }
                }
            }
            else
            {
                if (*(int *)(a0->field_8 + 96) == 2)
                {
                    v11 = a0;
                    v17 = a0->field_11c;
                    *(unsigned int *)&a0->padding_10[264] = 1;
                    v13 = v17 & 226;
                    goto LABEL_b4ea30;
                }
            }
        }
        if (sub_a6fbc4(a1, "context-string"))
        {
            v2 = a0 + 1;
            v18 = sub_a71440();
            if (!(unsigned int)v18)
            {
                *(unsigned long long *)&a0[1].padding_10[243] = 0;
                a0 = v18;
                if (*(long long *)&g_10002b0 == v6)
                    return (unsigned int)a0;
                ___stack_chk_fail();
            }
        }
        else
        {
            if (*(long long *)&g_10002b0 == v6)
                return 1;
            ___stack_chk_fail();
        }
        goto LABEL_b4ea68;
    }
    else
    {
        if (*(long long *)&g_10002b0 == v6)
            return (unsigned int)a0;
        ___stack_chk_fail();
    }
}
