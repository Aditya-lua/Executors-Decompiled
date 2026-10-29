/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4ee58..0xb4efac (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4ee58_0 {
    char padding_0[8];
    long long field_8;
} st_b4ee58_0;

typedef struct st_b4ee58_1 {
    long long field_0;
    struct st_b4ee58_0 *field_8;
    char padding_10[268];
    char field_11c;
    char field_11d;
    char padding_11e[258];
    long long field_220;
} st_b4ee58_1;

extern char g_10002b0;

unsigned long long sub_b4ee58(st_b4ee58_1 *a0, long long a1, unsigned long a2, char *a3, long long a4)
{
    long long v4;  // x22
    char *v5;  // x21
    unsigned long long v7;  // x0
    unsigned long v8;  // x8
    long long v9;  // x1
    char v0;  // [bp-0x88]
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a4;
    v5 = a3;
    v1 = *(long long *)&g_10002b0;
    v7 = 0;
    if (a2 == 114 && sub_a2f9e0())
    {
        v8 = a0->field_11c;
        if (!(v8 >> 3 & 1))
        {
            if (v8 >> 1 & 1)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/eddsa_sig.c", 665, "ed448_verify");
                v9 = 243;
                goto LABEL_b4ef6c;
            }
            goto LABEL_b4ef18;
        }
        else if (!(v8 >> 1 & 1))
        {
            v7 = sub_b4f378(a0->field_0, v5, v4, &v0);
            if ((unsigned int)v7)
            {
                v8 = a0->field_11c;
                v5 = &v0;
                v4 = 64;
            }
            else
            {
                if (*(long long *)&g_10002b0 == v1)
                    return v7;
                ___stack_chk_fail();
            }
LABEL_b4ef18:
            v7 = sub_a084a0(a0->field_0, v5, v4, a1, &a0->field_8[1].padding_0[1], &a0->field_11d, a0->field_220, __ROL__((unsigned int)v8, 29) & 3758096385 & 1, a0->field_8->field_8);
        }
        else
        {
            if (v4 == 64)
                goto LABEL_b4ef18;
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/eddsa_sig.c", 659, "ed448_verify");
            v9 = 166;
LABEL_b4ef6c:
            sub_a36abc(57, v9, 0);
            v7 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v1)
        return v7;
    ___stack_chk_fail();
}
