/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb35518..0xb35794 (636 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b35518_0 {
    char padding_0[32];
    unsigned long long field_20;
    char padding_28[8];
    long long field_30;
} st_b35518_0;

typedef struct st_b35518_1 {
    long long field_0;
    long long field_8;
    char padding_10[16];
    long long field_20;
    char padding_28[24];
    struct st_b35518_0 *field_40;
} st_b35518_1;

extern char g_10002b0;

long long sub_b35518(st_b35518_1 *a0, long long a1, unsigned long long *a2, long long a3, long long a4)
{
    st_b35518_0 *v4;  // x25
    long long v5;  // x2
    long long v6;  // x1
    long long v7;  // x23
    long long v8;  // x0
    long long v9;  // x19
    long long v10;  // x0
    long long v11;  // x0
    long long v12;  // x20
    long long v13;  // x0
    char v0;  // [bp-0xed]
    unsigned long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if ((int)a0->field_20 == 1)
    {
        v4 = a0->field_40;
        if (!a1)
        {
            *a2 = v4->field_20;
            v13 = 1;
        }
        else if (v4->field_20 > *a2)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kem/ec_kem.c", 739, "dhkem_decap");
            v5 = "*secretlen too small";
            v6 = 142;
            goto LABEL_b356fc;
        }
        else if (v4->field_30 == a4)
        {
            v7 = a0->field_0;
            v8 = sub_a19700(v7);
            v9 = sub_a18b7c(v8, sub_a19708(v7));
            if (v9 && sub_a19718(v9, sub_9ffdd0(v7)) && sub_a19954(v9, a3, a4, 0))
            {
                v10 = sub_9ffdd0(a0->field_0);
                v11 = sub_a1d9f8(v10, sub_975ff4(a0->field_0), 4, &v0, 133, 0);
                if (v11)
                {
                    if (v11 != a4)
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/kem/ec_kem.c", 754, "dhkem_decap");
                        sub_a36abc(57, 158, "Invalid recipient public key");
                    }
                    else if (sub_b35bcc(a0, a1, a0->field_0, v9, a0->field_0, a0->field_8, a3, &v0))
                    {
                        *a2 = v4->field_20;
                        v12 = 1;
                        goto LABEL_b35718;
                    }
                }
            }
            else
            {
                sub_a18c08(v9);
                v9 = 0;
            }
            v12 = 0;
LABEL_b35718:
            sub_a18c08(v9);
            v13 = v12;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kem/ec_kem.c", 743, "dhkem_decap");
            v5 = "Invalid enc public key";
            v6 = 158;
LABEL_b356fc:
            sub_a36abc(57, v6, v5);
            v13 = 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kem/ec_kem.c", 793, "eckem_decapsulate");
        sub_a36abc(57, 125, 0);
        v13 = 0xfffffffe;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v13;
    ___stack_chk_fail();
}
