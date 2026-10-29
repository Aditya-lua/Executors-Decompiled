/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae4bf4..0xae592c (3384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae4bf4_4 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_ae4bf4_5 *field_10;
} st_ae4bf4_4;

typedef struct st_ae4bf4_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    struct st_ae4bf4_2 *field_10;
} st_ae4bf4_1;

typedef struct st_ae4bf4_0 {
    struct st_ae4bf4_0 *field_0;
    char field_1;
    char padding_2[2];
    char field_4;
    char padding_5[3];
    struct st_ae4bf4_0 *field_8;
} st_ae4bf4_0;

typedef struct st_ae4bf4_5 {
    char field_0;
    char field_1;
    char field_2;
} st_ae4bf4_5;

typedef struct st_ae4bf4_3 {
    struct st_ae4bf4_3 *field_0;
    char field_1;
    char padding_2[2];
    long long field_4;
    struct st_ae4bf4_3 *field_8;
} st_ae4bf4_3;

typedef struct st_ae4bf4_2 {
    char field_0;
} st_ae4bf4_2;

extern long long g_ae5938;
extern long long g_aef19c;
extern long long g_eb64a0;
extern long long g_eb6528;
extern long long g_eb65b0;
extern long long g_eb6638;

st_ae4bf4_3 * sub_ae4bf4(unsigned long a0, long long a1, long long a2)
{
    long long v16;  // x27
    st_ae4bf4_3 *v17;  // x19
    st_ae4bf4_3 *v26;  // x22
    st_ae4bf4_3 *v27;  // x28
    st_ae4bf4_3 *v28;  // x26
    long long v29;  // w8
    st_ae4bf4_1 *v30;  // x21
    st_ae4bf4_3 *v31;  // x0
    st_ae4bf4_3 *v32;  // x20
    st_ae4bf4_3 *v33;  // x0
    st_ae4bf4_3 *v34;  // x0
    st_ae4bf4_3 *v35;  // x21
    unsigned long long v18;  // x0
    st_ae4bf4_3 *v36;  // x20
    st_ae4bf4_3 *v37;  // x28
    st_ae4bf4_4 *v38;  // x0
    st_ae4bf4_4 *v39;  // x27
    unsigned long v40;  // x22
    char *v41;  // x23
    st_ae4bf4_3 *v42;  // x22
    st_ae4bf4_3 *v43;  // x0
    st_ae4bf4_3 *v44;  // x23
    st_ae4bf4_3 *v45;  // x22
    unsigned long long v19;  // x24
    st_ae4bf4_3 *v46;  // x0
    st_ae4bf4_3 *v47;  // x20
    st_ae4bf4_3 *v48;  // x0
    st_ae4bf4_3 *v49;  // x20
    st_ae4bf4_3 *ptr;  // x0
    st_ae4bf4_3 *v51;  // w8
    unsigned long v52;  // cc_op
    unsigned long v53;  // cc_dep1
    unsigned long v54;  // cc_dep2
    unsigned long v55;  // cc_ndep
    st_ae4bf4_3 *v20;  // x23
    unsigned long long v56;  // 4112
    unsigned long long v57;  // 4102
    unsigned long long v58;  // 4112
    unsigned long long v59;  // 4102
    st_ae4bf4_3 *v21;  // w20
    long long v60;  // x0
    st_ae4bf4_3 *v61;  // x20
    st_ae4bf4_3 *v22;  // x25
    st_ae4bf4_3 *v62;  // x0
    st_ae4bf4_3 *v63;  // x8
    st_ae4bf4_3 *v64;  // x0
    st_ae4bf4_3 *v65;  // x20
    st_ae4bf4_3 *v66;  // x0
    st_ae4bf4_3 *v67;  // x22
    st_ae4bf4_3 *v68;  // x0
    st_ae4bf4_3 *v69;  // x0
    st_ae4bf4_0 **v23;  // x21
    long long len;  // x0
    st_ae4bf4_3 *v71;  // x0
    st_ae4bf4_3 *v72;  // x0
    st_ae4bf4_3 *v73;  // x22
    st_ae4bf4_3 *v74;  // x0
    long long v76;  // x1
    long long v77;  // x21
    long long v78;  // x22
    st_ae4bf4_0 *v24;  // x22
    long long v80;  // x1
    long long v81;  // x1
    long long v82;  // x1
    long long v83;  // x1
    long long v84;  // x1
    long long v85;  // x1
    long long v87;  // x1
    long long v88;  // x1
    long long v89;  // x1
    st_ae4bf4_3 *v25;  // x0
    st_ae4bf4_0 *v0;  // [bp-0xd0], Other Possible Types: unsigned long long
    st_ae4bf4_0 *v1;  // [bp-0xc8], Other Possible Types: unsigned long
    unsigned long long v2;  // [bp-0xc0]
    st_ae4bf4_3 *v3;  // [bp-0xb8], Other Possible Types: char *, unsigned long
    unsigned long long v4;  // [bp-0xb0]
    char *v5;  // [bp-0xa8]
    long long v6;  // [bp-0x9c]
    st_ae4bf4_3 *v7;  // [bp-0x98]
    long long v8;  // [bp-0x90]
    st_ae4bf4_3 *v9;  // [bp-0x88]
    st_ae4bf4_3 *v10;  // [bp-0x80]
    st_ae4bf4_3 *v11;  // [bp-0x74]
    st_ae4bf4_3 *v12;  // [bp-0x70]
    st_ae4bf4_3 *v13;  // [bp-0x68]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v16 = a1;
    v17 = sub_aef8d8(a2);
    v18 = sub_ad69e4(v17);
    if (v17)
    {
        v19 = v18;
        v20 = sub_ad61e0(0, v19);
        if (!v20)
        {
            sub_a368c8();
            v76 = 107;
LABEL_ae5294:
            sub_a369bc("crypto/x509/v3_cpols.c", v76, "r2i_certpol");
LABEL_ae52a8:
LABEL_ae52ac:
            sub_a36abc();
LABEL_ae53c4:
            sub_ad6958(v17, &g_aef19c);
            sub_ad6958(v20, &g_ae5938);
LABEL_ae53e4:
            return 0;
        }
        if ((int)v19 < 1)
        {
LABEL_ae52b4:
            sub_ad6958(v17, &g_aef19c);
            return v20;
        }
        v21 = (st_ae4bf4_3 *)0;
        v22 = 0;
        while (1)
        {
            v23 = sub_ad69f8(v17, v22);
            if (v23[2] || (v24 = v23[1], !v24))
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_cpols.c", 115, "r2i_certpol");
                sub_a36abc(0x22, 134, 0);
                v2 = ", value=";
                v3 = v23[2];
                v0 = "name=";
                v1 = v23[1];
                sub_a364a0(4);
                goto LABEL_ae53c4;
            }
            if (!_strcmp(v24, "ia5org"))
            {
                v21 = (st_ae4bf4_3 *)1;
                goto LABEL_ae4c9c;
            }
            if ((char)v24->field_0 == 64)
            {
                v25 = sub_ae4a14(v16, (char *)&v24->field_0 + 1);
                if (!v25)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_cpols.c", 128, "r2i_certpol");
                    v0 = v23[1];
                    goto LABEL_ae52ac;
                }
                v26 = v25;
                v27 = sub_9cde20(&g_eb64a0);
                if (v27)
                {
                    v11 = v21;
                    if ((int)sub_ad69e4(v26) < 1)
                        goto LABEL_ae51f0;
                    v28 = 0;
                    if (!v11)
                        v29 = 26;
                    else
                        v29 = 22;
                    v6 = v29;
                    v12 = v26;
                    break;
                }
                else
                {
                    sub_a368c8();
                    v80 = 174;
                    goto LABEL_ae581c;
                }
            }
            else
            {
                v72 = sub_a997a4(v24, 0);
                if (!v72)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_cpols.c", 138, "r2i_certpol");
                    v0 = v23[1];
                    goto LABEL_ae52ac;
                }
                v73 = v72;
                v74 = sub_9cde20(&g_eb64a0);
                if (v74)
                {
                    v27 = v74;
                    v74->field_0 = v73;
                }
                else
                {
                    sub_a368c8(sub_9c3580(v73));
                    sub_a369bc("crypto/x509/v3_cpols.c", 146, "r2i_certpol");
                    goto LABEL_ae52a8;
                }
LABEL_ae5240:
                if (sub_ad68a0(v20, v27))
                {
LABEL_ae4c9c:
                    v22 = (unsigned int)v22 + 1;
                    if ((unsigned int)v22 == (unsigned int)v19)
                        goto LABEL_ae52b4;
                }
                else
                {
                    sub_a368c8(sub_9cd960(v27, &g_eb64a0), &g_eb64a0);
                    v76 = 0x99;
                    goto LABEL_ae5294;
                }
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_cpols.c", 101, "r2i_certpol");
        sub_a36abc(0x22, 0x80022, 0);
        goto LABEL_ae53e4;
    }
    while (1)
    {
        v30 = sub_ad69f8(v26, v28);
        if (!_strcmp(v30->field_8, "policyIdentifier"))
        {
            v71 = sub_a997a4(v30->field_10, 0);
            if (v71)
            {
                v27->field_0 = v71;
                goto LABEL_ae51dc;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_cpols.c", 183, "policy_section");
                v81 = 110;
                goto LABEL_ae55bc;
            }
        }
        if (sub_aefce4(v30->field_8, "CPS"))
        {
            if (sub_aefce4(v30->field_8, "userNotice"))
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_cpols.c", 240, "policy_section");
                v81 = 138;
                goto LABEL_ae55bc;
            }
            if (*(char *)v30->field_10 != 64)
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_cpols.c", 217, "policy_section");
                v81 = 137;
                goto LABEL_ae55bc;
            }
            v31 = sub_ae4a14(v16, v30->field_10 + 1);
            if (!v31)
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_cpols.c", 223, "policy_section");
                v81 = 135;
