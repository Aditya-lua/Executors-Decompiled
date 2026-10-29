/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa41080..0xa41504 (1156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a41080_0 {
    char padding_0[16];
    struct st_a41080_1 *field_10;
    unsigned long long field_18;
} st_a41080_0;

typedef struct st_a41080_1 {
    unsigned int field_0;
} st_a41080_1;

typedef struct st_a41080_2 {
    struct st_a41080_2 *field_0;
    char padding_8[16];
    struct st_a41080_2 *field_18;
    char padding_20[56];
    unsigned int field_58;
    char padding_5c[4];
    struct st_a41080_2 *field_60;
    unsigned long long field_68;
    char padding_70[8];
    unsigned int field_78;
} st_a41080_2;

extern long long g_a416cc;
extern char g_def050;
extern char g_10002b0;

st_a41080_2 * sub_a41080(unsigned long long a0, st_a41080_0 *a1, long long a2)
{
    unsigned int *v3;  // x24
    st_a41080_2 *v4;  // x19
    unsigned long long v5;  // 4118
    st_a41080_2 *v6;  // x0
    unsigned long i;  // x9
    unsigned int v8;  // w8
    unsigned long long v9;  // 4102
    unsigned long v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *(long long *)&g_10002b0;
    v3 = a1->field_10;
    v4 = sub_a6bffc(248, "crypto/evp/digest.c", 943);
    if (v4)
    {
        /* unsupported instruction */;
        v4->field_78 = 1;
        *(unsigned int *)&v4->field_0 = 0;
        if (sub_a4f138(a2, a0, &g_a416cc, v4) && !(v5 = arm64g_calculate_condition(1, (int)v4->field_0, 1, 0), v5 & 1))
        {
            v4->field_58 = a0;
            v6 = sub_a6895c(a1);
            v4->field_60 = v6;
            if (v6)
            {
                v4->field_68 = a1->field_18;
                for (i = v3 + 2; 15 < (unsigned int)*(int *)(i - 8); i += 16);
                goto *((void *)(sub_a41144 + (&g_def050)[*(int *)(i - 8)] * 4));
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/digest.c", 1033, "evp_md_from_algorithm");
            sub_a36abc(6, 0xc0103, 0);
        }
        if (!(int)v4->field_18)
        {
            do
            {
                /* unsupported instruction */;
                v8 = /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v9 = arm64g_calculate_condition(19, v8, 1, 0);
            if (!(v9 & 1))
            {
                /* unsupported instruction */;
            }
            else if (1 < (int)v8)
            {
                goto LABEL_a41474;
            }
            sub_a50b58(v4);
        }
LABEL_a41474:
        v4 = 0;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/digest.c", 1025, "evp_md_from_algorithm");
        sub_a36abc(6, 0x80006, 0);
    }
    if (*(long long *)&g_10002b0 == v0)
        return v4;
    ___stack_chk_fail();
}
