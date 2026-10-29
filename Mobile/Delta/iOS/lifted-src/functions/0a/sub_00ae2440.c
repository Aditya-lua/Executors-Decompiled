/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae2440..0xae2620 (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_c7c2eb;
extern char g_10002b0;

int sub_ae2440(void* a0, long long a1, unsigned long long a2)
{
    unsigned long v8;  // x22
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // x8
    unsigned long long v11;  // 4108
    unsigned long long v12;  // 4108
    unsigned long v13;  // x9
    unsigned long long v14;  // 4108
    unsigned long long v15;  // 4108
    unsigned long v16;  // x10
    unsigned long v0;  // [bp-0xf0], Other Possible Types: unsigned long long
    unsigned long v1;  // [bp-0xe8]
    char *v2;  // [bp-0xe0]
    unsigned long v3;  // [bp-0xd8]
    char v4;  // [bp-0xc8]
    unsigned long v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    if ((*(long long *)a0 || (long long)a0[16] || (long long)a0[8]) && (v0 = a2, v1 = &g_c7c2eb, (int)sub_9d524c(a1, "%*snamingAuthority:\n") >= 1))
    {
        if (*(long long *)a0)
        {
            v8 = sub_a99788(sub_a99eac(*(long long *)a0));
            v0 = a2;
            v1 = &g_c7c2eb;
            if ((int)sub_9d524c(a1, "%*s  namingAuthorityId: ") >= 1)
            {
                sub_a99b48(&v4, 128, *(long long *)a0, 1);
                v9 = v8;
                if (!v8)
                {
                    v10 = &g_c7c2eb;
                    v11 = arm64g_calculate_condition(4, v9, 0, 0);
                    if (!(v11 & 1))
                        goto LABEL_ae250e;
LABEL_ae250d:
                    v13 = &g_c7c2eb;
                    v14 = arm64g_calculate_condition(4, v9, 0, 0);
                    if (!(v14 & 1))
                        goto LABEL_ae251a;
LABEL_ae2519:
                    v16 = &g_c7c2eb;
                }
                else
                {
                    v10 = v8;
                    v12 = arm64g_calculate_condition(4, v9, 0, 0);
                    if (v12 & 1)
                        goto LABEL_ae250d;
LABEL_ae250e:
                    v13 = " (";
                    v15 = arm64g_calculate_condition(4, v9, 0, 0);
                    if (v15 & 1)
                        goto LABEL_ae2519;
                    v16 = L"):]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺";
LABEL_ae251a:
                }
                v2 = &v4;
                v3 = v16;
                v0 = v10;
                v1 = v13;
                if ((int)sub_9d524c() > 0)
                    goto LABEL_ae253c;
            }
        }
        else
        {
LABEL_ae253c:
            if ((!(long long)a0[16] || (v0 = a2, v1 = &g_c7c2eb, (int)sub_9d524c(a1, "%*s  namingAuthorityText: ") >= 1 && (int)sub_9c3708(a1, (long long)a0[16]) >= 1 && (int)sub_9d524c(a1, "\n") >= 1)) && (!(long long)a0[8] || !(v0 = a2, v1 = &g_c7c2eb, (int)sub_9d524c(a1, "%*s  namingAuthorityUrl: ") < 1 || (int)sub_9c3708(a1, (long long)a0[8]) < 1 || (int)sub_9d524c(a1, "\n") <= 0)))
            {
                if (*(long long *)&g_10002b0 == v5)
                    return 1;
                ___stack_chk_fail();
            }
        }
    }
    if (*(long long *)&g_10002b0 == v5)
        return 0;
    ___stack_chk_fail();
}
