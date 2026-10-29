/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4e3ac..0xb4e550 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4e3ac_0 {
    char padding_0[8];
    long long field_8;
} st_b4e3ac_0;

typedef struct st_b4e3ac_1 {
    long long field_0;
    struct st_b4e3ac_0 *field_8;
    char padding_10[268];
    char field_11c;
    char field_11d;
    char padding_11e[258];
    long long field_220;
} st_b4e3ac_1;

extern char g_10002b0;

unsigned long long sub_b4e3ac(st_b4e3ac_1 *a0, long long a1, long long a2, char *a3, long long a4)
{
    long long v5;  // x22
    char *v6;  // x21
    unsigned int v7;  // w0
    unsigned long long v8;  // x0
    unsigned long v9;  // x8
    long long v10;  // x1
    char v0;  // [bp-0x90]
    char v1;  // [bp-0x88]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a4;
    v6 = a3;
    v2 = *(long long *)&g_10002b0;
    v7 = sub_a2f9e0();
    if (a2 != 64)
    {
        if (*(long long *)&g_10002b0 == v2)
            return 0;
        ___stack_chk_fail();
    }
    else if (v7)
    {
        v9 = a0->field_11c;
        if (!(v9 >> 3 & 1))
        {
            if (v9 >> 1 & 1)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/eddsa_sig.c", 613, "ed25519_verify");
                v10 = 243;
            }
            else
            {
                v8 = sub_a0c920(v6, v5, a1, &a0->field_8[1].padding_0[1], __ROL__((unsigned int)v9, 30) & 0xc0000001 & 1, __ROL__((unsigned int)v9, 29) & 3758096385 & 1, __ROL__((unsigned int)v9, 28) & 4026531841 & 1, &a0->field_11d, a0->field_220, a0->field_0, a0->field_8->field_8);
                if (*(long long *)&g_10002b0 == v2)
                    return v8;
                ___stack_chk_fail();
            }
        }
        else
        {
            if (!(v9 >> 1 & 1))
            {
                if (sub_a40bcc(a0->field_0, "SHA512", 0, v6, v5, &v1, &v0) && v0 == 64)
                {
                    v9 = a0->field_11c;
                    v8 = sub_a0c920(&v1, 64, a1, &a0->field_8[1].padding_0[1], __ROL__((unsigned int)v9, 30) & 0xc0000001 & 1, __ROL__((unsigned int)v9, 29) & 3758096385 & 1, __ROL__((unsigned int)v9, 28) & 4026531841 & 1, &a0->field_11d, a0->field_220, a0->field_0, a0->field_8->field_8);
                    if (*(long long *)&g_10002b0 == v2)
                        return v8;
                    ___stack_chk_fail();
                }
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/eddsa_sig.c", 601, "ed25519_verify");
                v10 = 241;
            }
            else if (v5 == 64)
            {
                v8 = sub_a0c920(v6, v5, a1, &a0->field_8[1].padding_0[1], __ROL__((unsigned int)v9, 30) & 0xc0000001 & 1, __ROL__((unsigned int)v9, 29) & 3758096385 & 1, __ROL__((unsigned int)v9, 28) & 4026531841 & 1, &a0->field_11d, a0->field_220, a0->field_0, a0->field_8->field_8);
                if (*(long long *)&g_10002b0 == v2)
                    return v8;
                ___stack_chk_fail();
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/eddsa_sig.c", 607, "ed25519_verify");
                v10 = 166;
            }
        }
        sub_a36abc(57, v10, 0);
        if (*(long long *)&g_10002b0 == v2)
            return 0;
        ___stack_chk_fail();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v2)
            return 0;
        ___stack_chk_fail();
    }
}
