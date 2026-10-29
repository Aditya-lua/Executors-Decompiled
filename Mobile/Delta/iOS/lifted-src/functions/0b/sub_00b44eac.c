/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb44eac..0xb44ff4 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b44eac_0 {
    char padding_0[48];
    unsigned long long field_30;
} st_b44eac_0;

extern char g_10002b0;

int sub_b44eac(st_b44eac_0 *a0, long long a1, long long a2)
{
    unsigned int v5;  // w0
    unsigned long long v6;  // 4109
    long long v7;  // x1
    unsigned long v8;  // x8
    unsigned int v9;  // w0
    unsigned long long v0;  // [bp-0x258]
    char v1;  // [bp-0x24c]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v5 = sub_a50a7c(sub_954340(&a0->padding_0[16]));
    v6 = arm64g_calculate_condition(130, a2 - 513, 0x1fe, 0);
    if (!(v6 & 1))
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/macs/kmac_prov.c", 269, "kmac_setkey");
        v7 = 105;
        goto LABEL_b44fb4;
    }
    else if ((int)v5 > 0)
    {
        if (!sub_b44ff4(&v1, &v0, a1, a2) || (v8 = v5 * (v5 + (unsigned int)v0 + 2 - 1) / v5, a0->field_30 = v8, 673 <= v8 || !sub_c6a8d0(&a0[1].padding_0[12], 0, &v1)))
            goto LABEL_b44fbc;
        v9 = 1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/macs/kmac_prov.c", 292, "kmac_setkey");
        v7 = 166;
LABEL_b44fb4:
        sub_a36abc(57, v7, 0);
LABEL_b44fbc:
        v9 = 0;
    }
    if (*(long long *)&g_10002b0 == v2)
        return v9;
    ___stack_chk_fail();
}
