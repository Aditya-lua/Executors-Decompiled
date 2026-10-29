/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98959c..0x9898b8 (796 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98959c_1 {
    char padding_0[8];
    struct st_98959c_1 *field_8;
} st_98959c_1;

typedef struct st_98959c_2 {
    struct st_98959c_0 *field_0;
    struct st_98959c_2 *field_8;
    char padding_10[16];
    struct st_98959c_1 *field_20;
    struct st_98959c_1 *field_28;
    char padding_30[64];
    long long field_70;
    char padding_78[8];
    char field_80;
    char padding_81[31];
    char field_a0;
    char padding_a1[95];
    unsigned long long field_100;
} st_98959c_2;

typedef struct st_98959c_5 {
    unsigned int field_0;
} st_98959c_5;

typedef struct st_98959c_7 {
    unsigned long long field_0;
} st_98959c_7;

typedef struct st_98959c_6 {
    struct st_98959c_2 *field_0;
    char padding_8[24];
    struct st_98959c_1 *field_20;
    struct st_98959c_1 *field_28;
    char padding_30[32];
    unsigned long long field_50;
    char padding_58[8];
    struct st_98959c_7 *field_60;
} st_98959c_6;

typedef struct st_98959c_4 {
    char padding_0[8];
    struct st_98959c_2 *field_8;
    char padding_10[24];
    struct st_98959c_1 *field_28;
    struct st_98959c_1 *field_30;
    char padding_38[32];
    unsigned long long field_58;
    char padding_60[8];
    struct st_98959c_5 *field_68;
} st_98959c_4;

typedef struct st_98959c_0 {
    char padding_0[8];
    unsigned int field_8;
} st_98959c_0;

extern char g_1000000;
extern char g_10002b0;

void sub_98959c(st_98959c_4 *a0, st_98959c_2 *a1)
{
    unsigned long long v9;  // x8
    unsigned int v10;  // w0
    unsigned long long v19;  // 4136
    unsigned int v20;  // w0
    unsigned long long v21;  // x0
    unsigned long long v22;  // x0
    st_98959c_4 *v23;  // x8
    st_98959c_2 *v24;  // x9
    st_98959c_6 *v25;  // x8
    unsigned int v27;  // x9
    unsigned int iter;  // x8
    unsigned int v11;  // w0
    st_98959c_0 *v29;  // x9
    unsigned int v30;  // x8
    unsigned long long v12;  // x8
    unsigned int v13;  // w9
    st_98959c_4 *v14;  // x8
    st_98959c_1 *v15;  // x9
    st_98959c_1 *v16;  // x8
    st_98959c_1 *v17;  // x10
    unsigned int v18;  // w9
    unsigned long v0;  // [bp-0x88]
    char v1;  // [bp-0x80]
    unsigned long v2;  // [bp-0x78]
    unsigned int v3;  // [bp-0x70]
    char v4;  // [bp-0x60]
    char v5;  // [bp-0x58]
    unsigned long v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v9 = a1->field_100;
    if (((unsigned int)v9 & 1) == *(int *)&a0[1].padding_10[8] && a0->field_68)
        a0->field_68();
    if (!((char)(v9 >> 8) == 3 && (v10 = sub_989088(a1->field_70), v9 = a1->field_100, sub_989088(a1->field_70))))
    {
        if ((v9 & 0x800000ff00) == 0x8000000200 && sub_989088(a1->field_70))
            goto LABEL_98968c;
    }
    else if ((char)(v9 >> 8) == 3)
    {
        a1->field_100 = v9 & 0xffffffffffff00ff | 0x400;
        v11 = sub_988ecc(a1->field_70, 0);
        a1->field_100 = a1->field_100 & 0xfffffe0000000000 | (a1->field_100 & 0xfffffeffffffffff | ((v11 & 1) * 0x10000000000 | (v11 & 1) >> 24) & 0x10000000000) & 0x1ffffffffff;
        sub_988ae8(a1->field_70);
        a1->field_70 = 0;
LABEL_98968c:
        if (a1->field_100 >> 39 & 1)
        {
            a1->field_100 = a1->field_100 & 0xffffff7fffffffff;
            a0->field_58 = a0->field_58 - 1;
        }
    }
    v12 = a1->field_100;
    if ((v12 & 0x6000000000) == 0x2000000000 && (!(v12 & 0xff0000) || v12 >> 36 & 1))
    {
        if (!(v12 & 0xff00) || (v13 = ((unsigned int)v12 * &g_1000000 | (unsigned int)v12 >> 8) & 0xff0000ff & 0xff, v13 == 4))
        {
            a1->field_100 = v12 | 0x4000000000;
        }
        else
        {
            v12 |= (v13 == 6) * 0x4000000000;
            a1->field_100 = v12;
            if (v13 != 6)
                goto LABEL_989704;
        }
        v14 = a0;
        v15 = v14->field_28;
        v16 = &v14->field_28;
        a1->field_20 = v15;
        v17 = &a1->field_20;
        v15->field_8 = v17;
        *(st_98959c_1 **)v16->padding_0 = v17;
        v17->field_8 = v16;
        v12 = (unsigned long long)v17[14].padding_0;
    }
LABEL_989704:
    if (v12 & 0x4000000000)
        v18 = 0;
    else
        v18 = 1;
    if (v18 == 1)
    {
        if (!(v12 & 0xff0000) || (v12 & 0xff0000) != 0x10000 || (v19 = arm64g_calculate_condition(129, (__ROL__((unsigned int)v12, 16) & 0xffff00ff & 0xff) - 7, 3, 0), v19 & 1 || !(v12 >> 33 & 1) && (v20 = sub_97be94(&a1->field_a0, 0), v12 = a1->field_100, !sub_97be94(&a1->field_a0, 0))))
        {
            if (v12 & 0xc00000000)
                goto LABEL_989754;
            if (!(v12 >> 27 & 1) && 2 >= (((unsigned int)v12 * 0x1000000 | (unsigned int)v12 >> 8) & 0xff) - 1)
            {
                v0 = 2;
                if (sub_988b64(a1->field_70, 0, &v1, &v5, &v0))
                {
                    v21 = sub_97ba98(&a1->field_80, 0);
                    v22 = sub_c4c40(&a1->field_80);
                    v12 = a1->field_100;
                    if (!v3 & v4 >> 1 & 1 || v22 + v21 > v2)
                        goto LABEL_989754;
                }
                else
                {
                    v12 = a1->field_100;
                }
            }
        }
        else
        {
LABEL_989754:
            if (!(v12 >> 24 & 1))
            {
                v23 = a0;
                v24 = v23->field_8;
                v25 = &v23->field_8;
                v24->field_8 = a1;
                a1->field_0 = v24;
                v25->field_0 = a1;
                a1->field_8 = v25;
                if (!v25->padding_58)
                    *(st_98959c_2 **)a0->padding_60 = a1;
                a1->field_100 = a1->field_100 | &g_1000000;
                if (*(long long *)&g_10002b0 == v6)
                    return;
                ___stack_chk_fail();
            }
            else
            {
                if (*(long long *)&g_10002b0 == v6)
                    return;
                ___stack_chk_fail();
            }
        }
    }
    if (v12 >> 24 & 1)
    {
        if (a0->padding_60 == a1)
        {
            v27 = (unsigned int)(struct st_98959c_4 *)&a0->field_8;
            iter = (unsigned int)a1->field_8;
            if (iter == v27)
                iter = *(long long *)(iter + 8);
            if (iter == v27)
                iter = 0;
            *(unsigned long long *)a0->padding_60 = iter;
            if (iter == a1)
            {
LABEL_9898ac:
                *(unsigned long long *)a0->padding_60 = 0;
            }
        }
        else if (a0->padding_60 == a1)
        {
            goto LABEL_9898ac;
        }
        v29 = a1->field_0;
        v30 = (unsigned int)a1->field_8;
        *(unsigned long long *)&v29->field_8 = v30;
        *(st_98959c_0 **)v30 = v29;
        a1->field_0 = 0;
        a1->field_8 = 0;
        a1->field_100 = a1->field_100 & 0xfffffffffeffffff;
        if (*(long long *)&g_10002b0 == v6)
            return;
        ___stack_chk_fail();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v6)
            return;
        ___stack_chk_fail();
    }
}
