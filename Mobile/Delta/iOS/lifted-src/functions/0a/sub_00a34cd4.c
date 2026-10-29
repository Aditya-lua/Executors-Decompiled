/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa34cd4..0xa34dc4 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a32f08;
extern long long g_a34dc4;
extern long long g_f086d8;
extern unsigned int g_f0d558;
extern long long g_f0d560;
extern long long g_f12878;

long long sub_a34cd4(unsigned long long *a0, unsigned long long a1, unsigned int a2)
{
    unsigned long v7;  // cc_op
    unsigned long v10;  // cc_ndep
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4102
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    unsigned long v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned int v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v0 = 0;
    v1 = 0;
    v2 = a1;
    v3 = a2;
    if (sub_a7c208(&g_f086d8, &g_a32f08))
    {
        v8 = arm64g_calculate_condition(v7 | 16, v13, v14, v10);
        v9 = arm64g_calculate_condition(19, (v8 & 1 ? g_f0d558 : 0x40000000), 0, 0);
        if (v9 & 1)
            goto LABEL_a34d54;
LABEL_a34d20:
        sub_a368c8();
        sub_a369bc("crypto/engine/tb_asnmth.c", 200, "ENGINE_pkey_asn1_find_str");
        sub_a36abc(38, 0x8000f, 0);
    }
    else
    {
        v11 = arm64g_calculate_condition(v7 | 16, v13, v14, v10);
        v12 = arm64g_calculate_condition(16, (v11 & 1 ? g_f0d558 : 0x40000000), 0, 0);
        if (!(v12 & 1))
            goto LABEL_a34d20;
LABEL_a34d54:
        if (sub_a7c17c(g_f0d560))
        {
            sub_a34a44(g_f12878, &g_a34dc4, &v0);
            if (v0)
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
            }
            *a0 = v0;
            sub_a7c1b4(g_f0d560);
            return v1;
        }
    }
    return 0;
}
