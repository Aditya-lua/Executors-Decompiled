/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7cdfc..0x7cf2c (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7cdfc_0 {
    char field_0;
} st_7cdfc_0;


unsigned long long sub_7cdfc(char *a0, void* a1, char *a2)
{
    char *v2;  // x9
    unsigned long long v3;  // x10
    unsigned long long v12;  // x8
    unsigned long v13;  // x8
    unsigned long long v14;  // 4132
    unsigned long long v15;  // 4134
    unsigned long long v16;  // x8
    unsigned long long v17;  // x8
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // cc_dep2
    unsigned long long v21;  // 4105
    char *v4;  // x8
    unsigned long long v22;  // 4105
    unsigned int v23;  // w9
    unsigned int v24;  // w10
    unsigned long v25;  // cc_dep1
    unsigned long v26;  // cc_dep2
    unsigned long long v28;  // 4105
    unsigned long long v29;  // 4105
    char *v30;  // x10
    void* v5;  // x11
    unsigned long long v6;  // x10
    char *iter;  // x8
    unsigned long v8;  // x8
    unsigned long long v9;  // 4132
    unsigned long long v10;  // 4134
    unsigned long long v11;  // x8
    st_7cdfc_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_7cdfc_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a2 - 7;
    if (v2 > a0)
    {
        if (*(long long *)a1 != *(long long *)a0)
        {
            v13 = *(long long *)a0 ^ *(long long *)a1;
            v14 = ((((((v13 & 0xaaaaaaaaaaaaaaaa) >> 1 | v13 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v13 & 0xaaaaaaaaaaaaaaaa) >> 1 | v13 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v13 & 0xaaaaaaaaaaaaaaaa) >> 1 | v13 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v13 & 0xaaaaaaaaaaaaaaaa) >> 1 | v13 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v15 = (((((((v13 & 0xaaaaaaaaaaaaaaaa) >> 1 | v13 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v13 & 0xaaaaaaaaaaaaaaaa) >> 1 | v13 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v13 & 0xaaaaaaaaaaaaaaaa) >> 1 | v13 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v13 & 0xaaaaaaaaaaaaaaaa) >> 1 | v13 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v16 = ((((v15 | v14) & 0xffff0000ffff0000) >> 16 | (v15 | v14) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v15 | v14) & 0xffff0000ffff0000) >> 16 | (v15 | v14) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v16)
                v17 = 64;
            else
                v17 = Clz(v16);
            return v17 >> 3;
        }
        v3 = 0;
        v4 = a0 + 8;
        v5 = a1 + 8;
        while (1)
        {
            v6 = v3;
            iter = v4;
            if (v2 <= iter)
                break;
            v4 = iter + 8;
            v3 = v6 + 8;
            if (*(long long *)((char *)v5 + v6) != *(long long *)iter)
            {
                v8 = *(long long *)iter ^ *(long long *)((char *)v5 + v6);
                v9 = ((((((v8 & 0xaaaaaaaaaaaaaaaa) >> 1 | v8 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v8 & 0xaaaaaaaaaaaaaaaa) >> 1 | v8 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v8 & 0xaaaaaaaaaaaaaaaa) >> 1 | v8 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v8 & 0xaaaaaaaaaaaaaaaa) >> 1 | v8 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v10 = (((((((v8 & 0xaaaaaaaaaaaaaaaa) >> 1 | v8 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v8 & 0xaaaaaaaaaaaaaaaa) >> 1 | v8 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v8 & 0xaaaaaaaaaaaaaaaa) >> 1 | v8 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v8 & 0xaaaaaaaaaaaaaaaa) >> 1 | v8 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v11 = ((((v10 | v9) & 0xffff0000ffff0000) >> 16 | (v10 | v9) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v10 | v9) & 0xffff0000ffff0000) >> 16 | (v10 | v9) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v11)
                    v12 = 64;
                else
                    v12 = Clz(v11);
                return v6 + 8 + (v12 >> 3);
            }
        }
        a1 = a1 + v6 + 8;
        if (iter < a2 - 3)
            goto LABEL_7ce7c;
    }
    else
    {
        iter = a0;
        if (a2 - 3 > a0)
        {
LABEL_7ce7c:
            v18 = *(int *)a1;
            v19 = *(int *)iter;
            if (*(int *)a1 != *(int *)iter)
            {
                iter = iter;
                v21 = arm64g_calculate_condition(19, v18, v19, 0);
                if (!(v21 & 1))
                    goto LABEL_7ce96;
LABEL_7ce95:
            }
            else
            {
                iter += 4;
                v22 = arm64g_calculate_condition(19, v18, v19, 0);
                if (v22 & 1)
                    goto LABEL_7ce95;
LABEL_7ce96:
                a1 += 4;
            }
        }
    }
    if (iter < a2 - 1)
    {
        v23 = *(short *)a1;
        v24 = *(short *)iter;
        v25 = v23 & 0xffff;
        v26 = v24 & 0xffff;
        if (v23 != v24)
        {
            iter = iter;
            v28 = arm64g_calculate_condition(19, v25, v26, 0);
            if (!(v28 & 1))
                goto LABEL_7ced2;
LABEL_7ced1:
        }
        else
        {
            iter += 2;
            v29 = arm64g_calculate_condition(19, v25, v26, 0);
            if (v29 & 1)
                goto LABEL_7ced1;
LABEL_7ced2:
            a1 += 2;
        }
        if (a2 <= iter)
            return iter - a0;
    }
    else if (iter >= a2)
    {
        return iter - a0;
    }
    v30 = iter;
    if (*(char *)a1 == *v30)
        iter = v30 + 1;
    return iter - a0;
}
