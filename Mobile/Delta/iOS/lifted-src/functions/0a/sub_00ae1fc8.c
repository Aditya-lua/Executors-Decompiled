/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae1fc8..0xae2440 (1144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_c7c2eb;
extern char g_10002b0;

int sub_ae1fc8(unsigned long a0, void* a1, long long a2, unsigned long long a3)
{
    unsigned long long v18;  // x19
    void* v19;  // x25
    long long v28;  // x0
    unsigned long v29;  // x28
    unsigned long v30;  // x1
    long long v31;  // x0
    unsigned long v32;  // x25
    unsigned long v33;  // cc_dep1
    unsigned long v34;  // x8
    unsigned long long v35;  // 4108
    unsigned long long v36;  // 4108
    unsigned long v37;  // x9
    unsigned long v20;  // x22
    unsigned long long v38;  // 4108
    unsigned long long v39;  // 4108
    unsigned long v40;  // x11
    unsigned int v41;  // w0
    unsigned long long v21;  // x8
    unsigned long long v22;  // x24
    unsigned long long v23;  // x26
    void* v24;  // x27
    unsigned long v25;  // x23
    void* v26;  // x24
    unsigned long v27;  // x28
    unsigned long long v0;  // [bp-0x170]
    unsigned long v1;  // [bp-0x168]
    unsigned long v2;  // [bp-0x160]
    unsigned long v3;  // [bp-0x158]
    char *v4;  // [bp-0x150]
    unsigned long v5;  // [bp-0x148]
    unsigned long long v6;  // [bp-0x138]
    unsigned long long v7;  // [bp-0x130]
    unsigned long long v8;  // [bp-0x120]
    unsigned long long v9;  // [bp-0x118]
    unsigned long long v10;  // [bp-0x110]
    unsigned long long v11;  // [bp-0x108]
    unsigned long long v12;  // [bp-0x100]
    unsigned long long v13;  // [bp-0xf8]
    char v14;  // [bp-0xf0]
    unsigned long v15;  // [bp-0x70]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v18 = a3;
    v19 = a1;
    v15 = *(long long *)&g_10002b0;
    if (*(long long *)a1 && (v0 = v18, v1 = &g_c7c2eb, (int)sub_9d524c(a2, "%*sadmissionAuthority:\n") < 1 || (v0 = v18, v1 = &g_c7c2eb, (int)sub_9d524c(a2, "%*s  ") < 1 || (int)sub_aec458(a2, *(long long *)v19) < 1 || (int)sub_9d524c(a2, "\n") < 1)))
    {
LABEL_ae23f8:
        v41 = 0;
    }
    else if ((int)sub_ad69e4((long long)v19[8]) >= 1)
    {
        v20 = 0;
        v21 = v18;
        v8 = v21;
        v9 = v21;
        v12 = v21;
        v13 = v21;
        v10 = v21;
        v11 = v21;
        v22 = v18;
        v6 = v22;
        v23 = v18;
        do
        {
            v24 = sub_ad69f8((long long)v19[8], v20);
            v20 = (unsigned int)v20 + 1;
            v1 = &g_c7c2eb;
            v2 = v20;
            v0 = v18;
            if ((int)sub_9d524c(a2, "%*sEntry %0d:\n") < 1 || *(long long *)v24 && !(v0 = v22, v1 = &g_c7c2eb, (int)sub_9d524c(a2, "%*s  admissionAuthority:\n") >= 1 && !(v0 = v10, v1 = &g_c7c2eb, (int)sub_9d524c(a2, "%*s    ") < 1 || (int)sub_aec458(a2, *(long long *)v24) < 1 || (int)sub_9d524c(a2, "\n") < 1)) || (long long)v24[8] && (int)sub_ae2440((long long)v24[8], a2, (unsigned int)v18 + 2) < 1)
                goto LABEL_ae23f8;
            if ((int)sub_ad69e4((long long)v24[16]) < 1)
                continue;
            v25 = 0;
            v7 = v23;
            do
            {
                v26 = sub_ad69f8((long long)v24[16], v25);
                v25 = (unsigned int)v25 + 1;
                v1 = &g_c7c2eb;
                v2 = v25;
                v0 = v23;
                if (!((int)sub_9d524c(a2, "%*s  Profession Info Entry %0d:\n") >= 1) || !((!(long long)v26[24] || (v0 = v11, v1 = &g_c7c2eb, (int)sub_9d524c(a2, "%*s    registrationNumber: ") >= 1 && (int)sub_9c3708(a2, (long long)v26[24]) >= 1 && (int)sub_9d524c(a2, "\n") >= 1)) && (!*(long long *)v26 || (int)sub_ae2440(*(long long *)v26, a2, (unsigned int)v18 + 4) >= 1)))
                    goto LABEL_ae23f8;
                if ((long long)v26[8])
                {
                    v0 = v9;
                    v1 = &g_c7c2eb;
                    if ((int)sub_9d524c(a2, "%*s    Info Entries:\n") < 1)
                        goto LABEL_ae23f8;
                    if ((int)sub_ad69e4((long long)v26[8]) >= 1)
                    {
                        v27 = 0;
                        do
                        {
                            v28 = sub_ad69f8((long long)v26[8], v27);
                            v0 = v12;
                            v1 = &g_c7c2eb;
                            if ((int)sub_9d524c(a2, "%*s      ") < 1 || (int)sub_9c3708(a2, v28) < 1 || (int)sub_9d524c(a2, "\n") <= 0)
                                goto LABEL_ae23f8;
                        } while ((v27 = (unsigned int)v27 + 1, (int)v27 < (int)sub_ad69e4((long long)v26[8])));
                    }
                }
                if (!(long long)v26[16])
                    continue;
                v0 = v8;
                v1 = &g_c7c2eb;
                if ((int)sub_9d524c(a2, "%*s    Profession OIDs:\n") < 1)
                    goto LABEL_ae23f8;
                if ((int)sub_ad69e4((long long)v26[16]) >= 1)
                {
                    v29 = 0;
                    do
                    {
                        v30 = v29;
                        v31 = sub_ad69f8((long long)v26[16], v30);
                        v32 = sub_a99788(sub_a99eac(v31, v30));
                        sub_a99b48(&v14, 128, v31, 1);
                        v33 = v32;
                        if (!v32)
                        {
                            v34 = &g_c7c2eb;
                            v35 = arm64g_calculate_condition(4, v33, 0, 0);
                            if (!(v35 & 1))
                                goto LABEL_ae2366;
                            goto LABEL_ae2365;
                        }
                        else
                        {
                            v34 = v32;
                            v36 = arm64g_calculate_condition(4, v33, 0, 0);
                            if (v36 & 1)
                            {
LABEL_ae2365:
                                v37 = &g_c7c2eb;
                                v38 = arm64g_calculate_condition(4, v33, 0, 0);
                                if (!(v38 & 1))
                                    goto LABEL_ae2372;
                                goto LABEL_ae2371;
                            }
                            else
                            {
LABEL_ae2366:
                                v37 = " (";
                                v39 = arm64g_calculate_condition(4, v33, 0, 0);
                                if (v39 & 1)
                                {
LABEL_ae2371:
                                    v40 = &g_c7c2eb;
                                    goto LABEL_ae2374;
                                }
                                else
                                {
LABEL_ae2372:
                                    v40 = L"):]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺";
LABEL_ae2374:
                                    v4 = &v14;
                                    v5 = v40;
                                    v2 = v34;
                                    v3 = v37;
                                    v0 = v13;
                                    v1 = &g_c7c2eb;
                                    if ((int)sub_9d524c() <= 0)
                                        goto LABEL_ae23f8;
                                }
                            }
                        }
                    } while ((v29 = (unsigned int)v29 + 1, (int)v29 < (int)sub_ad69e4((long long)v26[16])));
                }
            } while ((v23 = v7, (int)v25 < (int)sub_ad69e4((long long)v24[16])));
        } while ((v41 = 1, v22 = v6, (int)v20 < (int)sub_ad69e4((long long)v19[8])));
        goto LABEL_ae23f8;
    }
    else
    {
        v41 = 1;
    }
    if (*(long long *)&g_10002b0 == v15)
        return v41;
    ___stack_chk_fail();
}
