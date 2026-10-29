/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaec0c4..0xaec458 (916 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aec0c4_2 {
    long long field_0;
    void* field_8;
} st_aec0c4_2;

typedef struct st_aec0c4_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_aec0c4_0 *field_8;
} st_aec0c4_1;

typedef struct st_aec0c4_0 {
    int field_0;
    char padding_4[4];
    struct st_aec0c4_1 *field_8;
} st_aec0c4_0;

extern char g_10002b0;

long long sub_aec0c4(unsigned long a0, st_aec0c4_2 *a1, long long a2)
{
    long long v7;  // w8
    long long v8;  // x19
    st_aec0c4_1 *v17;  // x8
    st_aec0c4_1 *v18;  // x8
    st_aec0c4_1 *v19;  // x8
    unsigned int v20;  // w9
    st_aec0c4_1 *v21;  // x8
    st_aec0c4_1 *v9;  // x1
    unsigned long v10;  // x2
    long long v11;  // x0
    long long v12;  // x0
    int v13;  // w0
    void* v14;  // x8
    st_aec0c4_1 *v15;  // x8
    st_aec0c4_1 *v16;  // x8
    char *v0;  // [bp-0x280]
    long long v1;  // [bp-0x270]
    char v2;  // [bp-0x264]
    char v3;  // [bp-0x164]
    unsigned long v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = a2;
    v7 = (int)a1->field_0;
    if (v7 > 3)
    {
        if (v7 <= 5)
        {
            if (v7 != 4)
            {
                if (v7 == 5)
                {
LABEL_aec18c:
                    goto LABEL_aec258;
                }
            }
            else
            {
                v12 = sub_af3694(a1->field_8, &v2, 0x100);
                if (!v12)
                {
                    if (*(long long *)&g_10002b0 == v4)
                        return v12;
                    ___stack_chk_fail();
                }
LABEL_aec254:
                goto LABEL_aec258;
            }
            goto LABEL_aec2b4;
        }
        else if (v7 != 6)
        {
            if (v7 == 7)
            {
                v8 = sub_af02d8((long long)a1->field_8[8], *(int *)a1->field_8);
                if (!v8 || !sub_aeefc4("IP Address", v8, &v1))
                    v1 = 0;
                sub_a6c2e4(v8, "crypto/x509/v3_san.c", 195);
            }
            else if (v7 == 8)
            {
                sub_9c3058(&v2, 0x100, a1->field_8);
                goto LABEL_aec254;
            }
            goto LABEL_aec2b4;
        }
        else
        {
            v9 = (long long)a1->field_8[8];
            v10 = *(int *)a1->field_8;
            v11 = "URI";
        }
    }
    else
    {
        if (1 >= v7)
        {
            if (!v7)
            {
                v13 = sub_a99eac(*(long long *)a1->field_8);
                v14 = a1->field_8;
                if (v13 > 1208)
                {
                    if (v13 != 1209)
                    {
                        if (v13 != 1210)
                        {
                            if (v13 != 1211)
                                goto LABEL_aec394;
                            v15 = (long long)v14[8];
                            if (v15->field_0 == 12)
                            {
                                v9 = v15->field_8->field_8;
                                v10 = v15->field_8->field_0;
                                v11 = "othername: NAIRealm";
                            }
                            else
                            {
                                if (*(long long *)&g_10002b0 == v4)
                                    return 0;
                                ___stack_chk_fail();
                            }
                        }
                        else
                        {
                            v16 = (long long)v14[8];
                            if (v16->field_0 != 22)
                            {
                                if (*(long long *)&g_10002b0 == v4)
                                    return 0;
                                ___stack_chk_fail();
                            }
                            else
                            {
                                v9 = v16->field_8->field_8;
                                v10 = v16->field_8->field_0;
                                v11 = "othername: SRVName";
                            }
                        }
                    }
                    else
                    {
                        v17 = (long long)v14[8];
                        if (v17->field_0 != 12)
                        {
                            if (*(long long *)&g_10002b0 == v4)
                                return 0;
                            ___stack_chk_fail();
                        }
                        else
                        {
                            v9 = v17->field_8->field_8;
                            v10 = v17->field_8->field_0;
                            v11 = "othername: XmppAddr";
                        }
                    }
                }
                else
                {
                    switch (v13)
                    {
                    case 649:
                        v21 = (long long)v14[8];
                        if (v21->field_0 != 12)
                        {
                            if (*(long long *)&g_10002b0 == v4)
                                return 0;
                            ___stack_chk_fail();
                        }
                        else
                        {
                            v9 = v21->field_8->field_8;
                            v10 = v21->field_8->field_0;
                            v11 = "othername: UPN";
                            break;
                        }
                    case 1208:
                        v18 = (long long)v14[8];
                        if (v18->field_0 != 12)
                        {
                            if (*(long long *)&g_10002b0 == v4)
                                return 0;
                            ___stack_chk_fail();
                        }
                        else
                        {
                            v9 = v18->field_8->field_8;
                            v10 = v18->field_8->field_0;
                            v11 = "othername: SmtpUTF8Mailbox";
                            break;
                        }
                    default:
LABEL_aec394:
                        if ((int)sub_a99b48(&v2, 0x100, *(long long *)v14, 0) >= 1)
                        {
                            v0 = &v2;
                            sub_9d5b44(&v3, 300, "othername: %s");
                        }
                        else
                        {
                            sub_a6db20(&v3, "othername", 300);
                        }
                        v19 = (long long)a1->field_8[8];
                        v20 = v19->field_0;
                        if (v19->field_0 == 22)
                        {
                            if (sub_aef198(&v3, v19->field_8->field_8, v19->field_8->field_0, &v1))
                            {
                                if (*(long long *)&g_10002b0 == v4)
                                    return v1;
                                ___stack_chk_fail();
                            }
                            else
                            {
                                v19 = (long long)a1->field_8[8];
                                v20 = *(int *)(long long)a1->field_8[8];
                            }
                        }
                        if (v20 != 12 || !sub_aef198(&v3, v19->field_8->field_8, v19->field_8->field_0, &v1))
                        {
LABEL_aec258:
                            if (!sub_aeefc4())
                            {
                                if (*(long long *)&g_10002b0 == v4)
                                    return 0;
                                ___stack_chk_fail();
                            }
                        }
LABEL_aec2b4:
                        v12 = v1;
                        if (*(long long *)&g_10002b0 == v4)
                            return v12;
                        ___stack_chk_fail();
                    }
                }
            }
            else if (v7 == 1)
            {
                v9 = (long long)a1->field_8[8];
                v10 = *(int *)a1->field_8;
                v11 = "email";
            }
            else
            {
                if (*(long long *)&g_10002b0 == v4)
                    return v1;
                ___stack_chk_fail();
            }
        }
        else
        {
            if (v7 == 2)
            {
                v9 = (long long)a1->field_8[8];
                v10 = *(int *)a1->field_8;
                v11 = "DNS";
            }
            else if (v7 == 3)
            {
                goto LABEL_aec18c;
            }
            else
            {
                if (*(long long *)&g_10002b0 == v4)
                    return v1;
                ___stack_chk_fail();
            }
        }
    }
    if (!sub_aef198(v11, v9, v10, &v1))
    {
        if (*(long long *)&g_10002b0 == v4)
            return 0;
        ___stack_chk_fail();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v4)
            return v1;
        ___stack_chk_fail();
    }
}
