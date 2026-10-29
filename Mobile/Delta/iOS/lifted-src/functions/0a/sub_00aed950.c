/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaed950..0xaee50c (3004 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aed950_1 {
    struct st_aed950_0 *field_0;
    struct st_aed950_0 *field_8;
} st_aed950_1;

typedef struct st_aed950_2 {
    struct st_aed950_1 *field_0;
    struct st_aed950_0 *field_8;
    struct st_aed950_0 *field_10;
} st_aed950_2;

typedef struct st_aed950_0 {
    struct st_aed950_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_aed950_1 *field_8;
} st_aed950_0;

typedef struct st_aed950_3 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_aed950_3;

extern unsigned long long g_c7c2eb;
extern st_aed950_3 g_eb9410;
extern st_aed950_3 g_eb9470;

st_aed950_0 * sub_aed950(unsigned long a0, st_aed950_2 *a1, long long a2, unsigned long long a3)
{
    long long v8;  // x19
    st_aed950_1 *v9;  // x24
    st_aed950_0 *v18;  // x20
    unsigned long v19;  // x22
    st_aed950_0 *v20;  // x0
    st_aed950_0 **v21;  // x23
    st_aed950_0 *v22;  // x22
    st_aed950_0 **v23;  // x25
    long long v24;  // x1
    long long v25;  // x0
    st_aed950_0 *v26;  // x8
    st_aed950_0 *v27;  // w9
    unsigned long v10;  // x8
    unsigned long v28;  // x8
    unsigned long v29;  // x8
    st_aed950_0 *v30;  // x22
    unsigned long v31;  // x8
    unsigned long v32;  // x8
    st_aed950_0 *v33;  // w8
    long long v34;  // x1
    long long v35;  // x0
    long long v36;  // x1
    long long v37;  // x0
    st_aed950_0 **v11;  // x20
    st_aed950_0 *v38;  // x8
    st_aed950_0 *v39;  // w9
    st_aed950_0 *v40;  // x22
    st_aed950_0 **v41;  // x22
    long long v42;  // x1
    long long v43;  // x0
    st_aed950_0 *v44;  // x8
    st_aed950_0 *v45;  // w9
    unsigned long v46;  // x8
    st_aed950_0 *v47;  // x22
    st_aed950_0 *v12;  // x0
    unsigned long v48;  // x8
    st_aed950_0 *v49;  // x22
    st_aed950_0 *v13;  // x0
    st_aed950_0 *v14;  // x0
    st_aed950_0 *v15;  // x0
    st_aed950_0 *v16;  // x0
    st_aed950_0 *v17;  // x0
    unsigned long long v0;  // [bp-0x90], Other Possible Types: unsigned long
    st_aed950_0 **v1;  // [bp-0x88], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x80]
    unsigned long v3;  // [bp-0x78]
    char v4;  // [bp-0x70], Other Possible Types: unsigned long long
    char v5;  // [bp-0x68], Other Possible Types: unsigned long
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a2;
    if (!a1->field_10 || sub_9c1674(&v4) == 1 && (v1 = &g_c7c2eb, v2 = v4, v0 = a3, (int)sub_9d524c(v8, "%*sTimezone: UTC%+03lld:00\n") >= 1))
    {
        if ((int)a1->field_8 >= 1)
        {
            v0 = a3;
            v1 = &g_c7c2eb;
        }
        else
        {
            v0 = a3;
            v1 = &g_c7c2eb;
        }
        if ((int)sub_9d524c(v8) >= 1)
        {
            v9 = a1->field_0;
            v10 = (unsigned int)a3 + 4;
            if ((int)v9->field_0 == 1)
            {
                v0 = v10;
                v1 = &g_c7c2eb;
                if ((int)sub_9d524c(v8, "%*sPeriodic:\n") >= 1)
                {
                    if ((int)sub_ad69e4(v9->field_8) >= 1)
                    {
                        v18 = 0;
                        v19 = (unsigned int)a3 + 8;
                        v3 = (unsigned int)a3 + 12;
                        while (1)
                        {
                            if ((unsigned int)v18)
                            {
                                v20 = sub_9d4888(v8, "\n");
                                if (!(unsigned int)v20)
                                    return v20;
                            }
                            v21 = sub_ad69f8(v9->field_8, v18);
                            v0 = v19;
                            v1 = &g_c7c2eb;
                            if ((int)sub_9d524c(v8, "%*sPeriod:\n") < 1)
                                return 0;
                            if (*v21)
                            {
                                v0 = v3;
                                v1 = &g_c7c2eb;
                                if ((int)sub_9d524c(v8, "%*sDaytime bands:\n") < 1)
                                    return 0;
                                if ((int)sub_ad69e4(*v21) >= 1)
                                {
                                    v22 = 0;
                                    do
                                    {
                                        v23 = sub_ad69f8(*v21, v22);
                                        v0 = (unsigned int)a3 + 16;
                                        v1 = &g_c7c2eb;
                                        if ((int)sub_9d524c(v8, "%*s") < 1)
                                            return 0;
                                        if (*v23)
                                        {
                                            if (!sub_aee7d4(*v23, v8))
                                                return 0;
                                        }
                                        else
                                        {
                                            if (!sub_9d4888(v8, "00:00:00"))
                                                return 0;
                                        }
                                        if (!sub_9d4888(v8, " - "))
                                            return 0;
                                        if (v23[1])
                                        {
                                            if (!sub_aee7d4(v23[1], v8))
                                                return 0;
                                        }
                                        else
                                        {
                                            if (!sub_9d4888(v8, "23:59:59"))
                                                return 0;
                                        }
                                        if (!sub_9d4888(v8, "\n"))
                                            return 0;
                                        v22 = (unsigned int)v22 + 1;
                                    } while ((int)(unsigned int)v22 < (int)sub_ad69e4(*v21));
                                }
                            }
                            if (v21[1])
                                break;
LABEL_aedef4:
                            if (v21[2])
                            {
                                if ((int)v21[2]->field_0 == 1)
                                {
                                    if (v21[3])
                                    {
                                        v0 = v3;
                                        v1 = &g_c7c2eb;
                                        v36 = "%*sWeeks of the month: ";
                                        v37 = v8;
                                    }
                                    else
                                    {
                                        if (!v21[4])
                                        {
LABEL_aedf48:
                                            v38 = v21[2];
                                            v39 = (st_aed950_0 *)(int)v38->field_0;
                                            if (!v39)
                                            {
                                                v42 = "ALL";
                                                v43 = v8;
                                                goto LABEL_aee178;
                                            }
                                            if (v39 != 2)
                                            {
                                                if (v39 != 1)
                                                    return 0;
                                                if ((int)sub_ad69e4(*(long long *)&v38->field_1) >= 1)
                                                {
                                                    if (!sub_9c1674(&v5, sub_ad69f8(*(long long *)&v21[2]->field_1, 0)) || !(v0 = v5, sub_9d524c(v8, "%lld")))
                                                        goto LABEL_aee4bc;
                                                    if ((int)sub_ad69e4(*(long long *)&v21[2]->field_1) >= 2)
                                                    {
                                                        v40 = 1;
                                                        do
                                                        {
                                                            if (!sub_9c1674(&v5, sub_ad69f8(*(long long *)&v21[2]->field_1, v40)) || !sub_9d4888(v8, ", ") || !(v0 = v5, sub_9d524c(v8, "%lld")))
                                                                goto LABEL_aee4bc;
                                                        } while ((v40 = (unsigned int)v40 + 1, (int)(unsigned int)v40 < (int)sub_ad69e4(*(long long *)&v21[2]->field_1)));
                                                    }
                                                }
                                                goto LABEL_aee180;
                                            }
                                            v41 = *(long long *)&v38->field_1;
                                            if (sub_9c064c(v41, 0))
                                            {
                                                if (!sub_9d4888(v8, "first"))
                                                    return 0;
                                                if (!sub_9c064c(v41, 1))
                                                    goto LABEL_aee0d8;
                                                if (!sub_9d4888(v8, ", "))
                                                    return 0;
                                            }
                                            else
                                            {
                                                if (!sub_9c064c(v41, 1))
                                                {
                                                    if (!sub_9c064c(v41, 2))
                                                    {
                                                        if (sub_9c064c(v41, 3))
                                                        {
LABEL_aee134:
                                                            if (!sub_9d4888(v8, "fourth"))
                                                                return 0;
LABEL_aee148:
                                                            if (sub_9c064c(v41, 4))
                                                            {
                                                                if (!sub_9d4888(v8, ", "))
                                                                    return 0;
                                                                goto LABEL_aee16c;
                                                            }
                                                        }
                                                        else
                                                        {
                                                            if (sub_9c064c(v41, 4))
                                                            {
LABEL_aee16c:
                                                                v42 = "final";
                                                                v43 = v8;
LABEL_aee178:
                                                                if (!sub_9d4888(v43, v42))
                                                                    return 0;
                                                            }
                                                        }
LABEL_aee180:
                                                        if (!sub_9d4888(v8, "\n"))
                                                            return 0;
                                                        goto LABEL_aee194;
                                                    }
LABEL_aee0fc:
                                                    if (!sub_9d4888(v8, "third"))
                                                        return 0;
LABEL_aee110:
                                                    if (!sub_9c064c(v41, 3))
                                                        goto LABEL_aee148;
                                                    if (!sub_9d4888(v8, ", "))
                                                        return 0;
                                                    goto LABEL_aee134;
                                                }
                                            }
                                            if (!sub_9d4888(v8, "second"))
                                                return 0;
LABEL_aee0d8:
                                            if (!sub_9c064c(v41, 2))
                                                goto LABEL_aee110;
                                            if (!sub_9d4888(v8, ", "))
                                                return 0;
                                            goto LABEL_aee0fc;
                                        }
                                        else
                                        {
                                            v0 = v3;
                                            v1 = &g_c7c2eb;
                                            v36 = "%*sWeeks of the year: ";
                                            v37 = v8;
                                        }
                                    }
                                }
                                else
                                {
                                    v0 = v3;
                                    v1 = &g_c7c2eb;
                                    v36 = "%*sWeeks: ";
                                    v37 = v8;
                                }
                                if ((int)sub_9d524c(v37, v36) < 1)
                                    return 0;
                                goto LABEL_aedf48;
                            }
                            else
                            {
LABEL_aee194:
                                if (v21[3])
                                {
                                    v0 = v3;
                                    v1 = &g_c7c2eb;
                                    if ((int)sub_9d524c(v8, "%*sMonths: ") < 1)
                                        return 0;
                                    v44 = v21[3];
                                    v45 = (st_aed950_0 *)(int)v44->field_0;
                                    if (v45)
                                    {
                                        if (v45 != 2)
                                        {
                                            if (v45 != 1)
                                                return 0;
                                            if ((int)sub_ad69e4(*(long long *)&v44->field_1) >= 1)
                                            {
                                                if (!sub_9c1674(&v5, sub_ad69f8(*(long long *)&v21[3]->field_1, 0)) || !(v46 = v5 - 1, 11 >= v46 && sub_9d4888(v8, (&g_eb9410.field_0)[v46])))
                                                    goto LABEL_aee4bc;
                                                if ((int)sub_ad69e4(*(long long *)&v21[3]->field_1) >= 2)
                                                {
                                                    v47 = 1;
                                                    do
                                                    {
                                                        if (!sub_9c1674(&v5, sub_ad69f8(*(long long *)&v21[3]->field_1, v47)) || !sub_9d4888(v8, ", ") || !(v48 = v5 - 1, 11 >= v48 && sub_9d4888(v8, (&g_eb9410.field_0)[v48])))
                                                            goto LABEL_aee4bc;
                                                    } while ((v47 = (unsigned int)v47 + 1, (int)(unsigned int)v47 < (int)sub_ad69e4(*(long long *)&v21[3]->field_1)));
                                                }
                                            }
                                        }
                                        else
                                        {
                                            if (!sub_aee738(v8, *(long long *)&v44->field_1))
                                                return 0;
                                        }
                                    }
                                    else
                                    {
                                        if (!sub_9d4888(v8, "ALL"))
                                            return 0;
                                    }
                                    if (!sub_9d4888(v8, "\n"))
                                        return 0;
                                }
                                if (v21[4])
                                {
                                    v0 = v3;
                                    v1 = &g_c7c2eb;
                                    if ((int)sub_9d524c(v8, "%*sYears: ") < 1)
                                        return 0;
                                    if ((int)sub_ad69e4(v21[4]) >= 1)
                                    {
                                        if (!sub_9c1674(&v5, sub_ad69f8(v21[4], 0)) || !(v0 = v5, (int)sub_9d524c(v8, "%04lld") >= 1))
                                            goto LABEL_aee4bc;
                                        if ((int)sub_ad69e4(v21[4]) >= 2)
                                        {
                                            v49 = 1;
                                            do
                                            {
                                                if (!sub_9c1674(&v5, sub_ad69f8(v21[4], v49)) || !sub_9d4888(v8, ", ") || !(v0 = v5, (int)sub_9d524c(v8, "%04lld") > 0))
                                                    goto LABEL_aee4bc;
                                            } while ((v49 = (unsigned int)v49 + 1, (int)(unsigned int)v49 < (int)sub_ad69e4(v21[4])));
                                        }
                                    }
                                }
                                v18 = (unsigned int)v18 + 1;
                                if ((int)(unsigned int)v18 >= (int)sub_ad69e4(v9->field_8))
                                    return sub_9d4888(v8, "\n");
                            }
                        }
                        if ((int)v21[1]->field_0)
                        {
                            v0 = v3;
                            v1 = &g_c7c2eb;
                            v24 = "%*sDays: ";
                            v25 = v8;
                        }
                        else
                        {
                            if (v21[2])
                            {
                                v0 = v3;
                                v1 = &g_c7c2eb;
                                v24 = "%*sDays of the week: ";
                                v25 = v8;
                            }
                            else
                            {
                                if (v21[3])
                                {
                                    v0 = v3;
                                    v1 = &g_c7c2eb;
                                    v24 = "%*sDays of the month: ";
                                    v25 = v8;
                                }
                                else
                                {
                                    if (!v21[4])
                                        goto LABEL_aedcb4;
                                    v0 = v3;
                                    v1 = &g_c7c2eb;
                                    v24 = "%*sDays of the year: ";
                                    v25 = v8;
                                }
                            }
                        }
                        if ((int)sub_9d524c(v25, v24) < 1)
                            return 0;
LABEL_aedcb4:
                        v26 = v21[1];
                        v27 = (st_aed950_0 *)(int)v26->field_0;
                        if (v27 != 2)
                        {
                            if (v27 == 1)
                                goto LABEL_aeded0;
                            if (v27)
                                return 0;
                            if ((int)sub_ad69e4(*(long long *)&v26->field_1) >= 1)
                            {
                                if (!sub_9c1674(&v5, sub_ad69f8(*(long long *)&v21[1]->field_1, 0)))
                                    return 0;
                                v28 = v5;
                                if (v21[2])
                                {
                                    v29 = v28 - 1;
                                    if (6 < v29)
                                        return 0;
                                    if (!sub_9d4888(v8, (&g_eb9470.field_0)[v29]))
                                        return 0;
                                }
                                else
                                {
                                    v0 = v28;
                                    if ((int)sub_9d524c(v8, "%lld") < 1)
                                        return 0;
                                }
                                if ((int)sub_ad69e4(*(long long *)&v21[1]->field_1) >= 2)
                                {
                                    v30 = 1;
                                    do
                                    {
                                        if (!sub_9c1674(&v5, sub_ad69f8(*(long long *)&v21[1]->field_1, v30)) || !sub_9d4888(v8, ", "))
                                            goto LABEL_aee4bc;
                                        v31 = v5;
                                        if (!v21[2])
                                        {
                                            v0 = v31;
                                            if ((int)sub_9d524c(v8, "%lld") >= 1)
                                                continue;
                                        }
                                        else
                                        {
                                            v32 = v31 - 1;
                                            if (6 < v32)
                                                return 0;
                                            if (!sub_9d4888(v8, (&g_eb9470.field_0)[v32]))
                                                return 0;
                                        }
                                    } while ((v30 = (unsigned int)v30 + 1, (int)sub_ad69e4(*(long long *)&v21[1]->field_1) > (int)(unsigned int)v30));
                                }
                            }
                        }
                        else
                        {
                            v33 = (st_aed950_0 *)*(int *)*(long long *)&v26->field_1;
                            if (v33 > 1)
                            {
                                if (v33 != 2)
                                {
                                    if (v33 != 3)
                                    {
                                        if (v33 == 4)
                                        {
                                            v34 = "FIFTH ";
                                            v35 = v8;
                                        }
                                        else
                                        {
                                            return 0;
                                        }
                                    }
                                    else
                                    {
                                        v34 = "FOURTH ";
                                        v35 = v8;
                                    }
                                }
                                else
                                {
                                    v34 = "THIRD ";
                                    v35 = v8;
                                }
                            }
                            else
                            {
                                if (v33)
                                {
                                    if (v33 == 1)
                                    {
                                        v34 = "SECOND ";
                                        v35 = v8;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    v34 = "FIRST ";
                                    v35 = v8;
                                }
                            }
                            if (!sub_9d4888(v35, v34))
                                return 0;
                            v26 = *(long long *)(*(long long *)&v21[1]->field_1 + 8);
                            if ((int)v26->field_0 != 1)
                            {
                                if (!(int)v26->field_0)
                                {
                                    if (sub_9c1674(&v5, *(long long *)&v26->field_1))
                                    {
                                        if (!sub_aee714(v8, v5))
                                            return 0;
                                    }
                                    else
                                    {
                                        return 0;
                                    }
                                }
                                else
                                {
                                    return 0;
                                }
                            }
                            else
                            {
LABEL_aeded0:
                                if (!sub_aee50c(v8, *(long long *)&v26->field_1))
                                    return 0;
                            }
                        }
                        if (!sub_9d4888(v8, "\n"))
                            return 0;
                        goto LABEL_aedef4;
                    }
                    else
                    {
                        return sub_9d4888(v8, "\n");
                    }
                }
            }
            else if (!(int)v9->field_0 && (v0 = v10, v1 = &g_c7c2eb, (int)sub_9d524c(v8, "%*sAbsolute: ") >= 1))
            {
                v11 = v9->field_8;
                if (*v11)
                {
                    if (v11[1])
                    {
                        v12 = sub_9d4888(v8, "Any time between ");
                        if (!(unsigned int)v12)
                            return v12;
                        v13 = sub_9c5140(v8, *v11, 0);
                        if (!(unsigned int)v13)
                            return v13;
                        goto LABEL_aee448;
                    }
                    else
                    {
                        v14 = sub_9d4888(v8, "Any time after ");
                        if (!(unsigned int)v14)
                            return v14;
                        v15 = sub_9c5140(v8, *v11, 0);
                        if (!(unsigned int)v15)
                            return v15;
                        v0 = (int)*v11->field_0;
                        v1 = *(long long *)&*v11->field_1;
                        if (1 <= (int)sub_9d524c(v8, "%.*s"))
                            return sub_9d4888(v8, "\n");
                    }
                }
                else
                {
                    if (v11[1])
                    {
LABEL_aee448:
                        v16 = sub_9d4888(v8);
                        if (!(unsigned int)v16)
                            return v16;
                        v17 = sub_9c5140(v8, v11[1], 0);
                        if ((unsigned int)v17)
                            return sub_9d4888(v8, "\n");
                        return v17;
                    }
                    else if ((int)sub_9d4888(v8, "INVALID (EMPTY)") >= 1)
                    {
                        return sub_9d4888(v8, "\n");
                    }
                }
            }
        }
    }
LABEL_aee4bc:
    return 0;
}
