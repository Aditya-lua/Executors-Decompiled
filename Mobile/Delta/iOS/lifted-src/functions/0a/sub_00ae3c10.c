/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae3c10..0xae4020 (1040 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae3c10_2 {
    struct st_ae3c10_1 *field_0;
    struct st_ae3c10_2 *field_8;
} st_ae3c10_2;

typedef struct st_ae3c10_1 {
    unsigned long long field_0;
    struct st_ae3c10_2 *field_8;
} st_ae3c10_1;

typedef struct st_ae3c10_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_ae3c10_0;

typedef struct st_ae3c10_3 {
    long long field_0;
    struct st_ae3c10_0 *field_8;
    struct st_ae3c10_2 *field_10;
    struct st_ae3c10_2 *field_18;
    struct st_ae3c10_1 *field_20;
} st_ae3c10_3;

extern unsigned long long g_c7c2eb;
extern char g_10002b0;

st_ae3c10_2 * sub_ae3c10(unsigned long a0, st_ae3c10_3 *a1, long long a2, unsigned long long a3)
{
    unsigned long v9;  // x23
    st_ae3c10_2 *v10;  // x8
    st_ae3c10_2 *v11;  // x8
    st_ae3c10_2 *v12;  // x21
    unsigned long v13;  // x8
    st_ae3c10_2 *v14;  // x0
    void* v15;  // x23
    st_ae3c10_2 *v16;  // x21
    unsigned long v17;  // x23
    st_ae3c10_2 *v18;  // x8
    unsigned long long v0;  // [bp-0x120], Other Possible Types: unsigned long
    st_ae3c10_2 *v1;  // [bp-0x118], Other Possible Types: unsigned long long
    char *v2;  // [bp-0x110], Other Possible Types: unsigned long
    st_ae3c10_2 *v3;  // [bp-0x108], Other Possible Types: unsigned long
    char v4;  // [bp-0xf8]
    char v5;  // [bp-0xa8]
    unsigned long v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    if ((int)sub_a99b48(&v4, 80, a1->field_0, 1) >= 1)
    {
        v2 = &v4;
        v0 = a3;
        v1 = &g_c7c2eb;
        if ((int)sub_9d524c(a2, "%*sIdentifier: %s\n") >= 1)
        {
            v0 = a3;
            v1 = &g_c7c2eb;
            if ((int)sub_9d524c(a2, "%*sSyntax:\n") >= 1)
            {
                v9 = (unsigned int)a3 + 4;
                v2 = a1->field_8->field_0;
                v3 = a1->field_8->field_8;
                v0 = v9;
                v1 = &g_c7c2eb;
                if ((int)sub_9d524c(a2, "%*s%.*s") >= 1 && (int)sub_9d4888(a2, "\n\n") >= 1)
                {
                    v10 = a1->field_10;
                    if (!v10 || (v2 = (int)v10->field_0, v3 = v10->field_8, v0 = a3, v1 = &g_c7c2eb, (int)sub_9d524c(a2, "%*sName: %.*s\n") >= 1))
                    {
                        v11 = a1->field_18;
                        if (!v11 || (v2 = (int)v11->field_0, v3 = v11->field_8, v0 = a3, v1 = &g_c7c2eb, (int)sub_9d524c(a2, "%*sDescription: %.*s\n") >= 1))
                        {
                            v0 = a3;
                            v1 = &g_c7c2eb;
                            if ((int)sub_9d524c(a2, "%*sDomination Rule:\n") >= 1 && (int)sub_a99b48(&v5, 80, a1->field_20->field_0, 1) >= 1)
                            {
                                v1 = &g_c7c2eb;
                                v2 = &v5;
                                v0 = v9;
                                if ((int)sub_9d524c(a2, "%*sPrivilege Policy Identifier: %s\n") >= 1)
                                {
                                    v0 = v9;
                                    v1 = &g_c7c2eb;
                                    if ((int)sub_9d524c(a2, "%*sPrivilege Policy Syntax:\n") >= 1)
                                    {
                                        v12 = a1->field_20->field_8;
                                        v13 = (unsigned int)a3 + 8;
                                        if ((int)v12->field_0 == 1)
                                        {
                                            v0 = v13;
                                            v1 = &g_c7c2eb;
                                            if ((int)sub_9d524c(a2, "%*sPointer:\n") >= 1)
                                            {
                                                v15 = v12->field_8;
                                                v0 = (unsigned int)a3 + 12;
                                                v1 = &g_c7c2eb;
                                                if (...)
                                                {
                                                    if (*(long long *)&g_10002b0 == v6)
                                                        return 1;
                                                    ___stack_chk_fail();
                                                }
                                            }
                                        }
                                        else if (!(int)v12->field_0)
                                        {
                                            v0 = v13;
                                            v1 = &g_c7c2eb;
                                            if ((int)sub_9d524c(a2, "%*sContent: ") >= 1)
                                            {
                                                v0 = (int)v12->field_8->field_0;
                                                v1 = v12->field_8->field_8;
                                                if ((int)sub_9d524c(a2, "%.*s") >= 1)
                                                {
                                                    v14 = (int)sub_9d4888(a2, "\n") > 0;
                                                    if (*(long long *)&g_10002b0 == v6)
                                                        return v14;
                                                    ___stack_chk_fail();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    if (*(long long *)&g_10002b0 == v6)
        return 0;
    ___stack_chk_fail();
}
