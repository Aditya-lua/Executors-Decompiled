/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c9cfc..0x3ca5c8 (2252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c9cfc_0 {
    char field_0;
} st_3c9cfc_0;

typedef struct st_3c9cfc_3 {
    struct st_3c9cfc_2 *field_0;
    unsigned int field_4;
} st_3c9cfc_3;

typedef struct st_3c9cfc_2 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
} st_3c9cfc_2;

typedef struct st_3c9cfc_1 {
    unsigned long long field_0;
} st_3c9cfc_1;

extern st_3c9cfc_1 *g_f0b120;
extern char g_10002b0;

unsigned int sub_3c9cfc(st_3c9cfc_3 *a0, unsigned int *a1, unsigned int *a2, unsigned int a3, unsigned int a4)
{
    unsigned long v21;  // x9
    unsigned int *v22;  // x27
    unsigned long v31;  // cc_op
    unsigned long v32;  // cc_dep1
    unsigned long v33;  // cc_dep2
    unsigned long v34;  // 4112
    unsigned long long v35;  // 4134
    unsigned long i;  // x22
    unsigned int *iter;  // x26
    unsigned long long v38;  // x28
    unsigned long long v39;  // x25
    unsigned long v40;  // x22
    unsigned int v23;  // w1
    unsigned int ptr;  // x0
    st_3c9cfc_3 *v42;  // x9
    unsigned long long v43;  // x9
    unsigned int v44;  // w8
    unsigned long v45;  // x10
    unsigned long long v46;  // x9
    unsigned long long v47;  // x8
    unsigned long v48;  // x23
    unsigned int v49;  // x28
    int v50;  // w20
    unsigned int v24;  // w8
    int v51;  // w28
    unsigned long v52;  // cc_dep1
    unsigned long v53;  // cc_dep2
    unsigned long long v54;  // 4105
    unsigned long long v55;  // 4105
    unsigned int *v56;  // x8
    unsigned int v57;  // w8
    unsigned long v25;  // x10
    unsigned long v26;  // cc_dep1
    unsigned long v27;  // cc_dep2
    unsigned long v28;  // x20
    unsigned int v29;  // w11
    unsigned long v30;  // 4112
    unsigned long v0;  // [bp-0x1d0]
    unsigned long v1;  // [bp-0x1c8]
    unsigned long v2;  // [bp-0x1c0]
    unsigned int v3;  // [bp-0x19c]
    unsigned long v4;  // [bp-0x198]
    st_3c9cfc_3 *v5;  // [bp-0x190]
    unsigned long v6;  // [bp-0x188]
    unsigned long long v7;  // [bp-0x180]
    unsigned long v8;  // [bp-0x178]
    unsigned int v9;  // [bp-0x170], Other Possible Types: unsigned long
    unsigned int v10;  // [bp-0x168]
    unsigned int v11;  // [bp-0x164]
    st_3c9cfc_0 **v12;  // [bp-0x160], Other Possible Types: char
    st_3c9cfc_0 *v13;  // [bp-0x158]
    uint608_t v14;  // [bp-0x150]
    unsigned int v16;  // [bp-0x90]
    unsigned int v17;  // [bp-0x80]
    unsigned long v18;  // [bp-0x70]
    char *v19;  // [bp-0x10]
    char v20;  // [bp+0x0]

    v19 = &v20;
    v18 = *(long long *)&g_10002b0;
    v13 = &v12;
    v12 = &v13;
    a0->field_0->field_8 = 0;
    if (a4 >= 5)
        g_f0b120();
    if (sub_3d3608())
    {
        v21 = (char *)&a0[1365].field_0 + 4;
        v22 = &a0->field_0->field_0;
        v23 = v22[2];
        if (3 <= (int)v23)
            v24 = 3;
        else
            v24 = 1;
        if (!a4)
            v25 = v24;
        else
            v25 = a4;
        v26 = v23;
        v27 = 3;
        if (v23 == 3)
        {
            v26 = *(int *)(v21 + 2128);
            v27 = 3;
            v28 = v21;
            if (*(int *)(v21 + 2128) == 3)
            {
                v29 = 1;
            }
            else if (*(int *)(v28 + 2124))
            {
                v29 = 0;
            }
            else
            {
                v26 = *(int *)(v28 + 2120);
                v27 = 0;
                v29 = !*(int *)(v28 + 2120);
            }
        }
        else
        {
            v29 = 0;
            v28 = v21;
        }
        if (v23 == 3)
        {
            v30 = arm64g_calculate_condition(3, v26, v27, 0);
            v31 = 3;
            v32 = (v30 & 1 ? v25 & 0xffffffff : 0x20000000);
            v33 = (v30 & 1 ? 2 : 0);
        }
        else
        {
            v34 = arm64g_calculate_condition(3, v26, v27, 0);
            v31 = 0;
            v32 = (v34 & 1 ? v25 & 0xffffffff : 0x20000000);
            v33 = (v34 & 1 ? 2 : 0);
        }
        v35 = arm64g_calculate_condition(v31 | 144, v32, v33, 0);
        if (!(v35 & 1) || v29 & 1)
            i = v23;
        else
            i = 1;
        if ((int)i <= 0)
            goto LABEL_3c9f14;
        v3 = v29;
        v8 = v25;
        v9 = i;
        v10 = *v22;
        v11 = v23;
        iter = (char *)&v14 + 24;
        v38 = 18084;
        v16 = 0;
        v17 = 0;
        v39 = 18152;
        do
        {
            v40 = i;
            ptr = _malloc(v10 + 3);
            *(unsigned long long *)((char *)a0 + v39) = ptr;
            if (!ptr)
            {
                sub_3c93d0(a0, v11);
                g_f0b120();
            }
            v42 = (char *)a0 + v38;
            v43 = *(int *)(v28 + 1672) / (int)v42->field_0;
            v44 = *(int *)(v28 + 1676) / *(int *)((char *)&v42->field_0 + 4);
            *iter = v43;
            iter[1] = v44;
            iter[2] = (v10 - 1 + v43) / v43;
            iter[3] = (int)(v44) >> 1;
            iter[4] = 0;
            v45 = *(long long *)((char *)a0 + v39 - 24);
            *(unsigned long *)((char *)iter - 16) = v45;
            *(unsigned long *)((char *)iter - 8) = v45;
            if ((unsigned int)v43 != 2)
            {
                if ((unsigned int)v43 == 1)
                {
                    v46 = 3980344;
                    if (v44 != 2)
                        v46 = 4018204;
                    v47 = 4023988;
                    if (v44 != 1)
                        v47 = v46;
                    continue;
                }
                goto LABEL_3c9e54;
            }
            else if (v44 != 1)
            {
                if (v44 == 2)
                {
                    v47 = *(long long *)&a0[1546].field_4;
                    continue;
                }
LABEL_3c9e54:
                v47 = 4018204;
                continue;
            }
            else
            {
                v47 = ")";
            }
            *(unsigned long long *)((char *)iter - 24) = v47;
            v38 += 96;
            v39 += 96;
            iter += 12;
            i = v40 - 1;
        } while (i);
        v48 = v22[1];
        v49 = sub_3d6ef0(v8, v10, v48, 1);
        if (!v49)
        {
            sub_3c93d0(a0, v11);
            g_f0b120();
        }
        else if ((unsigned int)v48)
        {
            v5 = a0;
            v6 = v28 + 1728;
            v0 = v49 + 2;
            v1 = v49 + 1;
            v2 = v49 + 3;
            v4 = v28;
            v7 = v49;
            v10 = 0;
            v11 = 0;
            v9 = *v22;
            v50 = *(unsigned int *)((void*)&v14 + 36);
            v51 = *(unsigned int *)((void*)&v14 + 28);
            v52 = v50;
            v53 = v51 >> 1;
            if (v50 < v51 >> 1)
            {
                v54 = arm64g_calculate_condition(179, v52, v53, 0);
                if (!(v54 & 1))
                    goto LABEL_3ca04a;
LABEL_3ca049:
            }
            else
            {
                v55 = arm64g_calculate_condition(179, v52, v53, 0);
                if (v55 & 1)
                    goto LABEL_3ca049;
LABEL_3ca04a:
            }
            (*(unsigned long long *)&v14)();
        }
        else
        {
            sub_3c93d0(a0);
            v56 = &a0->field_0->field_0;
            *a1 = *v56;
            *a2 = v56[1];
            if (a3)
            {
                if (3 <= (int)v56[2])
                    v57 = 3;
                else
                    v57 = 1;
                *(unsigned int *)a3 = v57;
            }
        }
    }
    else
    {
LABEL_3c9f14:
        sub_3c93d0(a0);
        v49 = 0;
    }
    if (*(long long *)&g_10002b0 == v18)
        return v49;
    ___stack_chk_fail();
}
