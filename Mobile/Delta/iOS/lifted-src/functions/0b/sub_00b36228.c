/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb36228..0xb36560 (824 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b36228_1 {
    char padding_0[32];
    unsigned long long field_20;
    long long field_28;
    char padding_30[8];
    char field_38;
} st_b36228_1;

typedef struct st_b36228_2 {
    struct st_b36228_0 *field_0;
    char padding_8[8];
    long long field_10;
    long long field_18;
    unsigned int field_20;
    char padding_24[28];
    struct st_b36228_1 *field_40;
} st_b36228_2;

typedef struct st_b36228_0 {
    char padding_0[16];
    char field_10;
    char padding_11[79];
    unsigned int field_60;
} st_b36228_0;

extern char g_10002b0;

char sub_b36228(st_b36228_2 *a0, char a1, char a2, long long a3, char a4)
{
    st_b36228_1 *v4;  // x24
    char v5;  // x0
    char v6;  // x25
    char v7;  // x21
    char idx;  // x19
    char v9;  // x0
    char v10;  // x22
    char v11;  // x21
    char v12;  // x20
    char v0;  // [bp-0xaa]
    unsigned long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if (a0->field_20 == 1)
    {
        v4 = a0->field_40;
        if (a1)
        {
            if (v4->field_20 > (unsigned long long)*(long long *)a4)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kem/ecx_kem.c", 566, "dhkem_encap");
                goto LABEL_b3631c;
            }
            else if ((unsigned long long)v4->field_28 > (unsigned long long)*(long long *)a2)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kem/ecx_kem.c", 570, "dhkem_encap");
LABEL_b3631c:
                sub_a36abc(57, 142);
                v5 = 0;
            }
            else
            {
                v6 = *(long long *)&a0->padding_24[4];
                v7 = *(long long *)&a0->padding_24[12];
                idx = sub_a2a7c8(a0->field_10, a0->field_0->field_60, 0, a0->field_18);
                if (idx)
                {
                    v9 = sub_a2a950(idx);
                    if (v9)
                    {
                        if (v6 && v7)
                        {
                            v10 = v6;
                            goto LABEL_b363ec;
                        }
                        if ((unsigned long long)*(long long *)&v4->field_38 > 66)
                            goto LABEL_b363c0;
                        v10 = v6;
                        if ((int)sub_aa845c(a0->field_10, &v0) >= 1)
                        {
                            v7 = *(long long *)&v4->field_38;
                            v10 = (char)&v0;
LABEL_b363ec:
                            if (sub_b35f80(idx, v9, v10, v7) && sub_a2a0d4(idx))
                            {
                                *(char *)(idx + 16) = *(char *)(idx + 16) | 1;
                                goto LABEL_b3642c;
                            }
                        }
                    }
                    else
                    {
LABEL_b363c0:
                        v10 = v6;
                    }
                    sub_a2a8a4(idx);
                    idx = 0;
LABEL_b3642c:
                    if (v10 != v6)
                        sub_a66ec0(v10, v7);
                    if (!idx || !(*(char *)(idx + 16) & 1))
                        goto LABEL_b3644c;
                    v11 = idx + 0x11;
                }
                else
                {
LABEL_b3644c:
                    sub_a368c8();
                    sub_a369bc("providers/implementations/kem/ecx_kem.c", 152, "ecx_pubkey");
                    sub_a36abc(57, 220, 0);
                    v11 = 0;
                }
                if (!a0->field_0 || !(a0->field_0->field_10 & 1))
                {
                    sub_a368c8(a0, a3);
                    sub_a369bc("providers/implementations/kem/ecx_kem.c", 152, "ecx_pubkey");
                    sub_a36abc(57, 220, 0);
LABEL_b364c0:
                    v12 = 0;
                }
                else
                {
                    if (!v11 || !sub_b36aec())
                        goto LABEL_b364c0;
                    _memcpy(a1, v11, v4->field_28);
                    *(long long *)a2 = v4->field_28;
                    *(unsigned long long *)a4 = v4->field_20;
                    v12 = 1;
                }
                sub_a2a8a4(idx);
                v5 = v12;
            }
        }
        else
        {
            if (!a2 && !a4)
            {
                v5 = 0;
            }
            else
            {
                if (a2)
                    *(long long *)a2 = v4->field_28;
                if (a4)
                {
                    *(unsigned long long *)a4 = v4->field_20;
                    v5 = 1;
                }
                else
                {
                    v5 = 1;
                }
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kem/ecx_kem.c", 668, "ecxkem_encapsulate");
        sub_a36abc(57, 125, 0);
        v5 = 0xfffffffe;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v5;
    ___stack_chk_fail();
}