LABEL_ae55bc:
                sub_a36abc(0x22, v81, 0);
                v4 = ",value:";
                v5 = v30->field_10;
                v2 = ",name:";
                v3 = v30->field_8;
                v0 = "section:";
                v1 = v30->field_0;
                sub_a364a0(6);
                goto LABEL_ae53a8;
            }
            v13 = v31;
            v32 = sub_9cde20(&g_eb6528);
            if (!v32)
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_cpols.c", 301, "notice_section");
                v82 = 524301;
                goto LABEL_ae5650;
            }
            v33 = sub_a99624(165);
            v32->field_0 = v33;
            if (!v33)
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_cpols.c", 305, "notice_section");
                v82 = 786691;
LABEL_ae5650:
                sub_a36abc(0x22, v82, 0);
                sub_9cd960(v32, &g_eb6528);
                sub_ae4a74(v16, v13);
                goto LABEL_ae53a8;
            }
            v10 = v32;
            v34 = sub_9cde20(&g_eb65b0);
            if (!v34)
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_cpols.c", 309, "notice_section");
                sub_a36abc(0x22, 0x8000d, 0);
            }
            v35 = v34;
            v7 = v27;
            v8 = v16;
            v9 = v20;
            *(st_ae4bf4_3 **)&v10->field_1 = v34;
            v36 = v13;
            if ((int)sub_ad69e4(v36) >= 1)
            {
                v37 = 0;
                break;
            }
