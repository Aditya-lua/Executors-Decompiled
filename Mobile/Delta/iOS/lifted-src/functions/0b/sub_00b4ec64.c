/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4ec64..0xb4ee58 (500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4ec64_1 {
    long long field_0;
    struct st_b4ec64_0 *field_8;
    char padding_10[268];
    char field_11c;
} st_b4ec64_1;

typedef struct st_b4ec64_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[1];
    char field_11;
    char padding_12[62];
    unsigned long long field_50;
} st_b4ec64_0;

extern char g_10002b0;

unsigned long long sub_b4ec64(st_b4ec64_1 *a0, unsigned long long a1, unsigned long long *a2, unsigned long a3, char *a4, long long a5)
{
    long long v6;  // x23
    char *v7;  // x22
    st_b4ec64_0 *v8;  // x25
    unsigned long long v9;  // x0
    long long v10;  // x1
    unsigned long v11;  // x8
    char v0;  // [bp-0xb0]
    unsigned long v1;  // [bp-0xa8]
    char v2;  // [bp-0x98]
    unsigned long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a5;
    v7 = a4;
    v3 = *(long long *)&g_10002b0;
    v8 = a0->field_8;
    v9 = sub_a2f9e0();
    if (!(unsigned int)v9)
    {
        if (*(long long *)&g_10002b0 == v3)
            return v9;
        ___stack_chk_fail();
    }
    else if (a1)
    {
        if (113 >= a3)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/eddsa_sig.c", 0x1fe, "ed448_sign");
            v10 = 106;
        }
        else if (v8->field_50)
        {
            v11 = a0->field_11c;
            if (!(v11 >> 3 & 1))
            {
                if (!(v11 >> 1 & 1))
                    goto LABEL_b4ed84;
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/eddsa_sig.c", 549, "ed448_sign");
                v10 = 243;
            }
            else if (!(v11 >> 1 & 1))
            {
                v9 = sub_b4f378(a0->field_0, v7, v6, &v2);
                if ((unsigned int)v9)
                {
                    v11 = a0->field_11c;
                    v7 = &v2;
                    v6 = 64;
                }
                else
                {
                    if (*(long long *)&g_10002b0 == v3)
                        return v9;
                    ___stack_chk_fail();
                }
LABEL_b4ed84:
                v1 = v8->field_8;
                v0 = (char)(__ROL__((unsigned int)v11, 29)) & 1;
                if (sub_a08450(a0->field_0, a1, v7, v6, &v8->field_11))
                {
                    *a2 = 114;
                    if (*(long long *)&g_10002b0 == v3)
                        return 1;
                    ___stack_chk_fail();
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/signature/eddsa_sig.c", 558, "ed448_sign");
                    v10 = 175;
                }
            }
            else
            {
                if (v6 == 64)
                    goto LABEL_b4ed84;
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/eddsa_sig.c", 543, "ed448_sign");
                v10 = 166;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/eddsa_sig.c", 0x202, "ed448_sign");
            v10 = 0xdd;
        }
        sub_a36abc(57, v10, 0);
        if (*(long long *)&g_10002b0 == v3)
            return 0;
        ___stack_chk_fail();
    }
    else
    {
        *a2 = 114;
        if (*(long long *)&g_10002b0 == v3)
            return 1;
        ___stack_chk_fail();
    }
}
