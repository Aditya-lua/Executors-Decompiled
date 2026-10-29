/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7c6ec..0xb7ca00 (788 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_b7c6ec(char *a0, void* a1)
{
    unsigned int v5;  // w9
    char *v6;  // x8
    void* v15;  // x9
    void* v16;  // x8
    unsigned int v17;  // w9
    unsigned long long v18;  // 4174
    unsigned int v19;  // w10
    unsigned long long v20;  // 4173
    unsigned int v21;  // w9
    unsigned long long v22;  // 4174
    unsigned int v23;  // w9
    unsigned long long v24;  // 4174
    unsigned long long v7;  // 4157
    unsigned int v25;  // w9
    unsigned long long v26;  // 4174
    unsigned int v27;  // w9
    unsigned long long v28;  // 4182
    unsigned int v29;  // w9
    unsigned long long v30;  // 4182
    unsigned int v31;  // w9
    unsigned long long v32;  // 4182
    unsigned int v33;  // w9
    unsigned long long v34;  // 4182
    void* v8;  // x9
    unsigned int v35;  // w9
    unsigned long long v36;  // 4182
    unsigned int v37;  // w9
    unsigned long long v38;  // 4182
    unsigned int v39;  // w10
    unsigned long long v40;  // 4181
    unsigned int v41;  // w9
    unsigned long long v42;  // 4182
    void* v9;  // x9
    unsigned int v10;  // w10
    unsigned int v11;  // w11
    unsigned long long v12;  // 4173
    unsigned long long v13;  // 4157
    void* v14;  // w8
    void* v0;  // [bp-0x28]
    void* v1;  // [bp-0x20]
    void* v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (a1)
    {
        v5 = *a0;
        v6 = a0 + 1;
        if (v5 - 65 < 26 || (v7 = arm64g_calculate_condition((v5 != 95 ? 3 : 0) | 128, (v5 != 95 ? v5 - 97 : 0), (v5 != 95 ? 25 : 0), 0), !(v7 & 1)))
        {
            v8 = a1 - 1;
            if (a1 != 1)
            {
                do
                {
                    v9 = v8;
                    v10 = *v6;
                    v6 += 1;
                    v11 = v10 - 48;
                    v12 = arm64g_calculate_condition((10 <= v11 ? 3 : 0) | 48, (10 <= v11 ? v10 - 65 : 0), (10 <= v11 ? 26 : 0), 0);
                    if (!(v12 & 1) && (v13 = arm64g_calculate_condition((v10 != 95 ? 3 : 0) | 144, (v10 != 95 ? v10 - 97 : 0), (v10 != 95 ? 25 : 0), 0), !(v13 & 1)))
                        goto LABEL_b7c9f0;
                } while ((v8 = v9 - 1, v9 != 1));
            }
            goto LABEL_b7c730;
        }
    }
    else
    {
LABEL_b7c730:
        sub_be8f00(&v0);
        v14 = v0;
        v15 = (v14 ? 0 : v2);
        v16 = (!v14 ? v1 : 1);
        if (4 < v15)
        {
            switch (v15)
            {
            case 5:
                v33 = *(int *)v16;
                v34 = arm64g_calculate_condition((v33 == 1634038370 ? 3 : 0), (v33 == 1634038370 ? (char)v16[4] : 0), (v33 == 1634038370 ? 107 : 0), 0);
                if (!(v34 & 1) && (v35 = *(int *)v16, v36 = arm64g_calculate_condition((v35 == 1936482662 ? 3 : 0), (v35 == 1936482662 ? (char)v16[4] : 0), (v35 == 1936482662 ? 101 : 0), 0), !(v36 & 1) && (v37 = *(int *)v16, v38 = arm64g_calculate_condition((v37 == 1633906540 ? 3 : 0), (v37 == 1633906540 ? (char)v16[4] : 0), (v37 == 1633906540 ? 108 : 0), 0), !(v38 & 1) && (v39 = *(int *)v16, v40 = arm64g_calculate_condition((v39 == 1769238133 ? 3 : 0), (v39 == 1769238133 ? (char)v16[4] : 0), (v39 == 1769238133 ? 108 : 0), 0), !(v40 & 1) && (v41 = *(int *)v16, v42 = arm64g_calculate_condition((v41 == 1818847351 ? 3 : 0) | 16, (v41 == 1818847351 ? (char)v16[4] : 0), (v41 == 1818847351 ? 101 : 0), 0), v42 & 1)))))
                    goto LABEL_b7c9e8;
                break;
            case 6:
                v27 = *(int *)v16;
                v28 = arm64g_calculate_condition((v27 == 1702063205 ? 3 : 0), (v27 == 1702063205 ? (short)v16[4] : 0), (v27 == 1702063205 ? 26217 : 0), 0);
                if (!(v28 & 1) && (v29 = *(int *)v16, v30 = arm64g_calculate_condition((v29 == 1701864818 ? 3 : 0), (v29 == 1701864818 ? (short)v16[4] : 0), (v29 == 1701864818 ? 29793 : 0), 0), !(v30 & 1) && (v31 = *(int *)v16, v32 = arm64g_calculate_condition((v31 == 1970562418 ? 3 : 0), (v31 == 1970562418 ? (short)v16[4] : 0), (v31 == 1970562418 ? 28274 : 0), 0), !(v32 & 1))))
                {
LABEL_b7c9e8:
                    return 1;
                }
                break;
            case 8:
                if (*(long long *)v16 != 7957695015192261990)
                    return 1;
                break;
            default:
                goto LABEL_b7c9e8;
            }
        }
        else if (v15 != 2)
        {
            if (v15 != 3)
            {
                if (v15 != 4)
                    return 1;
                if (*(int *)v16 != 1702063205 && *(int *)v16 != 1852139636 && *(int *)v16 != 1702195828)
                    goto LABEL_b7c9e8;
            }
            else
            {
                v17 = *(short *)v16;
                v18 = arm64g_calculate_condition((v17 == 28257 ? 3 : 0), (v17 == 28257 ? (char)v16[2] : 0), (v17 == 28257 ? 100 : 0), 0);
                if (!(v18 & 1) && (v19 = *(short *)v16, v20 = arm64g_calculate_condition((v19 == 28261 ? 3 : 0), (v19 == 28261 ? (char)v16[2] : 0), (v19 == 28261 ? 100 : 0), 0), !(v20 & 1) && (v21 = *(short *)v16, v22 = arm64g_calculate_condition((v21 == 28518 ? 3 : 0), (v21 == 28518 ? (char)v16[2] : 0), (v21 == 28518 ? 114 : 0), 0), !(v22 & 1) && (v23 = *(short *)v16, v24 = arm64g_calculate_condition((v23 == 26990 ? 3 : 0), (v23 == 26990 ? (char)v16[2] : 0), (v23 == 26990 ? 108 : 0), 0), !(v24 & 1) && (v25 = *(short *)v16, v26 = arm64g_calculate_condition((v25 == 28526 ? 3 : 0) | 16, (v25 == 28526 ? (char)v16[2] : 0), (v25 == 28526 ? 116 : 0), 0), v26 & 1)))))
                    goto LABEL_b7c9e8;
            }
        }
        else
        {
            if (*(short *)v16 != 28516 && *(short *)v16 != 26217 && *(short *)v16 != 28265 && *(short *)v16 != 29295)
                goto LABEL_b7c9e8;
        }
    }
LABEL_b7c9f0:
    return 0;
}