LABEL_ae5190:
            v63 = v35->field_0;
            if (!v63 || *(long long *)&v63->field_1 && v63->field_0)
            {
                v16 = v8;
                sub_ae4a74(v16, v36);
                v27 = v7;
                v64 = *(long long *)&v27->field_1;
                v20 = v9;
                v65 = v10;
                if (!v64)
                {
                    v64 = sub_ad61b4(NULL);
                    *(st_ae4bf4_3 **)&v27->field_1 = v64;
                }
                if (!sub_ad68a0(v64, v65))
                {
                    sub_a368c8(sub_9cd960(v65, &g_eb6528), &g_eb6528);
                    sub_a369bc("crypto/x509/v3_cpols.c", 236, "policy_section");
                    v88 = 524303;
                    goto LABEL_ae582c;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_cpols.c", 381, "notice_section");
                v89 = 142;
            }
LABEL_ae51dc:
            v28 = (unsigned int)v28 + 1;
            if ((int)(unsigned int)v28 >= (int)sub_ad69e4(v26))
            {
LABEL_ae51f0:
                if (v27->field_0)
                {
                    sub_ae4a74(v16, v26);
                    v21 = v11;
                    goto LABEL_ae5240;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_cpols.c", 246, "policy_section");
                    v88 = 139;
                }
LABEL_ae582c:
                sub_a36abc(0x22, v88, 0);
LABEL_ae53a8:
                sub_9cd960(v27, &g_eb64a0);
                sub_ae4a74(v16, v26);
                goto LABEL_ae53c4;
            }
        }
        else
        {
            if (!*(long long *)&v27->field_1)
                *(unsigned long long *)&v27->field_1 = sub_ad61b4();
            v66 = sub_9cde20(&g_eb6528);
            if (!v66)
            {
                sub_a368c8();
                v85 = 193;
                goto LABEL_ae57e4;
            }
            v67 = v66;
            if (!sub_ad68a0(*(long long *)&v27->field_1, v67))
            {
                sub_a368c8(sub_9cd960(v67, &g_eb6528), &g_eb6528);
                sub_a369bc("crypto/x509/v3_cpols.c", 198, "policy_section");
                v87 = 524303;
                goto LABEL_ae57f4;
            }
            v68 = sub_a99624(164);
            v67->field_0 = v68;
            if (!v68)
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_cpols.c", 202, "policy_section");
                v87 = 786691;
                goto LABEL_ae57f4;
            }
            v69 = sub_9cf180();
            *(st_ae4bf4_3 **)&v67->field_1 = v69;
            if (!v69)
            {
                sub_a368c8();
                v85 = 206;
LABEL_ae57e4:
                sub_a369bc("crypto/x509/v3_cpols.c", v85, "policy_section");
                v87 = 524301;
LABEL_ae57f4:
                sub_a36abc(0x22, v87, 0);
                v26 = v12;
                goto LABEL_ae53a8;
            }
            len = _strlen(v30->field_10);
            v26 = v12;
            if (sub_9c7770(v69, v30->field_10, len))
                goto LABEL_ae51dc;
            sub_a368c8();
            v80 = 211;
LABEL_ae581c:
            sub_a369bc("crypto/x509/v3_cpols.c", v80, "policy_section");
            v88 = 524301;
            goto LABEL_ae582c;
        }
    }
LABEL_ae4edc:
    v38 = sub_ad69f8(v36, v37);
    v39 = v38;
    v40 = v38->field_8;
    v41 = &v38->field_10->field_0;
    if (!_strcmp(v40, "explicitText"))
    {
        ptr = _strchr(v41, 58);
        v51 = (st_ae4bf4_3 *)(unsigned int)(ptr - v41);
        if (ptr)
        {
            v56 = arm64g_calculate_condition(v52 | 16, v53, v54, v55);
            v57 = arm64g_calculate_condition(0x11, (v56 & 1 ? (unsigned long long)v51 : 0x40000000), v56 & 1, 0);
            if (v57 & 1)
                goto LABEL_ae5074;
            else
                goto LABEL_ae4fe8;
        }
        else
        {
            v58 = arm64g_calculate_condition(v52 | 16, v53, v54, v55);
            v59 = arm64g_calculate_condition(16, (v58 & 1 ? (unsigned long long)v51 : 0x40000000), v58 & 1, 0);
            if (v59 & 1)
                goto LABEL_ae5074;
            else
                goto LABEL_ae4fe8;
        }
LABEL_ae5074:
        if (8 >= v51)
        {
            switch (v51)
            {
            case 3:
                if (*v41 != 66)
                    goto LABEL_ae4fe8;
                if (v41[1] != 77)
                    goto LABEL_ae4fe8;
                if (v41[2] != 80)
                    goto LABEL_ae4fe8;
                v60 = 30;
                v61 = 4;
                break;
            case 4:
                if (_strncmp(v41, "UTF8", 4))
                    goto LABEL_ae4fe8;
                v60 = 12;
                v61 = 5;
                break;
            case 7:
                if (_strncmp(v41, "VISIBLE", 7))
                    goto LABEL_ae4fe8;
                v60 = 26;
                v61 = 8;
                break;
            default:
LABEL_ae4fe8:
                v61 = 0;
                v60 = 26;
                break;
            }
        }
        else
        {
            switch (v51)
            {
            case 9:
                if (_strncmp(v41, "BMPSTRING", 9))
                    goto LABEL_ae4fe8;
                v60 = 30;
                v61 = 10;
                break;
            case 10:
                if (_strncmp(v41, "UTF8String", 10))
                    goto LABEL_ae4fe8;
                v60 = 12;
                v61 = 11;
                break;
            case 13:
                if (_strncmp(v41, "VISIBLESTRING", 13))
                    goto LABEL_ae4fe8;
                v60 = 26;
                v61 = 14;
                break;
            default:
LABEL_ae4fe8:
                v61 = 0;
                v60 = 26;
                break;
            }
        }
        v62 = sub_9c79e8(v60);
        *(st_ae4bf4_3 **)&v35->field_1 = v62;
        if (v62)
        {
            v26 = v12;
            if (sub_9c7770(v62, v41 + v61, _strlen(v41 + v61)))
            {
LABEL_ae4ec4:
                v37 = (unsigned int)v37 + 1;
                v36 = v13;
                if ((int)sub_ad69e4(v36) <= (int)(unsigned int)v37)
                    goto LABEL_ae5190;
                goto LABEL_ae4edc;
            }
            else
            {
                sub_a368c8();
                v84 = 327;
            }
        }
        else
        {
            sub_a368c8();
            v83 = 320;
            goto LABEL_ae58d4;
        }
    }
    else if (!_strcmp(v40, "organization"))
    {
        v48 = v35->field_0;
        v26 = v12;
        if (!v48)
        {
            v48 = sub_9cde20(&g_eb6638);
            if (v48)
            {
                v35->field_0 = v48;
                v41 = &v39->field_10->field_0;
                goto LABEL_ae5048;
            }
            else
            {
                sub_a368c8();
                v84 = 335;
            }
        }
        else
        {
LABEL_ae5048:
            v49 = v48->field_0;
            *(int *)((char *)&v49->field_0 + 4) = v6;
            if (sub_9c7770(v49, v41, _strlen(v41)))
                continue;
            sub_a368c8();
            v84 = 347;
        }
    }
    else if (!_strcmp(v40, "noticeNumbers"))
    {
        v42 = v35->field_0;
        if (!v42)
        {
            v43 = sub_9cde20(&g_eb6638);
            if (v43)
            {
                v42 = v43;
                v35->field_0 = v43;
                v41 = &v39->field_10->field_0;
                goto LABEL_ae4f50;
            }
            else
            {
                sub_a368c8();
                v83 = 356;
LABEL_ae58d4:
                sub_a369bc("crypto/x509/v3_cpols.c", v83, "notice_section");
                sub_a36abc(0x22, 0x8000d, 0);
LABEL_ae537c:
                v16 = v8;
                v20 = v9;
                v27 = v7;
                v26 = v12;
            }
        }
        else
        {
LABEL_ae4f50:
            v44 = sub_aef8d8(v41);
            if (v44 && sub_ad69e4(v44))
            {
                if ((int)sub_ad69e4(v44) >= 1)
                {
                    v45 = 0;
                    do
                    {
                        v46 = sub_aef470(0, *(long long *)(sub_ad69f8(v44, v45) + 8));
                        if (v46)
                        {
                            v47 = v46;
                            if (!sub_ad68a0(*(long long *)&v42->field_1, v47))
                            {
                                sub_9cf124(v47);
                                v77 = 524303;
                                v78 = 407;
LABEL_ae5340:
                                sub_a368c8();
                                sub_a369bc("crypto/x509/v3_cpols.c", v78, "nref_nos");
                                sub_a36abc(0x22, v77, 0);
                                goto LABEL_ae536c;
                            }
                        }
                        else
                        {
                            v77 = 140;
                            v78 = 402;
                            goto LABEL_ae5340;
                        }
                    } while ((v45 = (unsigned int)v45 + 1, (int)(unsigned int)v45 < (int)sub_ad69e4(v44)));
                }
                sub_ad6958(v44, &g_aef19c);
                v26 = v12;
                goto LABEL_ae4ec4;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_cpols.c", 364, "notice_section");
                sub_a36abc(0x22, 141, 0);
                v2 = ", value=";
                v3 = &v39->field_10->field_0;
                v0 = "name=";
                v1 = v39->field_8;
                sub_a364a0(4);
LABEL_ae536c:
                sub_ad6958(v44, &g_aef19c);
                goto LABEL_ae537c;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_cpols.c", 374, "notice_section");
        sub_a36abc(0x22, 138, 0);
        v2 = ", value=";
        v3 = &v39->field_10->field_0;
        v0 = "name=";
        v1 = v39->field_8;
        sub_a364a0(4);
        goto LABEL_ae537c;
    }
}
